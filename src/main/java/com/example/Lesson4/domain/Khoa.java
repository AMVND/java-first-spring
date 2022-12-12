package com.example.Lesson4.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "khoa")
public class Khoa {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_kh", nullable = false, length = 10)
    private String id;

    @Column(name = "ten_kh", nullable = false, length = 50)
    private String tenKh;


}