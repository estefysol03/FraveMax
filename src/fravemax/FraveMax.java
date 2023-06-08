/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;

/**
 *
 * @author Adan
 */
public class FraveMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cliente c = new Cliente(1,"Lucero", "Juan", "San Luis", "2664345789");
        //Cliente c1 = new Cliente(2,"Go", "Jun Pyo", "Seul", "+8254478933");
        ClienteData cd = new ClienteData();
        //cd.guardarCliente(c1);
        //System.out.println(cd.buscarCliente(1));
        //cd.modificarCliente(c1);
        //System.out.println(cd.buscarCliente(2));
        System.out.println(cd.listarAlumnos());
        
    }
    
}
