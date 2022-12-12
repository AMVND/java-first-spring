package com.example.Lesson4.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ket_qua")
public class KetQua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ma_sv", nullable = false)
    private SinhVien maSv;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ma_mh", nullable = false)
    private MonHoc maMh;

    @Column(name = "diem")
    private Float diem;

}