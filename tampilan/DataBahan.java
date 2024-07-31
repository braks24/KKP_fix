package tampilan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import tampilan.Menu;

public class DataBahan extends javax.swing.JFrame {
        private Connection conn = new koneksi().connect();
        private DefaultTableModel tabmode;

    public DataBahan() {
        initComponents();
        kosong();
        datatable();
    }
    void kosong(){
        tkdb.setText("");
        cnama.setSelectedIndex(0);
        cgram.setSelectedIndex(0);
        tharga.setText("");
    }
    protected void datatable(){
        Object [] baris = {"kode", "nama", "gram", "harga"};
        tabmode = new DefaultTableModel(null, baris);
        tabelbahan.setModel(tabmode);
        String sql = "select*from bahan";
        
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("kode");
                String b = hasil.getString("nama");
                String c = hasil.getString("gram");
                String d = hasil.getString("harga");
                String [] data = {a,b,c,d};
                tabmode.addRow(data);
            }
        } catch (Exception e){
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tkdb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnama = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cgram = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tharga = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bcancel = new javax.swing.JButton();
        tcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbahan = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 214, 184));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setText("DATA BAHAN CETAK");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Kode Bahan");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Nama Bahan");

        cnama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "LUSTER", "ALBATROS", "A3", "A4", "A5", " " }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Grammasi");

        cgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "250 gram", "260 gram", "270 gram", "340 gram", "400 gram" }));
        cgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgramActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Harga Jual (m²)");

        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        bupdate.setText("UPDATE");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bcancel.setText("CANCEL");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        tabelbahan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelbahan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama", "Gram", "Harga"
            }
        ));
        tabelbahan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbahanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbahan);

        jButton6.setText("KEMBALI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tkdb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cgram, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcari)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tkdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdelete)
                    .addComponent(bupdate)
                    .addComponent(bcancel)
                    .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6))
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

    private void cgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgramActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        String sql = "delete from bahan where kode=?";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tkdb.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            kosong();
            tkdb.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        String sql = "update bahan set nama=?, gram=?, harga=? where kode=?";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, cnama.getSelectedItem().toString());
            stat.setString(2, cgram.getSelectedItem().toString());
            stat.setString(3, tharga.getText());
            stat.setString(4, tkdb.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            tkdb.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bcancelActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        Object [] baris = {"kode", "nama", "gram", "harga"};
        tabmode = new DefaultTableModel(null, baris);
        tabelbahan.setModel(tabmode);
        String sql = "select*from bahan where kode like '%"+tcari.getText()+"%'";

        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("kode");
                String b = hasil.getString("nama");
                String c = hasil.getString("gram");
                String d = hasil.getString("harga");
                String [] data = {a,b,c,d};
                tabmode.addRow(data);
            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_bcariActionPerformed

    private void tabelbahanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbahanMouseClicked
        int bar = tabelbahan.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();

        tkdb.setText(a);
        cnama.setSelectedItem(b);
        cgram.setSelectedItem(c);
        tharga.setText(d);
    }//GEN-LAST:event_tabelbahanMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Menu admin = new Menu();
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String sql = "insert into bahan values(?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tkdb.getText());
            stat.setString(2, cnama.getSelectedItem().toString());
            stat.setString(3, cgram.getSelectedItem().toString());
            stat.setString(4, tharga.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tkdb.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }         
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bupdate;
    private javax.swing.JComboBox<String> cgram;
    private javax.swing.JComboBox<String> cnama;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelbahan;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tkdb;
    // End of variables declaration//GEN-END:variables
}
