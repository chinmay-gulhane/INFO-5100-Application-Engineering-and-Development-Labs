package UI.WorkAreas.AdminRole;

import Education.Education;
import Education.Professor.Professor;
import Education.Student.Student;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ViewPendingRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPendingRegistrationJPanel
     */
    private JPanel userProcessContainer;
    private Education education;
    DefaultTableModel dtm;
    
    public ViewPendingRegistrationJPanel(JPanel userProcessContainer, Education education) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        dtm = (DefaultTableModel) tblPendingRegistration.getModel();
        populateTable();
        lblStatus.setVisible(false);
        optionsStatus.setVisible(false);
        btnSaveStatus.setVisible(false);
    }
    
        public void populateTable(){
        dtm.setRowCount(0);
        for(Professor professor: education.getProfessorsDirectory().getProfessorList()){
            if(!("Register".equals(professor.getStatus()))){
                continue;
            }
            Object[] row = new Object[5];
            row[0] = professor;
            row[1] = professor.getName();
            row[2] = professor.getEmail();
            row[3] = "Professor";
            if("Register".equals(professor.getStatus())){
                row[4] = "Unregistered";
            }
            else if("Block".equals(professor.getStatus())){
                row[4] = "Blocked";
            }else{
                row[4] = "Active";
            }
            dtm.addRow(row);
        }
        for(Student student: education.getStudentsDirectory().getStudentList()){
            if(!("Register".equals(student.getStatus()))){
                continue;
            }
            Object[] row = new Object[5];
            row[0] = student;
            row[1] = student.getName();
            row[2] = student.getEmail();
            row[3] = "Student";
            if("Register".equals(student.getStatus())){
                row[4] = "Unregistered";
            }
            else if("Block".equals(student.getStatus())){
                row[4] = "Blocked";
            }else{
                row[4] = "Active";
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPendingRegistration = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        optionsStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        btnSaveStatus = new javax.swing.JButton();
        lblWelcomeAdmin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 1000));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPendingRegistration.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblPendingRegistration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EduVerse ID", "Name", "Email", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPendingRegistration.setMinimumSize(new java.awt.Dimension(800, 80));
        jScrollPane1.setViewportView(tblPendingRegistration);
        if (tblPendingRegistration.getColumnModel().getColumnCount() > 0) {
            tblPendingRegistration.getColumnModel().getColumn(0).setResizable(false);
            tblPendingRegistration.getColumnModel().getColumn(1).setResizable(false);
            tblPendingRegistration.getColumnModel().getColumn(3).setResizable(false);
        }

        btnUpdateStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUpdateStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        optionsStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Block" }));
        optionsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsStatusActionPerformed(evt);
            }
        });

        lblStatus.setBackground(new java.awt.Color(0, 0, 0));
        lblStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblStatus.setText("Set Status:");

        btnSaveStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnSaveStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSaveStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveStatus.setText("Save Status");
        btnSaveStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStatusActionPerformed(evt);
            }
        });

        lblWelcomeAdmin.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblWelcomeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeAdmin.setText("Pending Registrations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStatus)
                                        .addGap(30, 30, 30)
                                        .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(604, 604, 604)
                                .addComponent(btnBack)))
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSaveStatus, btnUpdateStatus});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSaveStatus, btnUpdateStatus});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 2);
        if(component instanceof AdminJPanel adminJPanel) {
            adminJPanel.setupAdminDashboard();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPendingRegistration.getSelectedRow();
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
        int selectedRow = tblPendingRegistration.getSelectedRow();
        if("Professor".equals(tblPendingRegistration.getValueAt(selectedRow, 3))){
            Professor professorU = (Professor)tblPendingRegistration.getValueAt(selectedRow, 0);
            for(Professor professor: education.getProfessorsDirectory().getProfessorList()){
                if(professor.getProfessorId().equals(professorU.getProfessorId())){
                    professor.setStatus(String.valueOf(optionsStatus.getSelectedItem()));
                    lblStatus.setVisible(false);
                    optionsStatus.setVisible(false);
                    btnSaveStatus.setVisible(false);
                    populateTable();
                    return;
                }
            }
        }else {
            Student studentU = (Student)tblPendingRegistration.getValueAt(selectedRow, 0);
            for(Student student: education.getStudentsDirectory().getStudentList()){
                if(student.getStudentId().equals(studentU.getStudentId())){
                    student.setStatus(String.valueOf(optionsStatus.getSelectedItem()));
                    lblStatus.setVisible(false);
                    optionsStatus.setVisible(false);
                    btnSaveStatus.setVisible(false);
                    populateTable();
                    return;
                }
            }
        }       
    }//GEN-LAST:event_btnSaveStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveStatus;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblWelcomeAdmin;
    private javax.swing.JComboBox<String> optionsStatus;
    private javax.swing.JTable tblPendingRegistration;
    // End of variables declaration//GEN-END:variables
}
