/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recuento_horas;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.time.Year;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author javie
 */
public class CONSULTAS extends PANTALLA {

    /**
     * Creates new form CONSULTAS
     */
    public CONSULTAS() throws SQLException {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        print_button = new javax.swing.JButton();
        export_button = new javax.swing.JButton();
        ano_box = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha", "Proyecto", "Actividad", "Accion", "Modelo", "Hora inicio", "Hora fin", "horas totales", "Empresa", "Interlocutor", "Temas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("ATRÁS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        print_button.setText("PRINT");
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });

        export_button.setText("EXPORT");
        export_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_buttonActionPerformed(evt);
            }
        });

        ano_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        jLabel1.setText("AÑO");

        jButton2.setText("FILTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(735, 735, 735)
                .addComponent(print_button)
                .addGap(82, 82, 82)
                .addComponent(export_button)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ano_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ano_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(print_button)
                    .addComponent(export_button))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //RETURN BUTTON
        
        this.dispose();
        PANEL_CONSULTAS m1 = new PANEL_CONSULTAS();
        m1.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void export_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_buttonActionPerformed
        try {
            // TODO add your handling code here:
            Utilidades.export(jTable1);
        } catch (IOException ex) {
            Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_export_buttonActionPerformed

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
        try {
            // TODO add your handling code here:
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_print_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Get the table model
    //jTable1.setModel(new DefaultTableModel());
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            // TODO add your handling code here:
            this.crearTabla2();
        } catch (SQLException ex) {
            Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CONSULTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONSULTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONSULTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONSULTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //crearTabla(consultar_horasAnuales());
        //crearTabla2();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CONSULTAS().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    
    
    /*public static Map consultar_horasAnuales(){
    //conecto con base de datos
         Connection con = Conectar_db.conectDB();
         
         Map<String, Double> mapa = new HashMap<String, Double>();
         
        try {
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT nombre, SUM(horas) as suma from horas group by nombre;");
            
            while (rs.next()){
            
                String name = rs.getString("nombre");
                double total_hours = rs.getDouble("suma");
                Trabajadores t1 = new Trabajadores(name);
                t1.setHorasAnuales(total_hours);
                mapa.put(t1.getNombre(), t1.getHorasAnuales());
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        return mapa;
    }
        
        
        public void crearTabla(Map mapa){
        
            //convierto el hasmap en array 2d
            
            Object[][] array = new Object[mapa.size()][2];
            
            Set entries = mapa.entrySet();
            Iterator entriesIterator =  entries.iterator();
            
            int i = 0;
            while(entriesIterator.hasNext()){
            
                Map.Entry mapping = (Map.Entry) entriesIterator.next();
                
                array[i][0] = mapping.getKey();
                array[i][1] = mapping.getValue();
                i++;
            }
            
              String[] titles = {"nombre", "horas_totales"};
              //JTable table = new JTable(array, titles);
              
              DefaultTableModel model = new DefaultTableModel(array,titles);
             // jTable1.setModel(model);
            
            //creo la tabla
            for (Object[] row : array){
            
              
            
            }
            
            
            System.out.println(array[1][0]);
        }  */    
    public void crearTabla2() throws SQLException{
        System.out.println("iniciando tabla");
        Connection con = Conectar_db.conectDB();
        Statement st = null;
        ResultSet rs = null;
        
        
        try {
             st = con.createStatement();
            
            
            //int yearSelected = ano_box.getSelectedItem();
            String selectedItem = (String) ano_box.getSelectedItem();
            System.out.println(selectedItem);
            String sql_request = "SELECT * from ficha WHERE ANO = " + selectedItem + " ORDER BY FECHA ";
            //sql_request = sql_request + currentYear;
            rs = st.executeQuery(sql_request);
            while (rs.next()){
            
                String name = rs.getString("nombre");
                String date = rs.getString("FECHA");
                String project = rs.getString("PROYECTO");
                String actividad = rs.getString("ACTIVIDAD");
                String accion = rs.getString("ACCIÓN");
                String modelo = rs.getString("MODELO");
                String hora_in = rs.getString("HORA_INICIO");
                String hora_fin = rs.getString("HORA_FIN");
                String time_dedicated = rs.getString("TIEMPO_DEDICADO");
                String enterprise = rs.getString("EMPRESA");
                String interlocutor = rs.getString("INTERLOCUTOR");
                String themes = rs.getString("TEMAS_TRATADOS");
                int mes = rs.getInt("MES");
                int id = rs.getInt("ID");
           
                //String total_hours = String.valueOf(rs.getDouble("suma"));
                
               Object tbData[]={id, name, date, project, actividad, accion, modelo, hora_in, hora_fin, time_dedicated, enterprise, interlocutor, themes, mes};
               
               DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                
               tblModel.addRow(tbData); 
                
                
            }
            TableColumn column = jTable1.getColumnModel().getColumn(2);
            column.setPreferredWidth(80);

       
            
        } catch (SQLException ex) {
            Logger.getLogger(CONSULTAS.class.getName()).log(Level.SEVERE, null, ex);
         
        } finally {
            
            st.close();
            rs.close();
            con.close();
            System.out.println("Connection closed");
        }
            
            
            
        }
         
         
         
        
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ano_box;
    private javax.swing.JButton export_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print_button;
    // End of variables declaration//GEN-END:variables
}
