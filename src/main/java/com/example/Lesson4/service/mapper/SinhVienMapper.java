package com.example.Lesson4.service.mapper;

import com.example.Lesson4.domain.MonHoc;
import com.example.Lesson4.domain.SinhVien;
import com.example.Lesson4.service.dto.MonHocDTO;
import com.example.Lesson4.service.dto.SinhVienDTO;

import java.util.List;

public class SinhVienMapper implements EntityMapper<SinhVienDTO, SinhVien>{
    @Override
    public SinhVienDTO toDo(SinhVien sinhVien) {
        SinhVienDTO dto = new SinhVienDTO();
        dto.setId(sinhVien.getId());
        dto.setHoSv(sinhVien.getHoSv());
        dto.setTenSv(sinhVien.getTenSv());
        dto.setPhai(sinhVien.getPhai());
        dto.setNgaySinh(sinhVien.getNgaySinh());
        dto.setNoiSinh(sinhVien.getNoiSinh());
        return dto;
    }

    @Override
    public SinhVien toEntity(SinhVienDTO sinhVienDTO) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setId(sinhVienDTO.getId());
        sinhVien.setHoSv(sinhVien.getHoSv());
        sinhVien.setTenSv(sinhVien.getTenSv());
        sinhVien.setPhai(sinhVien.getPhai());
        sinhVien.setNgaySinh(sinhVien.getNgaySinh());
        sinhVien.setNoiSinh(sinhVien.getNoiSinh());
        return sinhVien;
    }

    @Override
    public List<SinhVienDTO> toDo(List<SinhVien> e) {
        return null;
    }

    @Override
    public List<SinhVien> toEntity(List<SinhVienDTO> d) {
        return null;
    }
}
