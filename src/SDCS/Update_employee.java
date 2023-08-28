 package SDCS;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Zifan
 */
public class Update_employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_New_Client
     */
    public Update_employee() {
        initComponents();
                
    }
        private void clear(){
       // Aname.requestFocus();
       
        Aname1.setText("");
        Aphone.setText("");
        Amale.setSelected(false);
        Afemale.setSelected(false);
        Aage.setText("");
        ANic.setText("");
        Aemptype.setSelectedIndex(0);
        Asalary.setText("");
        Ajdate.setCalendar(null);
        Ausername.setText("");
        Apassword.setText("");
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        empid = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Aname1 = new javax.swing.JTextField();
        Asalary = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Ajdate = new com.toedter.calendar.JDateChooser();
        Aemptype = new javax.swing.JComboBox<>();
        ANic = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Ausername = new javax.swing.JTextField();
        Apassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        empid1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Amale = new javax.swing.JRadioButton();
        Afemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(764, 615));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contact NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Joined Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 110, 29));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset_20px.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 100, 29));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Update Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 100, 29));
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 760, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 515, 760, 10));
        getContentPane().add(Aname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 200, -1));

        Asalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsalaryActionPerformed(evt);
            }
        });
        getContentPane().add(Asalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 200, 30));
        getContentPane().add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 200, -1));

        Aage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AageActionPerformed(evt);
            }
        });
        getContentPane().add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 232, 200, 30));
        getContentPane().add(Ajdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 197, 30));

        Aemptype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aemptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Admin", "Project manager", "Receptionist" }));
        Aemptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AemptypeActionPerformed(evt);
            }
        });
        getContentPane().add(Aemptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 200, 30));

        ANic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANicActionPerformed(evt);
            }
        });
        getContentPane().add(ANic, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 200, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 760, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Employee Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        Ausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AusernameActionPerformed(evt);
            }
        });
        getContentPane().add(Ausername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 200, 30));

        Apassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Apassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText(" Employee ID : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, -1));
        getContentPane().add(empid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search1.png"))); // NOI18N
        jButton4.setText(" Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        Amale.setText("Male");
        Amale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmaleActionPerformed(evt);
            }
        });
        getContentPane().add(Amale, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        Afemale.setText("Female");
        Afemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Afemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add new emp.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
          String id1 =empid1.getText();
        String name = Aname1.getText();
        int contact = Integer.parseInt(Aphone.getText());
        String gender = null;
        if(Amale.isSelected()){
            gender = "Male";
        }
        else if(Afemale.isSelected()){
            gender = "Female";
        }
        int age = Integer.parseInt(Aage.getText());
        String nic = ANic.getText ();
        String etype = (String) Aemptype.getSelectedItem();
        double salary = Double.parseDouble(Asalary.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(Ajdate.getDate());
        String user = Ausername.getText ();
        String pass = Apassword.getText ();
          
    
        
        //database connection
        DConnection c = new DConnection();
      
        
        try{
         
           String str = " update employee set EmpID='"+id1+"',name='"+name+"',Tel='"+contact+"',gender='"+gender+"',age='"+age+"',NIC='"+nic+"',Emp_Type='"+etype+"',salary='"+salary+"',Joined_Date='"+date+"',username='"+user+"',password='"+pass+"' WHERE EmpID='"+id1+"'";
          c.s.executeUpdate(str);
        
          
            JOptionPane.showMessageDialog(null, "Updated Employee Details");
         clear();
    
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Can't Update! Please Check All Details"); 
        } 


        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "You Really want to Exit ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsalaryActionPerformed

    private void AageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AageActionPerformed

    private void AemptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AemptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AemptypeActionPerformed

    private void ANicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANicActionPerformed

    private void AusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AusernameActionPerformed

    private void ApasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApasswordActionPerformed

    private void AmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmaleActionPerformed

    private void AfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AfemaleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    String empid =empid1.getText();
        //database connection
        DConnection c = new DConnection();

        try {
            String str = "select * from employee where EmpID = '" + empid + "'";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {

                //name,Tel,gender,age, NIC,Emp_Type,salary,Joined_Date, username, password
                Aname1.setText(rs.getString("Name"));
                Aphone.setText(rs.getString("Tel"));
                
               
          
                String add2 = rs.getString("gender");
              if("Male".equals(add2)){
                  Amale.setSelected(true);
              }
              else if("Female".equals(add2)){
                  Afemale.setSelected(true);
              }
              
                Aage.setText(rs.getString("age"));
                ANic.setText(rs.getString("NIC"));
                
                Aemptype.setSelectedItem(rs.getString("Emp_Type"));
                
                Asalary.setText(rs.getString("salary"));
                Ajdate.setDate(rs.getDate("Joined_Date"));
                Ausername.setText(rs.getString("username"));
                Apassword.setText(rs.getString("password"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
    public static void main(String args[]) {
  
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_employee().setVisible(true);
            }
        });
    

        


        
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANic;
    private javax.swing.JTextField Aage;
    private javax.swing.JComboBox<String> Aemptype;
    private javax.swing.JRadioButton Afemale;
    private com.toedter.calendar.JDateChooser Ajdate;
    private javax.swing.JRadioButton Amale;
    private javax.swing.JTextField Aname1;
    private javax.swing.JTextField Apassword;
    private javax.swing.JTextField Aphone;
    private javax.swing.JTextField Asalary;
    private javax.swing.JTextField Ausername;
    private javax.swing.JSeparator empid;
    private javax.swing.JTextField empid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}