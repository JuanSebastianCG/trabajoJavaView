/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Conexion;


public class Inicio_Usuario extends javax.swing.JFrame {

       
    Conexion con = new Conexion();
    Connection cn;
    Statement st;//El objeto Statement (sentencia) sirve para procesar una sentencia SQL estática y obtener los resultados producidos por ella.
    ResultSet rs;
    DefaultTableModel model;
    
    public Inicio_Usuario() {
        initComponents();
         setLocationRelativeTo(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_contraseñaUsuario = new javax.swing.JTextField();
        txt_nombreUsuario = new javax.swing.JTextField();
        txt_edadUsuario1 = new javax.swing.JTextField();
        btn_IS = new javax.swing.JToggleButton();
        btn_registrar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("BIENVENIDO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Edad:");

        btn_IS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_IS.setText("INICIAR SESION");
        btn_IS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ISActionPerformed(evt);
            }
        });

        btn_registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_IS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_contraseñaUsuario)
                            .addComponent(txt_edadUsuario1)
                            .addComponent(txt_nombreUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_edadUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_IS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
      
               //No se añade el id desde el formulario del usuario, si no, desde la DB
        String usuario = txt_nombreUsuario.getText();
        String contraseña = txt_contraseñaUsuario.getText();
        String edad = txt_edadUsuario1.getText();

        if (usuario.isEmpty() || contraseña.isEmpty() || edad.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Faltan campos por diligenciar");
            
        } else {
            String query = "INSERT INTO tb_user(nombre, contraseña, edad)VALUES('" + usuario + "','" + contraseña + "','" + edad+ "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Se ha creado el registro con éxito");
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "No se pudo crear el registro");
            }
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_ISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ISActionPerformed

        Inicio_Sesion inst_Frame = new Inicio_Sesion();

        inst_Frame.setVisible(true);
    }//GEN-LAST:event_btn_ISActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_IS;
    private javax.swing.JToggleButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_contraseñaUsuario;
    private javax.swing.JTextField txt_edadUsuario1;
    private javax.swing.JTextField txt_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
