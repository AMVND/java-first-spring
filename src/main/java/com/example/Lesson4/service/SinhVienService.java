package com.example.Lesson4.service;

import com.example.Lesson4.domain.MonHoc;
import com.example.Lesson4.domain.SinhVien;
import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.respository.SinhVienRepository;
import com.example.Lesson4.service.dto.MonHocDTO;
import com.example.Lesson4.service.dto.SinhVienDTO;
import com.example.Lesson4.service.mapper.SinhVienMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SinhVienService {
    private final SinhVienRepository sinhVienRepository;

    private final SinhVienMapper sinhVienMapper;

   public List<SinhVienInfo> sinhVienInfoList(Long id){
       List<SinhVienInfo> sinhVienInfos = sinhVienRepository.findDiemByMonhoc(id);
       return sinhVienInfos;
   }

    @Transactional
    public void create(SinhVienDTO sinhVienDTO) {
        SinhVien sinhVien = sinhVienMapper.toEntity(sinhVienDTO);
        sinhVienRepository.save(sinhVien);
    }

    @Transactional
    public void update(String id, SinhVienDTO sinhVienDTO) {
        SinhVien sinhVien = sinhVienMapper.toEntity(sinhVienDTO);
        sinhVien.setId(id);
        sinhVienRepository.save(sinhVien);
    }

    @Transactional
    public void delete(String name) {
        sinhVienRepository.deleteById(String.valueOf(name));
    }
}
