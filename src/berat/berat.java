
package berat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class berat extends javax.swing.JFrame {

    /**
     * Creates new form berat
     */
    public berat() {
        initComponents();
        koneksi();
    }
    
    Connection connection;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void proses(){
        float tinggi,berat,hasil,perkalian;
        String keterangan;
        
        tinggi = Float.parseFloat(txttinggi.getText());
        berat = Float.parseFloat(txtberat.getText());
        
        
        hasil = (berat)/((tinggi/100)*(tinggi/100));
        txtimt.setText(String.valueOf(hasil));
        
        if(hasil > 30 ){
            txtkeadaan.setText("Kegemukan");
        }else if(hasil > 25){
            txtkeadaan.setText("Gemuk");
        }else if(hasil > 18.5){
            txtkeadaan.setText("Normal");
        }else if(hasil < 18.5){
            txtkeadaan.setText("Kurus");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txttinggi = new javax.swing.JTextField();
        txtberat = new javax.swing.JTextField();
        btncek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtimt = new javax.swing.JTextField();
        txtkeadaan = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Tinggi Badan (cm)");

        jLabel3.setText("Berat Badan (kg)");

        txtberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtberatActionPerformed(evt);
            }
        });

        btncek.setText("Cek");
        btncek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncekActionPerformed(evt);
            }
        });

        jLabel4.setText("Index Masa Tubuh (IMT)");

        jLabel5.setText("Keadaan Badan");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");

        jButton4.setText("Delete");

        jButton5.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txttinggi)
                            .addComponent(txtberat)
                            .addComponent(btncek, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtimt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75)
                        .addComponent(txtkeadaan)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txttinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncek)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtimt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtkeadaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(586, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 void rumus(){
    float hasil,berat,tinggi;
    String nama;
    
    tinggi = Float.parseFloat(txttinggi.getText());
    berat = Float.parseFloat(txtberat.getText());
    nama = String.valueOf(txtnama.getText());
    
    
    hasil = (berat)/((tinggi/100)*(tinggi/100));
    
    
    txtimt.setText(String.valueOf(hasil));
    
    if (hasil > 30){
        txtkeadaan.setText("Kegemukan");
    }else if(hasil > 25){
        txtkeadaan.setText("Gemuk");
    }else if(hasil > 18.5){
        txtkeadaan.setText("Normal");
    }else if(hasil < 18.5){
        txtkeadaan.setText("Kurus");
    }
    
    
    
}
    
 
  public Connection con;
  public Statement stat;
  public String sql;
  private ResultSet rs;
 public void koneksi(){
     try {
         Class.forName("org.gjt.mm.mysql.Driver");
         System.out.println("Driver Di Temukan");
         try {
             String url = "jdbc:mysql://localhost:3306/berat?user=root&password=";
             connection = DriverManager.getConnection(url);
            
             System.out.println("Koneksi Sukses");
         } catch (SQLException e) {
             System.out.println("Koneksi Gagal");
             
         }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Class Tidak DiTemukan");
     }
 }
 
 public void simpan(){
     try {
//         sql = "Insert into tbl_berat values ('"+txtnama.getText()+
//              "','"+txttinggi.getText()+
//              "','"+txtberat.getText()+
//              "','"+txtimt.getText()+
//              "','"+txtkeadaan.getText()+"')";
          sql = "insert into tbl_berat values('"+txtnama.getText()
                                                         +"','"+txttinggi.getText()
                                                         +"','"+txtberat.getText()
                                                         +"','"+txtimt.getText()
                                                         +"','"+txtkeadaan.getText()
                                                         +"')";
      stat=connection.createStatement();
      stat.executeUpdate(sql);
      JOptionPane.showMessageDialog(rootPane,"Data Sudah Tersimpan!");
      stat.close();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Data gagal disimpan");
     }
 }
    private void btncekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncekActionPerformed
        // TODO add your handling code here:
        rumus();
    }//GEN-LAST:event_btncekActionPerformed

    private void txtberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtberatActionPerformed
        // TODO add your handling code here:
        proses();
    }//GEN-LAST:event_txtberatActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        simpan();
    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(berat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(berat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(berat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(berat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new berat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncek;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtimt;
    private javax.swing.JTextField txtkeadaan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttinggi;
    // End of variables declaration//GEN-END:variables
}
