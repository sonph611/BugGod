/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.model.HoaDon;
import com.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends PeachCoffeeDAO<HoaDon, String> {

    final String INSERT_SQL = "INSERT INTO HoaDon (MaHD, ThoiGianTao, ThoiGianTT, NguoiTao,  TongTien, ChiPhiKhac, HinhThucTT, GhiChu, TrangThai, TenNguoiTao) VALUES(?,?,?,?,?,?,?,?,?,?)";
    final String SELECT_ALL_SQL = "select * from HoaDon";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaHD(), entity.getThoiGianTao(), entity.getThoiGianThanhToan(), entity.getNguoiTao(), entity.getTongTien(), entity.getChiPhiKhac(), entity.getHinhThucThanhToan(), entity.getGhiChu(),entity.getTrangThai(), entity.getTenNguoiTao());
    }

    @Override
    public void update(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEmail(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString("MaHD"));
                entity.setThoiGianTao(rs.getDate("ThoiGianTao"));
                entity.setThoiGianThanhToan(rs.getDate("ThoiGianTT"));
                entity.setNguoiTao(rs.getString("NguoiTao"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setChiPhiKhac(rs.getDouble("ChiPhiKhac"));
                entity.setHinhThucThanhToan(rs.getString("HinhThucTT"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setTrangThai(rs.getString("TrangThai"));
                entity.setTenNguoiTao(rs.getString("TenNguoiTao"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
