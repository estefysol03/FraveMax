package fravemax.AccesoADatos;

import fravemax.Entidades.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ProveedorData {

    private Connection c = null;

    public ProveedorData() {
        c = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor pro) {
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pro.getRazonSocial());
            ps.setString(2, pro.getDomicilio());
            ps.setString(3, pro.getTelefono());
            ps.setBoolean(4, pro.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pro.setIdProveedor(rs.getInt("idProveedor"));
                JOptionPane.showMessageDialog(null, "Proveedor añadido con exito.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor -" + ex.getMessage());
        }
    }

    public void modificarProveedor(Proveedor pro) {
        String sql = "UPDATE proveedor SET razonSocial=?, domicilio =?,telefono =? WHERE idProveedor=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, pro.getRazonSocial());
            ps.setString(2, pro.getDomicilio());
            ps.setString(3, pro.getTelefono());
            ps.setInt(4, pro.getIdProveedor());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El Proveedor ingresado no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla Proveedor" + ex.getMessage());
        }
    }

    public Proveedor buscarProveedor(int id) {
        Proveedor pro = new Proveedor();
        String sql = "SELECT razonSocial, domicilio,telefono FROM proveedor WHERE idProveedor=?";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pro.setIdProveedor(id);
                pro.setRazonSocial(rs.getString("razonSocial"));
                pro.setDomicilio(rs.getString("domicilio"));
                pro.setTelefono(rs.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
        }
        return pro;
    }

    public void eliminarProveedor(int id) {
        Proveedor p = new Proveedor();
        p = buscarProveedor(id);
        try {
            String sql = " UPDATE proveedor SET estado=0 WHERE idProveedor =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == p.getIdProveedor()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar al Proveedor " + p.getRazonSocial(),
                        "Seleccione una opcion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito");
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada, Proveedor no eliminado");
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Proveedor");

        }
    }

    public List<Proveedor> listarProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();

        try {
            String sql = "SELECT * FROM proveedor WHERE estado = 1";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor prov = new Proveedor();

                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRazonSocial(rs.getString("razonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setEstado(true);
                proveedores.add(prov);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
        }
        return proveedores;
    }

}