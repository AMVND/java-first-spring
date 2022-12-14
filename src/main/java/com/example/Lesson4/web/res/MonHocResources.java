package com.example.Lesson4.web.res;

import com.example.Lesson4.projection.MonHocInfo;
import com.example.Lesson4.projection.SVDiemInfo;
import com.example.Lesson4.projection.SinhVienInfo;
import com.example.Lesson4.service.KhoaService;
import com.example.Lesson4.service.MonHocService;
import com.example.Lesson4.service.dto.KhoaDTO;
import com.example.Lesson4.service.dto.MonHocDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monhocs")
@RequiredArgsConstructor
public class MonHocResources {
    private final MonHocService monHocService;


    @GetMapping("")
    MonHocDTO findByName(@RequestParam("name") String name) {
        MonHocDTO dto = monHocService.findByName(name);
        return dto;
    }

    @GetMapping("/ketqua")
    public List<SVDiemInfo> getSinhVienInfoList(@RequestParam("id") Long id) {

        return monHocService.sinhVienInfoList(id);
    }


    @GetMapping("/diemtb")
    public List<MonHocInfo> getDiemTB(@RequestParam("id") Long id) {

        return monHocService.diemTB(id);
    }

    @GetMapping("/{id}")
    MonHocDTO findById(@PathVariable("id") String id) {
        MonHocDTO dto = monHocService.findById(id);
        return dto;
    }

//    @GetMapping("")
//    public List<MonHocDTO> findBySoTiet(@RequestParam("soTiet") Integer soTiet) {
//        return monHocService.findBySoTiet(soTiet);
//    }

    @PostMapping("/create")
    public void create(@RequestBody MonHocDTO monHocDTO) {
        monHocService.create(monHocDTO);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody MonHocDTO monHocDTO, @PathVariable int id) {
        monHocService.update(id, monHocDTO);
    }

    @DeleteMapping("/{name}")
    public void delete(@RequestParam("name") String name ) {
        monHocService.delete(name);
    }



}
