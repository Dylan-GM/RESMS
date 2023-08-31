/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resms.Factory;

import resms.MyApp.MainForm1;
import resms.MyLib.Lot_List;

/**
 *
 * @author Buena, Lucas, Lumba, Magana, Paita, Tambagan
 */
public class CashPayment extends javax.swing.JFrame {

    /**
     * Creates new form CashPayment
     */
    public Lot_List LotList;
    int num;
    
    public CashPayment(Lot_List LotList, int num) {
        initComponents();
        this.LotList = LotList;
        this.num = num;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountDue = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        amount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amountDue.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Cash Payment");

        mainmenuButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        mainmenuButton.setText("Return to Main Menu");
        mainmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuButtonActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("The details for On-Site Payment will be sent to your e-mail. Thank you!");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("For Cash Payment, please enter your e-mail below.");

        email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout amountDueLayout = new javax.swing.GroupLayout(amountDue);
        amountDue.setLayout(amountDueLayout);
        amountDueLayout.setHorizontalGroup(
            amountDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amountDueLayout.createSequentialGroup()
                .addGap(769, 769, 769)
                .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
            .addGroup(amountDueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amountDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amountDueLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(amountDueLayout.createSequentialGroup()
                        .addGroup(amountDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(amountDueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amountDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainmenuButton)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        amountDueLayout.setVerticalGroup(
            amountDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amountDueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount)
                .addGap(13, 13, 13)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(mainmenuButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(amountDue, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(amountDue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed

        MainForm1 mainform = new MainForm1(LotList);
        mainform.setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JPanel amountDue;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mainmenuButton;
    // End of variables declaration//GEN-END:variables
}



//  Buena, Lucas, Lumba, Magana, Paita, Tambagan
//  CSS123L - BM3 - FINAL PROJECT
//  08/07/2023
