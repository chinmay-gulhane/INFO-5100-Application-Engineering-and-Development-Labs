/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.ProfessorRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Professor.Professor;
import Education.Student.Student;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class AddGradesJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Education education;
    private Professor professor;
    DefaultTableModel dtm;
    /**
     * Creates new form AddGradesJPanel
     */
    public AddGradesJPanel(JPanel userProcessContainer, Education education, Professor professor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.professor = professor;
        dtm = (DefaultTableModel) tblGrade.getModel();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for(CourseSchedule courseSch : education.getCourseScheduleDirectory().getCourseScheduleList()){
            if(courseSch.getTeachingProfessorId().equals(professor.getProfessorId()) && (courseSch.getTerm()+" "+courseSch.getYear()).equals("Fall 2023")){
                for(Course course : education.getCourseDirectory().getCourseList()){
                    if(course.getCourseId().equals(courseSch.getCourseId())){
                        model.addElement(course.getName() +" "+courseSch.getScheduleId());
                    }
                    break;
                }
            }
        }
        optionsCourse.setModel(model);
        lblStudentName.setVisible(false);
        txtGrade.setVisible(false);
        btnSetGrade.setVisible(false);
        //populateTable();
    }
    
    public void populateTable(CourseSchedule courseSchedule){
        dtm.setRowCount(0);
        
    ArrayList<Student> studentList = education.getStudentsDirectory().getStudentList();
    List<Student> filteredStudents = studentList.stream().filter(student -> student.getGrades().containsKey(courseSchedule.getScheduleId())).collect(Collectors.toList());   
    filteredStudents.sort(Comparator.comparing(student -> student.getGrades().get(courseSchedule.getScheduleId()), Comparator.reverseOrder()));

    for(Student student: filteredStudents){
         Object[] row = new Object[5];
                row[0] = student;
                row[1] = student.getName();
                row[2] = student.getEmail();
                row[3] = student.getGrades().get(courseSchedule.getScheduleId());
                row[4] = student.getGpa();
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

        lblHeader = new javax.swing.JLabel();
        optionsCourse = new javax.swing.JComboBox<>();
        lblSelectCourse = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrade = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdateGrade = new javax.swing.JButton();
        lblStudentName = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        btnSetGrade = new javax.swing.JButton();

        lblHeader.setText("Add Grades:");

        lblSelectCourse.setText("Select Course:");

        lblTerm.setText("Fall 2023");

        tblGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Email", "Grade", "GPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGrade);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdateGrade.setText("Update Grades");
        btnUpdateGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGradeActionPerformed(evt);
            }
        });

        lblStudentName.setText("Grade for StudentFirstName StudentLastName:");

        txtGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradeActionPerformed(evt);
            }
        });

        btnSetGrade.setText("Set Grade");
        btnSetGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(optionsCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStudentName)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSetGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(optionsCourse)
                    .addComponent(lblTerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelectCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String courseSchID = String.valueOf(optionsCourse.getSelectedItem()).trim().replaceAll(".*\\s+", "");;
        System.out.print(courseSchID);
        for(CourseSchedule courseSch : education.getCourseScheduleDirectory().getCourseScheduleList()){
            if(courseSch.getScheduleId().equals(courseSchID)){
                populateTable(courseSch);
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGradeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblGrade.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Student student = (Student)tblGrade.getValueAt(selectedRow, 0);
            lblStudentName.setVisible(true);
            txtGrade.setVisible(true);
            btnSetGrade.setVisible(true);
            
            lblStudentName.setText("Set Grade for "+student.getName());
            
        }
    }//GEN-LAST:event_btnUpdateGradeActionPerformed

    private void btnSetGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetGradeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblGrade.getSelectedRow();
        Student student = (Student)tblGrade.getValueAt(selectedRow, 0);
        if(txtGrade.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill Grade for student to procced.", "Account Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Double.valueOf(txtGrade.getText().trim()) <= 0 || Double.valueOf(txtGrade.getText().trim()) > 4){
            JOptionPane.showMessageDialog(this, "Please make sure grade is between 0 and 4.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String courseSchID = String.valueOf(optionsCourse.getSelectedItem()).trim().replaceAll(".*\\s+", "");
        student.getGrades().put(courseSchID,Double.valueOf(txtGrade.getText()));
        double sum = 0;
        for (double value : student.getGrades().values()) {
            sum += value;
        }
        double gpaU = sum/student.getGrades().size();
        student.setGpa(gpaU);
         for(CourseSchedule courseSch : education.getCourseScheduleDirectory().getCourseScheduleList()){
            if(courseSch.getScheduleId().equals(courseSchID)){
                populateTable(courseSch);
            }
        }
        JOptionPane.showMessageDialog(this,"Grade updated successfuly!");
    }//GEN-LAST:event_btnSetGradeActionPerformed

    private void txtGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetGrade;
    private javax.swing.JButton btnUpdateGrade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblSelectCourse;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JComboBox<String> optionsCourse;
    private javax.swing.JTable tblGrade;
    private javax.swing.JTextField txtGrade;
    // End of variables declaration//GEN-END:variables
}
