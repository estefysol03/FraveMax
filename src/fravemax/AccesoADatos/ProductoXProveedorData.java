package fravemax.AccesoADatos;

import fravemax.Entidades.Producto;
import fravemax.Entidades.ProductoXProveedor;
import fravemax.Entidades.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RAFAEL
 */
public class ProductoXProveedorData {

    private Connection c = null;

    public ProductoXProveedorData() {
        c = Conexion.getConexion();
    }

    private Producto rProducto(int id) {
        ProductoData pd = new ProductoData();
        return pd.buscarProducto(id);
    }

    private Proveedor rProveedor(int id) {
        ProveedorData pro = new ProveedorData();
        return pro.buscarProveedor(id);
    }

    public void guardarProductoXProveedor(ProductoXProveedor producto) {
        String sql = "INSERT INTO productoxproveedor (idProveedor, idProducto, precioCosto, estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getIdProveedor().getIdProveedor());
            ps.setDouble(2, producto.getIdProducto().getIdProducto());
            ps.setDouble(3, producto.getPrecioCosto());
            ps.setBoolean(4, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setId(rs.getInt("id"));
                JOptionPane.showMessageDialog(null, "Producto agregado");
            } else {

                JOptionPane.showMessageDialog(null, "No se añadio el Producto");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto por Proveedor");
        }
    }

    public void modificarProductoxProveedor(ProductoXProveedor producto) {
        String sql = "UPDATE productoxproveedor SET idProveedor=?, idProducto =?, precioCosto=? WHERE id=?";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);

            ps.setInt(1, producto.getIdProveedor().getIdProveedor());
            ps.setInt(2, producto.getIdProducto().getIdProducto());
            ps.setDouble(3, producto.getPrecioCosto());
            ps.setInt(4, producto.getId());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El Producto ingresado no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto por Proveedor");
        }
    }

    public ProductoXProveedor buscarProductoXProveedor(int id) {
        ProductoXProveedor producto = new ProductoXProveedor();
        String sql = "SELECT idProveedor, idProducto, precioCosto FROM productoxproveedor WHERE id=? AND estado=1";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Proveedor pro;
            Producto p;
            if (rs.next()) {
                pro = rProveedor(rs.getInt("idProveedor"));
                p = rProducto(rs.getInt("idProducto"));
                producto.setId(id);
                producto.setIdProveedor(pro);
                producto.setIdProducto(p);
                producto.setPrecioCosto(rs.getDouble("precioCosto"));

            } else {
                JOptionPane.showMessageDialog(null, "Id de Producto no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto por Proveedor");
        }
        return producto;
    }
    
    public ProductoXProveedor buscarProductoXProveedorDetalle(int idProducto, int idProveedor) {
        ProductoXProveedor producto = new ProductoXProveedor();
        String sql = "SELECT * FROM productoxproveedor WHERE idProveedor=? AND idProducto=? AND estado=1";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ps.setInt(2, idProducto);
            ResultSet rs = ps.executeQuery();
            Proveedor pro;
            Producto p;
            if (rs.next()) {
                pro = rProveedor(rs.getInt("idProveedor"));
                p = rProducto(rs.getInt("idProducto"));
                producto.setId(rs.getInt("id"));
                producto.setIdProveedor(pro);
                producto.setIdProducto(p);
                producto.setPrecioCosto(rs.getDouble("precioCosto"));

            } else {
                JOptionPane.showMessageDialog(null, "Id de Producto no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto por Proveedor");
        }
        return producto;
    }

    public void eliminarProductoXProveedor(int id) {
        ProductoXProveedor pro = new ProductoXProveedor();
        pro = buscarProductoXProveedor(id);
        try {
            String sql = " UPDATE productoxproveedor SET estado=0 WHERE id=? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == pro.getId()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el Producto " + pro.getIdProducto().getDescripcion() + " al Proveedor " + pro.getIdProveedor().getRazonSocial(),
                        "BAJA DE DETALLE COMPRA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Producto por Proveedor eliminado con exito");
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Producto por Proveedor");

        }
    }
    
    public List<Producto> listarDetalleXProveedor(int id) {
        List<Producto> detalle = new ArrayList<>();

        try {
            //String sql = "SELECT * FROM productoxproveedor WHERE idProveedor=?";
            String sql = "SELECT producto.*"
                    + "FROM producto JOIN productoxproveedor ON (producto.idProducto = productoxproveedor.idProducto)"
                    + "WHERE idProveedor = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Producto p;

            while (rs.next()) {
                p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                detalle.add(p);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return detalle;
    }
    
    public List<ProductoXProveedor> listarDetalleXProveedor1(int id) {
        List<ProductoXProveedor> detalle = new ArrayList<>();

        try {
            //String sql = "SELECT * FROM productoxproveedor WHERE idProveedor=?";
            String sql = "SELECT productoxproveedor.*"
                    + "FROM producto JOIN productoxproveedor ON (producto.idProducto = productoxproveedor.idProducto)"
                    + "WHERE idProveedor = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            ProductoXProveedor producto;
            Producto p;

            while (rs.next()) {
                producto = new ProductoXProveedor();
                p = rProducto(rs.getInt("idProducto"));
                producto.setIdProducto(p);
                producto.setPrecioCosto(rs.getDouble("precioCosto"));
                detalle.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto ");
        }
        return detalle;
    }
    
    public List<ProductoXProveedor> listarProductos(){
        List<ProductoXProveedor> pxp = new ArrayList();
        
         try {
            String sql = "SELECT * FROM productoxproveedor WHERE estado = 1";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Proveedor pro;
            Producto p;
            while (rs.next()) {
                ProductoXProveedor prov = new ProductoXProveedor();
                pro = rProveedor(rs.getInt("idProveedor"));
                p = rProducto(rs.getInt("idProducto"));
                prov.setId(rs.getInt("id"));
                prov.setIdProveedor(pro);
                prov.setIdProducto(p);
                prov.setPrecioCosto(rs.getDouble("precioCosto"));
                prov.setEstado(rs.getBoolean("estado"));
                pxp.add(prov);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedo "+ex);
        }
        return pxp;
    }

}
