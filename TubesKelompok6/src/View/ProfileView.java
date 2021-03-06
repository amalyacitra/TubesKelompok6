/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;

/**
 *
 * @author ASUS
 */
public class ProfileView extends javax.swing.JFrame implements View{

    /**
     * Creates new form ProfileView
     */
    public ProfileView() {
        initComponents();
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
        btnEditProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaL = new javax.swing.JLabel();
        nimnipLabel = new javax.swing.JLabel();
        nipnimL = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        JenisUserLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmailL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");

        btnEditProfile.setText("Edit Profil");

        jLabel1.setText("Username :");

        jLabel3.setText("Nama :");

        nimnipLabel.setText("NIP/NIM :");

        titleLabel.setText("Profil Menu");

        jLabel7.setText("Email :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnEditProfile)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(nimnipLabel)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaL)
                                .addComponent(nipnimL))
                            .addComponent(usernameL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmailL))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JenisUserLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(JenisUserLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameL))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaL))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimnipLabel)
                    .addComponent(nipnimL))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(EmailL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnEditProfile))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailL;
    private javax.swing.JLabel JenisUserLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel namaL;
    private javax.swing.JLabel nimnipLabel;
    private javax.swing.JLabel nipnimL;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameL;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnEditProfile() {
        return btnEditProfile;
    }

    public void AddListener(ActionListener l){
        btnBack.addActionListener(l);
        btnEditProfile.addActionListener(l);
        
    }
    
    public void AddListenerAncestor(AncestorListener listener){
        jLabel1.addAncestorListener(listener);
    }

    public void setEmailL(String i) {
        this.EmailL.setText(i);
    }

    public void setJenisUserLabel(String i) {
        this.JenisUserLabel.setText(i);
    }

    public void setNamaL(String i) {
        this.namaL.setText(i);
    }

    public void setNimnipLabel(String i) {
        this.nimnipLabel.setText(i);
    }

    public void setNipnimL(String i) {
        this.nipnimL.setText(i);
    }

    public void setUsernameL(String i) {
        this.usernameL.setText(i);
    }
    
    


}
