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
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author samik
 */
public class RateProfessorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    private String selectedTerm;
    Map<String, Map<String, String>> professorNames = new HashMap<>();
    String selectedProfessorId ;

    /**
     * Creates new form RateProfessorJPanel
     */
    RateProfessorJPanel(JPanel userProcessContainer, Education education, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        this.student = student;
        rateProfessor();
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            if (student.getGrades().containsKey(cs.getScheduleId())) {
                for (Course c : education.getCourseDirectory().getCourseList()) {
                    if (c.getCourseId().equals(cs.getCourseId())) {
                        for (Professor p : education.getProfessorsDirectory().getProfessorList()) {
                            if (p.getProfessorId().equals(cs.getTeachingProfessorId())) {
                                model.addElement(c.getName());
                                Map<String, String> pN = new HashMap<>();
                                pN.put(p.getProfessorId(), p.getName());
                                professorNames.put(c.getName(), pN);
                            }
                        }
                    }
                }
            }
        }
        optionsCourses.setModel(model);
    }

    private void rateProfessor() {
        txtCourse.setEnabled(false);
        txtProf.setEnabled(false);
        btnSubmit.setEnabled(false);
        btnSubmit1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        optionsCourses = new javax.swing.JComboBox<>();
        txtProfessor = new javax.swing.JTextField();
        btnRateCourse = new javax.swing.JButton();
        btnRateProfessor = new javax.swing.JButton();
        txtCourse = new javax.swing.JTextField();
        txtProf = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnSubmit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        optionsCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsCoursesActionPerformed(evt);
            }
        });

        txtProfessor.setEditable(false);
        txtProfessor.setEnabled(false);

        btnRateCourse.setBackground(new java.awt.Color(0, 0, 0));
        btnRateCourse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRateCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnRateCourse.setText("Rate Course");
        btnRateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateCourseActionPerformed(evt);
            }
        });

        btnRateProfessor.setBackground(new java.awt.Color(0, 0, 0));
        btnRateProfessor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRateProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnRateProfessor.setText("Rate Professor");
        btnRateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateProfessorActionPerformed(evt);
            }
        });

        txtProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnSubmit1.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Select Course:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Professor:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rate Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRateProfessor)
                                .addGap(20, 20, 20)
                                .addComponent(txtProf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSubmit1))
                            .addComponent(optionsCourses, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRateCourse, btnRateProfessor});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCourse, txtProf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSubmit, btnSubmit1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRateCourse)
                    .addComponent(txtCourse)
                    .addComponent(btnSubmit))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRateProfessor)
                    .addComponent(txtProf)
                    .addComponent(btnSubmit1))
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(160, 160, 160))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRateCourse, btnRateProfessor});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSubmit, btnSubmit1});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateCourseActionPerformed
        // TODO add your handling code here:
        txtCourse.setEnabled(true);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnRateCourseActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(txtCourse.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill Course rating to procced.", "Account Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            for (Course c : education.getCourseDirectory().getCourseList()) {
                if (cs.getCourseId().equals(c.getCourseId())) {
                    double courseRating = c.getReputationIndex() + Double.valueOf(txtCourse.getText());
                    double avgReputationIndex = (double) courseRating / 2;
                    c.setReputationIndex(avgReputationIndex);
                    txtCourse.setText(String.valueOf(avgReputationIndex));
                }
            }
        }
        txtCourse.setText("");
        JOptionPane.showMessageDialog(null, "Course rating submitted. Thank you!");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateProfessorActionPerformed
        // TODO add your handling code here:
        txtProf.setEnabled(true);
        btnSubmit1.setEnabled(true);
        
    }//GEN-LAST:event_btnRateProfessorActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        if(txtProf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill Professor rating to procced.", "Account Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
 
        if(cs.getTeachingProfessorId().equals(selectedProfessorId) ){
            double profRating = cs.getTeachingProfessorRating() + Double.valueOf(txtProf.getText());
                    double avgProfRating = (double) profRating / 2;
                    cs.setTeachingProfessorRating(avgProfRating);
                    txtProf.setText(String.valueOf(avgProfRating));
        }
}
txtProf.setText("");
JOptionPane.showMessageDialog(null, "Professor's rating submitted. Thank you!");
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void optionsCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsCoursesActionPerformed
        // TODO add your handling code here:
      String selectedValue = (String) optionsCourses.getSelectedItem();
      Map<String, String> outerMap = professorNames.get(selectedValue);
      for(Map.Entry<String, String> entry :outerMap.entrySet())
      {
          txtProfessor.setText(entry.getValue());
          selectedProfessorId = entry.getKey();
      }
    }//GEN-LAST:event_optionsCoursesActionPerformed

    private void txtProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRateCourse;
    private javax.swing.JButton btnRateProfessor;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> optionsCourses;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtProf;
    private javax.swing.JTextField txtProfessor;
    // End of variables declaration//GEN-END:variables
}