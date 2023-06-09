/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.ProductoData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.Producto;

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
        
        //Cliente c = new Cliente(1,"Lucero", "Juan", "San Luis", "2664345789",true);
        //Cliente c1 = new Cliente(2,"Go", "Jun Pyo", "Seul", "+82544789335", true);
        ClienteData cd = new ClienteData();
        //cd.guardarCliente(c1);
        //System.out.println(cd.buscarCliente(1));
        //cd.modificarCliente(c1);
        //System.out.println(cd.buscarCliente(1));
        //cd.eliminarCliente(1);
        System.out.println(cd.listarClientes());
        Producto p = new Producto(1,"Licuadora Atmany", 12000, 10, true);
        Producto p1 = new Producto("Tostadora Atmany", 8000, 10, true);
        ProductoData pd = new ProductoData();
        //pd.registrarProductos(p1);
        //System.out.println(pd.buscarProducto(1));
        //pd.modificarProducto(p);
        //pd.eliminarProducto(1);
        System.out.println(pd.listarProductos());
      
    }
    
}
