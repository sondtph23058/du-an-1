
package view;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KICHTHUOC;
import service.KichThuocServices;
import service.impl.KichThuocServicesImpl;

public class KichThuocView extends javax.swing.JFrame {

    /**
     * Creates new form KichThuocView
     */
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    KichThuocServices kts = new KichThuocServicesImpl();

    public KichThuocView() {
        initComponents();
        setLocationRelativeTo(null);
        LoadTable(kts.getListKT());
        loadCB();
        txt_maKichThuoc.disable();
    }

    void LoadTable(ArrayList<KICHTHUOC> list) {
        defaultTableModel = (DefaultTableModel) tb_kichThuoc.getModel();
        defaultTableModel.setRowCount(0);
        for (KICHTHUOC kichThuoc : kts.getListKT()) {
            defaultTableModel.addRow(new Object[]{
                kichThuoc.getMaKichThuoc(), kichThuoc.getKichThuoc(),
                kichThuoc.getNgayTao(), kichThuoc.getNgaySua(), kichThuoc.getTrangThai() == 1 ? "Lon" : "Nho"
            });

        }
    }

    private void loadCB() {
        defaultComboBoxModel = (DefaultComboBoxModel) cb_trangThai.getModel();
        ArrayList<String> list = new ArrayList<>();
        list.add("Lớn");
        list.add("Nhỏ");
        for (String string : list) {
            defaultComboBoxModel.addElement(string);
        }

    }

//    public KICHTHUOC getData() {
//        KICHTHUOC kichThuoc = new KICHTHUOC();
//        kichThuoc.setMaKichThuoc(Integer.parseInt(txt_maKichThuoc.getText()));
//        kichThuoc.setKichThuoc(txt_kichThuoc.getText());
//        kichThuoc.setNgayTao(Date.valueOf(txt_ngayTao.getText()));
//        kichThuoc.setNgaySua(Date.valueOf(txt_ngaySua.getText()));
//        kichThuoc.setTrangThai(Integer.parseInt(cb_trangThai.getSelectedItem().toString()));
//        return kichThuoc;
//    }
    private KICHTHUOC getData() {
//        int maKichThuoc = Integer.parseInt(txt_maKichThuoc.getText().trim());
        String kichThuoc = txt_kichThuoc.getText().trim();
        String NgayTao = txt_ngayTao.getText().trim();
        String NgaySua = txt_ngaySua.getText().trim();
        Date ngayTao = (Date.valueOf(NgayTao));
        Date ngaySua = (Date.valueOf(NgaySua));
        int trangThai = TrangThai();
        if (kichThuoc.length() == 0 || NgaySua.length() == 0 || NgaySua.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            return null;
        }
        KICHTHUOC kt = new KICHTHUOC(null, kichThuoc, ngayTao, ngaySua, trangThai);
        return kt;
    }

    private int TrangThai() {
        if (cb_trangThai.getSelectedItem() == "Lớn") {
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
        txt_maKichThuoc = new javax.swing.JTextField();
        txt_kichThuoc = new javax.swing.JTextField();
        txt_ngayTao = new javax.swing.JTextField();
        txt_ngaySua = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_kichThuoc = new javax.swing.JTable();
        cb_trangThai = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Kích thuoc");

        jLabel2.setText("KichThuoc");

        jLabel3.setText("NgayTao");

        jLabel4.setText("NgaySua");

        jLabel5.setText("TrangThai");

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tb_kichThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaKichThuoc", "KichThuoc", "NgayTao", "NgaySua", "TrangThai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_kichThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_kichThuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_kichThuoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_maKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_kichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_trangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_them)
                            .addComponent(btn_sua)
                            .addComponent(btn_xoa)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_maKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_kichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, kts.add(getData()));
        LoadTable(kts.getListKT());
    }//GEN-LAST:event_btn_themActionPerformed

    private void tb_kichThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_kichThuocMouseClicked
        // TODO add your handling code here:
        int row = tb_kichThuoc.getSelectedRow();
        txt_maKichThuoc.setText(tb_kichThuoc.getValueAt(row, 0).toString());
        txt_kichThuoc.setText(tb_kichThuoc.getValueAt(row, 1).toString());
        txt_ngayTao.setText(tb_kichThuoc.getValueAt(row, 2).toString());
        txt_ngaySua.setText(tb_kichThuoc.getValueAt(row, 3).toString());
        cb_trangThai.setSelectedItem(tb_kichThuoc.getValueAt(row, 4).toString());

    }//GEN-LAST:event_tb_kichThuocMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
//        int id = tb_kichThuoc.getSelectedRow();
//        JOptionPane.showMessageDialog(this, kts.update(getData(), id));
//        LoadTable(kts.getListKT());
        int row = tb_kichThuoc.getSelectedRow();
        KICHTHUOC kt = getData();
        if (kt == null) {
            return;
        }
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu");
            return;
        }
        String id = tb_kichThuoc.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(id));
        String traLoi = kts.update(kt, ID);
        LoadTable(kts.getListKT());
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
//        int row = tb_kichThuoc.getSelectedRow();
//        int ID = (Integer.parseInt(id));
//        JOptionPane.showMessageDialog(this, kts.delete(ID));
//        LoadTable(kts.getListKT());

        int row = tb_kichThuoc.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu");
            return;
        }
        String id = tb_kichThuoc.getValueAt(row, 0).toString();
        int ID = (Integer.parseInt(id));
        String traLoi = kts.delete(ID);
        JOptionPane.showMessageDialog(this, traLoi);
        LoadTable(kts.getListKT());
        
    }//GEN-LAST:event_btn_xoaActionPerformed

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
            java.util.logging.Logger.getLogger(KichThuocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KichThuocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KichThuocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KichThuocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KichThuocView().setVisible(true);
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
    private javax.swing.JTable tb_kichThuoc;
    private javax.swing.JTextField txt_kichThuoc;
    private javax.swing.JTextField txt_maKichThuoc;
    private javax.swing.JTextField txt_ngaySua;
    private javax.swing.JTextField txt_ngayTao;
    // End of variables declaration//GEN-END:variables
}
