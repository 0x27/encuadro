/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasMiranda
 */
public class EditarJuego extends javax.swing.JFrame {
    /**
     * Creates new form EditarJuego
     */
    public EditarJuego() {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxObras = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        botonActivar = new javax.swing.JButton();
        botonAplicar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setText("ID");

        jLabel3.setText("Nombre");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Primera Obra");

        jComboBoxObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxObrasActionPerformed(evt);
            }
        });

        jLabel5.setText("Recorrido");

        jRadioButton1.setText("Lineal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Cíclico");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        botonActivar.setText("Activar Juego");
        botonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActivarActionPerformed(evt);
            }
        });

        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(botonActivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(botonAplicar)))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActivar)
                    .addComponent(botonAplicar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos(String id, String nombre, String ciclico, String activo) {//si el juego es ciclico, ciclico = 1 sino 0
                                                                             //activo = 1 si esta activo el juego
        labelID.setText(id);
        textNombre.setText(nombre);
        if (ciclico.equals("1")){
            jRadioButton2.setSelected(true);
        } else {
            jRadioButton1.setSelected(true);
            }
        if (activo.equals("1")){
            botonActivar.setEnabled(false);
        }
        
        String data = getObrasDeJuego(Integer.parseInt(id));
        String[] games1 = data.split("=>");
        jComboBoxObras.removeAllItems();
        for (int i=0;i<games1.length;i++){
            jComboBoxObras.addItem(games1[i]);
            
        }
        
    }
    
    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void botonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Desea confirmar éste juego como el único activo?") == JOptionPane.YES_OPTION){
                activarJuego(Integer.parseInt(labelID.getText()));
                this.dispose();
                ModificarJuego mj = new ModificarJuego();
                mj.setVisible(true);
                mj.setLocationRelativeTo(null);
                mj.setAlwaysOnTop(true);
                
                
        }
    }//GEN-LAST:event_botonActivarActionPerformed

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed
  if (!"".equals(textNombre.getText())){
           
        int id = Integer.parseInt(labelID.getText());
        int ciclico = 0;
        if (jRadioButton2.isSelected()==true){
            ciclico=1;
        }
        System.err.println("ciclico = "+ciclico+" idjuego = "+id);
        setJuego(id, textNombre.getText(), ciclico);
        if (jComboBoxObras.getSelectedIndex()!= -1){
            primeraDeJuego(id, jComboBoxObras.getSelectedItem().toString());
        }
        
        this.dispose();
        ModificarJuego mj = new ModificarJuego();
        mj.setVisible(true);
        mj.setLocationRelativeTo(null);
        mj.setAlwaysOnTop(true);
                
       }
        else{
           JOptionPane.showMessageDialog(rootPane,"Debe ingresarle un Nombre al Juego!");
       }
      
                
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void jComboBoxObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxObrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarJuego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActivar;
    private javax.swing.JButton botonAplicar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxObras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel labelID;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

    private static String getObrasDeJuego(int idJuego) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getObrasDeJuego(idJuego);
    }

    private static int activarJuego(int idJuego) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.activarJuego(idJuego);
    }

    private static int primeraDeJuego(int idJuego, java.lang.String nomObra) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.primeraDeJuego(idJuego, nomObra);
    }

    private static int setJuego(int idJuego, java.lang.String nombre, int recorrido) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.setJuego(idJuego, nombre, recorrido);
    }
}