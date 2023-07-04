package igu;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;
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
public class ClienteView extends javax.swing.JInternalFrame {

    ArrayList<Cliente> clientes;

    ClienteData clienteData;

    /**
     * Creates new form NuevoCliente
     */
    public ClienteView() {
        initComponents();
        jlCliente.setVisible(false);
        cbClientes.setVisible(false);
        clienteData = new ClienteData();
        //armarLista();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        cbActivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cbClientes = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
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
        jLabel2.setText("CLIENTES");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRE:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DOMICILIO:");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 204));
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 204));
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

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
        jLabel7.setText("TELEFONO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("APELLIDO:");

        txtDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        txtDomicilio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDomicilio.setForeground(new java.awt.Color(0, 0, 204));
        txtDomicilio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 204));
        txtApellido.setToolTipText("Ingresar al menos 3 caracteres para buscar");
        txtApellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        cbClientes.setForeground(new java.awt.Color(0, 0, 204));

        jlCliente.setForeground(new java.awt.Color(0, 0, 204));
        jlCliente.setText("SELECCIONAR CLIENTE");
        jlCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbActivo)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtApellido))
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbBuscar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbActivo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
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
        if (vCamposActualizar() == true) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos, primero realice busqueda del "
                    + "cliente para actualizar");
        } else {
            if (txtId.getText() != null) {
                int id = Integer.parseInt(txtId.getText());
                String apellido = txtApellido.getText();
                String nombre = txtNombre.getText();
                String domicilio = txtDomicilio.getText();
                String telefono = txtTelefono.getText();
                boolean activo = cbActivo.isEnabled();
                Cliente cliente = new Cliente(id, apellido, nombre, domicilio, telefono, activo);
                clienteData.modificarCliente(cliente);
            }
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        txtId.setText("");
        txtId.setBackground(Color.WHITE);
        txtApellido.setText("");
        txtApellido.setBackground(Color.WHITE);
        txtNombre.setText("");
        txtNombre.setBackground(Color.WHITE);
        txtDomicilio.setText("");
        txtDomicilio.setBackground(Color.WHITE);
        txtTelefono.setText("");
        txtTelefono.setBackground(Color.WHITE);
        cbActivo.setSelected(false);
        cbActivo.setBackground(Color.WHITE);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        txtId.setBackground(Color.WHITE);
        txtApellido.setBackground(Color.WHITE);
        if (txtId.getText().isEmpty() && txtApellido.getText().isEmpty()) {
            txtId.setBackground(Color.ORANGE);
            txtApellido.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Debe completar el campo Id o el campo apellido, segun su "
                    + "preferencia de busqueda");
        } else if (txtId.getText().isEmpty()) {
            armarLista();
            if (clientes.isEmpty()) {
                txtApellido.setBackground(Color.ORANGE);
                JOptionPane.showMessageDialog(this, "No se encontraron coincidencias, por favor reintente");
            } else {
                cbClientes.setVisible(true);
                jlCliente.setVisible(true);
                //armarLista();
            }
        } else {
            int id = Integer.parseInt(txtId.getText());
            Cliente cliente = clienteData.buscarCliente(id);
            if (cliente.getNombre() != null) {
                txtId.setText(cliente.getIdCliente() + "");
                txtApellido.setText(cliente.getApellido());
                txtNombre.setText(cliente.getNombre());
                txtDomicilio.setText(cliente.getDomicilio());
                txtTelefono.setText(cliente.getTelefono());
                cbActivo.setSelected(true);
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here
        if (vCamposGuardar() == true) {
            JOptionPane.showMessageDialog(this, "Cliente no se pudo agregar");
        } else {
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();
            String domicilio = txtDomicilio.getText();
            String telefono = txtTelefono.getText();
            boolean activo = cbActivo.isEnabled();
            Cliente cliente = new Cliente(apellido, nombre, domicilio, telefono, activo);
            clienteData.guardarCliente(cliente);
            txtId.setText(cliente.getIdCliente() + "");
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if (vCamposActualizar() == true) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos, primero realice busqueda del "
                    + "cliente para borrarlo");
        } else {
            int id = Integer.parseInt(txtId.getText());
            clienteData.eliminarCliente(id);
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

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(num || retroceso)) {
            JOptionPane.showMessageDialog(this, "Este campo es solo numerico");
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean may = key >= 65 && key <= 90;
        boolean min = key >= 97 && key <= 122;
        boolean validar = vTeclas(key);

        if (!(may || min || validar)) {
            JOptionPane.showMessageDialog(this, "Este campo solo admite caracteres");
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean may = key >= 65 && key <= 90;
        boolean min = key >= 97 && key <= 122;
        boolean validar = vTeclas(key);

        if (!(may || min || validar)) {
            JOptionPane.showMessageDialog(this, "Este campo solo admite caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void jlClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlClienteActionPerformed
        // TODO add your handling code here:
        Cliente seleccionado = (Cliente) cbClientes.getSelectedItem();
        int id = seleccionado.getIdCliente();
        Cliente cliente = clienteData.buscarCliente(id);
        if (cliente.getNombre() != null) {
            txtId.setText(cliente.getIdCliente() + "");
            txtApellido.setText(cliente.getApellido());
            txtNombre.setText(cliente.getNombre());
            txtDomicilio.setText(cliente.getDomicilio());
            txtTelefono.setText(cliente.getTelefono());
            cbActivo.setSelected(true);
            cbClientes.setVisible(false);
            jlCliente.setVisible(false);
            cbClientes.removeAllItems();
        }
    }//GEN-LAST:event_jlClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<Cliente> cbClientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jlCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private boolean vTeclas(int key) {
        boolean validar = false;
        if (key == 32) {
            boolean espacio = true;
            validar = espacio;
        }
        if (key == 8) {
            boolean retroceso = true;
            validar = retroceso;
        }
        if (key == 11) {
            boolean tab = true;
            validar = tab;
        }
        if (key == 127) {
            boolean sup = true;
            validar = sup;
        }
        if (key == 10) {
            boolean enter = true;
            validar = enter;
        }
        return validar;
    }

    private boolean vCamposGuardar() {
        boolean vacio = false;

        if (txtApellido.getText().isEmpty()) {
            vacio = true;
            txtApellido.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Apellido no puede estar vacio");
        } else {
            txtApellido.setBackground(Color.WHITE);
        }
        if (txtNombre.getText().isEmpty()) {
            vacio = true;
            txtNombre.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio");
        } else {
            txtNombre.setBackground(Color.WHITE);
        }
        if (txtDomicilio.getText().isEmpty()) {
            vacio = true;
            txtDomicilio.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Domicilio no puede estar vacio");
        } else {
            txtDomicilio.setBackground(Color.WHITE);
        }
        if (txtTelefono.getText().isEmpty()) {
            vacio = true;
            txtTelefono.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El campo Telefono no puede estar vacio");
        } else {
            txtTelefono.setBackground(Color.WHITE);
        }
        if (!cbActivo.isSelected()) {
            vacio = true;
            cbActivo.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "El cliente debe estar activo");
        } else {
            cbActivo.setBackground(Color.WHITE);
        }

        return vacio;
    }

    private boolean vCamposActualizar() {
        boolean vacio = false;
        if (txtId.getText().isEmpty()) {
            vacio = true;
            txtId.setBackground(Color.YELLOW);
        } else {
            txtId.setBackground(Color.WHITE);
        }
        if (txtApellido.getText().isEmpty() || txtApellido.getText().startsWith("Ingr")) {
            vacio = true;
            txtApellido.setBackground(Color.YELLOW);
            txtApellido.setText("Ingresar Apellido para buscar, o buscar por Id");
        } else {
            txtApellido.setBackground(Color.WHITE);
        }
        if (txtNombre.getText().isEmpty()) {
            vacio = true;
        }
        if (txtDomicilio.getText().isEmpty()) {
            vacio = true;
        }
        if (txtTelefono.getText().isEmpty()) {
            vacio = true;
        }
        if (!cbActivo.isSelected()) {
            vacio = true;
        }

        return vacio;
    }

    private void armarLista() {
        String seleccionado = txtApellido.getText();
        clientes = (ArrayList<Cliente>) clienteData.listarClientesXapellido(seleccionado);
        for (Cliente aux : clientes) {
            cbClientes.addItem(aux);
        }

    }

    private void limpiarCampos() {
        txtApellido.setText("");
        txtApellido.setBackground(Color.WHITE);
        txtNombre.setText("");
        txtNombre.setBackground(Color.WHITE);
        txtDomicilio.setText("");
        txtDomicilio.setBackground(Color.WHITE);
        txtTelefono.setText("");
        txtTelefono.setBackground(Color.WHITE);
        cbActivo.setSelected(false);
        cbActivo.setBackground(Color.WHITE);
    }

}
