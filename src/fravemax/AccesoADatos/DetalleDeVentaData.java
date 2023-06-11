package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.sql.*;
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
    
    public void guardarDetalleVenta(DetalleVenta detalle){
         String sql = "INSERT INTO detalleVenta (cantidad, precioVenta, idVenta, idProducto, estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioVenta());
            ps.setInt(3, detalle.getIdVenta().getIdVenta());
            ps.setInt(4, detalle.getIdProducto().getIdProducto());
            ps.setBoolean(5, detalle.isEstado());
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
    
    public void modificarDetalleVenta(DetalleVenta detalle){
         String sql = "UPDATE detalleVenta SET cantidad=?, precioVenta =?, idVenta=?, idProducto=? WHERE idDetalleVenta=?";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioVenta());
            ps.setInt(3, detalle.getIdVenta().getIdVenta());
            ps.setInt(4, detalle.getIdProducto().getIdProducto());
            ps.setInt(5, detalle.getIdDetalleVent());

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
    
    public DetalleVenta buscarDetalleVenta(int id){
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
    
    public void eliminarDetalleVenta(int id){
         try {
            String sql = " UPDATE detalleVenta SET estado=0 WHERE idDetalleVenta =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se Elimino el detalle de Venta");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla detalle Venta");

        }
     }
    
}
