package com.example.Lesson4.web.res;

import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.service.SinhVienService;
import com.example.Lesson4.service.dto.KhoaDTO;
import com.example.Lesson4.service.dto.SinhVienDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sinhviens")
@RequiredArgsConstructor
public class SinhVienResources {

    private  final SinhVienService sinhVienService;

    @GetMapping("")
    public List<SinhVienInfo> getSinhVienInfoList() {
        Long id=1l;
        return sinhVienService.sinhVienInfoList(id);
    }
}
