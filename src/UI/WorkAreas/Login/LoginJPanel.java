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
import UI.WorkAreas.EmployerRole.EmployerJPanel;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 500));
        setRequestFocusEnabled(false);

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        btnSignIn.setBackground(new java.awt.Color(0, 0, 0));
        btnSignIn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username:");

        lblRole.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRole.setText("Role:");

        optionsRole.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        optionsRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Student", "Admin", "Authority", "Employer" }));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lblPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password:");

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jPanel1.setBackground(new java.awt.Color(160, 237, 252));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Back");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Login-page-image.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignIn)
                            .addComponent(optionsRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegister, btnSignIn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {optionsRole, txtPassword, txtUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword, lblRole, lblUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optionsRole)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegister, btnSignIn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {optionsRole, txtPassword, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        String usernameInput = txtUsername.getText().trim();
        String passwordInput = txtPassword.getText().trim();
        
        if(usernameInput.isEmpty() || passwordInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
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
        if("Employer".equals(String.valueOf(optionsRole.getSelectedItem()))){
             if((usernameInput.equals(education.getEmployer().getUsername())) && (passwordInput.equals(education.getEmployer().getPassword())))
               {
                    EmployerJPanel panel = new EmployerJPanel(userProcessContainer,education);
                    userProcessContainer.add("EmployerJPanel", panel);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JComboBox<String> optionsRole;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
