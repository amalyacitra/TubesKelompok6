/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author ASUS
 */
public class AddSoalView extends javax.swing.JFrame implements View{

    /**
     * Creates new form AddSoalView
     */
    public AddSoalView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tfInputSoal = new javax.swing.JTextArea();
        comboBoxSoal = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tFshowSoal = new javax.swing.JTextArea();
        btnAddSoal = new javax.swing.JButton();
        btnFInish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lNamaTugas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfInputSoal.setColumns(20);
        tfInputSoal.setRows(5);
        jScrollPane1.setViewportView(tfInputSoal);

        comboBoxSoal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tFshowSoal.setColumns(20);
        tFshowSoal.setRows(5);
        jScrollPane2.setViewportView(tFshowSoal);

        btnAddSoal.setText("Add Soal");

        btnFInish.setText("Finish");

        jLabel1.setText("Tugas ");

        jLabel2.setText("Preview Soal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddSoal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxSoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(btnFInish, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lNamaTugas)))
                        .addGap(0, 156, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lNamaTugas))
                .addGap(4, 4, 4)
                .addComponent(comboBoxSoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAddSoal)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFInish)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSoal;
    private javax.swing.JButton btnFInish;
    private javax.swing.JComboBox<String> comboBoxSoal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lNamaTugas;
    private javax.swing.JTextArea tFshowSoal;
    private javax.swing.JTextArea tfInputSoal;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddSoal() {
        return btnAddSoal;
    }

    public JButton getBtnFinish() {
        return btnFInish;
    }

    public JComboBox<String> getComboBoxSoal() {
        return comboBoxSoal;
    }

    public JTextArea getTfShowSoal() {
        return tFshowSoal;
    }

    public JTextArea getTfInputSoal() {
        return tfInputSoal;
    }

    public void settFshowSoal(String s) {
        this.tFshowSoal.setText(s);
    }

    public void setTfInputSoal(String s) {
        this.tfInputSoal.setText(s);
    }


    public void setComboBoxSoal(String[] s) {
        comboBoxSoal.setModel(new DefaultComboBoxModel<>(s));
    }

    
    
    
    
    
    public void addListener(ActionListener l){
        comboBoxSoal.addActionListener(l);
        btnAddSoal.addActionListener(l);
        btnFInish.addActionListener(l);
        
        
    }

    public void setlNamaTugas(String s) {
        this.lNamaTugas.setText(s);
    }

    

}
