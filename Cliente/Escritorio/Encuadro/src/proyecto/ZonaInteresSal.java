/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyecto.clases.Global;

/**
 *
 * @author SysAdmin
 */
public class ZonaInteresSal extends javax.swing.JFrame {
    ProcesandoPeticion prc = new ProcesandoPeticion();
    
    /**
     * Creates new form ZonaInteresSal
     */
    public ZonaInteresSal() {
        Image ico = new ImageIcon(Global.directorioLocal + "\\museo.png").getImage();
        setIconImage(ico);
        initComponents();
        prc.setLocationRelativeTo(null);
        prc.setVisible(true);
        this.setLocationRelativeTo(null);
        String data = getSalas();
        String[] games1 = data.split("=>");
        String x = null;
        int c = 0;
        int d = 0;
        for (int r=0; r<games1.length; r++){
            x = games1[r];
            tablaSal.setValueAt(x, d, c);
            c++;
            if(c>1){
                c=0;
                d++;
            }
        }
        prc.dispose();
        
        if(d == 0){
            BotContinuar.setEnabled(false);
            if(JOptionPane.showConfirmDialog(rootPane, "Actualmente no existen Salas en el sistema.\n¿Deseas crear una Sala nueva?") == JOptionPane.YES_OPTION){
                AltaSala alSal = new AltaSala();
                alSal.setVisible(true);
                this.dispose();
            }
        }        
    }

    /**
     * Setea el titulo de ventana y del formulario
     * @param titulo 
     */
    public ZonaInteresSal(String titulo) {
        initComponents();
        prc.setLocationRelativeTo(null);
        prc.setVisible(true);
        this.setLocationRelativeTo(null);
        lbl_titulo.setText(titulo + " (1 de 3)");
        this.setTitle(titulo);
        String data = getSalas();
        String[] games1 = data.split("=>");
        String x = null;
        int c = 0;
        int d = 0;
        for (int r=0;r<games1.length;r++){
            x = games1[r];
            tablaSal.setValueAt(x, d, c);
            c++;
            if(c>1){
                c=0;
                d++;
            }
        }
        prc.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotContinuar = new javax.swing.JButton();
        BotCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSal = new javax.swing.JTable();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Zona de Interés");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("1- Seleccione la Sala donde se ubica la Obra:");

        BotContinuar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotContinuar.setText("Continuar >>");
        BotContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotContinuarActionPerformed(evt);
            }
        });

        BotCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotCancelar.setText("Cancelar");
        BotCancelar.setToolTipText("Cerrar la ventana actual");
        BotCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCancelarActionPerformed(evt);
            }
        });

        tablaSal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaSal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaSalKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSal);
        tablaSal.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaSal.getColumnModel().getColumn(1).setPreferredWidth(350);

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_titulo.setText("Agregar Zona de Interés (1 de 3)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotCancelar)
                    .addComponent(BotContinuar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotContinuarActionPerformed
        // TODO add your handling code here:
        int seleccion =  tablaSal.getSelectedRow();
        
        if(seleccion == -1 || tablaSal.getValueAt(seleccion, 0) == null ) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una sala válida.");
        }else{
            String x = (String) tablaSal.getValueAt(seleccion, 0);
            Global.IdSala = Integer.parseInt(x);
            ZonaInteresOb zio = new ZonaInteresOb(this.getTitle());
            zio.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BotContinuarActionPerformed

    private void BotCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCancelarActionPerformed
        // TODO add your handling code here:
        Global.zag = false;
        Global.zelim = false;
        Global.zmod = false;
        Global.IdSala = 0;
        this.dispose();
    }//GEN-LAST:event_BotCancelarActionPerformed

    private void tablaSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaSalKeyPressed
        // TODO add your handling code here:
             int k =evt.getKeyCode();
        if(k == KeyEvent.VK_ENTER){

        BotContinuarActionPerformed(null);
        }
    }//GEN-LAST:event_tablaSalKeyPressed

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
            java.util.logging.Logger.getLogger(ZonaInteresSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZonaInteresSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZonaInteresSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZonaInteresSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZonaInteresSal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotCancelar;
    private javax.swing.JButton BotContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tablaSal;
    // End of variables declaration//GEN-END:variables

    private static String getSalas() {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getSalas();
    }

}
