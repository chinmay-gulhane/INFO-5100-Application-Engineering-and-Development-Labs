/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.Authority;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Professor.Professor;
import Education.Student.Student;
import Utiltities.GraduationStatus;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinmaygulhane
 */
public class ViewGraduationRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Education education;
    DefaultTableModel dtm;
    /**
     * Creates new form GraduationRequestsJPanel
     */
    public ViewGraduationRequestJPanel(JPanel userProcessContainer, Education education) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        dtm = (DefaultTableModel) tblGradRequests.getModel();
        populateTable();
        lblStatus.setVisible(false);
        optionsStatus.setVisible(false);
        btnSaveStatus.setVisible(false);
    }

    public void populateTable(){
        dtm.setRowCount(0);
        for(Student student: education.getStudentsDirectory().getStudentList()){
            if(student.getGraduationStatus() == GraduationStatus.APPLIED){
                Object[] row = new Object[5];
                row[0] = student;
                row[1] = student.getName();
                
                int totalCredit = 0;
                int totalCourses = 0;
                for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
                    for (Course c : education.getCourseDirectory().getCourseList()) {
                        if (cs.getCourseId().equals(c.getCourseId()) && student.getGrades().containsKey(cs.getScheduleId())) {
                            totalCourses = totalCourses + 1;
                            totalCredit = c.getCredit() + totalCredit;
                        }
                    }
                }
                row[2] = totalCourses;
                row[3] = totalCredit;
                if(student.getGraduationStatus() == GraduationStatus.NOTAPPLIED){
                    row[4] ="Not Applied";
                } else if(student.getGraduationStatus() == GraduationStatus.APPLIED){
                    row[4] = "Applied";
                } else if(student.getGraduationStatus() == GraduationStatus.ACCEPTED){
                    row[4] = "Graduated"; 
                } else if(student.getGraduationStatus() == GraduationStatus.REJECTED){
                    row[4] = "Rejected";
                }
                dtm.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGradRequests = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        optionsStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        btnSaveStatus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblGradRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EduVerse ID", "Name", "Total Courses", "Total Credits", "Graduation Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGradRequests);

        btnUpdateStatus.setText("Update Graduation Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        optionsStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Reject" }));
        optionsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsStatusActionPerformed(evt);
            }
        });

        lblStatus.setText("Set Status:");

        btnSaveStatus.setText("Save Status");
        btnSaveStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStatusActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Graduation Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdateStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblGradRequests.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a person from the list!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        lblStatus.setVisible(true);
        optionsStatus.setVisible(true);
        btnSaveStatus.setVisible(true);
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void optionsStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsStatusActionPerformed

    private void btnSaveStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStatusActionPerformed
        // TODO add your handling code here:
        System.out.println("Save button pushed");
        int selectedRow = tblGradRequests.getSelectedRow();
        Student studentU = (Student)tblGradRequests.getValueAt(selectedRow, 0);
       if(optionsStatus.getSelectedItem() == "Accept"){
            tblGradRequests.setValueAt("Accepted", selectedRow, 4);
        } else {
            tblGradRequests.setValueAt("Rejected", selectedRow, 4);
        }
        for(Student student: education.getStudentsDirectory().getStudentList()){
            if(student.getStudentId().equals(studentU.getStudentId())){
                if(optionsStatus.getSelectedItem() == "Accept"){
                   student.setGraduationStatus(GraduationStatus.ACCEPTED);
                } else {
                   student.setGraduationStatus(GraduationStatus.REJECTED);
                }
                lblStatus.setVisible(false);
                optionsStatus.setVisible(false);
                btnSaveStatus.setVisible(false);
            }
        }
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 2);
        if(component instanceof AuthorityJPanel authorityJPanel) {
            authorityJPanel.setUpAuthorityDashboard();
        }
    }//GEN-LAST:event_btnSaveStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveStatus;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JComboBox<String> optionsStatus;
    private javax.swing.JTable tblGradRequests;
    // End of variables declaration//GEN-END:variables
}
