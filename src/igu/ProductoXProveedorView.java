package igu;

import fravemax.AccesoADatos.ProductoData;
import fravemax.AccesoADatos.ProductoXProveedorData;
import fravemax.AccesoADatos.ProveedorData;
import fravemax.Entidades.Producto;
import fravemax.Entidades.ProductoXProveedor;
import fravemax.Entidades.Proveedor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author RAFAEL
 */
public class ProductoXProveedorView extends javax.swing.JInternalFrame {

    ProveedorData proveedorData;
    ArrayList<Proveedor> proveedores;
    ProductoData productoData;
    ArrayList<Producto> productos;
    ProductoXProveedorData productoXProveedor;

    /**
     * Creates new form NuevoProducto
     */
    public ProductoXProveedorView() {
        initComponents();
        proveedorData = new ProveedorData();
        productoXProveedor = new ProductoXProveedorData();
        productoData = new ProductoData();
        proveedores = (ArrayList) proveedorData.listarProveedores();
        productos = (ArrayList) productoData.listarProductos();
        jbSeleccionar.setVisible(false);
        cbBuscar.setVisible(false);
        armarLista();
        armarListaProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("FraveMax.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPrecioCosto = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        cbActivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        cbProducto = new javax.swing.JComboBox<>();
        cbBuscar = new javax.swing.JComboBox<>();
        jbSeleccionar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Producto por Proveedor");
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(700, 430));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTO POR PROVEEDOR");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PRODUCTO:");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 204));
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtPrecioCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioCosto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecioCosto.setForeground(new java.awt.Color(0, 0, 204));
        txtPrecioCosto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 204));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbActualizar.setBackground(new java.awt.Color(204, 204, 255));
        jbActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 0, 204));
        jbActualizar.setText("Actualizar");
        jbActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 204));
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(204, 204, 255));
        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 204));
        jbBuscar.setText("Buscar");
        jbBuscar.setToolTipText("Click para seleccionar operacion");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        cbActivo.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ACTIVO:");

        jbBorrar.setBackground(new java.awt.Color(204, 204, 255));
        jbBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(0, 0, 204));
        jbBorrar.setText("Borrar");
        jbBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PRECIO COSTO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PROVEEDOR:");

        cbProveedor.setForeground(new java.awt.Color(0, 0, 204));

        cbProducto.setForeground(new java.awt.Color(0, 0, 204));

        cbBuscar.setForeground(new java.awt.Color(0, 0, 204));

        jbSeleccionar.setForeground(new java.awt.Color(0, 0, 204));
        jbSeleccionar.setText("SELECCIONAR OPERACION");
        jbSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbBuscar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPrecioCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbActivo)
                                    .addGap(32, 32, 32)
                                    .addComponent(jbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbBuscar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSeleccionar)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

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

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
      
        if (validarActualizar() == true) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos, primero realice busqueda para luego Actualizar");
        } else {
            if (txtId.getText() != null) {
                int id = Integer.parseInt(txtId.getText());
                Proveedor pro = null;
                Producto prod = null;
                try{
                pro = (Proveedor) cbProveedor.getSelectedItem();    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Proveedor no existe, seleccione un Proveedor");
                }
                try{
                prod = (Producto) cbProducto.getSelectedItem();    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Producto no existe, seleccione un Producto");
                }
                
                double precio = Double.parseDouble(txtPrecioCosto.getText());
                boolean activo = cbActivo.isEnabled();
                ProductoXProveedor producto = new ProductoXProveedor(id, pro, prod, precio, activo);
                productoXProveedor.modificarProductoxProveedor(producto);
            }
        }
//        if (txtId.getText() != null) {
//            int id = Integer.parseInt(txtId.getText());
//            String descripcion = txtProveedor.getText();
//            double precio = Double.parseDouble(txtProducto.getText());
//            int stock = Integer.parseInt(txtPrecioCosto.getText());
//            boolean activo = cbActivo.isEnabled();
//            Producto producto = new Producto(id, descripcion, precio, stock, activo);
//            productoData.modificarProducto(producto);
//        }

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        txtId.setText("");
        txtId.setBackground(Color.WHITE);
        cbProveedor.setEditable(true);
        cbProveedor.setSelectedItem("");
        cbProveedor.setBackground(Color.WHITE);
        cbProveedor.setEditable(false);
        cbProducto.setEditable(true);
        cbProducto.setSelectedItem("");
        cbProducto.setBackground(Color.WHITE);
        cbProducto.setEditable(false);
        txtPrecioCosto.setText("");
        txtPrecioCosto.setBackground(Color.WHITE);
        cbActivo.setSelected(false);
        cbActivo.setBackground(Color.WHITE);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        armarListaBuscar();
        jbSeleccionar.setVisible(true);
        cbBuscar.setVisible(true);
//        int id = Integer.parseInt(txtId.getText());
//        Producto producto = productoData.buscarProducto(id);
//        if (producto.getDescripcion() != null) {
//            txtId.setText(producto.getIdProducto() + "");
////            txtProveedor.setText(producto.getDescripcion());
////            txtProducto.setText(producto.getPrecioActual() + "");
//            txtPrecioCosto.setText(producto.getStock() + "");
//            cbActivo.doClick();
//        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if (validarGuardar() == true) {
            JOptionPane.showMessageDialog(this, "Producto no se pudo agregar al proveedor");
        } else {
            Proveedor pro = (Proveedor) cbProveedor.getSelectedItem();
            Producto prod = (Producto) cbProducto.getSelectedItem();
            double precio = Double.parseDouble(txtPrecioCosto.getText());
            boolean activo = cbActivo.isEnabled();
            ProductoXProveedor producto = new ProductoXProveedor(pro, prod, precio, activo);
            productoXProveedor.guardarProductoXProveedor(producto);
            txtId.setText(producto.getId() + "");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if (validarActualizar() == true) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos, primero realice busqueda para luego Borrar");
        } else {
            int id = Integer.parseInt(txtId.getText());
            productoXProveedor.eliminarProductoXProveedor(id);
        }

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(num || retroceso)) {
            JOptionPane.showMessageDialog(this, "Este campo es solo numerico y no admite espacios");
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        // TODO add your handling code here:
        txtId.setBackground(Color.WHITE);
        cbProveedor.setBackground(Color.WHITE);
        cbProducto.setBackground(Color.WHITE);
        txtPrecioCosto.setBackground(Color.WHITE);
        cbActivo.setBackground(Color.WHITE);
        
        ProductoXProveedor seleccionado = (ProductoXProveedor) cbBuscar.getSelectedItem();
        int id = seleccionado.getId();
        ProductoXProveedor pxp = productoXProveedor.buscarProductoXProveedor(id);

        txtId.setText(pxp.getId() + "");
        cbProveedor.setEditable(true);
        cbProveedor.setSelectedItem(pxp.getIdProveedor());
        cbProveedor.setEditable(false);
        cbProducto.setEditable(true);
        cbProducto.setSelectedItem(pxp.getIdProducto());
        cbProducto.setEditable(false);
        txtPrecioCosto.setText(pxp.getPrecioCosto() + "");
        cbActivo.setSelected(true);

        jbSeleccionar.setVisible(false);
        cbBuscar.setVisible(false);
        cbBuscar.removeAllItems();
    }//GEN-LAST:event_jbSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<ProductoXProveedor> cbBuscar;
    private javax.swing.JComboBox<Producto> cbProducto;
    private javax.swing.JComboBox<Proveedor> cbProveedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioCosto;
    // End of variables declaration//GEN-END:variables

    private void armarLista() {
        //cbProveedor.removeAllItems();
        for (Proveedor aux : proveedores) {
            cbProveedor.addItem(aux);
        }
    }

    private void armarListaProducto() {
        for (Producto aux : productos) {
            cbProducto.addItem(aux);
        }
    }

    private void armarListaBuscar() {
        ArrayList<ProductoXProveedor> lista = (ArrayList) productoXProveedor.listarProductos();
        for (ProductoXProveedor aux : lista) {
            cbBuscar.addItem(aux);
        }
    }

    private boolean validarGuardar() {
        boolean vacio = false;

        if (cbProveedor.getSelectedItem().toString().isEmpty()) {
            vacio = true;
            cbProveedor.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Proveedor no es valido");
        } else {
            cbProveedor.setBackground(Color.WHITE);
        }
        if (cbProducto.getSelectedItem().toString().isEmpty()) {
            vacio = true;
            cbProducto.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Producto no es valido");
        } else {
            cbProducto.setBackground(Color.WHITE);
        }
        if (txtPrecioCosto.getText().isEmpty()) {
            vacio = true;
            txtPrecioCosto.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Precio es obligatorio");
        } else {
            txtPrecioCosto.setBackground(Color.WHITE);
        }
        if (!cbActivo.isSelected()) {
            vacio = true;
            cbActivo.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Tilde ACTIVO");
        } else {
            cbActivo.setBackground(Color.WHITE);
        }

        return vacio;
    }

    private boolean validarActualizar() {
        boolean vacio = false;
        try{
        if (txtId.getText().isEmpty()) {
            vacio = true;
            txtId.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Id es obligatorio");
        } else {
            txtId.setBackground(Color.WHITE);
        }
        //Probar Try Catch para agarrar el nullpointereception que se genera en los combobox
        if (cbProveedor.getSelectedItem().toString().isEmpty()) {
            vacio = true;
            cbProveedor.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Proveedor no es valido");
        } else {
            cbProveedor.setBackground(Color.WHITE);
        }
        if (cbProducto.getSelectedItem().toString().isEmpty()) {
            vacio = true;
            cbProducto.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Producto no es valido");
        } else {
            cbProducto.setBackground(Color.WHITE);
        }
        if (txtPrecioCosto.getText().isEmpty()) {
            vacio = true;
            txtPrecioCosto.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Precio es obligatorio");
        } else {
            txtPrecioCosto.setBackground(Color.WHITE);
        }
        if (!cbActivo.isSelected()) {
            vacio = true;
            cbActivo.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Tilde ACTIVO");
        } else {
            cbActivo.setBackground(Color.WHITE);
        }
        }catch(Exception ex){
                 if(ex.equals(cbProveedor)){
                JOptionPane.showMessageDialog(this, "Proveedor no existe");
                 }
        }
        

        return vacio;
    }
}