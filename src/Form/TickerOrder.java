package Form;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// OOP import
import Core.Human;

public class TickerOrder extends javax.swing.JFrame {

 // inisiasi human
 Human human = new Human();

 // inisiasi payment

 
    private Object Interger;

    /**
     * Creates new form TickerOrder
     */
    public TickerOrder() {
        initComponents();
    }
    
    // fungsi reset
    private void resetForm() {
        // Menghapus text field
        tf_name.setText("");
        tf_phone.setText("");
        tf_amount.setText("");

        // Menghapus label
        label_total.setText("");
        
        // Menghapus combo button
        cb_day.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);

        // Menghapus radio button
        btngroup_payment.clearSelection();
    }
  
    // fungsi update data
    private void update() {
        // update data pembelian
        String name = this.human.getName();
        this.human.setName(name);

        String phone = this.human.getPhone();
        this.human.setPhone(phone);

        String amount = this.human.getAmount();
        this.human.setPhone(amount);

        String day = cb_day.getSelectedItem().toString();
        String time = cb_time.getSelectedItem().toString();
    }

    // fungsi validasi
     private String validateForm() {
        List<String> flag = new ArrayList<String>();
        String alert = "";
        
        // validasi nama
        String name = tf_name.getText();
        
        if(name.length() < 1) {
            flag.add("Name can not be blank!");
        }
        
        // validasi nomor telepon
        String phone = tf_phone.getText();
        
        if(phone.length() < 1) {
            flag.add("Phone number can not be blank!");
        }
        
        else if(!phone.matches("[0-9]+")){
            flag.add("Phone number contains number only!");
        }
        
        // validasi jumlah tiket
        String amount = tf_amount.getText();
        
        if(amount.length() < 1) {
            flag.add("Ticket amount can not be blank!");
        }
        
        else if(!amount.matches("[0-9]+")){
            flag.add("Ticket amount contains number only!");
        }
        
        // validasi hari
        if(cb_day.getSelectedIndex()== 0) {
            flag.add("Please select the day!");
        }
  
        // validasi jam
        if(cb_time.getSelectedIndex()== 0) {
            flag.add("Please select the time!");
        }

        // validasi radio button
        if(!(rb_gopay.isSelected()) | (rb_dana.isSelected()) | 
            (rb_shopeepay.isSelected()) | (rb_cash.isSelected()) |
            (rb_card.isSelected())) {
             flag.add("Please select the payment method!");
        }

        if (flag.size() > 0) {
            for (String msg : flag) {
                alert += (msg + "\n");
            }
        }

        return alert;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btngroup_payment = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JTextField();
        rb_shopeepay = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rb_dana = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_cash = new javax.swing.JRadioButton();
        cb_day = new javax.swing.JComboBox<>();
        label_total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox<>();
        label_price = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        rb_gopay = new javax.swing.JRadioButton();
        btn_save = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        label_result = new javax.swing.JLabel();
        label_final = new javax.swing.JLabel();
        rb_card = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Day");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 240, 34, 24);

        tf_amount.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tf_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amountActionPerformed(evt);
            }
        });
        tf_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_amountKeyReleased(evt);
            }
        });
        getContentPane().add(tf_amount);
        tf_amount.setBounds(32, 371, 165, 31);

        btngroup_payment.add(rb_shopeepay);
        rb_shopeepay.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rb_shopeepay.setForeground(new java.awt.Color(255, 255, 255));
        rb_shopeepay.setText("Shopee-Pay");
        rb_shopeepay.setContentAreaFilled(false);
        rb_shopeepay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_shopeepayActionPerformed(evt);
            }
        });
        getContentPane().add(rb_shopeepay);
        rb_shopeepay.setBounds(537, 377, 150, 19);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ticket Amount");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(41, 341, 127, 24);

        btngroup_payment.add(rb_dana);
        rb_dana.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rb_dana.setForeground(new java.awt.Color(255, 255, 255));
        rb_dana.setText("DANA");
        rb_dana.setContentAreaFilled(false);
        rb_dana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_danaActionPerformed(evt);
            }
        });
        getContentPane().add(rb_dana);
        rb_dana.setBounds(667, 377, 80, 19);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 240, 44, 24);

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Price");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(279, 341, 100, 24);

        btngroup_payment.add(rb_cash);
        rb_cash.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rb_cash.setForeground(new java.awt.Color(255, 255, 255));
        rb_cash.setText("Cash");
        rb_cash.setContentAreaFilled(false);
        rb_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_cashActionPerformed(evt);
            }
        });
        getContentPane().add(rb_cash);
        rb_cash.setBounds(434, 420, 90, 19);

        cb_day.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cb_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cb_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dayActionPerformed(evt);
            }
        });
        getContentPane().add(cb_day);
        cb_day.setBounds(32, 265, 145, 29);

        label_total.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        label_total.setForeground(new java.awt.Color(255, 255, 255));
        label_total.setText("   ");
        getContentPane().add(label_total);
        label_total.setBounds(269, 373, 110, 24);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ticket Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 240, 103, 24);

        cb_time.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select time", "13.30", "15.40", "17.50", "20.00" }));
        getContentPane().add(cb_time);
        cb_time.setBounds(257, 265, 149, 29);

        label_price.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        label_price.setForeground(new java.awt.Color(255, 255, 255));
        label_price.setText("    ");
        getContentPane().add(label_price);
        label_price.setBounds(489, 265, 131, 24);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment Methods");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(462, 341, 158, 24);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(32, 92, 51, 24);

        tf_phone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        getContentPane().add(tf_phone);
        tf_phone.setBounds(254, 122, 188, 31);

        tf_name.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        getContentPane().add(tf_name);
        tf_name.setBounds(32, 122, 174, 31);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(254, 92, 131, 24);

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biodata");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(32, 56, 156, 30);

        btn_back.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_back.setText("Back");
        getContentPane().add(btn_back);
        btn_back.setBounds(61, 595, 94, 38);

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 197, 99, 32);

        btn_next.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_next.setText("Next");
        getContentPane().add(btn_next);
        btn_next.setBounds(602, 594, 106, 41);

        btngroup_payment.add(rb_gopay);
        rb_gopay.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rb_gopay.setForeground(new java.awt.Color(255, 255, 255));
        rb_gopay.setText("Go-Pay");
        rb_gopay.setContentAreaFilled(false);
        rb_gopay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_gopayMouseClicked(evt);
            }
        });
        rb_gopay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_gopayActionPerformed(evt);
            }
        });
        getContentPane().add(rb_gopay);
        rb_gopay.setBounds(434, 377, 110, 19);

        btn_save.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save);
        btn_save.setBounds(630, 460, 83, 36);

        btn_reset.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(440, 460, 87, 36);

        label_result.setText("   ");
        getContentPane().add(label_result);
        label_result.setBounds(396, 550, 9, 16);

        label_final.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        label_final.setForeground(new java.awt.Color(255, 255, 255));
        label_final.setText("   ");
        getContentPane().add(label_final);
        label_final.setBounds(440, 510, 274, 25);

        btngroup_payment.add(rb_card);
        rb_card.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rb_card.setForeground(new java.awt.Color(255, 255, 255));
        rb_card.setText("Credit Card");
        rb_card.setContentAreaFilled(false);
        rb_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_cardActionPerformed(evt);
            }
        });
        getContentPane().add(rb_card);
        rb_card.setBounds(540, 420, 140, 19);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prio\\Downloads\\800x700 end.png")); // NOI18N
        jLabel8.setText("             ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -40, 810, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dayActionPerformed
      if (cb_day.getSelectedIndex()==0){
        label_price.setText(" ");
      }
      else if (cb_day.getSelectedIndex()< 5){
        label_price.setText("35000");
      }
      else{
        label_price.setText("40000");
      }
    }//GEN-LAST:event_cb_dayActionPerformed

    private void tf_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amountActionPerformed

    }//GEN-LAST:event_tf_amountActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        this.resetForm();
        label_final.setText("Your data has been reset.");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String validation = this.validateForm();
        if(validation.length() > 0) {
            JOptionPane.showMessageDialog(null, validation, "Validation Error!", 
            JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        else {
          this.update();
          label_final.setText("Your data has been saved.");
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tf_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_amountKeyReleased
        int price, amount, result;
        price = Integer.parseInt(label_price.getText());
        amount = Integer.parseInt(tf_amount.getText());
        result = price * amount;
        label_total.setText(String.valueOf(result));
    }//GEN-LAST:event_tf_amountKeyReleased

    private void rb_gopayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_gopayActionPerformed
        String gopay = rb_gopay.getText();
    }//GEN-LAST:event_rb_gopayActionPerformed

    private void rb_gopayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_gopayMouseClicked
        
    }//GEN-LAST:event_rb_gopayMouseClicked

    private void rb_shopeepayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_shopeepayActionPerformed
       String shopeepay = rb_shopeepay.getText();
    }//GEN-LAST:event_rb_shopeepayActionPerformed

    private void rb_danaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_danaActionPerformed
       String dana = rb_dana.getText();
    }//GEN-LAST:event_rb_danaActionPerformed

    private void rb_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_cashActionPerformed
       String cash = rb_cash.getText();
    }//GEN-LAST:event_rb_cashActionPerformed

    private void rb_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_cardActionPerformed
       String card = rb_card.getText();       
    }//GEN-LAST:event_rb_cardActionPerformed

    
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
            java.util.logging.Logger.getLogger(TickerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TickerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TickerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TickerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TickerOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup btngroup_payment;
    private javax.swing.JComboBox<String> cb_day;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_final;
    private javax.swing.JLabel label_price;
    private javax.swing.JLabel label_result;
    private javax.swing.JLabel label_total;
    private javax.swing.JRadioButton rb_card;
    private javax.swing.JRadioButton rb_cash;
    private javax.swing.JRadioButton rb_dana;
    private javax.swing.JRadioButton rb_gopay;
    private javax.swing.JRadioButton rb_shopeepay;
    private javax.swing.JTextField tf_amount;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables

}
