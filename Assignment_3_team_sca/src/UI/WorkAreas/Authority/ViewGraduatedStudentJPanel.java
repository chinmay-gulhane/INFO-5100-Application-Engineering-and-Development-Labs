/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.Authority;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Student.Student;
import Utiltities.GraduationStatus;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinmaygulhane
 */
public class ViewGraduatedStudentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    DefaultTableModel dtm;
    /**
     * Creates new form GraduatedStudentJPanel
     */
    public ViewGraduatedStudentJPanel(JPanel userProcessContainer, Education education) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        dtm = (DefaultTableModel) tblGradStudents.getModel();
        populateTable();
    }
    
    public void populateTable(){
        dtm.setRowCount(0);
        for(Student student: education.getStudentsDirectory().getStudentList()){
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGradStudents = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblGradStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGradStudents);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnBack)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGradStudents;
    // End of variables declaration//GEN-END:variables
}