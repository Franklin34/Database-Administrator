package vista;

import logica.Logica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tunning extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db;
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    
    
    public Tunning(){
        
        initComponents(); //Carga los elementos del JFrame o JPanel
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Planes de Ejecución"); //Título
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        btnCrearPlan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSql = new javax.swing.JTextField();
        btnEliminarPlanes = new javax.swing.JButton();
        btnverPlan1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(java.awt.Color.lightGray);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearPlan.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearPlan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearPlan.setText("Crear plan de Ejecución");
        btnCrearPlan.setBorder(null);
        btnCrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanActionPerformed(evt);
            }
        });
        panel.add(btnCrearPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 180, 30));

        tablaPlanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operación", "Objeto", "Fecha de Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPlanes);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 610, 230));

        btnRegresar.setBackground(java.awt.Color.darkGray);
        btnRegresar.setForeground(java.awt.Color.white);
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Explain Plan");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese una consulta SQL a optimizar");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 330, 30));

        txtSql.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSql.setBorder(null);
        panel.add(txtSql, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 430, 30));

        btnEliminarPlanes.setBackground(java.awt.Color.darkGray);
        btnEliminarPlanes.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnEliminarPlanes.setForeground(java.awt.Color.white);
        btnEliminarPlanes.setText("Limpiar tabla de planes");
        btnEliminarPlanes.setBorder(null);
        btnEliminarPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlanesActionPerformed(evt);
            }
        });
        panel.add(btnEliminarPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 160, 30));

        btnverPlan1.setBackground(java.awt.Color.darkGray);
        btnverPlan1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnverPlan1.setForeground(java.awt.Color.white);
        btnverPlan1.setText("Ver planes de Ejecución");
        btnverPlan1.setBorder(null);
        btnverPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverPlan1btnVerPlanesActionPerformed(evt);
            }
        });
        panel.add(btnverPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 190, 30));

        jSeparator1.setBackground(java.awt.Color.black);
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 640, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanActionPerformed
        // TODO add your handling code here:
        this.CrearPlan();        
    }//GEN-LAST:event_btnCrearPlanActionPerformed

    private void btnBorrarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlanesActionPerformed
        // TODO add your handling code here:
        if(db.BorrarTablaPlanes()){
            JOptionPane.showMessageDialog(null, "Se ha limpiado la tabla de planes", "Limpia completa",JOptionPane.INFORMATION_MESSAGE);
            this.llenarGrid();
        }
        
    }//GEN-LAST:event_btnBorrarPlanesActionPerformed

    private void btnverPlan1btnVerPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverPlan1btnVerPlanesActionPerformed
        // TODO add your handling code here:
        this.llenarGrid();
    }//GEN-LAST:event_btnverPlan1btnVerPlanesActionPerformed

    //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    

    //metodo de cargar directorios
    /*public void cargarTablasUsuario(){
        
        ResultSet resultado = db.cargarTablasUsuario(usuario);

        cbTablas.removeAllItems();
        
        try{
            while(resultado.next()){
                cbTablas.addItem(resultado.getString("TABLE_NAME"));

            }
            cbTablas.setSelectedIndex(-1);

        }catch(SQLException ex){
            Logger.getLogger(Tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
     
    
    public void CrearPlan(){   
        
        String msj = db.executarQueryOptimizar(txtSql.getText());
        if(msj.equals("true")){
            JOptionPane.showMessageDialog(null, "Se ha creado el plan correctamente", "Plan Creado",JOptionPane.INFORMATION_MESSAGE);
            llenarGrid();//llama al metodo que llena la tabla para mostrar el resultado de una vez
            txtSql.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, msj, "Error al crear Plan",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void llenarGrid(){
        
        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.tablaPlanes.getModel();
         
         
        for(int i = 0; i < tablaPlanes.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
         
        resultado= db.obtenerExplainPlan();//metodo
              
        this.tablaPlanes.removeAll();
        
        if(resultado != null){
            try{
                while(resultado.next()){
                    Object [] fila=new Object[3];
                    fila[0]=resultado.getString("OPERACION");
                    fila[1]=resultado.getString("OBJETO");
                    fila[2]=resultado.getString("FECHA");
                    modelo.addRow(fila);
                }
                tablaPlanes.setModel(modelo);
            
            }catch(Exception ex){
                Logger.getLogger(Tunning.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Error al consulta", "Error de Consultar",JOptionPane.ERROR_MESSAGE);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPlan;
    private javax.swing.JButton btnEliminarPlanes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnverPlan1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTextField txtSql;
    // End of variables declaration//GEN-END:variables
}
