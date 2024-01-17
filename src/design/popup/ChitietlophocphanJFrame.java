/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design.popup;
import controller.MyComboBox;
import dao.LopHocPhanDAO;
import dao.LophocphanSinhvienDAO;
import dao.SinhVienDAO;
import design.ChitietlophocphanJPanel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.LophocphanSinhvien;
import model.SinhVien;
import model.LopHocPhan;

/**
 *
 * @author nguye
 */
public class ChitietlophocphanJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SinhvienJFrame
     */
    private ChitietlophocphanJPanel chitietlophocphanJPanel;
    private LophocphanSinhvien lophocphanSinhvien;
    private Boolean isUpdate ;
    public ChitietlophocphanJFrame(ChitietlophocphanJPanel chitietlophocphanJPanel, LophocphanSinhvien lophocphanSinhvien, Boolean isUpdate) {
        initComponents();
        this.chitietlophocphanJPanel = chitietlophocphanJPanel;
        this.lophocphanSinhvien = lophocphanSinhvien;
        this.isUpdate = isUpdate;
        loadCombobox();
        if (isUpdate ) {
            loadDataUpdate();
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbSV = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbLHP = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(204, 153, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jButton1.setBackground(new java.awt.Color(112, 112, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lưu");
        jButton1.setPreferredSize(new java.awt.Dimension(125, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết lớp học phần", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã ");

        txtId.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Sinh  Viên");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Lớp Học Phần");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSV, 0, 187, Short.MAX_VALUE)
                    .addComponent(cbLHP, 0, 187, Short.MAX_VALUE)
                    .addComponent(txtId))
                .addGap(353, 353, 353))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(cbSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(cbLHP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.isUpdate ) {
            updateData();
        }else {
           insertData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertData() {
        try {
            
            MyComboBox item =(MyComboBox)cbSV.getSelectedItem();
            lophocphanSinhvien.setId_sinhvien(item.MaInt());
            
            MyComboBox item1 =(MyComboBox)cbLHP.getSelectedItem();
            lophocphanSinhvien.setId_lophocphan(item1.MaInt());
            
            int a = LophocphanSinhvienDAO.create(lophocphanSinhvien);
            if (a>0) {
                JOptionPane.showMessageDialog(this, "Thêm thông tin chi tiết lớp học thành công");
                System.out.println("Cập nhật thông tin Chi tiết lớp học thành công!");
                chitietlophocphanJPanel.loaddata();
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    private void updateData()  {
       try {
            //BigDecimal bigDecimal = new BigDecimal(txtGPA.getText());
            
            MyComboBox item =(MyComboBox)cbSV.getSelectedItem();
            lophocphanSinhvien.setId_sinhvien(item.MaInt());
            
            MyComboBox item1 =(MyComboBox)cbLHP.getSelectedItem();
            lophocphanSinhvien.setId_lophocphan(item1.MaInt());
            
            int a = LophocphanSinhvienDAO.update(lophocphanSinhvien);
            if (a>0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin chi tiết lớp học thành công");
                System.out.println("Cập nhật thông tin chi tiết lớp học thành công!");
                chitietlophocphanJPanel.loaddata();
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
    private void loadDataUpdate() {
        txtId.setText(String.valueOf(lophocphanSinhvien.getId()));
        
        cbSV.setSelectedIndex(lophocphanSinhvien.getId_sinhvien()-1);
        cbLHP.setSelectedIndex(lophocphanSinhvien.getId_lophocphan()-1);

    }
   
    private void loadCombobox() {
        try {
            ArrayList<SinhVien> list = SinhVienDAO.list();
            DefaultComboBoxModel cbSvModel = (DefaultComboBoxModel) cbSV.getModel();
            
            for (SinhVien item : list) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen());
                cbSvModel.addElement(object);
            }
            
            ArrayList<LopHocPhan> list1 = LopHocPhanDAO.list();
            DefaultComboBoxModel cbLHPModel = (DefaultComboBoxModel) cbLHP.getModel();
            
            for (LopHocPhan item : list1) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen());
                cbLHPModel.addElement(object);
            }
        } catch(Exception e) {
            
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbLHP;
    private javax.swing.JComboBox<Object> cbSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    
}
