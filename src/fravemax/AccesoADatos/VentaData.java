/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
import fravemax.Entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Adan
 */
public class VentaData {
    
      private Connection c = null;

    public VentaData() {
        c = Conexion.getConexion();
    }
    
  
    private Cliente rCliente(int id) {
        ClienteData ad = new ClienteData();
        return ad.buscarCliente(id);
    }

    public void registrarVentas(Venta v) {

        String sql = "INSERT INTO venta (idVenta,fecha,idCliente,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, v.getIdVenta());
            ps.setDate(2,Date.valueOf(v.getFecha()));
            ps.setInt(3, v.getIdCliente().getIdCliente());
            ps.setBoolean(4, v.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                v.setIdVenta(rs.getInt("idVenta"));
                JOptionPane.showMessageDialog(null, "Ventas Registrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ventas" + ex.getMessage());
        }

    }

    public Venta buscarVenta(int id) {
        Venta v = new Venta();
        String sql = "SELECT fecha,IdCliente,estado FROM venta WHERE idVenta=?";

        PreparedStatement ps = null;
        try {

            ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
             Cliente cli;
            if (rs.next()) {
                cli = rCliente(rs.getInt("idAlumno"));
                v.setIdVenta(id);
                v.setFecha(rs.getDate("fecha").toLocalDate());
                v.setIdCliente(cli);
                v.setEstado(rs.getBoolean("estado"));
            } else {

                JOptionPane.showMessageDialog(null, "No existe la Venta");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ventas");
        }
        return v;
    }

    public List<Venta> listarVentas() {
        List<Venta> productos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM venta WHERE  estado = 1";  //el *trae toda la tabla de producto
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Cliente cli;
            while (rs.next()) {
                Venta v = new Venta();
                cli = rCliente(rs.getInt("idCliente")); 
                v.setIdVenta(rs.getInt("IdVenta"));
                v.setFecha(rs.getDate("fecha").toLocalDate());
                v.setIdCliente(cli);
                v.setEstado(rs.getBoolean("estado"));
                v.setEstado(true);
                productos.add(v);   //le agregamos prod a la lista de productos
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Venta");
        }
        return productos;
    }

    //modifico un producto.
    public void modificarVenta(Venta v) {
        String sql = "UPDATE producto SET fecha=?, idCliente=? WHERE idVenta=? AND estado=1";

        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(1, v.getIdVenta());
            ps.setDate(2,Date.valueOf(v.getFecha()));
            ps.setInt(3, v.getIdCliente().getIdCliente());
            ps.setBoolean(4, v.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado  Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "La venta no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ventas" + ex.getMessage());

        }
    }

    public void eliminarVenta(int id) {
        try {
            String sql = " UPDATE producto SET estado =0 WHERE idVenta =? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se Elimino la Venta");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Venta");

        }
    }

}

