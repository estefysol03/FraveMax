package fravemax.AccesoADatos;

import fravemax.Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection c = null;

    public ProductoData() {
        c = Conexion.getConexion();
    }

    public void registrarProductos(Producto p) {

        String sql = "INSERT INTO producto (descripcion,precioActual,stock,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getDescripcion());
            ps.setDouble(2, p.getPrecioActual());
            ps.setInt(3, p.getStock());
            ps.setBoolean(4, p.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                p.setIdProducto(rs.getInt("idProducto"));
                JOptionPane.showMessageDialog(null, "Producto Registrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Registro" + ex.getMessage());
        }

    }

    public Producto buscarProducto(int id) {
        Producto prod = new Producto();
        String sql = "SELECT descripcion,precioActual,stock FROM producto WHERE idProducto=?";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prod.setIdProducto(id);
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
      
            } else {

                JOptionPane.showMessageDialog(null, "No existe el Producto");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return prod;
    }

    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM producto WHERE  estado = 1";  //el *trae toda la tabla de producto
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);
                productos.add(prod);   //le agregamos prod a la lista de productos
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return productos;
    }

    //modifico un producto.
    public void modificarProducto(Producto prod) {
        String sql = "UPDATE producto SET descripcion=?, precioActual=?, stock=? WHERE idProducto=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, prod.getDescripcion());
            ps.setDouble(2, prod.getPrecioActual());
            ps.setInt(3, prod.getStock());
            ps.setInt(4, prod.getIdProducto());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado  Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla Producto" + ex.getMessage());

        }
    }

    public void eliminarProducto(int id) {
        try {
            String sql = " UPDATE producto SET estado =0 WHERE idProducto =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se Elimino el Producto");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Producto");

        }
    }

}
