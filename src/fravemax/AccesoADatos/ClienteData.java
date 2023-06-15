package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClienteData {

    private Connection c = null;

    public ClienteData() {
        c = Conexion.getConexion();

    }

    //Guardar cliente
    public void guardarCliente(Cliente cli) {

        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono, estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cli.getApellido());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getDomicilio());
            ps.setString(4, cli.getTelefono());
            ps.setBoolean(5, cli.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cli.setIdCliente(rs.getInt("idCliente"));
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente -" + ex.getMessage());
        }
    }

    public void modificarCliente(Cliente cliente) {

        String sql = "UPDATE cliente SET apellido=?, nombre =?, domicilio=?,telefono =? WHERE idCliente=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente ingresado no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla Cliente" + ex.getMessage());
        }
    }

    public Cliente buscarCliente(int id) {
        Cliente cliente = new Cliente();
        String sql = "SELECT apellido,nombre,domicilio,telefono FROM cliente WHERE idCliente=? AND estado=1";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setIdCliente(id);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "Id de cliente no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return cliente;
    }

    public void eliminarCliente(int id) {
        Cliente cli = new Cliente();
        cli = buscarCliente(id);
        try {
            String sql = " UPDATE cliente SET estado=0 WHERE idCliente =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            if (id == cli.getIdCliente()) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar al Cliente " + cli.getNombre() + " " + cli.getApellido(),
                        "BAJA DE CLIENTE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmar == 0) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
                    ps.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Cliente");

        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente WHERE estado = 1";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(true);
                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return clientes;
    }

}