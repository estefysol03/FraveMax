/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
     private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "";   //falta nombre de BD.
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection coneccion;

    //Metodo constructor
    private Conexion(){
    
    }

    public static Connection getConexion() {

        if (coneccion == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                coneccion = DriverManager
                        .getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + USUARIO + "&password=" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");
            } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers");
            }
        }
        return coneccion;
    }
}
