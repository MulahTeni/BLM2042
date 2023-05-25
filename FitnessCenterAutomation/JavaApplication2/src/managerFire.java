import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author omera
 */
public class managerFire extends javax.swing.JFrame {

    /**
     * Creates new form managerFire
     */
    public managerFire() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("İşten Çıkart");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İşten çıkarılacak çalışanın T.C kimlik numarası");

        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jTextField1.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("İşlemi Tamamla");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-page-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void raporEkle(String TC){
        LocalDate date = LocalDate.now();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex);
                System.out.println("hata");
        }
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://aws.connect.psdb.cloud/mmooodatabase?sslMode=VERIFY_IDENTITY",
                    "enq8p0j5ciweyw1gsfrg",
                    "pscale_pw_2QyPbaQViAG5k6JgsBdbvKXkBkeGi6h8OKgMWImpieg");
            Statement st = con.createStatement();
            String sql = "SELECT ID FROM current";
            ResultSet rs = st.executeQuery(sql);
            String ID ="";
            while (rs.next()) {
                ID = rs.getString("ID");
            }
            sql ="SELECT isim,soyisim,ID FROM Personel";
            rs = st.executeQuery(sql);
            boolean islem = false;
            while (rs.next() && !islem) {
                String dataName = rs.getString("isim");
                String dataSurname = rs.getString("soyisim");
                String dataID = rs.getString("ID");
                if(dataID.equals(ID)){
                    String nSurname = dataName + " " + dataSurname;
                    sql = "INSERT INTO rapor (nSurname, kategori, date, mesaj) VALUES ('"+ nSurname + "', 'Personel isten cikarma', '" + date + "', '" + TC +" TC nolu personel isten cikarildi')";
                    Statement st2 = con.createStatement();
                    st2.executeUpdate(sql);
                    islem = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(sekreterMusteriEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tc = jTextField1.getText();
        //String telNum = jTextField2.getText();
        try {
   
            Class.forName("com.mysql.cj.jdbc.Driver");
  
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://aws.connect.psdb.cloud/mmooodatabase?sslMode=VERIFY_IDENTITY",
                    "enq8p0j5ciweyw1gsfrg",
                    "pscale_pw_2QyPbaQViAG5k6JgsBdbvKXkBkeGi6h8OKgMWImpieg"
            )) {

                String query = "delete from Personel where ID = ?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, tc);

                // execute the preparedstatement
                int affectedRows = preparedStmt.executeUpdate();
                if (affectedRows == 0) {
                    // Silme işlemi başarısız oldu, kullanıcıya hata mesajı göster
                    JOptionPane.showMessageDialog(null, "Silme işlemi başarısız oldu. Verilen TC numarasına ait kayıt bulunamadı.");
                } else {
                    // Silme işlemi başarılı oldu, ikinci paneli göster
                    JOptionPane.showMessageDialog(null, "Silme işlemi başarılı oldu.");
                    conn.close(); 
                    setVisible(false); //ilk paneli gizle
                    managerpersonel frame2 = new managerpersonel();
                    frame2.setVisible(true); //ikinci paneli göster
                }
            }
        } catch (SQLException ex) {
            // SQL hatası oluştu, kullanıcıya hata mesajı göster
            JOptionPane.showMessageDialog(null, "Silme işlemi sırasında bir hata oluştu: " + ex.getMessage());
        } catch (Exception e) {
            // Genel bir hata oluştu, kullanıcıya hata mesajı göster
            JOptionPane.showMessageDialog(null, "Beklenmedik bir hata oluştu: " + e.getMessage());
        }
      // TODO add your handling code here:
      raporEkle(tc);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
            setVisible(false); //ilk paneli gizle
        managerpersonel frame2 = new managerpersonel();
        frame2.setVisible(true); //ikinci paneli göster      // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed
        // TODO add your handling code here:



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
            java.util.logging.Logger.getLogger(managerFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerFire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}