/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */
public class ADD_Emplyee_Form extends javax.swing.JFrame {

    Connection con;
Statement stm;
JOptionpane jp;
ButtonGroup bg =new ButtonGroup();
 

    public ADD_Emplyee_Form() {
        initComponents();
        cjob.setBackground(color.WHITE);
       //ButtonGroup bg =new ButtonGroup();
        bg.add(jbmale);
        bg.add(jbFemale);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tAadhar = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        tuser = new javax.swing.JTextField();
        cPn = new javax.swing.JTextField();
        tage = new javax.swing.JTextField();
        jbmale = new javax.swing.JRadioButton();
        jbFemale = new javax.swing.JRadioButton();
        cjob = new javax.swing.JComboBox<>();
        tsalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255,90));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel  Butterfly  Blink");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jButton1)
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Employee");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("AGE");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("JOB Type");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Salary");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Aadhar Number");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Phone Number");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Email");

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Add Employee");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Back");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tAadhar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tAadhar.setForeground(new java.awt.Color(0, 51, 102));

        temail.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        temail.setForeground(new java.awt.Color(0, 51, 102));

        tuser.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tuser.setForeground(new java.awt.Color(0, 51, 102));

        cPn.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cPn.setForeground(new java.awt.Color(0, 51, 102));

        tage.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tage.setForeground(new java.awt.Color(0, 51, 102));

        jbmale.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jbmale.setForeground(new java.awt.Color(0, 0, 102));
        jbmale.setText("MALE");

        jbFemale.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jbFemale.setForeground(new java.awt.Color(0, 0, 102));
        jbFemale.setText("FEMALE");

        cjob.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cjob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front Desk Clerks", "Porters", "HouseKeeping", "Kitchen Staff", "Room Service", "Chefs", "Waiter/Waitress", "Manager", "Accountant" }));

        tsalary.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        tsalary.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cjob, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tsalary)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cPn, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmale)
                    .addComponent(jbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cjob)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = tuser.getText();
        String age = tage.getText();
        String salary = tsalary.getText();
        String pn = cPn.getText();
        String email= temail.getText();
        String aadhar = tAadhar.getText();
        String job = (String)cjob.getSelectedItem();
        String gender = null;
        if(jbmale.isSelected())
        {
            gender="Male";
        }else if(jbFemale.isSelected())
        {
            gender="Female";
        }
        
        
        
        System.out.println(job);
       
        if ( name.equals("")||job.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Name Should not be empty");
            return;
        
        }else if (age.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Age Should not be empty");
            return;
        }else if (!(jbmale.isSelected())&&!(jbFemale.isSelected()))
        {
            JOptionPane.showMessageDialog(null,"Gender Should not be empty");
            return;
        }
         else if (job == " " || job.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"JOB type Should not be empty");
            return;
        }
         else  if (salary.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Salary Should not be empty");
            return;
        }
         else if (pn.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Phone Number Should not be empty");
            return;
        }
         else if (email.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Email id  Should not be empty");
            return;
        }
         else if (aadhar.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Aadhar Should not be empty");
            return;
        }
        else{
             try{
            
               Class.forName("com.mysql.cj.jdbc.Driver");
               con= DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagemantSystem","root","pass123");
               stm = con.createStatement();
               String query = "insert into employee (name, age, gender, job, salary, phone, email, aadhar) values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+pn+"','"+email+"','"+aadhar+"')";
               stm.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Employee data Inserted Successfully!");
            
               System.out.println("Success");
               con.close();
               //(name, age, gender, job, salary, phone, email, aadhar)
              cleardata();
            
                 }catch(Exception ex)
                {
                        ex.printStackTrace();
                }
         
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cleardata()
    {
        tuser.setText(null);
        tage.setText(null);
        tsalary.setText(null);
        cPn.setText(null);
        temail.setText(null);
        tAadhar.setText(null);
        bg.clearSelection();
        cjob.setSelectedIndex(0);
        
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
            java.util.logging.Logger.getLogger(ADD_Emplyee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_Emplyee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_Emplyee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_Emplyee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_Emplyee_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cPn;
    private javax.swing.JComboBox<String> cjob;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jbFemale;
    private javax.swing.JRadioButton jbmale;
    private javax.swing.JTextField tAadhar;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tsalary;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}