package ejerciciohobbie2;



import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


public class Tabla_Posiciones extends javax.swing.JFrame {
    private Lista list;
    private DefaultTableModel tblModel;
    private String[] header = {"Equipo","Puntos","Ciudad"};
    
    
    public Tabla_Posiciones() {
        initComponents();
        iniTable();
        list = new Lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Ciudad = new javax.swing.JTextField();
        Txt_Equipo = new javax.swing.JTextField();
        Txt_Puntos = new javax.swing.JTextField();
        Btn_Insert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Btn_Agregar1 = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        J_Table = new javax.swing.JTable();
        Btn_Eliminar1 = new javax.swing.JButton();
        Btn_Ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tabla De Posiciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Equipo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Puntos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ciudad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Lista De Posiciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));
        jPanel1.add(Txt_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, -1));
        jPanel1.add(Txt_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));
        jPanel1.add(Txt_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));

        Btn_Insert.setText("InsertSort");
        Btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 390, 150));

        Btn_Agregar1.setText("Agregar");
        Btn_Agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Btn_Editar.setText("Editar");
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        J_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_TableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(J_Table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 307, 410, 240));

        Btn_Eliminar1.setText("Eliminar");
        Btn_Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Eliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        Btn_Ordenar.setText("BubbleSort");
        Btn_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InsertActionPerformed
        ordenarInsert();
    }//GEN-LAST:event_Btn_InsertActionPerformed

    private void Btn_Agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar1ActionPerformed
        // TODO add your handling code here:
       agregar();
       
       
        
    }//GEN-LAST:event_Btn_Agregar1ActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        // TODO add your handling code here:
        
        if(J_Table.getSelectedRowCount()!=1){
            return;
        }
        
        String nombre = Txt_Equipo.getText();
        int puntos = Integer.parseInt(Txt_Puntos.getText());
        String ciudad = Txt_Ciudad.getText();
        int fila = J_Table.getSelectedRow();
        
        
        
        Hobbie hb = new Hobbie(nombre, puntos, ciudad);
        tblModel.setValueAt(hb.getNombre(), fila, 0);
        tblModel.setValueAt(hb.getPuntos(), fila, 1);
        tblModel.setValueAt(hb.getCiudad(), fila, 2);
        
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void J_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_TableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() ==2){
            int fila = J_Table.getSelectedRow();
            
            String nombre = (String) tblModel.getValueAt(fila, 0);
            int puntos = (int) tblModel.getValueAt(fila, 1);
            String ciudad = (String) tblModel.getValueAt(fila, 2);       
            
            Hobbie hb = new Hobbie(nombre, puntos, ciudad);
            
            Txt_Equipo.setText(nombre);
            Txt_Puntos.setText(String.valueOf(puntos));
            Txt_Ciudad.setText(ciudad);
            
            
        }
        
    }//GEN-LAST:event_J_TableMouseClicked

    private void Btn_Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Eliminar1ActionPerformed
        // TODO add your handling code here:
        if(J_Table.getSelectedRowCount() != 1){
            return;
        }
        
        int fila = J_Table.getSelectedRow();
        tblModel.removeRow(fila);
        Txt_Equipo.setText("");
        Txt_Puntos.setText("");
        Txt_Ciudad.setText("");
                
        
        
    }//GEN-LAST:event_Btn_Eliminar1ActionPerformed

    private void Btn_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OrdenarActionPerformed
ordenar();
    }//GEN-LAST:event_Btn_OrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla_Posiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Posiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Posiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Posiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Posiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar1;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Eliminar1;
    private javax.swing.JButton Btn_Insert;
    private javax.swing.JButton Btn_Ordenar;
    private javax.swing.JTable J_Table;
    private javax.swing.JTextField Txt_Ciudad;
    private javax.swing.JTextField Txt_Equipo;
    private javax.swing.JTextField Txt_Puntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void iniTable() {
        tblModel = new DefaultTableModel(header, 0){
       @Override
        public boolean  isCellEditable(int row, int column){
                
            return false;
        }
        
    };
        J_Table.setModel(tblModel);
        }
    
     

    private void ordenar() {
     Ordenamientos or = new Ordenamientos();
     or.bubbleSort(list);
     limpiarTabla();
     cargarLista();
     list.imprimir();
    }
    private void ordenarInsert() {
     Ordenamientos or = new Ordenamientos();
     or.InsertionSort(list);
     limpiarTabla();
     cargarLista();
     list.imprimir();
    }
    private void cargarLista(){
        
        tblModel = (DefaultTableModel)J_Table.getModel();
        Object [] ob = new Object[3];
        for (int i = 0; i < list.getListaHobbies().size(); i++) {
            ob[0] = list.getListaHobbies().get(i).getNombre();
            ob[1] = list.getListaHobbies().get(i).getPuntos();
            ob[2] = list.getListaHobbies().get(i).getCiudad();
            tblModel.addRow(ob);    
        }
        J_Table.setModel(tblModel);
        
    }
    private void agregar(){
//         String nombre = Txt_Equipo.getText();
//        int puntos = Integer.parseInt(Txt_Puntos.getText());
//        String ciudad = Txt_Ciudad.getText();
//        
//        Hobbie hb = new Hobbie(nombre, puntos, ciudad);
//        
//        tblModel.addRow(hb.toArray());
//        
//        
//        Txt_Equipo.setText("");
//        Txt_Puntos.setText("");
//        Txt_Ciudad.setText("");
        list.lista(new Hobbie(Txt_Equipo.getText(),Integer.parseInt(Txt_Puntos.getText()),Txt_Ciudad.getText()));
        limpiarTabla();
        cargarLista();
        Txt_Equipo.setText("");
        Txt_Puntos.setText("");
        Txt_Ciudad.setText("");
                
        
        
    }
    private void limpiarTabla(){
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            tblModel.removeRow(i);
            i = i-1;
        }
    }
}

