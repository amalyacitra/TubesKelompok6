/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class KelolaKelasDosen extends javax.swing.JFrame implements View{

    /**
     * Creates new form EditKelasDosen
     */
    public KelolaKelasDosen() {
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

        lNamaKelas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lMK = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LJumlahMhs = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lJumlahTugasTotal = new javax.swing.JLabel();
        lJumlahTugasIndividu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lJumlahTugasKelompok = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lJumlahKelompok = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lSks = new javax.swing.JLabel();
        btnDeleteKelas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNamaKelas.setText("{Nama Kelas}");

        jLabel2.setText("Mata Kuliah: ");

        lMK.setText("jLabel3");

        jLabel4.setText("Jumlah Mahasiswa: ");

        LJumlahMhs.setText("jLabel5");

        jLabel6.setText("Jumlah Tugas: ");

        lJumlahTugasTotal.setText("jLabel7");

        lJumlahTugasIndividu.setText("jLabel3");

        jLabel5.setText("(Individu)");

        jLabel7.setText("(Total)");

        lJumlahTugasKelompok.setText("jLabel3");

        jLabel8.setText("(Kelompok)");

        jLabel3.setText("Jumlah Kelompok: ");

        lJumlahKelompok.setText("jLabel9");

        btnBack.setText("Back");

        jLabel9.setText("Sks Mata Kuliah: ");

        lSks.setText("jLabel10");

        btnDeleteKelas.setText("Delete Kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lSks)
                                    .addComponent(lMK)
                                    .addComponent(lJumlahKelompok)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lJumlahTugasKelompok)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lJumlahTugasIndividu)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lJumlahTugasTotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addComponent(LJumlahMhs)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNamaKelas)
                                .addGap(65, 65, 65)))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lMK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lSks))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LJumlahMhs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lJumlahTugasTotal)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJumlahTugasIndividu)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJumlahTugasKelompok)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJumlahKelompok)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDeleteKelas))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
      
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LJumlahMhs;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteKelas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lJumlahKelompok;
    private javax.swing.JLabel lJumlahTugasIndividu;
    private javax.swing.JLabel lJumlahTugasKelompok;
    private javax.swing.JLabel lJumlahTugasTotal;
    private javax.swing.JLabel lMK;
    private javax.swing.JLabel lNamaKelas;
    private javax.swing.JLabel lSks;
    // End of variables declaration//GEN-END:variables

    
    public void addListener(ActionListener l){
        btnBack.addActionListener(l);
        btnDeleteKelas.addActionListener(l);
        
    
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }

   

    public void setlJumlahMhs(String s) {
        this.LJumlahMhs.setText(s);
    }

    public void setlJumlahKelompok(String s) {
        this.lJumlahKelompok.setText(s);
    }

    public void setlJumlahTugasIndividu(String s) {
        this.lJumlahTugasIndividu.setText(s);
    }

    public void setlJumlahTugasTotal(String s) {
        this.lJumlahTugasTotal.setText(s);
    }

    public void setlMK(String s) {
        this.lMK.setText(s);
    }

    public void setlJumlahTugasKelompok(String s) {
        this.lJumlahTugasKelompok.setText(s);
    }

    public void setlSks(String s) {
        this.lSks.setText(s);
    }
    
    public void setlNamaKelas(String s){
        this.lNamaKelas.setText(s);
    }

    public JButton getBtnDeleteKelas() {
        return btnDeleteKelas;
    }

    
   
    

    


}
