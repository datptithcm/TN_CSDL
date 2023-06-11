/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author MINHDAT
 */
public class PnlReports extends javax.swing.JPanel {
    private String tabName;
    private JPanel pnlOption;

    /**
     * Creates new form PnlReports
     */
    public PnlReports(String tabName) {
        this.tabName = tabName;
        initComponents();
        initMyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlReportSection = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        PnlReportSection.setBackground(new java.awt.Color(255, 255, 255));
        PnlReportSection.setLayout(new java.awt.CardLayout());
        add(PnlReportSection, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void initMyComponents() {
        switch (tabName) {
            case "Xem kết quả thi":
                if (LoginVariables.databaseConnector.getAccount().getGroupName().equals("SINHVIEN")) {
                    add(pnlOption = new PnlReviewExamResultOption(PnlReportSection), BorderLayout.NORTH);
                } else if (LoginVariables.databaseConnector.getAccount().getGroupName().equals("GIANGVIEN")) {
                    add(pnlOption = new PnlReviewExamResultOptionForTeacher(PnlReportSection),BorderLayout.NORTH);
                }
                break;
            case "Xem bảng điểm":
                add(pnlOption = new PnlReviewReportBangDiem(PnlReportSection), BorderLayout.NORTH);
                break;
            default:
                throw new AssertionError();
        }
    }

//    Getters and setters
    public JPanel getPnlOption() {
        return pnlOption;
    }

    public void setPnlOption(JPanel pnlOption) {
        this.pnlOption = pnlOption;
    }

    public JPanel getPnlReportSection() {
        return PnlReportSection;
    }

    public void setPnlReportSection(JPanel PnlReportSection) {
        this.PnlReportSection = PnlReportSection;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlReportSection;
    // End of variables declaration//GEN-END:variables
}
