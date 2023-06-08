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

        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cli.getApellido());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getDomicilio());
            ps.setString(4, cli.getTelefono());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cli.setIdClinte(rs.getInt("idCliente"));
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente -" + ex.getMessage());
        }
    }

    public void modificarCliente(Cliente cliente) {

        String sql = "UPDATE cliente SET apellido=?, nombre =?, domicilio=?,telefono =? WHERE idCliente=?";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdClinte());

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
        String sql = "SELECT apellido,nombre,domicilio,telefono FROM cliente WHERE idCliente=?";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setIdClinte(id);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return cliente;
    }
    
    public void eliminarCliente(int id){
        try {
            String sql = " DELETE FROM cliente WHERE idCliente =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se Elimino el Cliente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Cliente");

        }
    }
    
    public List<Cliente> listarAlumnos() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente WHERE idCliente IS NOT NULL";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdClinte(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return clientes;
    }
}
