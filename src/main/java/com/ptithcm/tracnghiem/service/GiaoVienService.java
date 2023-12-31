/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.GiaoVien;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.GiaoVienRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienService {
    public static GiaoVien getTeacher(String maGV) throws SQLException {
        return (GiaoVien) (new GiaoVienRepository().find(maGV));
    }
    
    public static List<GiaoVien> getAllTeachers() throws SQLException {
        return toTeachers(new GiaoVienRepository().findAll());
    }
    
    public static List<GiaoVien> toTeachers(List<Object> objects) {
        List<GiaoVien> teachers = new ArrayList<>();
        objects.forEach(object -> teachers.add((GiaoVien) object));
        return teachers;
    }
    
    //hàm này lấy toàn bộ dữ liệu code by hai mai
     public List<Object> getAllGiaoVien() throws SQLException {
        return new GiaoVienRepository().findAll();
    }
     
    //hàm này lấy toàn bộ dữ liệu code by hai mai
     public List<Object> getAllGiaoVien(boolean check) throws SQLException {
        return new GiaoVienRepository().findAll(check);
    }
     
    //hàm này dùng để kết nối 
     public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_GIAOVIEN(Filter.getChangedObjectActions(objectActions));
        GiaoVienRepository giaoVienRepository = new GiaoVienRepository();
        giaoVienRepository.saveAll(sqlServerDataTable);
    }
}
