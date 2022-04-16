/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;
import Core.Human;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Prio
 */
public class Bill extends javax.swing.JFrame {
    Human human;

    /**
     * Creates new form Bill
     */
    public Bill(Human human) {
        this.human = human;

        initComponents();

        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);

        // set label
        ta_bill.setEditable(false);
        ta_seats.setEditable(false);
        tf_studio.setEditable(false);
    }

    public void Output(){
        String film = human.getTitle();
        String name = human.getName();
        String phone = human.getPhone();
        String tickets = human.getAmount();
        String day = human.getDay();
        String time = human.getTime();
        String payment = human.getPayment();
        String total = human.getTotal();

        ta_bill.setText(
            "\tDetail Transaction\t"
            + "\n"
            + "Film\t : " + film + "\n"
            + "Name\t : " + name + "\n"
            + "Phone Number: " + phone + "\n"
            + "Tickets\t : " + tickets + "\n"
            + "Day\t : " + day + "\n"
            + "Time\t : " + time + "\n"
            + "Payment Methods : " + payment + "\n"
            + "Total Payment\t: " + total + "\n"
        );
    }

   public void setLabel(){
      String studio = human.getStudio();
      String seats = human.getSeats();

      tf_studio.setText(studio);
      ta_seats.setText(seats);
    }

     public void setLabelPay(){
      String payment = human.getPayment();
      String phone = human.getPhone();
      String time = human.getTime();

    if("DANA".equals(payment)){
     label_pay.setText(payment + " is selected. " + " \n  Enter Cinemount company code : 05103 " 
     + "\n and your registered phone number." + "\n05103" + phone);
        }
    if("Go-Pay".equals(payment)){
     label_pay.setText(payment + " is selected. " + " \n  Enter Cinemount company code : 05103 " 
     + "\n and your registered phone number." + "\n05103" + phone);
        }
    if("Shopee-Pay".equals(payment)){
     label_pay.setText(payment + " is selected. " + " \n  Enter Cinemount company code : 05103 " 
     + "\n and your registered phone number." + "\n05103" + phone);
        }
    if("Credit Card".equals(payment)){
     label_pay.setText("Please pay at the cashier before " + time);
        }
    if("Cash".equals(payment)){
     label_pay.setText("Please pay at the cashier before " + time);    
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_bill = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_seats = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tf_studio = new javax.swing.JTextField();
        SEATS = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        bt_pay = new javax.swing.JButton();
        label_pay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        jLabel1.setText("BILL PAYMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 369, 70));

        ta_bill.setColumns(20);
        ta_bill.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        ta_bill.setRows(5);
        jScrollPane1.setViewportView(ta_bill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 320));

        ta_seats.setColumns(20);
        ta_seats.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ta_seats.setRows(5);
        jScrollPane3.setViewportView(ta_seats);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 179, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("STUDIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, 33));

        tf_studio.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        tf_studio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tf_studio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 179, 132));

        SEATS.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        SEATS.setText("SEATS");
        getContentPane().add(SEATS, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 360, -1, -1));

        bt_exit.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        bt_exit.setText("EXIT");
        getContentPane().add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 122, -1));

        bt_pay.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        bt_pay.setText("PAY");
        bt_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_payActionPerformed(evt);
            }
        });
        getContentPane().add(bt_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 117, 43));

        label_pay.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        label_pay.setForeground(new java.awt.Color(255, 255, 255));
        label_pay.setText("          ");
        getContentPane().add(label_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 430, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prio\\Downloads\\bill.png")); // NOI18N
        jLabel3.setText("        ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_payActionPerformed
       this.Output();
       this.setLabel();
       this.setLabelPay();
    }//GEN-LAST:event_bt_payActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SEATS;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_pay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_pay;
    private javax.swing.JTextArea ta_bill;
    private javax.swing.JTextArea ta_seats;
    private javax.swing.JTextField tf_studio;
    // End of variables declaration//GEN-END:variables
}