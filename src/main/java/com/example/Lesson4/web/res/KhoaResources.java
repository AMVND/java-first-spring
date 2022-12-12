package com.example.Lesson4.web.res;


import com.example.Lesson4.service.KhoaService;
import com.example.Lesson4.service.dto.KhoaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khoas")
@RequiredArgsConstructor

public class KhoaResources {
    private final KhoaService khoaService;

    @GetMapping("")
    KhoaDTO findByName(@RequestParam("name") String name) {
        KhoaDTO dto = khoaService.findByName(name);
        return dto;
    }

    @GetMapping("/{id}")
    KhoaDTO findById(@PathVariable("id") String id) {
        KhoaDTO dto = khoaService.findById(id);
        return dto;
    }


    @PostMapping("/create")
    public void create(@RequestBody KhoaDTO khoaDTO) {
        khoaService.create(khoaDTO);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody KhoaDTO khoaDTO, @PathVariable String id) {
        khoaService.update(id, khoaDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id ) {
        khoaService.delete(id);
    }


}
