/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */
public class UpdateCheck extends javax.swing.JFrame {

    Connection con;
    Statement stm;
    public UpdateCheck() {
        initComponents();
        
       JLabel  igmL = new JLabel();
       igmL.setBounds(550,30,100,100);
       ImageIcon li = new ImageIcon(getClass().getResource("image2.gif"));
       java.awt.Image image1 =(li).getImage().getScaledInstance(igmL.getWidth(),igmL.getHeight(),java.awt.Image.SCALE_DEFAULT);
       li=new ImageIcon(image1);
       igmL.setIcon(li);
       jPanel1.add(igmL);
       
        Jcid.setBackground(color.WHITE);
        
        
       ImageIcon li2 = new ImageIcon(getClass().getResource("engage1.png"));
       java.awt.Image image2 =(li2).getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),java.awt.Image.SCALE_DEFAULT);
       li2=new ImageIcon(image2);
       jLabel2.setIcon(li2);
       
       
       
       
       
       try{
            
          Class.forName("com.mysql.cj.jdbc.Driver");
          con= java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagemantSystem","root","pass123");
            stm = con.createStatement();
            String q ="select *from customer ";
            ResultSet r = stm.executeQuery(q);
            while(r.next())
            {
             String l = r.getString("docid");
             Jcid.addItem(l);
            }
        //con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Jcid = new javax.swing.JComboBox<>();
        tname = new javax.swing.JTextField();
        tcheckintime = new javax.swing.JTextField();
        tpendingamount = new javax.swing.JTextField();
        troom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        paidamount1 = new javax.swing.JTextField();
        tv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255,90));
        jPanel3.setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(980, 0, 40, 30);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel  Butterfly  Blink");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(380, 0, 184, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" UPDATE CUSTOMER STATUS");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Customer Id");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Checkin Time");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("Amount Paid");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("Pending Amount");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("Room Number");

        Jcid.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Jcid.setForeground(new java.awt.Color(0, 51, 102));
        Jcid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tname.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tname.setForeground(new java.awt.Color(0, 51, 102));

        tcheckintime.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tcheckintime.setForeground(new java.awt.Color(0, 51, 102));

        tpendingamount.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tpendingamount.setForeground(new java.awt.Color(0, 51, 102));

        troom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        troom.setForeground(new java.awt.Color(0, 51, 102));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_management_system/engage1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setText("Price of Room");

        paidamount1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        paidamount1.setForeground(new java.awt.Color(0, 51, 102));

        tv.setBackground(new java.awt.Color(255, 255, 255));
        tv.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tv.setForeground(new java.awt.Color(0, 102, 153));
        tv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jcid, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(144, 144, 144))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tv, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcheckintime, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tpendingamount, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(troom, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paidamount1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jcid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(159, 159, 159)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(paidamount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tpendingamount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(troom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(tcheckintime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = (String) Jcid.getSelectedItem();
        String q1 = "Select *from customer where docid = '"+id+"'";
        try{
            ResultSet r1 = stm.executeQuery(q1);
            while(r1.next())
            {
                troom.setText(r1.getString("room"));
                tname.setText(r1.getString("name"));
                tcheckintime.setText(r1.getString("checkintime"));
                paidamount1.setText(r1.getString("deposit"));
                
                
            }
            ResultSet rs2 = stm.executeQuery("select *from room where roomnumber='"+troom.getText()+"'");
            while(rs2.next())
            {
                String price = rs2.getString("price");
                //total_amont.setText(""+price);
                tv.setText(""+price);
                int amoutpaid = Integer.parseInt(price)-Integer.parseInt(paidamount1.getText());
                tpendingamount.setText(""+amoutpaid);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String number1 = (String) Jcid.getSelectedItem();
        String roomn =troom.getText();
        String nam = tname.getText();
        String cit = tcheckintime.getText();
        String pandingda = paidamount1.getText();
        try{
            
            String Upd = "UPDATE customer SET room = ?, name = ?, checkintime = ?, deposit = ? WHERE docid = '"+number1+"'";
          
            PreparedStatement PreparedStatement = con.prepareStatement(Upd);
            PreparedStatement.setString(1,roomn);
            PreparedStatement.setString(2,nam );
            PreparedStatement.setString(3,cit);
            PreparedStatement.setString(4,pandingda);
            
            
            int rowsAffected = PreparedStatement.executeUpdate();
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null,"Updation is Successfull---");
                clear();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data is Not Update");
                
            }
            //PreparedStatement.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void clear()
    {
       troom.setText(null);
        tname.setText(null);
        tcheckintime.setText(null);
        paidamount1.setText(null);
        tpendingamount.setText(null);
        Jcid.setSelectedIndex(0);
        tv.setText(null);
                  
    }
  
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
            java.util.logging.Logger.getLogger(UpdateCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Jcid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField paidamount1;
    private javax.swing.JTextField tcheckintime;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tpendingamount;
    private javax.swing.JTextField troom;
    private javax.swing.JLabel tv;
    // End of variables declaration//GEN-END:variables
}
