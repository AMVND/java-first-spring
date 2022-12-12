package com.example.Lesson4.service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SinhVienDTO {
    private String id;
    private String hoSv;
    private String tenSv;
    private Boolean phai = false;
    private LocalDate ngaySinh;
    private String noiSinh;
    private KhoaDTO maKh;
}
