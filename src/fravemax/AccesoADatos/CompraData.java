package fravemax.AccesoADatos;

import fravemax.Entidades.Compra;
import fravemax.Entidades.DetalleDeCompra;
import fravemax.Entidades.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class CompraData {

    private Connection c = null;

    public CompraData() {
        c = Conexion.getConexion();
    }

    private Proveedor rProveedor(int id) {
        ProveedorData pd = new ProveedorData();
        return pd.buscarProveedor(id);
    }

    public void guardarCompra(Compra compra) {

        String sql = "INSERT INTO compra (idProveedor, fecha, estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setBoolean(3, compra.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                compra.setIdCompra(rs.getInt("idCompra"));
                JOptionPane.showMessageDialog(null, "Compra añadida con exito.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra -" + ex.getMessage());
        }
    }

    public void modificarCompra(Compra compra) {

        String sql = "UPDATE compra SET idProveedor=?, fecha =? WHERE idCompra=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(1, compra.getIdProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setInt(3, compra.getIdCompra());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "La Compra ingresada no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla Cliente" + ex.getMessage());
        }
    }

    public Compra buscarCompra(int id) {
        Compra compra = new Compra();
        String sql = "SELECT idProveedor, fecha, estado FROM compra WHERE idCompra=? AND estado=1";

        PreparedStatement ps = null;

        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            //Metodo para rearmar proveedor.
            Proveedor p;
            if (rs.next()) {
                p = rProveedor(rs.getInt("idProveedor"));
                compra.setIdCompra(id);
                compra.setIdProveedor(p);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Compra");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
        }

        return compra;
    }

    public void eliminarCompra(int id) {
        Compra com = buscarCompra(id);
        try {
            String sql = " UPDATE compra SET estado=0 WHERE idCompra =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == com.getIdCompra()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la Compra " + com.getIdCompra(),
                        "BAJA DE COMPRA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Compra eliminada con exito");
                    updateDetalleXCompra(id);
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Compra");

        }
    }

    public List<Compra> listarCompras() {
        List<Compra> compras = new ArrayList<>();

        try {
            String sql = "SELECT * FROM compra WHERE estado = 1";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Proveedor prov;
            while (rs.next()) {
                Compra compra = new Compra();
                prov = rProveedor(rs.getInt("idProveedor"));
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setIdProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compras.add(compra);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
        }
        return compras;
    }
    
    public void updateDetalleXCompra(int id) {
        DetalleDeCompra dc = new DetalleDeCompra();
        DetalleDeCompraData dcd = new DetalleDeCompraData();
        dc = dcd.buscarDetalleCompra(id);
        try {
            String sql = " UPDATE detalleCompra SET estado=0 WHERE idCompra =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

//            if (id == dc.getIdDetalle()) {
//                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el Detalle Compra " + dc.getIdDetalle(),
//                        "BAJA DE DETALLE COMPRA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//                if (confirmar == 0) {
//                    JOptionPane.showMessageDialog(null, "Detalle Compra eliminado con exito");
                    ps.executeUpdate();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
//                }
//            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Detalle Compra");

        }
    }

}
