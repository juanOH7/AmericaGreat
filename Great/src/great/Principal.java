/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package great;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


/**
 *
 * @author danie
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        administrarIlegales.cargarArchivo();
        System.out.println(administrarIlegales.getList().getHead());
        Image img = Toolkit.getDefaultToolkit().createImage("./trump2.jpg").getScaledInstance(640, 320, 0);
        this.lb_imgPrincipal.setIcon(new ImageIcon(img));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registro = new javax.swing.JDialog();
        lb_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        lb_fecha = new javax.swing.JLabel();
        tf_nacionalidad = new javax.swing.JTextField();
        lb_nacionalidad1 = new javax.swing.JLabel();
        jc_date = new com.toedter.calendar.JDateChooser();
        lb_raza = new javax.swing.JLabel();
        js_raza = new javax.swing.JSpinner();
        lb_pais = new javax.swing.JLabel();
        tf_pais = new javax.swing.JTextField();
        jb_agregarIlegal = new javax.swing.JButton();
        lb_imagenRegistro = new javax.swing.JLabel();
        lb_imgPrincipal = new javax.swing.JLabel();
        jb_menu = new javax.swing.JMenuBar();
        jm_menu1 = new javax.swing.JMenu();
        ji_registro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jd_registro.setTitle("Registro Ilegales");

        lb_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nombre.setText("Nombre: ");

        lb_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_fecha.setText("Fecha Nacimiento: ");

        lb_nacionalidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nacionalidad1.setText("Nacionalidad:");

        lb_raza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_raza.setText("Raza:");

        js_raza.setModel(new javax.swing.SpinnerListModel(new String[] {"Hispano", "Afroasiático", "Indioeuropeo", "Níger-Congo"}));

        lb_pais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_pais.setText("País Origen");

        jb_agregarIlegal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_agregarIlegal.setText("Agregar");
        jb_agregarIlegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarIlegalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jb_agregarIlegal))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_pais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nacionalidad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_raza, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jc_date, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(js_raza)
                            .addComponent(tf_pais))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(lb_imagenRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jd_registroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jc_date, tf_nacionalidad, tf_nombre});

        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_imagenRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nacionalidad1)
                            .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_fecha)
                            .addComponent(jc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_raza)
                            .addComponent(js_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_pais)
                            .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jb_agregarIlegal)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jd_registroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lb_nombre, tf_nombre});

        jd_registroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jc_date, lb_fecha, lb_nacionalidad1, tf_nacionalidad});

        jd_registroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lb_pais, lb_raza});

        jd_registroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {js_raza, tf_pais});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("America Great");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jm_menu1.setText("File");

        ji_registro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ji_registro.setText("Registro");
        ji_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ji_registroActionPerformed(evt);
            }
        });
        jm_menu1.add(ji_registro);

        jb_menu.add(jm_menu1);

        jMenu2.setText("Edit");
        jb_menu.add(jMenu2);

        setJMenuBar(jb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lb_imgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lb_imgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ji_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ji_registroActionPerformed
        // TODO add your handling code here:
        Image img = Toolkit.getDefaultToolkit().createImage("./trump1.jpg").getScaledInstance(220, 293, 0);
        this.lb_imagenRegistro.setIcon(new ImageIcon(img));
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setLocationRelativeTo(this); 
        jd_registro.setVisible(true);

    }//GEN-LAST:event_ji_registroActionPerformed

    private void jb_agregarIlegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarIlegalActionPerformed
        // TODO add your handling code here:
        String fecha = ((JTextField)jc_date.getDateEditor().getUiComponent()).getText();
        Ilegal ilegal = new Ilegal(tf_nombre.getText(),tf_nacionalidad.getText(),fecha,js_raza.getValue().toString(),tf_pais.getText(),false);
        administrarIlegales.write(ilegal);
        //administrarIlegales.getList().add(ilegal);
    }//GEN-LAST:event_jb_agregarIlegalActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        administrarIlegales.refresh();
    }//GEN-LAST:event_formWindowClosed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton jb_agregarIlegal;
    private javax.swing.JMenuBar jb_menu;
    private com.toedter.calendar.JDateChooser jc_date;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JMenuItem ji_registro;
    private javax.swing.JMenu jm_menu1;
    private javax.swing.JSpinner js_raza;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_imagenRegistro;
    private javax.swing.JLabel lb_imgPrincipal;
    private javax.swing.JLabel lb_nacionalidad1;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_pais;
    private javax.swing.JLabel lb_raza;
    private javax.swing.JTextField tf_nacionalidad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables
    AdminIlegales administrarIlegales = new 
        AdminIlegales("./ilegales.bin");
    
}
