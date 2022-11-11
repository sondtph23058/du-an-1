
package view;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChucVu;
import service.impl.ChucVuServiceImpl;
import service.ChucVuService;

public class ChucVuView extends javax.swing.JFrame {

    ChucVuService qls = new ChucVuServiceImpl();
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;

    public ChucVuView() {
        initComponents();
        setLocationRelativeTo(null);
        loadCB();
        loadTable();
    }

    private void loadCB() {
        defaultComboBoxModel = (DefaultComboBoxModel) cb_TrangThai.getModel();
        ArrayList<String> list = new ArrayList<>();
        list.add("Hoạt Động");
        list.add("Không Hoạt Động");
        for (String string : list) {
            defaultComboBoxModel.addElement(string);
        }

    }

    private void loadTable() {
        defaultTableModel = (DefaultTableModel) tbChucVu.getModel();
        defaultTableModel.setRowCount(0);
        for (ChucVu cv : qls.getListChucVu()) {
            defaultTableModel.addRow(new Object[]{
                cv.getMaCV(), cv.getTenCV(), cv.getNgayTao(), cv.getNgaySua(), cv.getTrangThai() == 1 ? "Hoạt Động" : "Không Hoạt Động"
            });
        }
    }

    private int TrangThai() {
        if (cb_TrangThai.getSelectedItem() == "Hoạt Động") {
            return 1;
        } else {
            return 0;
        }
    }

    private ChucVu getForm() {
        String tenCV = txtTenCV.getText().trim();
        String NgayTao = txtNgayTao.getText().trim();
        String NgaySua = txtNgaySua.getText().trim();
        Date ngayTao = (Date.valueOf(NgayTao));
        Date ngaySua = (Date.valueOf(NgaySua));
        int trangThai = TrangThai();
        if (tenCV.length() == 0 || NgaySua.length() == 0 || NgaySua.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            return null;
        }
        ChucVu cv = new ChucVu(null, tenCV, ngayTao, ngaySua, trangThai);
        return cv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenCV = new javax.swing.JTextField();
        txtNgaySua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChucVu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        lb_MaCV = new javax.swing.JLabel();
        cb_TrangThai = new javax.swing.JComboBox<>();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Chức Vụ", "Tên Chức Vụ", "Ngày Tạo", "Ngày Sửa", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChucVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChucVu);

        jLabel5.setText("Mã CV");

        jLabel1.setText("Quản Lý Chức Vụ");

        jLabel2.setText("Tên CV");

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

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
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
                            .addComponent(txtTenCV)
                            .addComponent(txtNgaySua)
                            .addComponent(txtNgayTao)
                            .addComponent(lb_MaCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25))
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
                            .addComponent(txtTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ChucVu cv = getForm();
        if (cv == null) {
            return;
        }
        String traLoi = qls.addChucVu(cv);
        JOptionPane.showMessageDialog(this, traLoi);
        loadTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChucVuMouseClicked
        int row = tbChucVu.getSelectedRow();
        lb_MaCV.setText(tbChucVu.getValueAt(row, 0).toString());
        txtTenCV.setText(tbChucVu.getValueAt(row, 1).toString());
        txtNgayTao.setText(tbChucVu.getValueAt(row, 2).toString());
        txtNgaySua.setText(tbChucVu.getValueAt(row, 3).toString());
        cb_TrangThai.setSelectedItem(tbChucVu.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tbChucVuMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tbChucVu.getSelectedRow();
        ChucVu cv = getForm();
        if (cv == null) {
            return;
        }
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu");
            return;
        }
        String id = tbChucVu.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(id));
        String traLoi = qls.updateChucVu(cv, ID);
        loadTable();
        JOptionPane.showMessageDialog(this, traLoi);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tbChucVu.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu");
            return;
        }
        String id = tbChucVu.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(id));
        String traLoi = qls.deleteChucVu(ID);
        loadTable();
        JOptionPane.showMessageDialog(this, traLoi);
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(ChucVuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucVuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucVuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucVuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChucVuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cb_TrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_MaCV;
    private javax.swing.JTable tbChucVu;
    private javax.swing.JTextField txtNgaySua;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCV;
    // End of variables declaration//GEN-END:variables
}
