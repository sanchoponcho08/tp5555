/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp5;

/**
 *
 * @author Kevin
 */
public class Directoriotelefonico extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Directoriotelefonico() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jtdireccion = new javax.swing.JTextField();
        jtapellido = new javax.swing.JTextField();
        jtnombre = new javax.swing.JTextField();
        jtciudad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jttelefono = new javax.swing.JTextField();
        jbnuevo = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(249, 243, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de contacto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 270, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("DNI:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Ciudad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jtdni.setText("jTextField1");
        jtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdniActionPerformed(evt);
            }
        });
        jPanel1.add(jtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 30));

        jtdireccion.setText("jTextField1");
        jPanel1.add(jtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 260, 30));

        jtapellido.setText("jTextField1");
        jPanel1.add(jtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 30));

        jtnombre.setText("jTextField1");
        jPanel1.add(jtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 260, 30));

        jtciudad.setText("jTextField1");
        jPanel1.add(jtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 450, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        jttelefono.setText("jTextField6");
        jttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 250, 30));

        jbnuevo.setText("Nuevo");
        jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jbguardar.setText("Guardar");
        jPanel1.add(jbguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jbborrar.setText("Borrar");
        jPanel1.add(jbborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jbsalir.setText("Salir");
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdniActionPerformed

    private void jttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttelefonoActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Directoriotelefonico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Directoriotelefonico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Directoriotelefonico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Directoriotelefonico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Directoriotelefonico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbborrar;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtciudad;
    private javax.swing.JTextField jtdireccion;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JTextField jttelefono;
    // End of variables declaration//GEN-END:variables
}