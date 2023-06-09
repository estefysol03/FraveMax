package igu;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author RAFAEL
 */
public class Menu extends javax.swing.JFrame {

    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/FraveMax.jpg"));
        Image image = icon.getImage();
        desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        salir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiCompra = new javax.swing.JMenuItem();
        jmiDetalleCompra = new javax.swing.JMenuItem();
        jmAlumno = new javax.swing.JMenu();
        jmiVenta = new javax.swing.JMenuItem();
        jmiDetalleVenta = new javax.swing.JMenuItem();
        jmInscripcion = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenu();
        jmiProveedor = new javax.swing.JMenuItem();
        jmProXProveedor = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jmiReportes = new javax.swing.JMenu();
        jmiCompras = new javax.swing.JMenuItem();
        jmiVentas = new javax.swing.JMenuItem();
        jmiClientes = new javax.swing.JMenuItem();
        jmiProveedores = new javax.swing.JMenuItem();
        jmiProductos = new javax.swing.JMenuItem();
        jmProductoXProveedor = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.orange);

        desktop.setBackground(new java.awt.Color(204, 204, 255));
        desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        salir.setForeground(new java.awt.Color(0, 0, 255));
        salir.setText("Archivo");
        salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setText("Salir del sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        salir.add(jMenuItem1);

        jMenuBar1.add(salir);

        jmMateria.setForeground(new java.awt.Color(0, 0, 255));
        jmMateria.setText("Compras");
        jmMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiCompra.setText("Compra de Productos");
        jmiCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCompraActionPerformed(evt);
            }
        });
        jmMateria.add(jmiCompra);

        jmiDetalleCompra.setText("Detalle de Compra");
        jmiDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetalleCompraActionPerformed(evt);
            }
        });
        jmMateria.add(jmiDetalleCompra);

        jMenuBar1.add(jmMateria);

        jmAlumno.setForeground(new java.awt.Color(0, 0, 255));
        jmAlumno.setText("Ventas");
        jmAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiVenta.setText("Venta de Productos");
        jmiVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVentaActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiVenta);

        jmiDetalleVenta.setText("Detalle de Venta");
        jmiDetalleVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetalleVentaActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiDetalleVenta);

        jMenuBar1.add(jmAlumno);

        jmInscripcion.setForeground(new java.awt.Color(0, 0, 255));
        jmInscripcion.setText("Clientes");
        jmInscripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiCliente.setText("Opciones clientes");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jmInscripcion.add(jmiCliente);

        jMenuBar1.add(jmInscripcion);

        jmNotas.setForeground(new java.awt.Color(0, 0, 255));
        jmNotas.setText("Proveedor");
        jmNotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiProveedor.setText("Opciones Proveedor");
        jmiProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedorActionPerformed(evt);
            }
        });
        jmNotas.add(jmiProveedor);

        jmProXProveedor.setText("Productos por Proveedor");
        jmProXProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProXProveedorActionPerformed(evt);
            }
        });
        jmNotas.add(jmProXProveedor);

        jMenuBar1.add(jmNotas);

        jmConsultas.setForeground(new java.awt.Color(0, 0, 255));
        jmConsultas.setText("Productos");
        jmConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiProducto.setText("Opciones Producto");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiProducto);

        jMenuBar1.add(jmConsultas);

        jmiReportes.setForeground(new java.awt.Color(0, 0, 255));
        jmiReportes.setText("Reportes");
        jmiReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiCompras.setText("Compras");
        jmiCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComprasActionPerformed(evt);
            }
        });
        jmiReportes.add(jmiCompras);

        jmiVentas.setText("Ventas");
        jmiVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVentasActionPerformed(evt);
            }
        });
        jmiReportes.add(jmiVentas);

        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmiReportes.add(jmiClientes);

        jmiProveedores.setText("Proveedores");
        jmiProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedoresActionPerformed(evt);
            }
        });
        jmiReportes.add(jmiProveedores);

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmiReportes.add(jmiProductos);

        jmProductoXProveedor.setText("Producto por Proveedor");
        jmProductoXProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductoXProveedorActionPerformed(evt);
            }
        });
        jmiReportes.add(jmProductoXProveedor);

        jMenuBar1.add(jmiReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Menu m1 = new Menu();
        m1.setVisible(true);
        m1.setLocationRelativeTo(null);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVentaActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        VentaView v = new VentaView();
        desktop.add(v);
        desktop.moveToFront(v);
    }//GEN-LAST:event_jmiVentaActionPerformed

    private void jmiCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCompraActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        CompraView com = new CompraView();
        desktop.add(com);
        desktop.moveToFront(com);
    }//GEN-LAST:event_jmiCompraActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ClienteView cli = new ClienteView();
        desktop.add(cli);
        desktop.moveToFront(cli);
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedorActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ProveedorView pro = new ProveedorView();
        desktop.add(pro);
        desktop.moveToFront(pro);
    }//GEN-LAST:event_jmiProveedorActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ProductoView producto = new ProductoView();
        desktop.add(producto);
        desktop.moveToFront(producto);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteClienteView reporte = new ReporteClienteView();
        desktop.add(reporte);
        desktop.moveToFront(reporte);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedoresActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteProveedorView reporte = new ReporteProveedorView();
        desktop.add(reporte);
        desktop.moveToFront(reporte);
    }//GEN-LAST:event_jmiProveedoresActionPerformed

    private void jmiVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVentasActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteVentaView reporte = new ReporteVentaView();
        desktop.add(reporte);
        desktop.moveToFront(reporte);
    }//GEN-LAST:event_jmiVentasActionPerformed

    private void jmiComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComprasActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteCompraView reporte = new ReporteCompraView();
        desktop.add(reporte);
        desktop.moveToFront(reporte);
    }//GEN-LAST:event_jmiComprasActionPerformed

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteProductoView reporte = new ReporteProductoView();
        desktop.add(reporte);
        desktop.moveToFront(reporte);
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmProXProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProXProveedorActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ProductoXProveedorView pxp = new ProductoXProveedorView();
        desktop.add(pxp);
        desktop.moveToFront(pxp);
    }//GEN-LAST:event_jmProXProveedorActionPerformed

    private void jmiDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetalleCompraActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        DetalleCompraView dc = new DetalleCompraView();
        desktop.add(dc);
        desktop.moveToFront(dc);
    }//GEN-LAST:event_jmiDetalleCompraActionPerformed

    private void jmiDetalleVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetalleVentaActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        DetalleVentaView dv = new DetalleVentaView();
        desktop.add(dv);
        desktop.moveToFront(dv);
    }//GEN-LAST:event_jmiDetalleVentaActionPerformed

    private void jmProductoXProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductoXProveedorActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        ReporteProductoProveedorView pxp = new ReporteProductoProveedorView();
        desktop.add(pxp);
        desktop.moveToFront(pxp);
    }//GEN-LAST:event_jmProductoXProveedorActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmInscripcion;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmNotas;
    private javax.swing.JMenuItem jmProXProveedor;
    private javax.swing.JMenuItem jmProductoXProveedor;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiCompra;
    private javax.swing.JMenuItem jmiCompras;
    private javax.swing.JMenuItem jmiDetalleCompra;
    private javax.swing.JMenuItem jmiDetalleVenta;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiProveedor;
    private javax.swing.JMenuItem jmiProveedores;
    private javax.swing.JMenu jmiReportes;
    private javax.swing.JMenuItem jmiVenta;
    private javax.swing.JMenuItem jmiVentas;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
