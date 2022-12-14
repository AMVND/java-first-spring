package com.example.Lesson4.web.res;

import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.service.SinhVienService;
import com.example.Lesson4.service.dto.KhoaDTO;
import com.example.Lesson4.service.dto.MonHocDTO;
import com.example.Lesson4.service.dto.SinhVienDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sinhviens")
@RequiredArgsConstructor
public class SinhVienResources {

    private  final SinhVienService sinhVienService;

    @GetMapping("")
    public List<SinhVienInfo> getSinhVienInfoList(@RequestParam("id") String id) {
        return sinhVienService.sinhVienInfoList(id);
    }



//    @PostMapping("/create")
//    public void create(@RequestBody SinhVienDTO sinhVienDTO) {
//        sinhVienService.create(sinhVienDTO);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@RequestBody SinhVienDTO sinhVienDTO, @PathVariable String id) {
//        sinhVienService.update(id, sinhVienDTO);
//    }

    @DeleteMapping("/{name}")
    public void delete(@RequestParam("name") String name ) {
        sinhVienService.delete(name);
    }

}
