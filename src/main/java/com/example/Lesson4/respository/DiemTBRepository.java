package com.example.Lesson4.respository;

import com.example.Lesson4.domain.KetQua;
import com.example.Lesson4.domain.SinhVien;
import com.example.Lesson4.projection.MonHocInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiemTBRepository extends JpaRepository<KetQua, String> {

    @Query(value = "select avg(kq.diem) as DiemTB " +
            "from ket_qua kq " +
            "where kq.ma_mh=:id", nativeQuery = true)
    List<MonHocInfo> DiemTB(@Param("id") Long id);
}
