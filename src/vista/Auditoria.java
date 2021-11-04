
package vista;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logica.Logica;

public class Auditoria extends JFrame{
    
    public String usuario;
    public String contrasena;
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    List<String> listDirectorios = new ArrayList<String>();
    public Logica db;
    ResultSet resultado;



    public Auditoria(){
        initComponents();
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Auditoria"); //Título
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        btnCrear1 = new javax.swing.JButton();
        btnCrear2 = new javax.swing.JButton();
        btnCrear3 = new javax.swing.JButton();
        btnCrear4 = new javax.swing.JButton();
        btnCrear5 = new javax.swing.JButton();
        btnCrear6 = new javax.swing.JButton();
        btnCrear7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jSeparator1.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 670, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 510, 220));

        btnCrear.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear.setText("Auditoria de intentos acertados");
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 30));

        btnCrear1.setBackground(new java.awt.Color(0, 0, 0));
        btnCrear1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear1.setForeground(new java.awt.Color(204, 255, 255));
        btnCrear1.setText("Consultar auditoria ");
        btnCrear1.setBorder(null);
        btnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 180, 30));

        btnCrear2.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear2.setText("Auditoria de intentos fallidos");
        btnCrear2.setBorder(null);
        btnCrear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 30));

        btnCrear3.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear3.setText("Visualizar Auditoria");
        btnCrear3.setBorder(null);
        btnCrear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, 30));

        btnCrear4.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear4.setText("Auditoria de Accion");
        btnCrear4.setBorder(null);
        btnCrear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 30));

        btnCrear5.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear5.setText("Auditoria de Tablas");
        btnCrear5.setBorder(null);
        btnCrear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, 30));

        btnCrear6.setBackground(new java.awt.Color(153, 255, 153));
        btnCrear6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear6.setText("Auditoria de inicios de sesion");
        btnCrear6.setBorder(null);
        btnCrear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 180, 30));

        btnCrear7.setBackground(new java.awt.Color(0, 0, 0));
        btnCrear7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrear7.setForeground(new java.awt.Color(204, 255, 255));
        btnCrear7.setText("Consultar auditoria sesion");
        btnCrear7.setBorder(null);
        btnCrear7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if(validaciones()){
            String mensaje="Creando respaldo "; //Variable con el mensaje "Creando respaldo "

            if(radioFull.isSelected()) //Si se selecciona la opción Full
            mensaje= mensaje+"Full..."; //El mensaje será "Creando respaldo Full..."

            else if(radioSchema.isSelected()) //Si se selecciona la opción Schema
            mensaje= mensaje+"del Schema..."; //El mensaje será "Creando respaldo de Schema..."

            else if(radioTablas.isSelected()) //Si se selecciona la opción Tablas
            mensaje= mensaje+"de Tabla..."; //El mensaje será "Creando respaldo de Tablas..."

            lblTipoElegido.setText(mensaje); //El label cambia su contenido con el texto

            btnCrear.setEnabled(false);//para bloquear el boton de crear
            btnRegresar.setEnabled(false);

            Thread h1 = new Thread(run);
            h1.start();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear1ActionPerformed

    private void btnCrear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear2ActionPerformed

    private void btnCrear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear3ActionPerformed

    private void btnCrear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear4ActionPerformed

    private void btnCrear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear5ActionPerformed

    private void btnCrear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear6ActionPerformed

    private void btnCrear7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrear1;
    private javax.swing.JButton btnCrear2;
    private javax.swing.JButton btnCrear3;
    private javax.swing.JButton btnCrear4;
    private javax.swing.JButton btnCrear5;
    private javax.swing.JButton btnCrear6;
    private javax.swing.JButton btnCrear7;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
