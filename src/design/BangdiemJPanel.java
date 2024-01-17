/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controller.MyComboBox;
import dao.BangDiemDAO;
import dao.HocPhanDAO;
import dao.SinhVienDAO;
import design.popup.BangdiemJFrame;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.BangDiem;
import model.HocPhan;
import model.SinhVien;

/**
 *
 * @author nguye
 */
public class BangdiemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuJPanel
     */
    private BangdiemJPanel bangdiemJPanel = this;

    public BangdiemJPanel() {
        initComponents();
        
        tbDiem.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Lấy số hàng đã được nhấp
                if (e.getClickCount() == 2) {
                    int row = tbDiem.getSelectedRow();
                    
                    BangDiem bangdiem = new BangDiem();
                    bangdiem.setId((int) tbDiem.getValueAt(row, 0));
                    bangdiem.setId_sinhvien((int) tbDiem.getValueAt(row, 1));
                    bangdiem.setId_hocphan((int) tbDiem.getValueAt(row, 2));
                    bangdiem.setDiem_chuyen_can((BigDecimal) tbDiem.getValueAt(row, 3));
                    bangdiem.setDiem_thi((BigDecimal) tbDiem.getValueAt(row, 4));
                    bangdiem.setNgay_thi((Date) tbDiem.getValueAt(row, 5));
                    
                    BangdiemJFrame frame = new BangdiemJFrame(bangdiemJPanel, bangdiem, true);
                    frame.setTitle("Sửa thông tin");
                
                    frame.setVisible(true);
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            
        });
        
        JTableHeader thead = tbDiem.getTableHeader();
        
        thead.setFont(new Font("Segoe", Font.ITALIC,16));
        thead.setBackground(new Color(200,255,255));
        loadCombobox();
        loaddata(0,0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cbSV = new javax.swing.JComboBox<>();
        cbHp = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 680));

        jPanel1.setBackground(new java.awt.Color(230, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 680));

        jButton1.setBackground(new java.awt.Color(122, 122, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Điểm", "Mã SV", "Mã Học Phần", "Điểm Chuyên Cần", "Điểm Thi", "Ngày Thi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDiem.setGridColor(new java.awt.Color(0, 0, 153));
        tbDiem.setPreferredSize(new java.awt.Dimension(980, 600));
        tbDiem.setRequestFocusEnabled(false);
        tbDiem.setRowHeight(30);
        tbDiem.setRowMargin(10);
        tbDiem.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tbDiem.setSelectionForeground(new java.awt.Color(255, 0, 51));
        tbDiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDiem.setShowGrid(true);
        tbDiem.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tbDiem);

        jButton2.setBackground(new java.awt.Color(112, 112, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbHp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tên SV");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên Học Phần");

        jButton3.setBackground(new java.awt.Color(112, 112, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Tìm Kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(112, 112, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Xuất dữ liệu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSV, 0, 178, Short.MAX_VALUE)
                            .addComponent(cbHp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbHp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loaddata(int idsv, int idhp) {
        
        try {
            DefaultTableModel model = (DefaultTableModel) tbDiem.getModel();
            model.setRowCount(0);
            ArrayList<BangDiem> list = BangDiemDAO.find(idsv,idhp);
            for (BangDiem item : list) {
                model.addRow(new Object[]{item.getId(), item.getId_sinhvien(), item.getId_hocphan(),
                    item.getDiem_chuyen_can(), item.getDiem_thi(), item.getNgay_thi()});
            }
        } catch (Exception e ) {
            
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BangDiem bangdiem = new BangDiem();
        BangdiemJFrame frame = new BangdiemJFrame(bangdiemJPanel,bangdiem, false);
        frame.setTitle("Thêm Điểm");
        frame.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbDiem.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Lấy giá trị của cột CID từ dòng được chọn
            int id = (int) tbDiem.getValueAt(selectedRowIndex, 0);

            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xoa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int a = BangDiemDAO.delete(id);
                if(a>0) {
                    loaddata(0,0);
                }
            }
        } else {
            System.out.println("Vui lòng chọn một dòng để xóa!");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void loadCombobox() {
        try {
            
            ArrayList<SinhVien> list1 = SinhVienDAO.list();
            DefaultComboBoxModel cbSvModel = (DefaultComboBoxModel) cbSV.getModel();
            
            for (SinhVien item : list1) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen());
                cbSvModel.addElement(object);
            }
            
            ArrayList<HocPhan> list2 = HocPhanDAO.list();
            DefaultComboBoxModel cbHpModel = (DefaultComboBoxModel) cbHp.getModel();
            
            for (HocPhan item : list2) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen_hocphan());
                cbHpModel.addElement(object);
            }
        } catch(Exception e) {
            
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            int idsv = 0;
            int idhp = 0;

            if(cbSV.getSelectedIndex() ==0) {
                idsv =0;
            }else {
                MyComboBox item1 =(MyComboBox)cbSV.getSelectedItem();
                idsv = item1.MaInt();
            }
            
            if(cbHp.getSelectedIndex() ==0) {
                idhp =0;
            }else {
                MyComboBox item2 =(MyComboBox)cbHp.getSelectedItem();
                idhp = item2.MaInt();
            }
            
            loaddata(idsv,idhp);
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Document document = new Document() ;
        int id;
        try {
            if(cbSV.getSelectedIndex() ==0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sinh viên");
                return;
            }else {
                MyComboBox item1 =(MyComboBox)cbSV.getSelectedItem();
                id = item1.MaInt();
            }
            ArrayList<Object> list = BangDiemDAO.xuat(id);
            Object[] objectArray1 = (Object[]) list.get(0);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("filediem.pdf"));
            document.open();
            document.setPageSize(PageSize.A0);
            Paragraph paragraph = new Paragraph();
            Paragraph phrase1 = new Paragraph("   BO GIAO DUC VA DAO TAO");
            phrase1.add("                                 ");
            phrase1.add("CONG HOA XA HOI CHU NGHIA VIET NAM");
            phrase1.setLeading(10);
            document.add(phrase1);
            Paragraph phrase2 = new Paragraph("Truong Dai Hoc Kien Truc Ha Noi");
            phrase2.add("                                         ");
            phrase2.add("Doc lap - Tu do - Hanh phuc");
            phrase2.setLeading(20);
            document.add(phrase2);
            Paragraph phrase3 = new Paragraph("             --------------------");
            phrase3.add("                                                                   ");
            phrase3.add("--------------------");
            phrase3.setLeading(20);
            document.add(phrase3);
            Paragraph phrase6 = new Paragraph("                                                                  Phieu Diem");
            phrase6.setLeading(40);
            document.add(phrase6);
            document.add(new Paragraph());
            Paragraph phrase4 = new Paragraph("Ho và Ten:");
            phrase4.add(" ");
            phrase4.add((String) objectArray1[1]);
            phrase4.setLeading(40);
            document.add(phrase4);
            Paragraph phrase5 = new Paragraph("TBC tich luy (He 10):");
            phrase5.add(" ");
            phrase5.add((String) objectArray1[7]);
            phrase5.add("                                           "); 
            phrase5.add("Xep loai hoc tap (He 10): ");
            double dou1 = Double.parseDouble((String) objectArray1[7]);
            if (dou1 <= 10 && dou1 >= 9) {
                phrase5.add("Xuat sac");
            } else if(dou1 < 9 && dou1 >= 8) {
                phrase5.add("Gioi");
            } else if(dou1 < 8 && dou1 >= 7) {
               phrase5.add("Kha");
            } else if(dou1 < 7 && dou1 >= 5) {
                phrase5.add("Trung binh");
            } else if(dou1 < 5 && dou1 >= 4) {
                phrase5.add("Yeu");
            }else if(dou1 < 4) {
                 phrase5.add("Kem");
            } 
            phrase5.setLeading(30);
            document.add(phrase5);
            Paragraph phrase7 = new Paragraph(" ");
            phrase7.setLeading(40);
            document.add(phrase7);
            PdfPTable table = new PdfPTable(8);
            table.addCell("STT");
            table.addCell("Ten hoc phan ");
            table.addCell("So tin chi");
            table.addCell("Diem qua trinh"); 
            table.addCell("Diem thi"); 
            table.addCell("TBCHP"); 
            table.addCell("Diem so"); 
            table.addCell("Diem chu"); 

            for (int i = 0; i < list.size(); i++) {
                Object[] objectArray = (Object[]) list.get(i);
                System.out.println(objectArray[0]  );
                table.addCell(String.valueOf(i+1));
                table.addCell((String) objectArray[2]);
                table.addCell((String) objectArray[3]);
                table.addCell((String) objectArray[4]);
                table.addCell((String) objectArray[5]);
                double dou = Double.parseDouble((String) objectArray[6]);
                table.addCell((String) String.format("%.2f", dou));

                if (dou <= 10 && dou >= 8.5) {
                    table.addCell("4");
                    table.addCell("A");
                } else if(dou < 8.5 && dou >= 7.0) {
                    table.addCell("3");
                    table.addCell("B");
                } else if(dou < 7.0 && dou >= 5.5) {
                    table.addCell("2");
                    table.addCell("C");
                } else if(dou < 5.5 && dou >= 4.0) {
                    table.addCell("1");
                    table.addCell("D");
                } else if(dou < 4.0) {
                    table.addCell("0");
                    table.addCell("F");
                } 
            }
            document.add(table);
            LocalDate today = LocalDate.now();
            int year = today.getYear();
            int month = today.getMonthValue();
            int dayOfMonth = today.getDayOfMonth();
            Paragraph phrase8 = new Paragraph("");
            phrase8.add("                                                                                          ");
            phrase8.add("Ha Noi, ngay " + dayOfMonth +" thang "+ month +" nam " + year);
            phrase8.setLeading(60);
            
            document.add(phrase8);
            document.close();
            
            Desktop desktop = Desktop.getDesktop();

            desktop.open(new File(System.getProperty("user.dir")+ "\\filediem.pdf"));
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(BangdiemJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BangdiemJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbHp;
    private javax.swing.JComboBox<Object> cbSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDiem;
    // End of variables declaration//GEN-END:variables
}
