/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.ProfessorRole;

import Education.Education;
import Education.Professor.Professor;
import static Utiltities.Validations.validateEmail;
import static Utiltities.Validations.validatePassword;
import static Utiltities.Validations.validatePhone;
import static Utiltities.Validations.validateUsername;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ASUS
 */
public class ViewProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProfileJPanel
     */
    
    private JPanel userProcessContainer;
    private Education education;
    private Professor professor;
    
    public ViewProfileJPanel(JPanel userProcessContainer, Education education, Professor professor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.professor = professor;
        txtName.setText(professor.getName());
        txtUsername.setText(professor.getUsername());
        txtContactInfo.setText(professor.getPhone());
        txtEmail.setText(professor.getEmail());
        txtPassword.setText(professor.getCurrentPassword());
        
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
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblContactInfo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtContactInfo = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Update Professor");

        lblUsername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username:");

        txtUsername.setEditable(false);
        txtUsername.setEnabled(false);

        lblContactInfo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContactInfo.setText("Contact Info:");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmail.setText("Email:");

        lblPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password:");

        lblName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name:");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(txtEmail)
                    .addComponent(txtContactInfo)
                    .addComponent(txtUsername)
                    .addComponent(txtName)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String userName = txtUsername.getText().trim();
        String contactInfo = txtContactInfo.getText().trim();
        String email = txtEmail.getText().trim();
        String password = txtPassword.getText().trim();
        
        if(userName.isEmpty() || name.isEmpty() || contactInfo.isEmpty() || email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validateUsername(name)){
            JOptionPane.showMessageDialog(this, "Name should be between 5 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validateUsername(userName)){
            JOptionPane.showMessageDialog(this, "Username should be between 5 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validatePhone(contactInfo)){
            JOptionPane.showMessageDialog(this, "Please verify if Phone number is in correct format \"(000) 000-0000\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validateEmail(email)){
            JOptionPane.showMessageDialog(this, "Please verify if email is in correct format \"youremail@xxx.xxx\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validatePassword(password)){
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!BCrypt.checkpw(password,professor.getCurrentPassword())){
            for(String passwordOld : professor.getPasswordHistory()){
                if(password.equals(passwordOld)){
                    JOptionPane.showMessageDialog(this, "Password already used. Please enter a new password.","Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        professor.getPasswordHistory().add(password);
        String salt = BCrypt.gensalt();
        String Cpassword = BCrypt.hashpw(password, salt);
        for(Professor professorU : education.getProfessorsDirectory().getProfessorList()){
            if(professor.getProfessorId().equals(professorU.getProfessorId())){
                professorU.setName(name);
                professorU.setUsername(userName);
                professorU.setPhone(contactInfo);
                professorU.setEmail(email);
                professorU.setCurrentPassword(Cpassword);
                JOptionPane.showMessageDialog(this,"Professor details updated successfuly!");
                return;
            }
        }        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtContactInfo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
