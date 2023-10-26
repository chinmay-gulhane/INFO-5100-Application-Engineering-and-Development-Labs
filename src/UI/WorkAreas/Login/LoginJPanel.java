/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.Login;

import Education.Education;
import UI.WorkAreas.StudentRole.StudentJPanel;
import UI.WorkAreas.ProfessorRole.ProfessorJPanel;
import UI.WorkAreas.AdminRole.AdminJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Education.Professor.Professor;
import Education.Student.Student;
import UI.WorkAreas.Authority.AuthorityJPanel;
import UI.WorkAreas.Register.RegisterJPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author samik
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
//    private JSplitPane main;
    /**
     * Creates new form LoginJPanel
     */

    LoginJPanel(JPanel userProcessContainer, Education education) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
//        headerSignoutJPanel headerPanel = new headerSignoutJPanel(userProcessContainer, education);
//        main.setLeftComponent(headerPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        optionsRole = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 500));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 500));
        setRequestFocusEnabled(false);

        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblRole.setText("Role:");

        optionsRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Student", "Admin", "Authority" }));

        lblPassword.setText("Password:");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnRegister)
                .addGap(56, 56, 56)
                .addComponent(btnSignIn)
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(optionsRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsername)
                        .addComponent(txtPassword))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnRegister))
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(optionsRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRole))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsername)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(333, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        String usernameInput = txtUsername.getText();
        String passwordInput = txtPassword.getText();

        if("Professor".equals(String.valueOf(optionsRole.getSelectedItem()))){
            for(Professor professor : education.getProfessorsDirectory().getProfessorList()){
                if((usernameInput.equals(professor.getUsername())) && (passwordInput.equals(professor.getCurrentPassword())))
                {
                    if(professor.getStatus().equals("Register")){
                        JOptionPane.showMessageDialog(this, "User account verification pending. Please contact admin.", "Account Error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                        return;
                    }
                    if(professor.getStatus().equals("Block")){
                        JOptionPane.showMessageDialog(this, "User account is blocked. Please contact admin.", "Account Error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                        return;
                    }
                    ProfessorJPanel panel = new ProfessorJPanel(userProcessContainer,education,professor);
                    userProcessContainer.add("ProfessorJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    return;
                }
            }
        }
        if("Student".equals(String.valueOf(optionsRole.getSelectedItem()))){
            for(Student student : education.getStudentsDirectory().getStudentList()){
                if((usernameInput.equals(student.getUsername())) && (passwordInput.equals(student.getCurrentPassword())))
                {
                    if(student.getStatus().equals("Register")){
                        JOptionPane.showMessageDialog(this, "User account verification pending. Please contact admin.", "Account Error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                        return;
                    }
                    if(student.getStatus().equals("Block")){
                        JOptionPane.showMessageDialog(this, "User account is blocked. Please contact admin.", "Account Error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                        return;
                    }
                    StudentJPanel panel = new StudentJPanel(userProcessContainer,student,education);
                    userProcessContainer.add("StudentJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    return;
                }
            }
        }
        if("Admin".equals(String.valueOf(optionsRole.getSelectedItem()))){
                if((usernameInput.equals(education.getAdmin().getUsername())) && (passwordInput.equals(education.getAdmin().getPassword())))
                {
                    AdminJPanel panel = new AdminJPanel(userProcessContainer,education);
                    userProcessContainer.add("AdminJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    return;
                }
        }
        if("Authority".equals(String.valueOf(optionsRole.getSelectedItem()))){
             if((usernameInput.equals(education.getAuthority().getUsername())) && (passwordInput.equals(education.getAuthority().getPassword())))
               {
                    AuthorityJPanel panel = new AuthorityJPanel(userProcessContainer,education);
                    userProcessContainer.add("AuthorityJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    return;
               }
        }
        JOptionPane.showMessageDialog(this, "Incorrect Username or Password.", "Credentials Error", JOptionPane.ERROR_MESSAGE);
        txtPassword.setText("");
                    
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegisterJPanel panel = new RegisterJPanel(userProcessContainer,education);
        userProcessContainer.add("RegisterJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JComboBox<String> optionsRole;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
