package com.example.Lesson4.service.mapper;

import com.example.Lesson4.domain.Khoa;
import com.example.Lesson4.service.dto.KhoaDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KhoaMapper implements EntityMapper<KhoaDTO,Khoa>{

    @Override
    public KhoaDTO toDo(Khoa khoa) {
        KhoaDTO dto = new KhoaDTO();
        dto.setId(khoa.getId());
        dto.setTenKh(khoa.getTenKh());
        return dto;
    }

    @Override
    public Khoa toEntity(KhoaDTO khoaDTO) {
        Khoa khoa = new Khoa();
        khoa.setId(khoaDTO.getId());
        khoa.setTenKh(khoaDTO.getTenKh());
        return khoa;
    }

    @Override
    public List<KhoaDTO> toDo(List<Khoa> e) {
        return null;
    }

    @Override
    public List<Khoa> toEntity(List<KhoaDTO> d) {
        return null;
    }
}
