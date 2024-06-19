/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import loginForm.loginForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author wendy
 */
public class leaveForm extends javax.swing.JFrame {

    /**
     * Creates new form userForm
     */
    public leaveForm() {
        initComponents();
        displayData();
              
    }
       
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    
     Color navcolor = new Color(155,48,69);
        Color hovercolor = new Color(53,30,75);
    
      public void displayData(){
        
          try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT  leave_id, u_id, e_name,  leave_type, start_date, end_date, leave_status FROM tbl_leave");
            leaveTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
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

        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        p_edit1 = new javax.swing.JButton();
        p_edit2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ls = new javax.swing.JComboBox<>();
        eid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        en = new javax.swing.JTextField();
        ed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lt = new javax.swing.JTextField();
        sd = new javax.swing.JTextField();

        jButton3.setBackground(new java.awt.Color(249, 118, 31));
        jButton3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD USER");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-64.png"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 134, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 30, 75));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE APPLIED LEAVE FORM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 890, 90));

        jPanel3.setBackground(new java.awt.Color(155, 48, 69));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employeeicon (1) (1).png"))); // NOI18N

        p_edit1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        p_edit1.setText("PRINT");
        p_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_edit1ActionPerformed(evt);
            }
        });

        p_edit2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        p_edit2.setText("UPDATE");
        p_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_edit2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(175, 175, 175)
                .addComponent(p_edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 610));

        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        leaveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(leaveTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 500, 470));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Start Date:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, 20));

        ls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Declined", "Pending" }));
        ls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsActionPerformed(evt);
            }
        });
        jPanel1.add(ls, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 180, 30));

        eid.setEnabled(false);
        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });
        jPanel1.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 120, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Leave Type:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Leave Status:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, 20));

        en.setEnabled(false);
        jPanel1.add(en, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 180, 30));

        ed.setEnabled(false);
        jPanel1.add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 180, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Leave ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 20));

        lid.setEnabled(false);
        jPanel1.add(lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 180, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("End Date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, 20));

        lt.setEnabled(false);
        jPanel1.add(lt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 180, 30));

        sd.setEnabled(false);
        jPanel1.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        adminDashboard ds = new adminDashboard();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void leaveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseClicked
       int rowIndex = leaveTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = leaveTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_leave WHERE leave_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                    lid.setText(""+rs.getInt("leave_id"));
                    eid.setText(""+rs.getString("u_id"));
                    en.setText(""+rs.getString("e_name"));
                    lt.setText(""+rs.getString("leave_type"));
                   sd.setText(""+rs.getString("start_date"));
                    ed.setText(""+rs.getString("end_date"));
                    ls.setSelectedItem(""+rs.getString("leave_status"));
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_leaveTableMouseClicked

    private void p_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_edit1ActionPerformed
         int rowIndex = leaveTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = leaveTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_leave WHERE leave_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                    leavePrinting lpt = new leavePrinting();
                    lpt.lid.setText(""+rs.getInt("leave_id"));
                   lpt.eid.setText(""+rs.getInt("u_id"));
                    lpt.en.setText(""+rs.getString("e_name"));
                    lpt.lt.setText(""+rs.getString("leave_type"));
                    lpt.sd.setText(""+rs.getString("start_date"));
                    lpt.ed.setText(""+rs.getString("end_date"));
                    lpt.ls.setText(""+rs.getString("leave_status"));


                    lpt.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_p_edit1ActionPerformed

    private void lsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lsActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

    private void p_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_edit2ActionPerformed
       dbConnector dbc = new dbConnector();
       dbc.updateData("UPDATE tbl_leave SET leave_status = '"+ls.getSelectedItem()+"' WHERE leave_id = '"+lid.getText()+"'");
       leaveForm lvf = new leaveForm();
                lvf.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_p_edit2ActionPerformed

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
            java.util.logging.Logger.getLogger(leaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leaveForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ed;
    public javax.swing.JTextField eid;
    public javax.swing.JTextField en;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leaveTable;
    public javax.swing.JTextField lid;
    public javax.swing.JComboBox<String> ls;
    public javax.swing.JTextField lt;
    private javax.swing.JButton p_edit1;
    private javax.swing.JButton p_edit2;
    public javax.swing.JTextField sd;
    // End of variables declaration//GEN-END:variables
}
