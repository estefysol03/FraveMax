package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
import fravemax.Entidades.Venta;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class VentaData {

    private Connection c = null;

    public VentaData() {
        c = Conexion.getConexion();
    }

    private Cliente rCliente(int id) {
        ClienteData cd = new ClienteData();
        return cd.buscarCliente(id);
    }

    public void guardarVenta(Venta venta) {

        String sql = "INSERT INTO venta (fecha,idCliente, estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getIdCliente().getIdCliente());
            ps.setBoolean(3, venta.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                venta.setIdVenta(rs.getInt("idVenta"));
                JOptionPane.showMessageDialog(null, "Venta añadida con exito.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Venta -" + ex.getMessage());
        }
    }

    public void modificarVenta(Venta venta) {

        String sql = "UPDATE venta SET fecha =?, idCliente=? WHERE idVenta=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getIdCliente().getIdCliente());
            ps.setInt(3, venta.getIdVenta());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "La Venta ingresada no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla Venta" + ex.getMessage());
        }
    }

    public Venta buscarVenta(int id) {
        Venta venta = new Venta();
        String sql = "SELECT fecha,idCliente, estado FROM venta WHERE idVenta=? AND estado=1";

        PreparedStatement ps = null;

        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            //Metodo para rearmar proveedor.
            Cliente cli;
            if (rs.next()) {
                cli = rCliente(rs.getInt("idCliente"));
                venta.setIdVenta(id);
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                venta.setIdCliente(cli);
                venta.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Venta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Venta");
        }

        return venta;
    }

    public void eliminarVenta(int id) {
        Venta v = new Venta();
        v = buscarVenta(id);
        try {
            String sql = " UPDATE venta SET estado=0 WHERE idVenta =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == v.getIdVenta()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la Venta " + v.getIdVenta(),
                        "BAJA DE VENTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Venta eliminada con exito");
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Venta");
        }
    }
}
