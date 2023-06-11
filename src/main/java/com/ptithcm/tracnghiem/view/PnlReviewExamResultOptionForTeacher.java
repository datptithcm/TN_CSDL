/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.ptithcm.tracnghiem.entity.GiaoVienDangKy;
import com.ptithcm.tracnghiem.entity.Lop;
import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.entity.SinhVien;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import com.ptithcm.tracnghiem.service.BangDiemService;
import com.ptithcm.tracnghiem.service.GiaoVienDangKyService;
import com.ptithcm.tracnghiem.service.GiaoVienService;
import com.ptithcm.tracnghiem.service.KhoaService;
import com.ptithcm.tracnghiem.service.LopService;
import com.ptithcm.tracnghiem.service.SinhVienService;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author MINHDAT
 */
public class PnlReviewExamResultOptionForTeacher extends javax.swing.JPanel {
    private JPanel pnlReportSection;

    /**
     * Creates new form PnlReviewExamResultOption
     */
    public PnlReviewExamResultOptionForTeacher(JPanel pnlReportSection) {
        initComponents();
        fillFieldData();
        this.pnlReportSection = pnlReportSection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboLop = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboStudent = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSubjects = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboTimes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnReviewExamResult = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jPanel6.setOpaque(false);
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel4.setText("Lớp:");
        jPanel6.add(jLabel4, java.awt.BorderLayout.WEST);

        cboLop.setPreferredSize(new java.awt.Dimension(180, 34));
        cboLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLopActionPerformed(evt);
            }
        });
        jPanel6.add(cboLop, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel3.setOpaque(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setText("Mã sinh viên:");
        jPanel3.add(jLabel1, java.awt.BorderLayout.WEST);

        cboStudent.setPreferredSize(new java.awt.Dimension(180, 34));
        cboStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStudentActionPerformed(evt);
            }
        });
        jPanel3.add(cboStudent, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel2.setText("Môn học:");
        jPanel4.add(jLabel2, java.awt.BorderLayout.WEST);

        cboSubjects.setPreferredSize(new java.awt.Dimension(180, 34));
        cboSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubjectsActionPerformed(evt);
            }
        });
        jPanel4.add(cboSubjects, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel3.setText("Lần thi:");
        jPanel5.add(jLabel3, java.awt.BorderLayout.WEST);

        cboTimes.setPreferredSize(new java.awt.Dimension(100, 34));
        cboTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTimesActionPerformed(evt);
            }
        });
        jPanel5.add(cboTimes, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 48));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnReviewExamResult.setText("Xem kết quả");
        btnReviewExamResult.setEnabled(false);
        btnReviewExamResult.setPreferredSize(new java.awt.Dimension(120, 34));
        btnReviewExamResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewExamResultActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(btnReviewExamResult, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void cboSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubjectsActionPerformed
        try {
            int tongSoLanThi = GiaoVienDangKyService.getTongSoLanThi(cboLop.getSelectedItem().toString(), cboSubjects.getSelectedItem().toString());
            if (tongSoLanThi > 0) {
                DefaultComboBoxModel timesModel = new DefaultComboBoxModel();
                for (int i = 0; i < tongSoLanThi; ++i) {
                    timesModel.addElement(i+1);
                }
                cboTimes.setModel(timesModel);
                cboTimes.setSelectedItem(0);
                btnReviewExamResult.setEnabled(true);
            } else {
                btnReviewExamResult.setEnabled(false);
            }
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_cboSubjectsActionPerformed

    private void cboTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTimesActionPerformed
        btnReviewExamResult.setEnabled(true);
    }//GEN-LAST:event_cboTimesActionPerformed

    private void btnReviewExamResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewExamResultActionPerformed
        try {
//            Làm mới vùng chứa báo cáo
            pnlReportSection.removeAll();
            
//            Hiển thị báo cáo
            JasperDesign jasperDesign = JRXmlLoader.load(getClass().getResource("/reports/rpXemKetQuaThi.jrxml").getFile());
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            
            Map<String,Object> parameters = new HashMap<>();
            parameters.put("MASV", cboStudent.getSelectedItem().toString().trim());
            parameters.put("HOTEN", SinhVienService.getStudent(cboStudent.getSelectedItem().toString()).getHo() + " " + SinhVienService.getStudent(cboStudent.getSelectedItem().toString()).getTen());
            parameters.put("MAMH", cboSubjects.getSelectedItem().toString().trim());
            parameters.put("LAN", Short.parseShort(cboTimes.getSelectedItem().toString()));
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, LoginVariables.databaseConnector.getConnection());
            JRViewer viewer = new JRViewer(jasperPrint);
            
            pnlReportSection.add(viewer);
            pnlReportSection.revalidate();
            pnlReportSection.repaint();
        } catch (SQLServerException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        } catch (JRException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_btnReviewExamResultActionPerformed

    private void cboStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStudentActionPerformed
        try {
            List<String> maMHs = GiaoVienDangKyService.getRegisteredSubjectByClassroomCode(cboLop.getSelectedItem().toString());
            if (maMHs.isEmpty()) {
                MessageBox.showWarningBox("Thông báo", "Lớp học này chưa có thi môn nào");
            } else {
                DefaultComboBoxModel subjectModel = new DefaultComboBoxModel();
                subjectModel.addAll(maMHs);
                cboSubjects.setModel(subjectModel);
                cboSubjects.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PnlReviewExamResultOptionForTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboStudentActionPerformed

    private void cboLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLopActionPerformed
        try {
            List<String> sinhViens = SinhVienService.getAllStudentOfClass(cboLop.getSelectedItem().toString()).stream().map(SinhVien::getMaSV).toList();
            if (sinhViens.isEmpty()) {
                MessageBox.showWarningBox("Thông báo", "Lớp học này chưa có học sinh nào");
            } else {
                DefaultComboBoxModel sinhVienModel = new DefaultComboBoxModel();
                sinhVienModel.addAll(sinhViens);
                cboStudent.setModel(sinhVienModel);
                cboStudent.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PnlReviewExamResultOptionForTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboLopActionPerformed

    public void fillFieldData() {
        try {
            List<String> maLops = GiaoVienDangKyService.getRegisteredClassroomByTeacherCode(LoginVariables.databaseConnector.getAccount().getUsername()).stream().map(Lop::getMaLop).toList();
            if (!maLops.isEmpty()) {
                DefaultComboBoxModel lopModel = new DefaultComboBoxModel();
                lopModel.addAll(maLops);
                cboLop.setModel(lopModel);
                cboLop.setSelectedIndex(0);
            } else {
                 MessageBox.showErrorBox("Thông báo", "Bạn chưa đăng ký hoặc chưa có kì thi nào được diễn ra");
            }
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReviewExamResult;
    private javax.swing.JComboBox<String> cboLop;
    private javax.swing.JComboBox<String> cboStudent;
    private javax.swing.JComboBox<String> cboSubjects;
    private javax.swing.JComboBox<String> cboTimes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}