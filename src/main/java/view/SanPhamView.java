
package view;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SanPham;
import service.impl.SanPhamServiceImpl;
import service.SanPhamService;

/**
 *
 * @author sondi
 */
public class SanPhamView extends javax.swing.JFrame {

    SanPhamService qls = new SanPhamServiceImpl();
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;

    public SanPhamView() {
        initComponents();
        loadCB();
        loadTable(qls.getListSanPham());
    }

    private void loadTable(ArrayList<SanPham> list) {
        defaultTableModel = (DefaultTableModel) tbSanpham.getModel();
        defaultTableModel.setRowCount(0);
        for (SanPham sp : list) {
            defaultTableModel.addRow(new Object[]{
                sp.getMaSP(), sp.getTensp(), sp.getNgayTao(), sp.getNgaySua(), sp.getTrangThai() == 1 ? "Con Hang" : "Het Hang"
            });
        }

    }

    private void loadCB() {
        defaultComboBoxModel = (DefaultComboBoxModel) cbLop.getModel();
        ArrayList<String> list = new ArrayList<>();
        list.add("Còn Hàng");
        list.add("Hết Hàng");
        for (String string : list) {
            defaultComboBoxModel.addElement(string);
        }

    }

    private SanPham getForm() {
        String tensp = txtTenSp.getText().trim();
        String NgayTao = txtNgayTao.getText().trim();
        String NgaySua = txtNgaySua.getText().trim();
        Date ngayTao = (Date.valueOf(NgayTao));
        Date ngaySua = (Date.valueOf(NgaySua));
        int trangThai = TrangThai();
        if (tensp.length() == 0 || NgayTao.length() == 0 || NgaySua.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            return null;
        }
        SanPham sp = new SanPham(null, tensp, ngayTao, ngaySua, trangThai);
        return sp;
    }

    private int TrangThai() {
        if (cbLop.getSelectedItem() == "Còn Hàng") {
            return 1;
        } else {
            return 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenSp = new javax.swing.JTextField();
        txtNgaySua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanpham = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        cbLop = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        lb_MaCV = new javax.swing.JLabel();
        btnxoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã San Pham", "Tên San Pham", "Ngày Tạo", "Ngày Sửa", "Trạng Thái"
            }
        ));
        tbSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSanpham);

        jLabel5.setText("Mã Sp");

        jLabel1.setText("Quản Lý San Pham");

        jLabel2.setText("Tên Sp");

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Ngày Sửa");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel6.setText("Trạng Thái");

        lb_MaCV.setText("-");

        btnxoa.setText("Xoa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jButton1.setText("Sua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenSp)
                                    .addComponent(cbLop, 0, 281, Short.MAX_VALUE)
                                    .addComponent(txtNgaySua)
                                    .addComponent(txtNgayTao)
                                    .addComponent(lb_MaCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem)
                                    .addComponent(btnxoa)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lb_MaCV))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoa))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        JOptionPane.showMessageDialog(this, qls.addSanPham(getForm()));
        loadTable(qls.getListSanPham());
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int row = tbSanpham.getSelectedRow();
        String delete = tbSanpham.getValueAt(row, 0).toString();
        JOptionPane.showMessageDialog(this, qls.delete(Integer.parseInt(delete)));
        loadTable(qls.getListSanPham());
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanphamMouseClicked
        // TODO add your handling code here:
        int row = tbSanpham.getSelectedRow();
        lb_MaCV.setText(tbSanpham.getValueAt(row, 0).toString());
        txtTenSp.setText(tbSanpham.getValueAt(row, 1).toString());
        txtNgayTao.setText(tbSanpham.getValueAt(row, 2).toString());
        txtNgaySua.setText(tbSanpham.getValueAt(row, 3).toString());
        cbLop.setSelectedItem(tbSanpham.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tbSanphamMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = tbSanpham.getSelectedRow();
        SanPham sp = getForm();
        if (sp == null) {
            return;
        }
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu");
            return;
        }
        String id = tbSanpham.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(id));
        String traLoi = qls.update(sp, ID);
        loadTable(qls.getListSanPham());
        JOptionPane.showMessageDialog(this, traLoi);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbLop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_MaCV;
    private javax.swing.JTable tbSanpham;
    private javax.swing.JTextField txtNgaySua;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenSp;
    // End of variables declaration//GEN-END:variables
}
