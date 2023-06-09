package igu;

import fravemax.AccesoADatos.ProductoData;
import fravemax.Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author RAFAEL
 */
public class ReporteProductoView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ProductoData productoData;

    /**
     * Creates new form ReporteProductoView
     */
    public ReporteProductoView() {
        initComponents();
        modelo = new DefaultTableModel();
        productoData = new ProductoData();
        armarTabla();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/FraveMax.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Productos");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE PRODUCTOS");

        jtClientes.setBackground(new java.awt.Color(204, 204, 255));
        jtClientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtClientes.setForeground(new java.awt.Color(0, 0, 255));
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descripcion", "Precio", "stock"
            }
        ));
        jtClientes.setToolTipText("");
        jtClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtClientes.getColumnModel().getColumn(1).setPreferredWidth(360);
            jtClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClientes;
    // End of variables declaration//GEN-END:variables



    private void armarTabla() {
        ArrayList<Object> column = new ArrayList();
        column.add("Id");
        column.add("Descripcion");
        column.add("Precio");
        column.add("Stock");        
        for (Object object : column) {
            modelo.addColumn(object);
        }
        jtClientes.setModel(modelo);
        jtClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtClientes.getColumnModel().getColumn(1).setPreferredWidth(360);
        jtClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    private void llenarTabla() {
        ArrayList<Producto> producto = (ArrayList<Producto>) productoData.listarProductos();
        for (Producto aux : producto) {
                modelo.addRow(new Object[]{aux.getIdProducto(), aux.getDescripcion(), aux.getPrecioActual(), aux.getStock()});
            
            
        }

    }

}
