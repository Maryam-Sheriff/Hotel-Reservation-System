/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Frames.Panels;

import Classes.Employee;
import com.placeholder.PlaceHolder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Connection.*;
import Classes.*;

/**
 *
 * @author Farah
 */
public class Emp_update extends javax.swing.JPanel {

    /**
     * Creates new form Emp_update
     */
    Employee employee;
    int employee_ID = 0;
    String employee_fN = "";
    String employee_lN = "";
    String employee_department = "";
    DefaultTableModel tableModel = new DefaultTableModel();

    public Emp_update() {
        initComponents();
        tableModel.addColumn("ID");
        tableModel.addColumn("fN");
        tableModel.addColumn("lN");
        tableModel.addColumn("department");
        tblEmployee.setModel(tableModel);
        try {
            String ConnectionSql = "jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;";
            Connection conn = DriverManager.getConnection(ConnectionSql);
            java.sql.Statement st = conn.createStatement();
            String sql = "select * from employee";
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {

                tableModel.addRow(new String[]{
                    String.valueOf(res.getInt(1)),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),});
            }
            st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextFielddep = new javax.swing.JTextField();
        jTextFieldLS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(14, 2, 16));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update Employee");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 20, -1, -1));

        PlaceHolder holder = new PlaceHolder(jTextFieldID, "Please enter ID");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 167, 30));

        PlaceHolder holder1= new PlaceHolder(jTextFieldFn, "Please enter First Name");
        jTextFieldFn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 167, 30));

        jLabel8.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.setPreferredSize(new java.awt.Dimension(140, 52));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));
        jButton3.getAccessibleContext().setAccessibleDescription("");

        PlaceHolder holder4 = new PlaceHolder(jTextFielddep, "Please enter Department");
        jTextFielddep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddepActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFielddep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 167, 30));

        PlaceHolder holder2 = new PlaceHolder(jTextFieldLS, "Please enter Last Name");
        jTextFieldLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLSActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 167, 32));

        jLabel11.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Department");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 40));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 530, 373));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldFnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Employee employee = new Employee(employee_ID, employee_fN, employee_lN, employee_department);
        try {
            employee_ID = Integer.parseInt(jTextFieldID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID should be numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            employee_fN = jTextFieldFn.getText().trim();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Name should be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            employee_lN = jTextFieldLS.getText().trim();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Name should be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            employee_department = jTextFielddep.getText().trim();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "department be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            employee.setEmployee_ID(employee_ID);
            employee.setEmployee_fN(employee_fN);
            employee.setEmployee_lN(employee_lN);
            employee.setEmployee_department(employee_department);
            Employee_CRUD.insertEmployeedata(employee);

            JOptionPane.showMessageDialog(null, "Added Succsesfully", "ADD", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFielddepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddepActionPerformed

    private void jTextFieldLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLSActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked

        DefaultTableModel tableModel = new DefaultTableModel();
        // get the selected row index
        int selectedRowIndex = tblEmployee.getSelectedRow();
        // set the selected row data into jtextfields
        jTextFieldID.setText(this.tableModel.getValueAt(selectedRowIndex, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmployeeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFn;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLS;
    private javax.swing.JTextField jTextFielddep;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables

    public void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
