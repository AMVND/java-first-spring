package com.example.Lesson4.service;

import com.example.Lesson4.domain.MonHoc;
import com.example.Lesson4.projection.MonHocInfo;
import com.example.Lesson4.projection.SVDiemInfo;
import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.respository.DiemTBRepository;
import com.example.Lesson4.respository.MonHocRepository;
import com.example.Lesson4.respository.SVDiemRepository;
import com.example.Lesson4.respository.SinhVienRepository;
import com.example.Lesson4.service.dto.MonHocDTO;
import com.example.Lesson4.service.mapper.MonHocMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MonHocService {
    private final MonHocRepository monHocRepository;
    private final DiemTBRepository diemTBRepository;
    private final MonHocMapper monHocMapper;
    private final SVDiemRepository svDiemRepository;

    public MonHocDTO findByName(String name) {
        MonHoc monHoc = monHocRepository.findByName(name);
        MonHocDTO dto = monHocMapper.toDo(monHoc);
        return dto;
    }

    public List<SVDiemInfo> sinhVienInfoList(Long id){
        List<SVDiemInfo> sinhVienInfos = svDiemRepository.findDiemByMonhoc(id);
        return sinhVienInfos;
    }

    public List<MonHocInfo> diemTB(Long id){
        List<MonHocInfo> monHocInfos = diemTBRepository.DiemTB(id);
        return monHocInfos;
    }
    public MonHocDTO findById(String id) {
        Optional<MonHoc> optionalMonHoc = monHocRepository.findById(id);
        if (optionalMonHoc.isPresent()) {
            MonHocDTO dto = monHocMapper.toDo(optionalMonHoc.get());
            return dto;

        }
        return null;
    }

//    @Transactional(readOnly = true)
//    public List<MonHocDTO> findBySoTiet(Integer soTiet) {
//        List<MonHoc> monHocs = monHocRepository.findBySoTiet(soTiet);
//        return monHocMapper.toDo(monHocs);
//    }

    @Transactional
    public void create(MonHocDTO monHocDTO) {
        MonHoc monHoc = monHocMapper.toEntity(monHocDTO);
        monHocRepository.save(monHoc);
    }

    @Transactional
    public void update(int id, MonHocDTO monHocDTO) {
        MonHoc monHoc = monHocMapper.toEntity(monHocDTO);
        monHoc.setId(id);
        monHocRepository.save(monHoc);
    }

    @Transactional
    public void delete(String name) {
        monHocRepository.deleteById(String.valueOf(name));
    }
}
