package com.example.Lesson4.service.mapper;

import com.example.Lesson4.domain.MonHoc;
import com.example.Lesson4.service.dto.MonHocDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MonHocMapper implements EntityMapper<MonHocDTO,MonHoc>{
    @Override
    public MonHocDTO toDo(MonHoc monHoc) {
        MonHocDTO dto = new MonHocDTO();
        dto.setId(monHoc.getId());
        dto.setTenMh(monHoc.getTenMh());
        dto.setSoTiet(monHoc.getSoTiet());
        return dto;
    }

    @Override
    public MonHoc toEntity(MonHocDTO monHocDTO) {
        MonHoc monHoc = new MonHoc();
        monHoc.setId(monHocDTO.getId());
        monHoc.setTenMh(monHocDTO.getTenMh());
        monHoc.setSoTiet(monHocDTO.getSoTiet());
        return monHoc;
    }

    @Override
    public List<MonHocDTO> toDo(List<MonHoc> e) {
        List<MonHocDTO> dtos = new ArrayList<>();
        e.forEach(monHoc -> {
            dtos.add(toDo(monHoc));
        });
        return dtos;
    }

    @Override
    public List toEntity(List d) {
        return null;
    }
}
