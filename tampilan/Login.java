package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
     private Connection conn = new koneksi().connect();
     private DefaultTableModel tabmode;

    public Login() {
        initComponents();
        kosong();
    }
     void kosong(){
        tuser3.setText("");
        tpass1.setText("");
        tuser3.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tuser2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tpass = new javax.swing.JPasswordField();
        LOGIN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tuser3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tpass1 = new javax.swing.JPasswordField();
        LOGIN1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setText("Username");

        tuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuser2ActionPerformed(evt);
            }
        });
        tuser2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tuser2KeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel10.setText("Password");

        tpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpassActionPerformed(evt);
            }
        });
        tpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpassKeyPressed(evt);
            }
        });

        LOGIN.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        LOGIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LOGINKeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(187, 214, 184));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("Login ");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setText("Username");

        tuser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuser3ActionPerformed(evt);
            }
        });
        tuser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tuser3KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel12.setText("Password");

        tpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpass1ActionPerformed(evt);
            }
        });
        tpass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpass1KeyPressed(evt);
            }
        });

        LOGIN1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LOGIN1.setText("LOGIN");
        LOGIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN1ActionPerformed(evt);
            }
        });
        LOGIN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LOGIN1KeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LOGIN1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(tpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(122, 122, 122)
                .addComponent(jButton5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addComponent(jButton5))
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addComponent(tuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(LOGIN1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuser2ActionPerformed

    private void tuser2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuser2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            tpass1.requestFocus();
        }
    }//GEN-LAST:event_tuser2KeyPressed

    private void tpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpassActionPerformed

    private void tpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            LOGIN.requestFocus();
        }
    }//GEN-LAST:event_tpassKeyPressed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        String user = tuser3.getText();
        String pass = tpass1.getText();

        String sql = "select*from admin where username ='"+user+"' and password ='"+pass+"';";
        try{
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                Menu mn = new Menu();
                mn.setVisible(true);
                mn.setLocationRelativeTo(null);
                this.dispose();
                kosong();
            }else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_LOGINActionPerformed

    private void LOGINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LOGINKeyPressed
        String user = tuser3.getText();
        String pass = tpass1.getText();

        String sql = "select*from admin where username ='"+user+"' and password ='"+pass+"';";
        try{
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                Menu mn = new Menu();
                mn.setVisible(true);
                mn.setLocationRelativeTo(null);
                this.dispose();
                kosong();
            }else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_LOGINKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tuser3.setText("");
        tpass1.setText("");
        tuser3.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tuser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuser3ActionPerformed

    private void tuser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuser3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            tpass1.requestFocus();
        }
    }//GEN-LAST:event_tuser3KeyPressed

    private void tpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpass1ActionPerformed

    private void tpass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpass1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            LOGIN.requestFocus();
        }
    }//GEN-LAST:event_tpass1KeyPressed

    private void LOGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN1ActionPerformed
        String user = tuser3.getText();
        String pass = tpass1.getText();

        String sql = "select*from admin where username ='"+user+"' and password ='"+pass+"';";
        try{
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                Menu mn = new Menu();
                mn.setVisible(true);
                mn.setLocationRelativeTo(null);
                this.dispose();
                kosong();
            }else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_LOGIN1ActionPerformed

    private void LOGIN1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LOGIN1KeyPressed
        String user = tuser3.getText();
        String pass = tpass1.getText();

        String sql = "select*from admin where username ='"+user+"' and password ='"+pass+"';";
        try{
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                Menu mn = new Menu();
                mn.setVisible(true);
                mn.setLocationRelativeTo(null);
                this.dispose();
                kosong();
            }else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_LOGIN1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tuser3.setText("");
        tpass1.setText("");
        tuser3.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton LOGIN1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JPasswordField tpass1;
    private javax.swing.JTextField tuser;
    private javax.swing.JTextField tuser1;
    private javax.swing.JTextField tuser2;
    private javax.swing.JTextField tuser3;
    // End of variables declaration//GEN-END:variables
}
