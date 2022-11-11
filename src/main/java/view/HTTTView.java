/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HINHTHUCTHANHTOAN;
import service.HTTTServices;
import service.impl.HTTTServicesImpl;

/**
 *
 * @author vuong
 */
public class HTTTView extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private HTTTServices httts = new HTTTServicesImpl();

    public HTTTView() {
        initComponents();
        txt_maHTTT.disable();
        LoadTable();
    }

    void LoadTable() {
        defaultTableModel = (DefaultTableModel) tb_HTTT.getModel();
        defaultTableModel.setRowCount(0);
        for (HINHTHUCTHANHTOAN hinhthucthanhtoan : httts.getList()) {
            defaultTableModel.addRow(new Object[]{
                hinhthucthanhtoan.getMaHTTT(),
                hinhthucthanhtoan.getTenHTTT(),
                hinhthucthanhtoan.getNgayTao(),
                hinhthucthanhtoan.getNgaySua(),
                hinhthucthanhtoan.getTrangThai() == 1 ? "Đã Thanh Toán" : "Chờ Thanh Toán"
            });
        }

    }

    private HINHTHUCTHANHTOAN getData() {
        String tenHTTT = txt_tenHTTT.getText().trim();
        String NgayTao = txt_ngayTao.getText().trim();
        String NgaySua = txt_ngaySua.getText().trim();
        Date ngayTao = (Date.valueOf(NgayTao));
        Date ngaySua = (Date.valueOf(NgaySua));
        int trangThai = TrangThai();
        if (tenHTTT.length() == 0 || NgaySua.length() == 0 || NgaySua.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            return null;
        }
        HINHTHUCTHANHTOAN hinhthucthanhtoan = new HINHTHUCTHANHTOAN(0, tenHTTT, ngayTao, ngaySua, trangThai);
        return hinhthucthanhtoan;
    }

    private int TrangThai() {
        if (cb_trangThai.getSelectedItem() == "Đã Thanh Toán") {
            return 1;
        } else {
            return 0;
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
        txt_maHTTT = new javax.swing.JTextField();
        txt_tenHTTT = new javax.swing.JTextField();
        txt_ngayTao = new javax.swing.JTextField();
        txt_ngaySua = new javax.swing.JTextField();
        cb_trangThai = new javax.swing.JComboBox<>();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_HTTT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã HTTT");

        jLabel2.setText("Tên HTTT");

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Ngày Sửa");

        jLabel5.setText("Trạng Thái");

        cb_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã Thanh Toán", "Chờ Thanh Toán" }));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        tb_HTTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HTTT", "Tên HTTT", "Ngày Tạo", "Ngày Sửa", "Trạng Thái"
            }
        ));
        tb_HTTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_HTTTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_HTTT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ngaySua, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txt_ngayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txt_tenHTTT, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txt_maHTTT)
                    .addComponent(cb_trangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sua))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btn_xoa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_maHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_tenHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sua)
                            .addComponent(btn_them))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_xoa)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cb_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, httts.add(getData()));
        LoadTable();

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:

        int row = tb_HTTT.getSelectedRow();
        String Id = tb_HTTT.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(Id));
        JOptionPane.showMessageDialog(this, httts.update(getData(), ID));
        LoadTable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tb_HTTT.getSelectedRow();
        String Id = tb_HTTT.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(Id));
        JOptionPane.showMessageDialog(this, httts.delete(ID));
        LoadTable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tb_HTTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_HTTTMouseClicked
        // TODO add your handling code here:
        int row = tb_HTTT.getSelectedRow();
        txt_maHTTT.setText(tb_HTTT.getValueAt(row, 0).toString());
        txt_tenHTTT.setText(tb_HTTT.getValueAt(row, 1).toString());
        txt_ngayTao.setText(tb_HTTT.getValueAt(row, 2).toString());
        txt_ngaySua.setText(tb_HTTT.getValueAt(row, 3).toString());
        cb_trangThai.setSelectedItem(tb_HTTT.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tb_HTTTMouseClicked

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
            java.util.logging.Logger.getLogger(HTTTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTTTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTTTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTTTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTTTView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_trangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_HTTT;
    private javax.swing.JTextField txt_maHTTT;
    private javax.swing.JTextField txt_ngaySua;
    private javax.swing.JTextField txt_ngayTao;
    private javax.swing.JTextField txt_tenHTTT;
    // End of variables declaration//GEN-END:variables
}
