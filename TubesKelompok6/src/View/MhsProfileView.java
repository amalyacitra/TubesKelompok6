/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author my asus
 */
public class MhsProfileView extends javax.swing.JFrame implements View {

    /**
     * Creates new form MhsProfileView
     */
    public MhsProfileView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelNIM = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnEditProfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Profil Menu Mahasiswa");

        jLabel2.setText("Username :");

        labelUsername.setText("Username disini");

        jLabel4.setText("Nama :");

        LabelNama.setText("Nama disini");

        jLabel6.setText("NIM : ");

        LabelNIM.setText("NIM disini");

        jLabel8.setText("Email :");

        LabelEmail.setText("Email disini");

        btnBack.setText("Back");

        btnEditProfil.setText("Edit Profil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEmail)
                    .addComponent(LabelNIM)
                    .addComponent(LabelNama)
                    .addComponent(labelUsername)
                    .addComponent(jLabel1))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditProfil)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelUsername))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelNama))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LabelNIM))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnEditProfil))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnEditProfil() {
        return btnEditProfil;
    }
    
    public void addListener (ActionListener l){
        btnBack.addActionListener(l);
        btnEditProfil.addActionListener(l);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelNIM;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditProfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
