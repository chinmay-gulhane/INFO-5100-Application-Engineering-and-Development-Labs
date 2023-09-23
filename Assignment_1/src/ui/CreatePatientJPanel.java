/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author chinmaygulhane
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    Patient patient;
    public CreatePatientJPanel(Patient patient) {
        initComponents();
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOnMedication = new javax.swing.ButtonGroup();
        buttonGroupAllergies = new javax.swing.ButtonGroup();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        lblPrimaryDoctor = new javax.swing.JLabel();
        txtPrimaryDoctor = new javax.swing.JTextField();
        lbLastVisitDate = new javax.swing.JLabel();
        txtLastVisitDate = new javax.swing.JTextField();
        lblNextAppointmentDate = new javax.swing.JLabel();
        txtNextAppointmentDate = new javax.swing.JTextField();
        lblOnMedication = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblAllergies = new javax.swing.JLabel();
        jRadioButtonMedicationYes = new javax.swing.JRadioButton();
        jRadioButtonMedicationNo = new javax.swing.JRadioButton();
        jRadioButtonAllergiesYes = new javax.swing.JRadioButton();
        jRadioButtonAllergiesNo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatientId.setText("Paient Id:");

        lblPrimaryDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrimaryDoctor.setText("Primary Doctor:");

        txtPrimaryDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryDoctorActionPerformed(evt);
            }
        });

        lbLastVisitDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLastVisitDate.setText("Last Visit Date:");

        txtLastVisitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastVisitDateActionPerformed(evt);
            }
        });

        lblNextAppointmentDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNextAppointmentDate.setText("Next Appointment Date:");

        lblOnMedication.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOnMedication.setText("On Medication:");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Patient");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAllergies.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAllergies.setText("Allergies:");

        buttonGroupOnMedication.add(jRadioButtonMedicationYes);
        jRadioButtonMedicationYes.setText("Yes");
        jRadioButtonMedicationYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedicationYesActionPerformed(evt);
            }
        });

        buttonGroupOnMedication.add(jRadioButtonMedicationNo);
        jRadioButtonMedicationNo.setText("No");
        jRadioButtonMedicationNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedicationNoActionPerformed(evt);
            }
        });

        jRadioButtonAllergiesYes.setText("Yes");
        jRadioButtonAllergiesYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllergiesYesActionPerformed(evt);
            }
        });

        jRadioButtonAllergiesNo.setText("No");
        jRadioButtonAllergiesNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllergiesNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLastVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrimaryDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNextAppointmentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOnMedication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAllergies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(txtPrimaryDoctor)
                        .addComponent(txtNextAppointmentDate)
                        .addComponent(txtLastVisitDate)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButtonAllergiesYes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonAllergiesNo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButtonMedicationYes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonMedicationNo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrimaryDoctor)
                    .addComponent(txtPrimaryDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastVisitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLastVisitDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNextAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNextAppointmentDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOnMedication)
                    .addComponent(jRadioButtonMedicationYes)
                    .addComponent(jRadioButtonMedicationNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergies)
                    .addComponent(jRadioButtonAllergiesYes)
                    .addComponent(jRadioButtonAllergiesNo))
                .addGap(50, 50, 50)
                .addComponent(btnSave)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimaryDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryDoctorActionPerformed

    private void txtLastVisitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastVisitDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastVisitDateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        // Validation if any field is left empty
        if(txtPatientId.getText().isEmpty() || txtPrimaryDoctor.getText().isEmpty() || txtLastVisitDate.getText().isEmpty()
         || txtNextAppointmentDate.getText().isEmpty() || !(jRadioButtonAllergiesNo.isSelected() || jRadioButtonAllergiesYes.isSelected())
         || !(jRadioButtonMedicationNo.isSelected() || jRadioButtonMedicationYes.isSelected())){
           JOptionPane.showMessageDialog(null, "Please enter all the fields");
            return; 
        }
        
        boolean checkIfNumber;
        String pId = (txtPatientId.getText());
        checkIfNumber = pId.matches("^[0-9]+$");
        if(!checkIfNumber) {
            JOptionPane.showMessageDialog(null, "Patient Id must have digits only");
            return;
        } 
        
        Long patientId =Long.parseLong(txtPatientId.getText());
        String primaryDoctor = txtPrimaryDoctor.getText();
        String lastVisitDate = txtLastVisitDate.getText();
        String nextAppointmentDate = txtNextAppointmentDate.getText();
        String onMedication = "No";
        String allergies = "No";
        
        if(jRadioButtonMedicationYes.isSelected()){
            onMedication = "Yes";
        }
        if(jRadioButtonAllergiesYes.isSelected()){
            allergies = "Yes";
        }

        patient.setPatientID(patientId);
        patient.setPrimaryDoctor(primaryDoctor);
        patient.setDateOfLastVisit(lastVisitDate);
        patient.setDateOfNextAppointment(nextAppointmentDate);
        patient.setAllergies(allergies);
        patient.setOnMedication(onMedication);

        JOptionPane.showMessageDialog(this, "Patient Information Saved");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jRadioButtonMedicationYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedicationYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMedicationYesActionPerformed

    private void jRadioButtonMedicationNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedicationNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMedicationNoActionPerformed

    private void jRadioButtonAllergiesYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllergiesYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAllergiesYesActionPerformed

    private void jRadioButtonAllergiesNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllergiesNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAllergiesNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupAllergies;
    private javax.swing.ButtonGroup buttonGroupOnMedication;
    private javax.swing.JRadioButton jRadioButtonAllergiesNo;
    private javax.swing.JRadioButton jRadioButtonAllergiesYes;
    private javax.swing.JRadioButton jRadioButtonMedicationNo;
    private javax.swing.JRadioButton jRadioButtonMedicationYes;
    private javax.swing.JLabel lbLastVisitDate;
    private javax.swing.JLabel lblAllergies;
    private javax.swing.JLabel lblNextAppointmentDate;
    private javax.swing.JLabel lblOnMedication;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPrimaryDoctor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtLastVisitDate;
    private javax.swing.JTextField txtNextAppointmentDate;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPrimaryDoctor;
    // End of variables declaration//GEN-END:variables
}
