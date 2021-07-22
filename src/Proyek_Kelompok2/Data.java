/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek_Kelompok2;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ASUS
 */
public class Data extends javax.swing.JFrame {

    /**
     * Creates new form Data
     */
    public Data() {
        initComponents();
        KosongForm();
        TampilData();
        this.setLocationRelativeTo(null);
    }

    public void KosongForm() {
        jTextField1.setEditable(true);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jComboBox1.setSelectedItem(this);
    }
    
    public void TampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NISN");
        model.addColumn("Nama Lengkap");
        model.addColumn("Email");
        model.addColumn("No Telepon");
        model.addColumn("Nilai");
        model.addColumn("Status");

        //Menampilkan data pada database ke dalam tabel
        try {
            int no = 1;
            String sql = "SELECT * FROM mahasiswa";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),});
            }
            jTable2.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(799, 607));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Data Calon Mahasiswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 50, 330, 36);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setText("NISN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 120, 120, 20);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 160, 140, 20);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 200, 120, 20);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setText("No Telepon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 240, 120, 20);

        jTextField1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 120, 240, 30);

        jTextField2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 160, 240, 30);

        jTextField3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 200, 240, 30);

        jTextField4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 240, 240, 30);

        jButton1.setBackground(new java.awt.Color(123, 185, 236));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 390, 81, 25);

        jButton2.setBackground(new java.awt.Color(123, 185, 236));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 390, 75, 25);

        jButton3.setBackground(new java.awt.Color(123, 185, 236));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 390, 73, 25);

        jScrollPane2.setBackground(new java.awt.Color(123, 217, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NISN", "Nama", "Email", "Telepon", "Nilai", "Status"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 460, 734, 90);

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setText("Nilai");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 280, 130, 20);

        jTextField5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(300, 280, 240, 30);

        jButton6.setBackground(new java.awt.Color(114, 240, 106));
        jButton6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButton6.setText("Cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(370, 420, 90, 30);

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 320, 40, 20);

        jComboBox1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LULUS", "TIDAK LULUS" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 320, 150, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(560, 390, 80, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyek_Kelompok2/bg4.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 320, 800, 290);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyek_Kelompok2/bg3.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 810, 360);

        jButton4.setBackground(new java.awt.Color(123, 185, 236));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 390, 73, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO mahasiswa VALUES('" + jTextField1.getText() + "',"
                    + "'" + jTextField2.getText() + "',"
                    + "'" + jTextField3.getText() + "',"
                    + "'" + jTextField4.getText() + "',"
                    + "'" + jTextField5.getText() + "')";

            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            KosongForm();
            TampilData();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="UPDATE mahasiswa SET nisn='"+jTextField1.getText()+"',"
                    +"nama='"+jTextField2.getText()+"',"
                    +"email='"+jTextField3.getText()+"',"
                    +"no_telp='"+jTextField4.getText()+"',"
                    +"nilai='"+jTextField5.getText()+"',"
                    +"status='"+jComboBox1.getSelectedItem()+"' WHERE nisn='"+jTextField1.getText()+"'";
        
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
            TampilData();
            KosongForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="DELETE FROM mahasiswa WHERE nisn='"+jTextField1.getText()+"'";
        
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            TampilData();
            KosongForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        jTextField1.setEditable(false);

        int baris = jTable2.rowAtPoint(evt.getPoint());
        String nik = jTable2.getValueAt(baris, 1).toString();
        jTextField1.setText(nik);
        String nama = jTable2.getValueAt(baris, 2).toString();
        jTextField2.setText(nama);
        String email = jTable2.getValueAt(baris, 3).toString();
        jTextField3.setText(email);
        String telepon = jTable2.getValueAt(baris, 4).toString();
        jTextField4.setText(telepon);
        String nilai = jTable2.getValueAt(baris, 5).toString();
        jTextField5.setText(nilai);
        String status = jTable2.getValueAt(baris, 6).toString();
        jComboBox1.setSelectedItem(status);

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            InputStream is = Data.class.getResourceAsStream("/Laporan/Laporan.jasper");
            JasperPrint jsPrint = JasperFillManager.fillReport(is, null, Konfig.configDB());
            JasperViewer.viewReport(jsPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal mencetak laporan karena :"
                    + e.getMessage(), "cetak laporan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed


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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}