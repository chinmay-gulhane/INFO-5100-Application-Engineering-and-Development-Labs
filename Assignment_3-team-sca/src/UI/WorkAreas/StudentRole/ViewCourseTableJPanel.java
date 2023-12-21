/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Professor.Professor;
import Education.Student.Student;
import UI.WorkAreas.ProfessorRole.ViewCourseProfessorJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samik
 */
public class ViewCourseTableJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    
    /**
     * Creates new form ViewCourseTableJPanel
     */

    ViewCourseTableJPanel(JPanel userProcessContainer, Education education, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.student = student;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblViewCourse.getModel();
        Map<String, Double> grades = new HashMap<>();
        dtm.setRowCount(0);
        for(CourseSchedule cs:education.getCourseScheduleDirectory().getCourseScheduleList()){
            if(student.getGrades().containsKey(cs.getScheduleId()))
            {
                for(Course c:education.getCourseDirectory().getCourseList())
                { 
                    for(Professor p:education.getProfessorsDirectory().getProfessorList())
                    {
                        if(p.getProfessorId().equals(cs.getTeachingProfessorId()))
                        {
                            if(cs.getCourseId().equals(c.getCourseId())){
                            Object[] row = new Object[9];
                            row[0] = cs;
                            row[1] = c;
                            row[2] = c.getTopic();
                            row[3] = c.getName();
                            row[4] = p.getName();
                            row[5] = cs.getStartDate();
                            row[6] = c.getReputationIndex();
                            row[7] = cs.getRegion();
                            row[8] = cs.getLanguage();
                            dtm.addRow(row);
                            grades.put(cs.getScheduleId(), 0.0);
                            }
                        }
                    }
	        }
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
        tblViewCourse = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblViewCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule Id", "Course Id", "Course Topic", "Course Name", "Professor Name", "Schedule", "Course Reputation Index", "Region", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCourse);
        if (tblViewCourse.getColumnModel().getColumnCount() > 0) {
            tblViewCourse.getColumnModel().getColumn(0).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(1).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(2).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(3).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(4).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(5).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(6).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(7).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(8).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(672, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDelete))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 1);
        if(component instanceof StudentJPanel studentJPanel) {
            studentJPanel.setupStudentDashboard();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblViewCourse.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the person details", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                CourseSchedule csh = (CourseSchedule) tblViewCourse.getValueAt(selectedRow, 0);
                student.getGrades().remove(csh.getScheduleId());
                populateTable();
                int credit= 0;
                for(Course course: education.getCourseDirectory().getCourseList()){
                    if(course.getCourseId().equals(csh.getCourseId())){
                        credit = course.getCredit();
                        break;
                    }
                }
                student.setAmountOwed(student.getAmountOwed() - (credit*1000));
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewCourse;
    // End of variables declaration//GEN-END:variables
}