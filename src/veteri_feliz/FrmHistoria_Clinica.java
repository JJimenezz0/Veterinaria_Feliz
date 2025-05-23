/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veteri_feliz;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanj
 */
public class FrmHistoria_Clinica extends javax.swing.JFrame {

    ArrayList<Historia_Clinica> ListaClinica;
    
    public FrmHistoria_Clinica() {
        initComponents();
        ListaClinica = new ArrayList<>();
        getContentPane().setBackground(new Color(255, 202, 156));
        jButton_CargarActionPerformed(null); // Recargar la tabla
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Fecha = new javax.swing.JTextField();
        jTextField_Motivo = new javax.swing.JTextField();
        jTextField_Especie = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_NombreMascota = new javax.swing.JTextField();
        jTextField_Raza = new javax.swing.JTextField();
        jTextField_Color = new javax.swing.JTextField();
        jTextField_Fecha_Nacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_IDMascota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Peso = new javax.swing.JTextField();
        jButton_Cargar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_datos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("Historia Clinica");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setText("Motivo:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setText("Especie:");

        jTextField_Especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EspecieActionPerformed(evt);
            }
        });

        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel6.setText("Raza:");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel7.setText("Color:");

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel9.setText("Nombre Mascota:");

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel10.setText("Id_Mascota:");

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel11.setText("Peso:");

        jButton_Cargar.setText("Cargar");
        jButton_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CargarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jButton_Editar.setText("Editar");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jTable_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha Visita", "Motivo", "Especie", "ID Mascota", "Nombre Mascota", "Raza", "Color", "Fecha Nacimiento", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_Especie, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Motivo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Fecha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_IDMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField_Raza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(jTextField_Color, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Peso, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Fecha_Nacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_NombreMascota)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_NombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_IDMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Guardar)
                    .addComponent(jButton_Eliminar)
                    .addComponent(jButton_Editar)
                    .addComponent(jButton_Cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_EspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EspecieActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        Historia_Clinica Hcl =new Historia_Clinica();
        
        // Validación de campos vacíos en una sola línea
        if (jTextField_Fecha.getText().trim().isEmpty()||
            jTextField_Motivo.getText().trim().isEmpty()||
            jTextField_Especie.getText().trim().isEmpty()||
            jTextField_NombreMascota.getText().trim().isEmpty()||
            jTextField_Raza.getText().trim().isEmpty()||
            jTextField_Color.getText().trim().isEmpty()||
            jTextField_Fecha_Nacimiento.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Hcl.Id_Visita = Integer.parseInt(jTextField_ID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto en el ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Hcl.ID = Integer.parseInt(jTextField_IDMascota.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto en el ID de Mascota", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Hcl.Peso = Integer.parseInt(jTextField_Peso.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto en el Peso", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Hcl.Id_Visita = Integer.parseInt(jTextField_ID.getText().trim());
        Hcl.ID = Integer.parseInt(jTextField_IDMascota.getText().trim());
        Hcl.Peso = Integer.parseInt(jTextField_Peso.getText().trim());
        Hcl.Fecha_Visita = jTextField_Fecha.getText().trim();
        Hcl.Motivo = jTextField_Motivo.getText().trim();
        Hcl.Especie = jTextField_Especie.getText().trim();
        Hcl.Raza = jTextField_Raza.getText().trim();
        Hcl.Color = jTextField_Color.getText().trim();
        Hcl.Fecha_N = jTextField_Fecha_Nacimiento.getText().trim();
        Hcl.Nombre_Mascota = jTextField_NombreMascota.getText().trim();
        
        JOptionPane.showMessageDialog(null, "Registro Realizado:\nID Visita: " + Hcl.Id_Visita + "\nFecha: " + Hcl.Fecha_Visita +
        "\nNombre Mascota: " + Hcl.Nombre_Mascota,"Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        Hcl.setId_Visita(Hcl.Id_Visita);
        Hcl.setID(Hcl.ID);
        Hcl.setPeso(Hcl.Peso);
        Hcl.setFecha_Visita(Hcl.Fecha_Visita);
        Hcl.setMotivo(Hcl.Motivo);
        Hcl.setEspecie(Hcl.Especie);
        Hcl.setRaza(Hcl.Raza);
        Hcl.setColor(Hcl.Color);
        Hcl.setFecha_N(Hcl.Fecha_N);
        Hcl.setNombre_Mascota(Hcl.Nombre_Mascota);
        ListaClinica.add(Hcl);
        ArchivoPlanoHis.guardarEnArchivo(ListaClinica);
       jButton_CargarActionPerformed(null); // Recargar la tabla
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jButton_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CargarActionPerformed
        // Cargar los estudiantes desde el archivo y agregamos a la lista
        List<Historia_Clinica> hclinica = ArchivoPlanoHis.cargarDesdeArchivo();

        //Limpiar la tabla y la lista actual para luego cargar los datos
        ListaClinica.clear();
        DefaultTableModel modelo = (DefaultTableModel) jTable_datos.getModel();
        modelo.setRowCount(0);  // Limpiar las filas de la tabla

        // Agregar los estudiantes cargados a la lista y a oa tabla
        for (Historia_Clinica historia : hclinica) {
            ListaClinica.add(historia);
            modelo.addRow(new Object[] {historia.getId_Visita(), historia.getFecha_Visita(), historia.getMotivo(), historia.getEspecie(), historia.getID()
            , historia.getNombre_Mascota(), historia.getRaza(), historia.getColor(), historia.getFecha_N(), historia.getPeso()});
        }
    }//GEN-LAST:event_jButton_CargarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // Validar que el campo no esté vacío
        if (jTextField_ID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor escribe un ID para eliminar.");
            return;
        }

        try {
            int cedulaAEliminar = Integer.parseInt(jTextField_ID.getText().trim());
            ArchivoPlanoHis.eliminarDeArchivo(cedulaAEliminar);
            jButton_CargarActionPerformed(null); // Recargar la tabla después de eliminar
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarActionPerformed
        if (jTextField_ID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor escribe un ID.");
            return;
        }

        try {
            int idVisita = Integer.parseInt(jTextField_ID.getText().trim());
            int idMascota = Integer.parseInt(jTextField_IDMascota.getText().trim());
            int peso = Integer.parseInt(jTextField_Peso.getText().trim());
            String nuevaFecha = jTextField_Fecha.getText().trim();
            String nuevoMotivo = jTextField_Motivo.getText().trim();
            String nuevaEspecie = jTextField_Especie.getText().trim();
            String nuevoNombreMascota = jTextField_NombreMascota.getText().trim();
            String nuevaRaza = jTextField_Raza.getText().trim();
            String nuevoColor = jTextField_Color.getText().trim();
            String nuevaFechaNacimiento = jTextField_Fecha_Nacimiento.getText().trim();
            
            ArchivoPlanoHis.modificarEnArchivo(idVisita, idMascota, peso, nuevaFecha, nuevoMotivo, nuevoNombreMascota, nuevaEspecie, nuevaRaza, nuevoColor, nuevaFechaNacimiento);
            jButton_CargarActionPerformed(null); // Recargar la tabla

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El Codigo debe ser un número válido.");
        }
    }//GEN-LAST:event_jButton_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHistoria_Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistoria_Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistoria_Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistoria_Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistoria_Clinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cargar;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_datos;
    private javax.swing.JTextField jTextField_Color;
    private javax.swing.JTextField jTextField_Especie;
    private javax.swing.JTextField jTextField_Fecha;
    private javax.swing.JTextField jTextField_Fecha_Nacimiento;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_IDMascota;
    private javax.swing.JTextField jTextField_Motivo;
    private javax.swing.JTextField jTextField_NombreMascota;
    private javax.swing.JTextField jTextField_Peso;
    private javax.swing.JTextField jTextField_Raza;
    // End of variables declaration//GEN-END:variables
}
