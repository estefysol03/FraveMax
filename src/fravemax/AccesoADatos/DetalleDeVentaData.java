package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class DetalleDeVentaData {

    private Connection c = null;

    public DetalleDeVentaData() {
        c = Conexion.getConexion();
    }

    private Venta rVenta(int id) {
        VentaData vd = new VentaData();
        return vd.buscarVenta(id);
    }

    private Producto rProducto(int id) {
        ProductoData pd = new ProductoData();
        return pd.buscarProducto(id);
    }

    public void guardarDetalleVenta(DetalleVenta detalle) {
        int stock = detalle.getCantidad();
        int idProducto = detalle.getIdProducto().getIdProducto();
        if (updateStock(stock, idProducto) >= 0) {
            String sql = "INSERT INTO detalleVenta (cantidad, precioVenta, idVenta, idProducto, estado) VALUES (?,?,?,?,?)";

            try {
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, detalle.getCantidad());
                ps.setDouble(2, detalle.getPrecioVenta());
                ps.setInt(3, detalle.getIdVenta().getIdVenta());
                ps.setInt(4, detalle.getIdProducto().getIdProducto());
                ps.setBoolean(5, detalle.isEstado());

               // updateStock(detalle.getCantidad(), detalle.getIdProducto().getIdProducto());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    detalle.setIdDetalleVent(rs.getInt("idDetalleVenta"));
                    JOptionPane.showMessageDialog(null, "Detalle de Venta agregado");
                } else {

                    JOptionPane.showMessageDialog(null, "No se añadio el detalle de Venta");

                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle Compra" + ex.getMessage());
            }
        }

    }

    public void modificarDetalleVenta(DetalleVenta detalle) {
        //Chequear que esta descontando mal el stock del producto, ver metodo updateStckActuañizar...
       
        int cantidad = detalle.getCantidad();
        int idProducto = detalle.getIdProducto().getIdProducto();
        int id = detalle.getIdDetalleVent();
        if (updateStockActualizar(cantidad, idProducto, id) >= 0) {
            String sql = "UPDATE detalleVenta SET cantidad=?, precioVenta =?, idVenta=?, idProducto=? WHERE idDetalleVenta=?";

            PreparedStatement ps = null;
            try {
                ps = c.prepareStatement(sql);

                ps.setInt(1, detalle.getCantidad());
                ps.setDouble(2, detalle.getPrecioVenta());
                ps.setInt(3, detalle.getIdVenta().getIdVenta());
                ps.setInt(4, detalle.getIdProducto().getIdProducto());
                ps.setInt(5, detalle.getIdDetalleVent());
         //       updateStockActualizar(cantidad, idProducto, id);
                int exito = ps.executeUpdate();

                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "El detalle de Venta ingresado no existe");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder ala tabla detalle Venta" + ex.getMessage());
            }
        }

    }

    public DetalleVenta buscarDetalleVenta(int id) {
        DetalleVenta detalle = new DetalleVenta();
        String sql = "SELECT cantidad,precioVenta,idVenta,idProducto FROM detalleVenta WHERE idDetalleVenta=? AND estado=1";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Venta v;
            Producto p;
            if (rs.next()) {
                v = rVenta(rs.getInt("idVenta"));
                p = rProducto(rs.getInt("idProducto"));
                detalle.setIdDetalleVent(id);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioVenta(rs.getDouble("precioVenta"));
                detalle.setIdVenta(v);
                detalle.setIdProducto(p);
            } else {
                JOptionPane.showMessageDialog(null, "Id detalle Venta no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle venta");
        }
        return detalle;
    }

    public void eliminarDetalleVenta(int id) {
        DetalleVenta v = new DetalleVenta();
        v = buscarDetalleVenta(id);
        try {
            String sql = " UPDATE detalleVenta SET estado=0 WHERE idDetalleVenta =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == v.getIdDetalleVent()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el Detalle Venta " + v.getIdDetalleVent(),
                        "BAJA DE DETALLE VENTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Detalle Venta eliminada con exito");
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla detalle Detalle Venta");

        }
    }

    public List<DetalleVenta> listarDetallePorVenta(int idVenta) {
        List<DetalleVenta> dVentas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM detalleventa WHERE idVenta=?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, idVenta);
            ResultSet rs = ps.executeQuery();
            Venta ven;
            Producto pro;
            while (rs.next()) {
                DetalleVenta dVenta = new DetalleVenta();
                ven = rVenta(idVenta);
                pro = rProducto(rs.getInt("idProducto"));
                dVenta.setIdDetalleVent(rs.getInt("idDetalleVenta"));
                dVenta.setCantidad(rs.getInt("cantidad"));
                dVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                dVenta.setIdVenta(ven);
                dVenta.setIdProducto(pro);
                dVentas.add(dVenta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle Venta");
        }
        return dVentas;
    }

    private int updateStock(int cantidad, int idProducto) {
        Producto pro = rProducto(idProducto);
        int stock = pro.getStock() - cantidad;
        if (stock < 0) {
            JOptionPane.showMessageDialog(null, "Stock insuficiente, solo puede vender " + pro.getStock() + " " + pro.getDescripcion());
        } else {
            String sql = "UPDATE producto SET stock=? WHERE idProducto=?";
            PreparedStatement ps = null;
            try {
                ps = c.prepareStatement(sql);

                ps.setInt(1, stock);
                ps.setInt(2, idProducto);

                ps.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder ala tabla detalle Compra" + ex.getMessage());
            }
        }
        return stock;
    }

    public int updateStockActualizar(int cantidad, int idProducto, int id) {
        //hacer metodo boolean para poder usarlo en modificar
        Producto pro = rProducto(idProducto);
        DetalleVenta dv = buscarDetalleVenta(id);
        int stockActual = dv.getCantidad();
        int stockNew = (cantidad - stockActual);
        int stock = (pro.getStock() - stockNew);
        if (stock < 0) {
            JOptionPane.showMessageDialog(null, "Stock insuficiente, solo puede vender " + pro.getStock() + " " + pro.getDescripcion());
        } else {
            String sql = "UPDATE producto SET stock=? WHERE idProducto=?";

            PreparedStatement ps = null;
            try {
                ps = c.prepareStatement(sql);

                ps.setInt(1, stock);
                ps.setInt(2, idProducto);

                ps.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder ala tabla detalle Venta" + ex.getMessage());
            }
        }
        return stock;
    }

}
