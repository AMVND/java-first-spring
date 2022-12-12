package com.example.Lesson4.service;

import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.respository.SinhVienRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SinhVienService {
    private final SinhVienRepository sinhVienRepository;

   public List<SinhVienInfo> sinhVienInfoList(Long id){
       List<SinhVienInfo> sinhVienInfos = sinhVienRepository.findDiemByMonhoc(id);
       return sinhVienInfos;
   }
}
