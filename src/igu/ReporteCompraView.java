package igu;

import fravemax.AccesoADatos.CompraData;
import fravemax.AccesoADatos.DetalleDeCompraData;
import fravemax.Entidades.Compra;
import fravemax.Entidades.DetalleDeCompra;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author RAFAEL
 */
public class ReporteCompraView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Compra> compras;
    private CompraData compraData;
    private DetalleDeCompraData dCompra;

    /**
     * Creates new form NotasView
     */
    public ReporteCompraView() {
        initComponents();
        modelo = new DefaultTableModel();
        compraData = new CompraData();
        dCompra = new DetalleDeCompraData();
        compras = (ArrayList) compraData.listarCompras();
        cargarCompras();
        armarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("FraveMax.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCompras = new javax.swing.JTable();
        jcCompra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Compras");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLE POR COMPRA");

        jtCompras.setBackground(new java.awt.Color(204, 204, 255));
        jtCompras.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtCompras.setForeground(new java.awt.Color(0, 0, 255));
        jtCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Detalle", "Cantidad", "Precio", "Producto"
            }
        ));
        jtCompras.setToolTipText("");
        jtCompras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtCompras.setOpaque(false);
        ((DefaultTableCellRenderer)jtCompras.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setViewportView(jtCompras);
        if (jtCompras.getColumnModel().getColumnCount() > 0) {
            jtCompras.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtCompras.getColumnModel().getColumn(1).setPreferredWidth(80);
            jtCompras.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtCompras.getColumnModel().getColumn(3).setPreferredWidth(360);
        }

        jcCompra.setBackground(new java.awt.Color(204, 204, 255));
        jcCompra.setForeground(new java.awt.Color(0, 0, 255));
        jcCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("COMPRA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        //jScrollPane1.setOpaque(false);
        //jScrollPane1.getViewport().setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompraActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        llenarTabla();
    }//GEN-LAST:event_jcCompraActionPerformed

    private void borrarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Compra> jcCompra;
    private javax.swing.JTable jtCompras;
    // End of variables declaration//GEN-END:variables

    private void cargarCompras() {
        for (Compra aux : compras) {
            jcCompra.addItem(aux);
        }
    }

    private void armarTabla() {
        ArrayList<Object> column = new ArrayList();
        column.add("Id Detalle");
        column.add("Cantidad");
        column.add("Precio costo");
        column.add("Id Compra");
        column.add("Producto");
        for (Object object : column) {
            modelo.addColumn(object);
        }
        jtCompras.setModel(modelo);
        jtCompras.getColumnModel().getColumn(0).setPreferredWidth(80);
        jtCompras.getColumnModel().getColumn(1).setPreferredWidth(80);
        jtCompras.getColumnModel().getColumn(2).setPreferredWidth(80);
        jtCompras.getColumnModel().getColumn(4).setPreferredWidth(80);
        jtCompras.getColumnModel().getColumn(4).setPreferredWidth(360);
    }

    private void llenarTabla() {
        Compra seleccionada = (Compra) jcCompra.getSelectedItem();
        ArrayList<DetalleDeCompra> detalle = (ArrayList<DetalleDeCompra>) dCompra.listarDetalleXProducto(seleccionada.getIdCompra());
        for (DetalleDeCompra aux : detalle) {
            modelo.addRow(new Object[]{aux.getIdDetalle(), aux.getCantidad(), aux.getPrecioCosto(), aux.getIdCompra().getIdCompra(), aux.getIdProducto().getDescripcion()});
        }

    }

}
