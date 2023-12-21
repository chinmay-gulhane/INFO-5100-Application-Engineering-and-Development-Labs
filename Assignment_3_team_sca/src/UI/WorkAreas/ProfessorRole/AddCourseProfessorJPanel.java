/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.ProfessorRole;

import Education.Courses.Course;
import Education.Education;
import Education.Professor.Professor;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class AddCourseProfessorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Professor professor;

    /**
     * Creates new form AddCourseJPanel
     */
    public AddCourseProfessorJPanel(JPanel userProcessContainer, Education education, Professor professor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.professor = professor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        lblCourseID = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        lblCourseTopic = new javax.swing.JLabel();
        lblCourseCredit = new javax.swing.JLabel();
        txtCourseCredit = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        optionsTopic = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Add Course");

        lblCourseName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCourseName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCourseName.setText("Course Name:");

        lblCourseID.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCourseID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCourseID.setText("Course ID:");

        txtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseIDActionPerformed(evt);
            }
        });

        lblCourseTopic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCourseTopic.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCourseTopic.setText("Course Topic:");

        lblCourseCredit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCourseCredit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCourseCredit.setText("Course Credit:");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        optionsTopic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Systems Programs", "Computer Systems Engineering", "Engineering Cooperative Education", "Data Science", "Data Analytics", "Cybersecurity", "Project Management" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCourseID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCourseTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCourseCredit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionsTopic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCourseID, lblCourseName, lblCourseTopic});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCourseName)
                    .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String courseName = txtCourseName.getText().trim();
        String courseID = txtCourseID.getText().trim();
        String courseTopic = String.valueOf(optionsTopic.getSelectedItem());
        
        
        if (courseName.isEmpty() || courseID.isEmpty() || txtCourseCredit.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all fields are filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int courseCredit;
        try{
            courseCredit = Integer.valueOf(txtCourseCredit.getText().trim());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Course credit should be an Integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (courseCredit <= 0 || courseCredit > 4){
            JOptionPane.showMessageDialog(this, "Please make sure course credit is between 1 and 4.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(Course course : education.getCourseDirectory().getCourseList()){
            if(course.getCourseId().equals(courseID)){
                JOptionPane.showMessageDialog(this, "Please make sure course ID is unique.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        if(!courseID.matches("[A-Z]{4} \\d{4}")){
            JOptionPane.showMessageDialog(this, "Please enter valid course ID following format 'XXXX 0000'.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        education.getCourseDirectory().addCourse(courseName, courseID, courseTopic, professor.getProfessorId(), courseCredit, 0);
        JOptionPane.showMessageDialog(this,"Course added successfuly!");
        txtCourseName.setText("");
        txtCourseID.setText("");
        optionsTopic.setSelectedIndex(0);
        txtCourseCredit.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 2);
        if(component instanceof ProfessorJPanel professorJPanel) {
            professorJPanel.setUpDasboardData();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCourseCredit;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCourseTopic;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JComboBox<String> optionsTopic;
    private javax.swing.JTextField txtCourseCredit;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    // End of variables declaration//GEN-END:variables
}