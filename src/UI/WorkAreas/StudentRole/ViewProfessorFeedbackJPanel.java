/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Professor.Professor;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samik
 */
public class ViewProfessorFeedbackJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;

    /**
     * Creates new form ViewProfessorFeedbackJPanel
     */
    ViewProfessorFeedbackJPanel(JPanel userProcessContainer, Education education) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        viewFeedback();
    }

    private void viewFeedback() {
        DefaultTableModel dtm = (DefaultTableModel) tblViewCourse.getModel();
        dtm.setRowCount(0);
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            {
                for (Course c : education.getCourseDirectory().getCourseList()) {
                    for (Professor p : education.getProfessorsDirectory().getProfessorList()) {
                        if (p.getProfessorId().equals(cs.getTeachingProfessorId())) {
                            if (cs.getCourseId().equals(c.getCourseId())) {
                                if (!cs.getProfessorFeedback().isEmpty()) {
                                    for (Map.Entry<String, String> entry : cs.getProfessorFeedback().entrySet()) {
                                        Object[] row = new Object[9];
                                        row[0] = c;
                                        row[1] = c.getTopic();
                                        row[2] = c.getName();
                                        row[3] = p.getName();
                                        row[4] = c.getReputationIndex();
                                        row[5] = cs.getRegion();
                                        row[6] = cs.getLanguage();
                                        row[7] = entry.getValue();
                                        row[8] = cs.getTerm()+cs.getYear();
                                        dtm.addRow(row);
                                    }
                                } else {
                                    Object[] row = new Object[9];
                                    row[0] = c;
                                    row[1] = c.getTopic();
                                    row[2] = c.getName();
                                    row[3] = p.getName();
                                    row[4] = c.getReputationIndex();
                                    row[5] = cs.getRegion();
                                    row[6] = cs.getLanguage();
                                    row[7] = "No feedback Provided";
                                    row[8] = cs.getTerm()+cs.getYear();
                                    dtm.addRow(row);
                                }
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

        tblViewCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Id", "Course Topic", "Course Name", "Professor Name", "Course Reputation Index", "Region", "Language", "Professor Feedback", "Term"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCourse);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewCourse;
    // End of variables declaration//GEN-END:variables
}
