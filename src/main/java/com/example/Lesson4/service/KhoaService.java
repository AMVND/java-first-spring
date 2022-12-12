package com.example.Lesson4.service;

import com.example.Lesson4.domain.Khoa;
import com.example.Lesson4.respository.KhoaRepository;
import com.example.Lesson4.service.dto.KhoaDTO;
import com.example.Lesson4.service.mapper.KhoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class KhoaService {
    private final KhoaRepository khoaRepository;

    private  final KhoaMapper khoaMapper;

    public KhoaDTO findByName(String name){
        Khoa khoa = khoaRepository.findByName(name);
        KhoaDTO dto = khoaMapper.toDo(khoa);
        return dto;
    }

    public KhoaDTO findById(String id){
        Optional<Khoa> optionalKhoa = khoaRepository.findById(id);
        if (optionalKhoa.isPresent()){
            KhoaDTO dto = khoaMapper.toDo(optionalKhoa.get());
            return dto;

        }
        return null;
    }
    @Transactional
    public void create(KhoaDTO khoaDTO) {
        Khoa khoa = khoaMapper.toEntity(khoaDTO);
        khoaRepository.save(khoa);
    }
    @Transactional
    public void update(String id, KhoaDTO khoaDTO) {
        Khoa khoa = khoaMapper.toEntity(khoaDTO);
        khoaRepository.save(khoa);
    }
    @Transactional
    public void delete(String id) {
        khoaRepository.deleteById(id);
    }
}