/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rahemet
 */
public class teacherhome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     * @throws java.sql.SQLException
     */
    public teacherhome() throws SQLException {
        initComponents();
    }
        public ArrayList<User> userList() {
            ArrayList<User> usersList = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:MySQL://localhost:3306/users";
            Connection con = DriverManager.getConnection(url);
            String query1="SELECT * FROM grading";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query1);
            User user;
                while(rs.next()){
                    user = new User(rs.getInt("gradeid"), rs.getString("studentid"), rs.getString("name"), rs.getInt("math"), rs.getInt("science"), rs.getInt("english"), rs.getInt("hekasi"), rs.getInt("he"), rs.getInt("pe"));
                    usersList.add(user);
                }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return usersList;
        }
        
        public void show_user() {
            ArrayList<User> list = userList();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            
            Object [] row = new Object[9];
            for (int i=0;i<list.size();i++){
                row[0]=list.get(i).getgradeid();
                row[1]=list.get(i).getstudentid();
                row[2]=list.get(i).getname();
                row[3]=list.get(i).getmath();
                row[4]=list.get(i).getscience();
                row[5]=list.get(i).getenglish();
                row[6]=list.get(i).gethekasi();
                row[7]=list.get(i).gethe();
                row[8]=list.get(i).getpe();
                model.addRow(row);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        math3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gradeid = new javax.swing.JTextField();
        science3 = new javax.swing.JTextField();
        english3 = new javax.swing.JTextField();
        hekasi3 = new javax.swing.JTextField();
        pe3 = new javax.swing.JTextField();
        he3 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        upd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        studid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        funame = new javax.swing.JTextField();
        upd1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Welcome Back");

        user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 102));
        user.setText("John");

        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        math3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        math3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Grade ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Math");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Science");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("H.E");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Hekasi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("English");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("P.E");

        gradeid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gradeid.setToolTipText("");
        gradeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeidActionPerformed(evt);
            }
        });

        science3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        science3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                science3ActionPerformed(evt);
            }
        });

        english3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        english3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                english3ActionPerformed(evt);
            }
        });

        hekasi3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hekasi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hekasi3ActionPerformed(evt);
            }
        });

        pe3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pe3ActionPerformed(evt);
            }
        });

        he3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        he3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                he3ActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        upd.setText("Update");
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Student ID");

        studid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studid.setToolTipText("");
        studid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studidActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Name");

        funame.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funame.setToolTipText("");
        funame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funameActionPerformed(evt);
            }
        });

        upd1.setText("View List");
        upd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade ID", "Student ID", "Name", "Math", "Science", "English", "Hekasi", "H.E", "P.E"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(math3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(science3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(english3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hekasi3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(he3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pe3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(funame, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gradeid, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upd1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(add)
                                .addGap(9, 9, 9)
                                .addComponent(del)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upd)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(gradeid)
                            .addComponent(jLabel9)
                            .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(math3)
                            .addComponent(jLabel10)
                            .addComponent(funame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(science3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(english3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hekasi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(he3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upd1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add)
                        .addComponent(del)
                        .addComponent(upd)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void math3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_math3ActionPerformed

    private void gradeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeidActionPerformed

    private void science3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_science3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_science3ActionPerformed

    private void english3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_english3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_english3ActionPerformed

    private void hekasi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hekasi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hekasi3ActionPerformed

    private void pe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pe3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pe3ActionPerformed

    private void he3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_he3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_he3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    String SUrl = "jdbc:MySQL://localhost:3306/users";
    String SUser = "root";
    String SPass = "";
        
    String gid = gradeid.getText();
    String id = studid.getText();
    String name = funame.getText ();
    String math2 = math3.getText();
    String english2 = english3.getText();
    String science2 = science3.getText();
    String hekasi2 = hekasi3.getText();
    String he2 = he3.getText();
    String pe2 = pe3.getText();

    try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {
      Statement st = con.createStatement();
      String query = "INSERT INTO grading(gradeid, studentid, name, math, science, english, hekasi, he ,pe) VALUES('" + gid + "', '" + id + "', '" + name + "', '" + math2 + "', '" + english2 + "', '" + science2 + "', '" + hekasi2 + "', '" + he2 + "', '" + pe2  + "')";
        boolean execute = st.execute(query);
      JOptionPane.showMessageDialog(null, "Grade entered successfully!");
        studid.setText("");
        gradeid.setText("");
        math3.setText("");
        english3.setText("");
        science3.setText("");
        hekasi3.setText("");
        he3.setText("");
        pe3.setText("");

    }   catch (java.sql.SQLException ex) {                            
            Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
        }                            
    }//GEN-LAST:event_addActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
            String SUrl = "jdbc:MySQL://localhost:3306/users";
    String SUser = "root";
    String SPass = "";

    String gid = gradeid.getText();
    String id = studid.getText();

    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
      try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {
        PreparedStatement statement = con.prepareStatement(
            "DELETE FROM grading WHERE gradeid = ? AND studentid = ?");

        statement.setString(1, gid);
        statement.setString(2, id);

        int rowsDeleted = statement.executeUpdate();

        if (rowsDeleted > 0) {
          JOptionPane.showMessageDialog(null, "Grade deleted successfully!");
        } else {
          JOptionPane.showMessageDialog(null, "No record found to delete!");
        }
      } catch (java.sql.SQLException ex) {
        Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
      }
    }    
    }//GEN-LAST:event_delActionPerformed

    private void updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updActionPerformed
        // TODO add your handling code here:
                String SUrl = "jdbc:MySQL://localhost:3306/users";
        String SUser = "root";
        String SPass = "";

        String gid = gradeid.getText();
        String id = studid.getText();
        String math2 = math3.getText();
        String english2 = english3.getText();
        String science2 = science3.getText();
        String hekasi2 = hekasi3.getText();
        String he2 = he3.getText();
        String pe2 = pe3.getText();

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {
          PreparedStatement statement = con.prepareStatement(
              "UPDATE grading SET math = ?, science = ?, english = ?, hekasi = ?, he = ?, pe = ? WHERE gradeid = ? AND studentid = ?");

          statement.setString(1, math2);
          statement.setString(2, science2);
          statement.setString(3, english2);
          statement.setString(4, hekasi2);
          statement.setString(5, he2);
          statement.setString(6, pe2);
          statement.setString(7, gid);
          statement.setString(8, id);

          int rowsUpdated = statement.executeUpdate();

          if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Grade updated successfully!");
          } else {
            JOptionPane.showMessageDialog(null, "No record found to update!");
          }
        } catch (java.sql.SQLException ex) {
          Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updActionPerformed

    private void studidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studidActionPerformed

    private void funameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funameActionPerformed

    private void upd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd1ActionPerformed
         // TODO add your handling code here:
    show_user();
    }//GEN-LAST:event_upd1ActionPerformed
    
    public void setUser(String name){
        user.setText(name);
    }
    
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
            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new teacherhome().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton add;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton del;
    private javax.swing.JTextField english3;
    private javax.swing.JTextField funame;
    private javax.swing.JTextField gradeid;
    private javax.swing.JTextField he3;
    private javax.swing.JTextField hekasi3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField math3;
    private javax.swing.JTextField pe3;
    private javax.swing.JTextField science3;
    private javax.swing.JTextField studid;
    private javax.swing.JButton upd;
    private javax.swing.JButton upd1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
