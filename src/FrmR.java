/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.Color;

/**
 *
 * @author ayyam8774
 */
public class FrmR extends javax.swing.JFrame {

    
    
    
    
    /**
     * Creates new form FrmR
     */
    public FrmR() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblhit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblYmoney = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbStraight = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtStraight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbStreet = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbLow = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtLow = new javax.swing.JTextField();
        cmbRed = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtRed = new javax.swing.JTextField();
        cmbEven = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtEven = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Roulette");

        jLabel3.setText("Hit number :");

        lblhit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblhit.setForeground(java.awt.Color.red);
        lblhit.setText("...");

        jLabel5.setText("Your money :");

        lblYmoney.setForeground(java.awt.Color.blue);
        lblYmoney.setText("10000");

        jLabel1.setText("Inside Bet");

        jLabel4.setText("Straight :");

        cmbStraight.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));

        jLabel7.setText("How much? :");

        txtStraight.setText("0");

        jLabel8.setText("Street :");

        cmbStreet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-2-3", "4-5-6", "7-8-9", "10-11-12", "13-14-15", "16-17-18", "19-20-21", "22-23-24", "25-26-27", "28-29-30", "31-32-33", "34-35-36", " " }));

        jLabel9.setText("How much? :");

        txtStreet.setText("0");
        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        jLabel10.setText("Outside Bet");

        cmbLow.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low", "High" }));

        jLabel11.setText("How much? :");

        txtLow.setText("0");

        cmbRed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Black" }));

        jLabel12.setText("How much? :");

        txtRed.setText("0");

        cmbEven.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Even", "Odd" }));

        jLabel13.setText("How much? :");

        txtEven.setText("0");

        btnStart.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        btnStart.setText("Spin the wheel");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblhit)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(259, 259, 259)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(325, 325, 325)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmbStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel9))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmbStraight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtStraight, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                    .addComponent(txtStreet)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblYmoney))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnStart)
                                .addGap(18, 18, 18)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel13))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(107, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblhit)
                            .addComponent(jLabel4)
                            .addComponent(cmbStraight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtStraight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblYmoney))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbLow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //get the number/value that user pick to bet.
        int numA = cmbStraight.getSelectedIndex();
        
        Object nume = cmbStreet.getSelectedItem();
        String numE = nume.toString();
        
        Object numl = cmbLow.getSelectedItem();
        String numL = numl.toString();
        
        Object numr = cmbRed.getSelectedItem();
        String numR = numr.toString();
        
        Object numq = cmbEven.getSelectedItem();
        String numQ = numq.toString();

        
        //get how much does user bet in each spot and amount of money.
        int straight = Integer.parseInt(txtStraight.getText());
        
        int street = Integer.parseInt(txtStreet.getText());
        
        int low = Integer.parseInt(txtLow.getText());
        
        int red = Integer.parseInt(txtRed.getText());
        
        int even = Integer.parseInt(txtEven.getText());
        
        int money = Integer.parseInt(lblYmoney.getText());
        
        money = money - straight - street - low - red - even;
        
        //Create the Arraylist of Odd and Even numbers.
        ArrayList <Integer> listOdd = new ArrayList();
        listOdd.add(1);
        listOdd.add(3);
        listOdd.add(5);
        listOdd.add(7);
        listOdd.add(9);
        listOdd.add(11);
        listOdd.add(13);
        listOdd.add(15);
        listOdd.add(17);
        listOdd.add(19);
        listOdd.add(21);
        listOdd.add(23);
        listOdd.add(25);
        listOdd.add(27);
        listOdd.add(29);
        listOdd.add(31);
        listOdd.add(33);
        listOdd.add(35);
        
        
        ArrayList <Integer> listEven = new ArrayList();
        listEven.add(0);
        listEven.add(2);
        listEven.add(4);
        listEven.add(6);
        listEven.add(8);
        listEven.add(10);
        listEven.add(12);
        listEven.add(14);
        listEven.add(16);
        listEven.add(18);
        listEven.add(20);
        listEven.add(22);
        listEven.add(24);
        listEven.add(26);
        listEven.add(28);
        listEven.add(30);
        listEven.add(32);
        listEven.add(34);
        listEven.add(36);

        
        
        //Create the Arraylist of Red numbers.
        List <Integer> Red = new ArrayList (17); 
        Red.add(1);
        Red.add(3);
        Red.add(5);
        Red.add(7);
        Red.add(9);
        Red.add(12);
        Red.add(14);
        Red.add(16);
        Red.add(18);
        Red.add(19);
        Red.add(21);
        Red.add(23);
        Red.add(25);
        Red.add(27);
        Red.add(30);
        Red.add(32);
        Red.add(34);
        Red.add(36);
        
        //Create the Arraylist of Black numbers.
        List <Integer> Black = new ArrayList(17);
        Black.add(2);
        Black.add(4);
        Black.add(6);
        Black.add(8);
        Black.add(10);
        Black.add(11);
        Black.add(13);
        Black.add(15);
        Black.add(17);
        Black.add(20);
        Black.add(22);
        Black.add(24);
        Black.add(26);
        Black.add(28);
        Black.add(29);
        Black.add(31);
        Black.add(33);
        Black.add(35);
        
        
        
        
       
        
        //Define Street.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        if (numE == "1-2-3")
        {
            num1 = 1;
            num2 = 2;
            num3 = 3;
        }
        
        if (numE == "4-5-6")
        {
            num1 = 4;
            num2 = 5;
            num3 = 6;
        }
        
        
       
        
        
        //find out the what number is hit, if number is Red(Black) → Change text colour to red(black).
        Random rand = new Random();
        int hit = rand.nextInt(36);
        lblhit.setText(""+ hit +"");

        
        //money that you get by win of Straight
        if (hit == numA)
        {
            money = money + straight + (straight * 36);
            lblYmoney.setText(""+ money +"");
        }
        
        //money that you get from win of Street
        if (hit == num1)
        {
            money = money + street + (street * 18);
            lblYmoney.setText(""+ money +"");
        }
        
        if (hit == num2)
        {
            money = money + (street * 18);
            lblYmoney.setText(""+ money +"");
        }
        
        if (hit == num3)
        {
            money = money + street + (street * 18);
            lblYmoney.setText(""+ money +"");
        }
        
        
        //money that you get from high
        if (hit > 18)
        {
            if (numL == "High")
            {
                money = money + low + (low * 2);
                lblYmoney.setText(""+ money +"");
            }
            
            if (numL == "Low")
            {
                lblYmoney.setText(""+ money +"");
            }
        }
        
        //money that player get from low
        if (hit < 19)
        {
            if (numL == "High")
            {
                lblYmoney.setText(""+ money +"");
            }
            
            if (numL == "Low")
            {
                money = money + low + (low * 2);
                lblYmoney.setText(""+ money +"");
            }
        }
        
        
        //money that user get from Odd/Even.
        // ↓That's user get money by hitting to Even
        
        Integer A = hit;
        Boolean E = listEven.contains(A);
        
        if (E == true)
        {
            if (numQ == "Even")
            {
                money = money + even + (even * 2);
                lblYmoney.setText(""+ money +"");
            }
            
            if (numQ == "Odd")
            {
                lblYmoney.setText(""+ money +"");
            }
        }    
        
        if (E == false)
        {
            lblYmoney.setText(""+ money +"");
        }
        
       
        // ↓That's user get money by hitting to Odd
        Boolean O = listOdd.contains(A);
        
        if (O == true)
        {
            if (numQ == "Odd")
            {
                money = money + even + (even * 2);
                lblYmoney.setText(""+ money +"");
            }
            
            if (numQ == "Even")
            {
                lblYmoney.setText(""+ money +"");
            }
        }
        
        if (O == false)
        {
            lblYmoney.setText(""+ money +"");
        }
        
        
        
        
        
        
        
        
        
        //Money that's user get from Red/Black.
        //↓That's user get money by hitting to Red
        if (Arrays.asList(Red).contains(hit))
        {
            if (numR == "Red")
            {
                money = money + red + (red * 2);
                lblYmoney.setText(""+ money +"");          
            }
            
            if (numR == "Black")
            {
                lblYmoney.setText(""+ money +"");        
            }
        }
        
        //↓That's user get money by hitting to Black
        if (Arrays.asList(Black).contains(hit))
        {
            if (numR == "Red")
            {
                lblYmoney.setText(""+ money +"");
            }
            
            if (numR == "Black")
            {
                money = money + red + (red * 2);
                lblYmoney.setText(""+ money +"");
            }    
        }
        
        
        //When user's money become less or equal to 0, user just can press Restart button.
        if (money < 1)
        {
            btnStart.setEnabled(false);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        lblYmoney.setText("10000");
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox cmbEven;
    private javax.swing.JComboBox cmbLow;
    private javax.swing.JComboBox cmbRed;
    private javax.swing.JComboBox cmbStraight;
    private javax.swing.JComboBox cmbStreet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblYmoney;
    private javax.swing.JLabel lblhit;
    private javax.swing.JTextField txtEven;
    private javax.swing.JTextField txtLow;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtStraight;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
