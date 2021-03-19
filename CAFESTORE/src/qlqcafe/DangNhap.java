
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhom 40
 */
public class DangNhap extends javax.swing.JFrame {   
    private NguoiDung staff;
    
    public DangNhap() {        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        new XuLyChung().kiemTraLanDangNhapTiepTheo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_dn = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();
        jLabel_ten = new javax.swing.JLabel();
        jLabel_tk = new javax.swing.JLabel();
        jLabel_mk = new javax.swing.JLabel();
        jTextField_tk = new javax.swing.JTextField();
        jPasswordField_mk = new javax.swing.JPasswordField();
        jLabel_hinh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_dn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/login.png"))); // NOI18N
        jButton_dn.setText("Đăng nhập");
        jButton_dn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleLogin(evt);
            }
        });
        getContentPane().add(jButton_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 129, -1));

        jButton_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/x-button.png"))); // NOI18N
        jButton_thoat.setText("Thoát");
        jButton_thoat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleExit(evt);
            }
        });
        getContentPane().add(jButton_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 136, -1));

        jLabel_ten.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ten.setText("QUẢN LÝ QUÁN CAFE");
        getContentPane().add(jLabel_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 74));

        jLabel_tk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_tk.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tk.setText("Tài khoản");
        getContentPane().add(jLabel_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 39));

        jLabel_mk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_mk.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_mk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mk.setText("Mật khẩu ");
        getContentPane().add(jLabel_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 38));
        getContentPane().add(jTextField_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 204, 39));
        getContentPane().add(jPasswordField_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 204, 38));

        jLabel_hinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/46-128.png"))); // NOI18N
        getContentPane().add(jLabel_hinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 130, 129));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/dangnhap.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
//    private void luuDN(String maNV){
//        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        Date currentDate = new Date();        
//        try {
//            Connection cn = ConnectDB.SQLConnect();
//            PreparedStatement ps = cn.prepareStatement("insert into PHIENLAMVIEC(MANV,CHECKIN) values(?,?)");
//            ps.setString(1, maNV);
//            ps.setString(2, df.format(currentDate));
//            ps.executeUpdate();                      
//        } catch (SQLException ex) {
//            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    private void handleLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleLogin
        if(jTextField_tk.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa điền tên đăng nhập!");
        }else if(jPasswordField_mk.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mật khẩu!");
        }else {
            String query = "SELECT * FROM NHANVIEN WHERE TAIKHOAN = '"+ jTextField_tk.getText() +"' AND MATKHAU = HASHBYTES('MD5','"+ jPasswordField_mk.getText() +"')";
            try {                     
                Connection cn = ConnectDB.SQLConnect();
                PreparedStatement ps = cn.prepareStatement(query);                
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    staff = new NguoiDung();
                    staff.setManv(rs.getString("MANV"));    
                    staff.setHoten(rs.getString("TENNV"));
                    staff.setTendn(jTextField_tk.getText());                    
                    staff.setMacv(rs.getInt("MACV"));
                    new XuLyChung().luuDN(staff.getManv(),"checkin");
                    if(staff.getMacv() == 1){                    
                        GiaoDienChung giaoDien = new GiaoDienChung(staff);
                        this.setVisible(false);
                        giaoDien.setVisible(true);
                    }
                    if(staff.getMacv() == 2){                        
                        GiaoDienNhanVien giaoDien = new GiaoDienNhanVien(staff);
                        this.setVisible(false);
                        giaoDien.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu sai!");
                }                
            } catch (SQLException e) {
                Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, e);
            }
        }  
    }//GEN-LAST:event_handleLogin

    private void handleExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleExit
        int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình hay không?", "Thông báo", 2);
        if(click==JOptionPane.YES_OPTION){
            System.exit(0);
        } else if(click==JOptionPane.CANCEL_OPTION){
            return;
        }
    }//GEN-LAST:event_handleExit

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_dn;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_hinh;
    private javax.swing.JLabel jLabel_mk;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JLabel jLabel_tk;
    private javax.swing.JPasswordField jPasswordField_mk;
    private javax.swing.JTextField jTextField_tk;
    // End of variables declaration//GEN-END:variables
}
