/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

import javax.swing.JOptionPane;

public class GiaoDienChung extends javax.swing.JFrame {
    private final NguoiDung staff; 
        
    public GiaoDienChung(NguoiDung user) {
        initComponents();
        this.staff = user;
        setResizable(false);
        setLocationRelativeTo(this);        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_nuocUong = new javax.swing.JButton();
        jButton_nhanVien = new javax.swing.JButton();
        jButton_banCafe = new javax.swing.JButton();
        jButton_datBan = new javax.swing.JButton();
        jButton_thongKe = new javax.swing.JButton();
        jLabel_ten = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_thongTin = new javax.swing.JButton();
        jButton_dangXuat = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_themQuanLy = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton_lsThayDoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_nuocUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/coffee (1)_(1).png"))); // NOI18N
        jButton_nuocUong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_nuocUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuocUongActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_nuocUong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 76, 55));

        jButton_nhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/teamwork.png"))); // NOI18N
        jButton_nhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_nhanVien.setMaximumSize(new java.awt.Dimension(65, 41));
        jButton_nhanVien.setMinimumSize(new java.awt.Dimension(65, 41));
        jButton_nhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_nhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 76, 55));

        jButton_banCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/cafe.png"))); // NOI18N
        jButton_banCafe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_banCafe.setMaximumSize(new java.awt.Dimension(65, 41));
        jButton_banCafe.setMinimumSize(new java.awt.Dimension(65, 41));
        jButton_banCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_banCafeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_banCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 77, 55));

        jButton_datBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/coffee-table (1).png"))); // NOI18N
        jButton_datBan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_datBan.setMaximumSize(new java.awt.Dimension(65, 41));
        jButton_datBan.setMinimumSize(new java.awt.Dimension(65, 41));
        jButton_datBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_datBanActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_datBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 75, 55));

        jButton_thongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/graph.png"))); // NOI18N
        jButton_thongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_thongKe.setMaximumSize(new java.awt.Dimension(65, 41));
        jButton_thongKe.setMinimumSize(new java.awt.Dimension(65, 41));
        jButton_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thongKeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_thongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 75, 55));

        jLabel_ten.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ten.setText("QUẢN LÝ QUÁN CAFE");
        jLabel_ten.setToolTipText("");
        getContentPane().add(jLabel_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 392, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đồ uống");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhân viên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 136, 76, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bán hàng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 135, 77, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đặt bàn");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 135, 75, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bàn");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 135, 70, 30));

        jButton_thongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/info.png"))); // NOI18N
        jButton_thongTin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_thongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thongTinActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_thongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 98, 60));

        jButton_dangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/logout.png"))); // NOI18N
        jButton_dangXuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dangXuatActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_dangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 98, 60));

        jButton_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/exit.png"))); // NOI18N
        jButton_thoat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thoatActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 98, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông tin");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 97, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Đăng xuất");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 97, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thoát");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 97, 25));

        jButton_themQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user (1).png"))); // NOI18N
        jButton_themQuanLy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_themQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themQuanLyActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_themQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 98, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thêm quản lý ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 25));

        jButton_lsThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/edit.png"))); // NOI18N
        jButton_lsThayDoi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_lsThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lsThayDoiActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_lsThayDoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 75, 55));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Làm việc");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 75, 25));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/plus.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 75, 55));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thay đổi");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 75, 25));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/coffee-table.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleGoToSLBanMax(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 75, 55));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Thống kê");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 75, 25));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/coffee.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton_thongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thongKeActionPerformed
        ThongKe tk = new ThongKe(this.staff);
        this.setVisible(false);
        tk.setVisible(true);
    }//GEN-LAST:event_jButton_thongKeActionPerformed

    private void jButton_nhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nhanVienActionPerformed
        NhanVien nv = new NhanVien(this.staff);
        this.setVisible(false);
        nv.setVisible(true);
    }//GEN-LAST:event_jButton_nhanVienActionPerformed

    private void jButton_nuocUongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuocUongActionPerformed
        DoUong doUong = new DoUong(this.staff);
        this.setVisible(false);
        doUong.setVisible(true);
    }//GEN-LAST:event_jButton_nuocUongActionPerformed

    private void jButton_banCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_banCafeActionPerformed
        // TODO add your handling code here:
        BanHang banHang = new BanHang(this.staff, "");
        this.setVisible(false);
        banHang.setVisible(true);       
    }//GEN-LAST:event_jButton_banCafeActionPerformed

    private void jButton_datBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_datBanActionPerformed
        DatBan db = new DatBan(this.staff);
        this.setVisible(false);
        db.setVisible(true);        
    }//GEN-LAST:event_jButton_datBanActionPerformed

    private void jButton_thongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thongTinActionPerformed
        ThongTin tt = new ThongTin(this.staff);
        this.setVisible(false);
        tt.setVisible(true);
    }//GEN-LAST:event_jButton_thongTinActionPerformed

    private void jButton_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dangXuatActionPerformed
        int Click = JOptionPane.showConfirmDialog(null, "Kết ca?", "Thông Báo", 2);
        if(Click == JOptionPane.YES_OPTION){
            new XuLyChung().luuDN(staff.getManv(),"checkout");
            DangNhap dangnhap = new DangNhap();
            this.setVisible(false);
            dangnhap.setVisible(true);
        }
    }//GEN-LAST:event_jButton_dangXuatActionPerformed

    private void jButton_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thoatActionPerformed
        int click=JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình hay không?", "Thông báo", 2);
        if(click==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton_thoatActionPerformed

    private void jButton_themQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themQuanLyActionPerformed
        ThemQuanLy tql = new ThemQuanLy(this.staff);
        this.setVisible(false);
        tql.setVisible(true);
    }//GEN-LAST:event_jButton_themQuanLyActionPerformed

    private void jButton_lsThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lsThayDoiActionPerformed
        LSThayDoi ls = new LSThayDoi(this.staff);
        this.setVisible(false);
        ls.setVisible(true);
    }//GEN-LAST:event_jButton_lsThayDoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NVLamViec lv = new NVLamViec(this.staff);
        this.setVisible(false);
        lv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void handleGoToSLBanMax(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleGoToSLBanMax
        // TODO add your handling code here:
        SLBanMax slBanMax = new SLBanMax(this.staff);
        dispose();
        slBanMax.setVisible(true);
    }//GEN-LAST:event_handleGoToSLBanMax

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_banCafe;
    private javax.swing.JButton jButton_dangXuat;
    private javax.swing.JButton jButton_datBan;
    private javax.swing.JButton jButton_lsThayDoi;
    private javax.swing.JButton jButton_nhanVien;
    private javax.swing.JButton jButton_nuocUong;
    private javax.swing.JButton jButton_themQuanLy;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JButton jButton_thongKe;
    private javax.swing.JButton jButton_thongTin;
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
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
