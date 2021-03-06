/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproj;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PatientSearch extends javax.swing.JFrame {

java.sql.Connection conn=null;
ResultSet rs = null;
java.sql.PreparedStatement pst=null;

    public PatientSearch() {
        initComponents();
        //CurrentDate();
        getContentPane().setBackground(java.awt.Color.darkGray);
    }
public void close() {
WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SSN_Text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Username_Text = new javax.swing.JTextField();
        Name_Text = new javax.swing.JTextField();
        DOB_Text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Social Security #");

        jLabel2.setText("Username");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SSN_Text.setToolTipText("");

        jLabel3.setText("Date of Birth");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel4);

        jLabel4.setText("Name");

        Username_Text.setToolTipText("");

        Name_Text.setToolTipText("");

        DOB_Text.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Patient Search");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SSN_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SSN_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOB_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SSN", "DOB", "Name", "Address", "City", "Zipcode", "State", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable1, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);
        binding.bind();
        jScrollPane1.setViewportView(jTable1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproj/HomeIcon.jpg"))); // NOI18N

        jButton4.setText("About");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Contact");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Location");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Log-out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(44, 44, 44)
                        .addComponent(jButton5)
                        .addGap(42, 42, 42)
                        .addComponent(jButton6)
                        .addGap(39, 39, 39)
                        .addComponent(jButton7))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SSN_Text.setText("");   // Collecting the input
       DOB_Text.setText("");     // Collecting the input
       Name_Text.setText("");   // Collecting the input
       Username_Text.setText("");// Collecting the input
       
       for (int j= 0; j < jTable1.getRowCount(); j++) {
            for (int i= 0; i < jTable1.getColumnCount(); i++) {
                jTable1.setValueAt("", j, i);
            }
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(SSN_Text.getText().length()==0 && DOB_Text.getText().length()==0 && 
            Name_Text.getText().length()==0 && Username_Text.getText().length()==0)  // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill at least one field");
        else{
            String SSN = SSN_Text.getText();   // Collecting the input
            String DOB = DOB_Text.getText();     // Collecting the input
            String Name = Name_Text.getText();   // Collecting the input
            String UserName = Username_Text.getText();// Collecting the input

            
            ArrayList<PatientDetail> patients = search(SSN,DOB,Name,UserName);
            if(patients.size()>0)
            {
                int row = 0;
                for (PatientDetail p : patients) {
                    
                    String data1 = p.getSSN();
                    jTable1.setValueAt(data1, row, 0);
                    String data2 = p.getDOB();
                    jTable1.setValueAt(data2, row, 1);
                    String data3 = p.getName();
                    jTable1.setValueAt(data3, row, 2);
                    String data4 = p.getAddress();
                    jTable1.setValueAt(data4, row, 3);
                    String data5 = p.getCity();
                    jTable1.setValueAt(data5, row, 4);
                    String data6 = p.getZipcode();
                    jTable1.setValueAt(data6, row, 5);
                    String data7 = p.getState();
                    jTable1.setValueAt(data7, row, 6);
                    String data8 = p.getPhone();
                    jTable1.setValueAt(data8, row, 7);

                    row++;
                }
            }       
            else
            {JOptionPane.showMessageDialog(null, "No results Found!");}
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(null, "You Log-out");
        dispose();
        dbmsproj s = new dbmsproj();
        s.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         if (evt.getClickCount() > 0) {
          if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    URI uri = new URI("https://www.stjosephtowson.com/about-us.aspx");
                    desktop.browse(uri);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
        }
      }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       if (evt.getClickCount() > 0) {
          if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    URI uri = new URI("https://www.stjosephtowson.com/directions-parking.aspx");
                    desktop.browse(uri);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
        }
      }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       if (evt.getClickCount() > 0) {
          if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    URI uri = new URI("https://www.stjosephtowson.com/patients/patient-pre-op-instructions/telephone-directory.aspx");
                    desktop.browse(uri);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
        }
      }
    }//GEN-LAST:event_jButton6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Connection conn = null;
        try{
            // connect way #1
            String url1 = "jdbc:mysql://127.0.0.1:3360/pudapu1db";
            String user = "pudapu1";
            String password = "Cosc*tqd5";
 
            conn = (Connection) DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Connected to the database pudapu1db");
            }
        }
         catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientSearch().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOB_Text;
    private javax.swing.JTextField Name_Text;
    private javax.swing.JTextField SSN_Text;
    private javax.swing.JTextField Username_Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private ArrayList<PatientDetail> search(String SSN, String DOB, String Name, String UserName) {
         Connection conn = null;
         ArrayList<PatientDetail> result = new ArrayList<PatientDetail>();
   try{           
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
          String url1 = "jdbc:mysql://127.0.0.1:3360/pudapu1db";
            String user = "pudapu1";
            String password1 = "Cosc*tqd5";
 
            conn = (Connection) DriverManager.getConnection(url1, user, password1);
            String query = "SELECT * FROM pudapu1db.Patient where ";
            int index=0;
            if (SSN.length()!=0){
                query+="SSN=? ";
                index++;
            }
            if (DOB.length()!=0){
                if (index != 0){
                    query+=" AND ";
                }
                query+="DOB=? ";
                index++;
            }
            if (Name.length()!=0){
                if (index != 0){
                    query+=" AND ";
                }
                query+="Name=? ";
                index++;
            }
            if (UserName.length()!=0){
                if (index != 0){
                    query+=" AND ";
                }
                query+="Username=? ";
            }
        query+=" ;";   
        PreparedStatement pst = (PreparedStatement) conn.prepareStatement(query);
        int count=0;
        if (SSN.length()!=0){
            count+=1;
            pst.setString(count, SSN);
        }
        if (DOB.length()!=0){
            count+=1;
            pst.setDate(count, new java.sql.Date(
                  new SimpleDateFormat("yyyy-MM-dd")
                      .parse(DOB.substring(0, 10))
                      .getTime()
                  )
             );
        }
        if (Name.length()!=0){
            count+=1;
            pst.setString(count, Name);
        }
        if (UserName.length()!=0){
            count+=1;
            pst.setString(count, UserName);
        }
       
       ResultSet rs = pst.executeQuery();
       
       while(rs.next()){
            PatientDetail patient = new PatientDetail();
            patient.setSSN(rs.getString("SSN"));
            patient.setID(rs.getString("ID"));
            patient.setDOB(rs.getString("DOB"));
            patient.setUsername(rs.getString("Username"));
            patient.setSex(rs.getString("Sex"));
            patient.setPassword(rs.getString("Password"));
            patient.setZipcode(rs.getString("Zipcode"));
            patient.setEmail(rs.getString("Email"));
            patient.setAddress(rs.getString("address"));
            patient.setCity(rs.getString("city"));
            patient.setState(rs.getString("state"));
            patient.setPrimaryDoc(rs.getString("PrimaryDoc"));
            patient.setEmergencyContact(rs.getString("Emer_contact"));
            patient.setPhone(rs.getString("Phone"));
            patient.setName(rs.getString("Name"));
            patient.setInsuranceProvider(rs.getString("Insurance_provider"));
            result.add(patient);
       }
                  
   }
   catch(Exception e){
       e.printStackTrace();
   }   
   
   return result;
}

    
}
