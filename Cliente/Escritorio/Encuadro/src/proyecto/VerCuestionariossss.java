/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyecto.clases.Global;

/**
 *
 * @author LucasMiranda
 */
public class VerCuestionariossss extends javax.swing.JFrame {
    
    ProcesandoPeticion prc = new ProcesandoPeticion();
    String[] games1 = null;
    String[] games12 = null;
    int i;
    
    public VerCuestionariossss() {
        initComponents();
        
        Image icono = new ImageIcon(Global.directorioLocal + "\\museo.png").getImage();
        setIconImage(icono);
        String data = getCuestionarios();
        System.out.println(data);
        games1 = data.split("=>");
        String x = null;
        int c = 0;
        int d = 0;
        for (int r=0; r<games1.length; r++){
            x = games1[r];
            if (c==5 && x.equals("")){
                x = "              -";
            }
            //System.out.println(data);
            jTableCuest.setValueAt(x, d, c);
            c++;
            
            if(c>5){
                c=0;
                d++;
            }
        }        
        prc.dispose();
        
        if(d == 0 && (c==0 || c==1)){
            //BotContinuar.setEnabled(false);
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(rootPane, "Actualmente no existen Cuestionarios en el sistema."); 
            System.out.println(this.toString());
                CrearEncuesta1 alSal = new CrearEncuesta1();
                alSal.setAlwaysOnTop(true);
                this.dispose();
            
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuest = new javax.swing.JTable();
        listapreg = new java.awt.List();
        list2 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelgrupo = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuestionarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        jTableCuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Creador", "Fecha Creado", "Fecha Desactivado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCuestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCuest);
        jTableCuest.getColumnModel().getColumn(0).setMinWidth(50);
        jTableCuest.getColumnModel().getColumn(0).setMaxWidth(50);
        jTableCuest.getColumnModel().getColumn(3).setMinWidth(80);
        jTableCuest.getColumnModel().getColumn(3).setMaxWidth(80);
        jTableCuest.getColumnModel().getColumn(4).setMinWidth(130);
        jTableCuest.getColumnModel().getColumn(4).setMaxWidth(130);
        jTableCuest.getColumnModel().getColumn(5).setMinWidth(130);
        jTableCuest.getColumnModel().getColumn(5).setMaxWidth(130);

        listapreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listapregMouseClicked(evt);
            }
        });
        listapreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listapregActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Preguntas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Opciones");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelgrupo.setText("                                                  ");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listapreg, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButtonModificar)))
                                .addGap(36, 36, 36)
                                .addComponent(jButton1)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelgrupo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(labelgrupo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButtonModificar)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listapreg, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listapregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listapregActionPerformed

    private void jTableCuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCuestMouseClicked
        listapreg.removeAll();
        
        String data = getTextPreguntas(Integer.parseInt(games1[jTableCuest.getSelectedRow()*6]));
        System.out.println(data);
        games12 = data.split("=>");
        
        
        System.out.println(getTextPreguntas(Integer.parseInt(games1[jTableCuest.getSelectedRow()*6])));
        for (i=0; i< games12.length; i++){
            if ((i-3)%5==0){
                listapreg.add(games12[i-1]+") "+games12[i]);
            }
        }
    }//GEN-LAST:event_jTableCuestMouseClicked

    private void listapregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listapregMouseClicked
        list2.removeAll();
        System.out.println("id de pregunta "+games12[listapreg.getSelectedIndex()*5+1]);
        String algo = getRespPreguntas(Integer.parseInt(games12[listapreg.getSelectedIndex()*5+1]));
        System.out.println("aaaaaaaaaaaaaaaaa "+algo);
        String[] games123 = algo.split("=>");
        if (games123[0].equals("-1") || algo.equals("-1")){
            list2.add("--PREGUNTA ABIERTA--");
            labelgrupo.setText("");
        } else{
            labelgrupo.setText("Grupo: "+getOpcPregunta(Integer.parseInt(games12[listapreg.getSelectedIndex()*5+1])));
            for(int k=0; k<games123.length; k++){
                    list2.add(games123[k]);
                }
            }
        
    }//GEN-LAST:event_listapregMouseClicked

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeiconified

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        //modificar
        if (jTableCuest.getSelectedRow()!=-1){
        int id_cuest = Integer.parseInt(games1[jTableCuest.getSelectedRow()*6]);
        
        System.out.println("id cuestionario "+id_cuest);
        this.dispose();
        CrearEncuesta1 e = new CrearEncuesta1();
        e.setVisible(true);
        e.setAlwaysOnTop(true);
        e.setLocationRelativeTo(null);
        e.actualizar(1, id_cuest);
        
        } else {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un Cuestionario para poder Modificarlo!"); 
            
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 int selectedValue =JOptionPane.showConfirmDialog(rootPane, "Confirma que desea Eliminar el Cuestionario?");
        if(selectedValue == JOptionPane.YES_OPTION ){
        if (jTableCuest.getSelectedRow()!=-1){
            
            int res = isPreguntaAsociadaACuestionario(games1[jTableCuest.getSelectedRow()*6]);
            System.out.println("res........................ "+res);
            
            if (res>0 && res!=9999){
                //no se puede eliminar
                this.setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(rootPane, "No es posible eliminar este Cuestionario porque ya ha sido completado por algun visitante del Museo!"); 
                
            } else{
                if (res==0){
                    //eliminar
                    
                    System.out.println("borrado cuest 0?? ... "+borrarCuestionario(Integer.parseInt(games1[jTableCuest.getSelectedRow()*6])));
                    
                    System.out.println("borrado relaciones 0?? ... "+borrarRelacionPreguntasCuestionario(Integer.parseInt(games1[jTableCuest.getSelectedRow()*6])));
                    
                } else {
                    this.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(rootPane, "No es posible realizar su solicitud en este momento! Intente mas tarde o comuníquese con el Soporte Técnico!"); 
                
                }
            }
        } else {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un Cuestionario para poder Eliminarlo!");
        }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VerCuestionariossss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCuestionariossss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCuestionariossss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCuestionariossss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCuestionariossss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCuest;
    private javax.swing.JLabel labelgrupo;
    private java.awt.List list2;
    private java.awt.List listapreg;
    // End of variables declaration//GEN-END:variables

    private static String getCuestionarios() {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getCuestionarios();
    }

    private static String getTextPreguntas(int idCuest) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getTextPreguntas(idCuest);
    }

    private static String getPreguntas(int idCuest) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getPreguntas(idCuest);
    }

    private static String getRespPreguntas(int idPreg) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getRespPreguntas(idPreg);
    }

    private static String getOpcPregunta(int idPreg) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getOpcPregunta(idPreg);
    }

    private static int isPreguntaAsociadaACuestionario(java.lang.String idPreg) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.isPreguntaAsociadaACuestionario(idPreg);
    }

    private static int borrarCuestionario(int idCuest) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.borrarCuestionario(idCuest);
    }

    private static int borrarRelacionPreguntasCuestionario(int idCuest) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.borrarRelacionPreguntasCuestionario(idCuest);
    }
}
