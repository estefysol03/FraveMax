package fravemax.AccesoADatos;

import fravemax.Entidades.Compra;
import fravemax.Entidades.DetalleDeCompra;
import fravemax.Entidades.Producto;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class DetalleDeCompraData {
     private Connection c = null;

    public DetalleDeCompraData() {
        c = Conexion.getConexion();
    }
    
    private Compra rCompra(int id) {
        CompraData cd = new CompraData();
        return cd.buscarCompra(id);
    }
    
    private Producto rProducto(int id) {
        ProductoData pd = new ProductoData();
        return pd.buscarProducto(id);
    }
     
     public void guardarDetalleCompra(DetalleDeCompra detalle){
         String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto, estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getCantidad());
               ps.setDouble(2, detalle.getPrecioCosto());
            ps.setInt(3, detalle.getIdCompra().getIdCompra());
            ps.setInt(4, detalle.getIdProducto().getIdProducto());
            ps.setBoolean(5, detalle.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                JOptionPane.showMessageDialog(null, "Detalle de compra agregado");
            } else {

                JOptionPane.showMessageDialog(null, "No se añadio el detalle de Compra");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle Compra" + ex.getMessage());
        }
     }
     
     public void modificarDetalleCompra(DetalleDeCompra detalle){
         String sql = "UPDATE detallecompra SET cantidad=?, precioCosto =?, idCompra=?, idProducto=? WHERE idDetalle=?";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioCosto());
            ps.setInt(3, detalle.getIdCompra().getIdCompra());
            ps.setInt(4, detalle.getIdProducto().getIdProducto());
            ps.setInt(5, detalle.getIdDetalle());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El detalle de Compra ingresado no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla detalle Compra" + ex.getMessage());
        }
     }
     
     public DetalleDeCompra buscarDetalleCompra(int id){
         DetalleDeCompra detalle = new DetalleDeCompra();
        String sql = "SELECT cantidad,precioCosto,idCompra,idProducto FROM detalleCompra WHERE idDetalle=? AND estado=1";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Compra com;
            Producto p;
            if (rs.next()) {
                com = rCompra(rs.getInt("idCompra"));
                p = rProducto(rs.getInt("idProducto"));
                detalle.setIdDetalle(id);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                detalle.setIdCompra(com);
                detalle.setIdProducto(p);
            } else {
                JOptionPane.showMessageDialog(null, "Id de detalle compra no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle compra");
        }
        return detalle;
     }
     
     public void eliminarDetalleCompra(int id){
         try {
            String sql = " UPDATE detalleCompra SET estado=0 WHERE idDetalle =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se Elimino el detalle de Compra");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Compra");

        }
     }

}