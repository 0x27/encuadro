/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto.clases.FileUpload;
import proyecto.clases.Global;
import proyecto.clases.MediaPanelAudio;
import proyecto.clases.prbQT;

/**
 *
 * @author SysAdmin
 */
public class EliminarObra2 extends javax.swing.JFrame {
    private DefaultListModel modelListaObras = new DefaultListModel();
    String[] sep;
    ProcesandoPeticion prc = new ProcesandoPeticion();
    boolean vacio = false;
    
//    static {
//        if (!vtkNativeLibrary.LoadAllNativeLibraries()) {
//            for (vtkNativeLibrary lib : vtkNativeLibrary.values()) {
//                if (!lib.IsLoaded()) {
//                    System.out.println(lib.GetLibraryName() + " not loaded");
//                }
//            }
//        }
//        vtkNativeLibrary.DisableOutputWindow(null);
//    }
    
    /**
     * Creates new form EliminarObra2
     */
    public EliminarObra2() {        
        Image ico = new ImageIcon(Global.directorioLocal + "\\museo.png").getImage();
        setIconImage(ico);
        initComponents();
        prc.setLocationRelativeTo(null);
        prc.setVisible(true);
        this.setLocationRelativeTo(null);
        ListaObras.setModel(modelListaObras);
        labVisi(false);
        CargarLista();
        //imagen por defecto
        CambiarImagenLabel(new File(Global.directorioLocal + "/imagen_default.jpg"), LabImagen);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaObras = new javax.swing.JList();
        BotCancelar = new javax.swing.JButton();
        BotAtras = new javax.swing.JButton();
        BotEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabVideo = new javax.swing.JLabel();
        LabAudio = new javax.swing.JLabel();
        LabMod3D = new javax.swing.JLabel();
        BotVideo = new javax.swing.JButton();
        BotAudio = new javax.swing.JButton();
        BotModelo = new javax.swing.JButton();
        LabVideo2 = new javax.swing.JTextField();
        LabAudio2 = new javax.swing.JTextField();
        LabMod3D2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        laba1 = new javax.swing.JTextField();
        laba2 = new javax.swing.JTextField();
        laba3 = new javax.swing.JTextField();
        laba4 = new javax.swing.JTextField();
        laba5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LabText2 = new javax.swing.JTextArea();
        LabText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabImagen = new javax.swing.JLabel();
        LabNomObra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabAutor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Obra");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("2- Seleccione de la lista la Obra que desee eliminar:");

        jPanel2.setPreferredSize(new java.awt.Dimension(873, 350));

        ListaObras.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ListaObras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ListaObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaObrasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaObras);

        BotCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotCancelar.setText("Cancelar");
        BotCancelar.setToolTipText("Cerrar esta ventana");
        BotCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCancelarActionPerformed(evt);
            }
        });

        BotAtras.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotAtras.setText("<< Atrás");
        BotAtras.setToolTipText("Volver a la selección de Sala");
        BotAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAtrasActionPerformed(evt);
            }
        });

        BotEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotEliminar.setText("Eliminar");
        BotEliminar.setToolTipText("Borrar la Sala seleccionada");
        BotEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenidos"));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        LabVideo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabVideo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabVideo.setText("Video:");
        LabVideo.setFocusable(false);

        LabAudio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabAudio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabAudio.setText("Audio:");
        LabAudio.setFocusable(false);

        LabMod3D.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabMod3D.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabMod3D.setText("Modelo 3D:");
        LabMod3D.setFocusable(false);

        BotVideo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotVideo.setText("Ver");
        BotVideo.setToolTipText("Reproducir el video asociado");
        BotVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotVideoActionPerformed(evt);
            }
        });

        BotAudio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotAudio.setText("Ver");
        BotAudio.setToolTipText("Reproducir el audio asociado");
        BotAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAudioActionPerformed(evt);
            }
        });

        BotModelo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotModelo.setText("Ver");
        BotModelo.setToolTipText("Mostrar el modelo 3D asociado");
        BotModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotModeloActionPerformed(evt);
            }
        });

        LabVideo2.setEditable(false);
        LabVideo2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        LabAudio2.setEditable(false);
        LabAudio2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        LabMod3D2.setEditable(false);
        LabMod3D2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Animación:");
        jLabel4.setFocusable(false);

        laba1.setEditable(false);
        laba1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        laba2.setEditable(false);
        laba2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        laba3.setEditable(false);
        laba3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        laba4.setEditable(false);
        laba4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        laba5.setEditable(false);
        laba5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        LabText2.setEditable(false);
        LabText2.setBackground(new java.awt.Color(240, 240, 240));
        LabText2.setColumns(20);
        LabText2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabText2.setLineWrap(true);
        LabText2.setRows(5);
        LabText2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(LabText2);

        LabText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabText.setText("Texto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(laba5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabMod3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabMod3D2)
                            .addComponent(LabVideo2)
                            .addComponent(LabAudio2)
                            .addComponent(laba1)
                            .addComponent(laba2)
                            .addComponent(laba3)
                            .addComponent(laba4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotAudio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotVideo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabVideo)
                    .addComponent(BotVideo)
                    .addComponent(LabVideo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabAudio)
                    .addComponent(BotAudio)
                    .addComponent(LabAudio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabMod3D, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabMod3D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(laba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laba2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(laba4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laba5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabText))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        LabImagen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));
        LabImagen.setFocusable(false);
        LabImagen.setPreferredSize(new java.awt.Dimension(256, 234));

        LabNomObra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabNomObra.setText("Nombre de la Obra");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabNomObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LabNomObra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Autor:");

        LabAutor.setEditable(false);
        LabAutor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotCancelar)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LabAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotCancelar)
                    .addComponent(BotEliminar)
                    .addComponent(BotAtras))
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar Obra (2 de 2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaObrasValueChanged
        // TODO add your handling code here:
        prc.setVisible(true);
        LabNomObra.setText(ListaObras.getSelectedValue().toString());
        String cont = getContenidoObra(ListaObras.getSelectedValue().toString());
        sep = cont.split("=>");
        LabAutor.setText(sep[7]);
        File path = null;
        path = new File(Global.directorioTemporal + "/imatmp.jpeg");
        try {
            FileUpload.download(sep[5], path);
        } catch (MalformedURLException ex) {
            Logger.getLogger(EliminarObra2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EliminarObra2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //mostrar la imagen sin perder la relacion de aspecto
        CambiarImagenLabel(path, LabImagen);
        
        mostrarContenido(LabAudio2, sep[1], BotAudio);
        mostrarContenido(LabVideo2, sep[2], BotVideo);
        mostrarContenido(LabMod3D2, sep[4], BotModelo);
        if(sep[3].equals("null")){
            LabText2.setText("No existe contenido.");
        }else{
            LabText2.setText(sep[3]);
        }
        if(sep[8].equals("null") || sep[9].equals("null") || sep[10].equals("null") || sep[11].equals("null") || sep[12].equals("null") ){
        laba1.setText("No existe contenido.");
        laba2.setText("No existe contenido.");
        laba3.setText("No existe contenido.");
        laba4.setText("No existe contenido.");
        laba5.setText("No existe contenido.");
        }else{
        laba1.setText(sep[8]);
        laba2.setText(sep[9]);
        laba3.setText(sep[10]);
        laba4.setText(sep[11]);
        laba5.setText(sep[12]);
        }
        prc.dispose();
        labVisi(true);
    }//GEN-LAST:event_ListaObrasValueChanged

    private void BotVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotVideoActionPerformed
        // TODO add your handling code here:
        //MediaPanel mediaPanel = null;
        File video = null;
        video = new File(Global.directorioTemporal + "/video.mov");
        try {
            FileUpload.download(sep[2], video);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        }
        Global.fvid = video ;
       /* URL mediaURL = null;
        try{
            mediaURL = video.toURL();
        }
        catch ( MalformedURLException malformedURLException ){
            System.err.println( "No se pudo crear la URL" );
        }*/
        
        if ( Global.fvid != null ){
            //repAudioyVideo   repAudVi = new repAudioyVideo(video.getPath());
            prbQT frame = new prbQT("Simple QTJ Player"); 
             frame.pack(); 
             frame.setVisible(true); 
        try { 
            frame.movie.start(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        }else{
            JOptionPane.showMessageDialog(rootPane, "El archivo que has seleccionado no está disponible.");
        }
    }//GEN-LAST:event_BotVideoActionPerformed

    private void BotAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAudioActionPerformed
        // TODO add your handling code here:
        MediaPanelAudio mediaPanel = null;
        File audio = null;
        audio = new File(Global.directorioTemporal + "/audio.mp3");
        String dir = sep[0] + "/audio/";
        try {
            FileUpload.download(sep[1], audio);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        URL mediaURL = null;
        try{
            mediaURL = audio.toURL();
        }
        catch ( MalformedURLException malformedURLException ){
            System.err.println( "No se pudo crear la URL" );
        }
        if ( mediaURL != null ){
            mediaPanel = new MediaPanelAudio( mediaURL );
        }else{
            JOptionPane.showMessageDialog(rootPane, "El archivo que has seleccionado no está disponible.");
        }
    }//GEN-LAST:event_BotAudioActionPerformed

    private void BotModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotModeloActionPerformed
        // TODO add your handling code here:
        File modelo = null;
        modelo = new File(Global.directorioTemporal + "/modelo.pod");
        String dir = sep[0] + "/modelo/";
        try {
            FileUpload.download(sep[4], modelo);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        vtkRenderer render = new vtkRenderer();
//        vtkRenderWindow renderWindow = new vtkRenderWindow();
//        renderWindow.AddRenderer(render);
//        vtkRenderWindowInteractor renderWindowInteractor = new vtkRenderWindowInteractor();
//        renderWindowInteractor.SetRenderWindow(renderWindow);
//        vtkPLYReader mod = new vtkPLYReader();
//        mod.SetFileName(modelo.getAbsolutePath());
//        mod.Update();
//        vtkElevationFilter colorIt = new vtkElevationFilter();
//        colorIt.SetInput(mod.GetOutput());
//        colorIt.SetLowPoint(0, 0, -1);
//        colorIt.SetHighPoint(0, 0, 1);
//        vtkPolyDataMapper point = new vtkPolyDataMapper();
//        point.SetInputConnection(mod.GetOutputPort());
//        vtkActor actor = new vtkActor();
//        actor.SetMapper(point);
//        render.AddActor(actor);
//        render.SetBackground(1, 1, 1);
//        renderWindow.SetSize(500, 500);
//        renderWindow.SetPosition(450, 200);
//        renderWindow.Render();
//        renderWindowInteractor.Start();
//        render.Delete();
//        renderWindow.Delete();
//        renderWindowInteractor.Delete();
//        mod.Delete();
//        colorIt.Delete();
//        actor.Delete();
    }//GEN-LAST:event_BotModeloActionPerformed

    private void BotCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCancelarActionPerformed
        // TODO add your handling code here:
        Global.IdSala = 0;
        this.dispose();
    }//GEN-LAST:event_BotCancelarActionPerformed

    private void BotAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAtrasActionPerformed
        // TODO add your handling code here:
        Global.IdSala = 0;
        this.dispose();
        EliminarObra elim = new EliminarObra();
        elim.setVisible(true);        
    }//GEN-LAST:event_BotAtrasActionPerformed

    private void BotEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotEliminarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(rootPane, "¿Deseas eliminar la Obra seleccionada?") == JOptionPane.YES_OPTION){
            int x = Integer.parseInt(sep[0]);
            prc.setVisible(true);
            
            if(borrarObra(x) == 0){                
                prc.dispose();
                if(JOptionPane.showConfirmDialog(rootPane, "Se eliminó correctamente la Obra seleccionada.\n¿Deseas eliminar otra Obra?") == JOptionPane.YES_OPTION){
                    BotAtras.doClick();
                }else{
                    Global.IdSala = 0;
                    this.dispose();
                }
            }else{
                prc.dispose();
                JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar la Obra.");
            }
        }
    }//GEN-LAST:event_BotEliminarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        if(vacio == true){  //cierra la ventana si la Sala no tiene Obras
            this.dispose();
            EliminarObra eliOb = new EliminarObra();
            eliOb.setVisible(true);
            Global.IdSala = 0;
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(EliminarObra2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarObra2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarObra2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarObra2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarObra2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAtras;
    private javax.swing.JButton BotAudio;
    private javax.swing.JButton BotCancelar;
    private javax.swing.JButton BotEliminar;
    private javax.swing.JButton BotModelo;
    private javax.swing.JButton BotVideo;
    private javax.swing.JLabel LabAudio;
    private javax.swing.JTextField LabAudio2;
    private javax.swing.JTextField LabAutor;
    private javax.swing.JLabel LabImagen;
    private javax.swing.JLabel LabMod3D;
    private javax.swing.JTextField LabMod3D2;
    private javax.swing.JLabel LabNomObra;
    private javax.swing.JLabel LabText;
    private javax.swing.JTextArea LabText2;
    private javax.swing.JLabel LabVideo;
    private javax.swing.JTextField LabVideo2;
    private javax.swing.JList ListaObras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField laba1;
    private javax.swing.JTextField laba2;
    private javax.swing.JTextField laba3;
    private javax.swing.JTextField laba4;
    private javax.swing.JTextField laba5;
    // End of variables declaration//GEN-END:variables
    private static String getObraSala(int id) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getObraSala(id);
    }
    private static String getContenidoObra(java.lang.String nombre) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getContenidoObra(nombre);
    }
    private static int borrarObra(int idSala) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.borrarObra(idSala);
    }
    private void CargarLista(){
        String data = getObraSala(Global.IdSala);
        String[] sep = data.split("=>");
        String e = null;
        //Boolean vacio = false;
        
        for (int i=0;i<sep.length;i++){
            e = sep[i];

            if("".equals(e)){
                modelListaObras.addElement("< Lista vacía >");
                prc.dispose();
                JOptionPane.showMessageDialog(rootPane, "La Sala seleccionada no tiene Obras asociadas", "Sala vacía", 1);
                vacio = true;
            }else{
                modelListaObras.addElement(e);
                vacio = false;
            }
        }
        prc.dispose();
    }
    private void labVisi(Boolean siono){
        if(siono == true){
            BotVideo.setEnabled(true);
            BotAudio.setEnabled(true);
            BotModelo.setEnabled(true);
            BotEliminar.setEnabled(true);
        }else{
            BotVideo.setEnabled(false);
            BotAudio.setEnabled(false);
            BotModelo.setEnabled(false);
            BotEliminar.setEnabled(false);
        }
    }
    private void mostrarContenido(JTextField label, String dat, JButton bot){
        if(dat.equals("null")){
            label.setText("No existe contenido.");
            bot.setEnabled(false);
        }else{
            label.setText(dat);
            bot.setEnabled(true);
        }
    }
    
    private void CambiarImagenLabel(File path, JLabel label){
        BufferedImage read = null;
        try {
            read = ImageIO.read(path);
        } catch (IOException ex) {
            Logger.getLogger(ListarObra2.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        //mostrar la imagen sin perder la relacion de aspecto
        float height = (float)read.getHeight();
        float width = (float)read.getWidth();
        float maxH = (float) 280;
        float maxV = (float) 230;
        float relacion = 1;
        
        if(height > width){ //imagen vertical
            relacion = height / maxV;
        }else if(width > height){ //imagen horizontal
            relacion =  width / maxH;
        }else{ //imagen cuadrada
            relacion = height / maxV;
        }
        
        //Image scaledInstance = read.getScaledInstance(290, 230, Image.SCALE_DEFAULT);
        Image scaledInstance = read.getScaledInstance((int)(width/relacion), (int)(height/relacion), Image.SCALE_DEFAULT);
        //im.getImage().flush();
        label.setIcon(new ImageIcon(scaledInstance));
    }

}
