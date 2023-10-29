/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */
public class Check_out extends javax.swing.JFrame {
Connection con;
Statement stm;
    
    public Check_out() {
        initComponents();
        
        Jcid.setBackground(color.WHITE); 
        
        
       JLabel  igmL = new JLabel();
       igmL.setBounds(425,25,100,100);
       ImageIcon li = new ImageIcon(getClass().getResource("image2.gif"));
       java.awt.Image image1 =(li).getImage().getScaledInstance(igmL.getWidth(),igmL.getHeight(),java.awt.Image.SCALE_DEFAULT);
       li=new ImageIcon(image1);
       igmL.setIcon(li);
       jPanel1.add(igmL);
        
        
        
        ImageIcon li2 = new ImageIcon(getClass().getResource("che.png"));
       java.awt.Image image2 =(li2).getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),java.awt.Image.SCALE_SMOOTH);
       li2=new ImageIcon(image2);
       jLabel2.setIcon(li2);
       
       ImageIcon li3 = new ImageIcon(getClass().getResource("checkout.png"));
       java.awt.Image image3 =(li3).getImage().getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(),java.awt.Image.SCALE_SMOOTH);
       li3=new ImageIcon(image3);
       jLabel3.setIcon(li3);
       
       
       //Date date = new Date(DateTimeFormatter.ofPattern("yyyy/dd/MM E hh:mm:ss ");
       LocalDateTime d = LocalDateTime.now();
       DateTimeFormatter date =DateTimeFormatter.ofPattern("dd/mm/YYYY E hh:mm:ss ");
       Checkout.setText(""+d.format(date));
       
       
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

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CinTime = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Jcid = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rNumber = new javax.swing.JLabel();
        Checkout = new javax.swing.JLabel();
        searchB = new javax.swing.JButton();
        backb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchB1 = new javax.swing.JButton();

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
        jButton4.setBounds(830, 0, 40, 30);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel  Butterfly  Blink");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(390, 0, 184, 30);

        CinTime.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        CinTime.setForeground(new java.awt.Color(0, 102, 153));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CHECK OUT");

        Jcid.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Jcid.setForeground(new java.awt.Color(0, 51, 102));
        Jcid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Checkin Time");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("Customer Id");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("checkout Time");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("Room Number");

        rNumber.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        rNumber.setForeground(new java.awt.Color(0, 102, 153));

        Checkout.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Checkout.setForeground(new java.awt.Color(0, 102, 153));

        searchB.setBackground(new java.awt.Color(0, 102, 153));
        searchB.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        searchB.setForeground(new java.awt.Color(255, 255, 255));
        searchB.setText("CheckOut");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        backb.setBackground(new java.awt.Color(0, 102, 153));
        backb.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        backb.setForeground(new java.awt.Color(255, 255, 255));
        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_management_system/che.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_management_system/checkout.png"))); // NOI18N

        searchB1.setBackground(new java.awt.Color(0, 102, 153));
        searchB1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        searchB1.setForeground(new java.awt.Color(255, 255, 255));
        searchB1.setText("Search");
        searchB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchB1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(backb, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jcid, 0, 280, Short.MAX_VALUE)
                                .addComponent(CinTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jcid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CinTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchB1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
       
        try{
           
           String qu1 = "delete from customer where docid='"+Jcid.getSelectedItem()+"'";
           String qu2 ="update room set availability ='Available' where roomnumber='"+rNumber.getText()+"'";
            stm.executeUpdate(qu1);
            stm.executeUpdate(qu2);
            JOptionPane.showMessageDialog(null, "Checkout Done");
            clear();
   
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBActionPerformed

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbActionPerformed

    private void searchB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchB1ActionPerformed
        
              
        String id = (String) Jcid.getSelectedItem();
        String q1 = "Select *from customer where docid = '"+id+"'";
        try{
            ResultSet r1 = stm.executeQuery(q1);
            while(r1.next())
            {
               rNumber.setText(r1.getString("room"));
              CinTime.setText(r1.getString("checkintime"));
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_searchB1ActionPerformed

    public void clear()
    {
        rNumber.setText(null);
        CinTime.setText(null);
        Jcid.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Checkout;
    private javax.swing.JLabel CinTime;
    public javax.swing.JComboBox<String> Jcid;
    private javax.swing.JButton backb;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel rNumber;
    private javax.swing.JButton searchB;
    private javax.swing.JButton searchB1;
    // End of variables declaration//GEN-END:variables
}
