package com.example.Lesson4.respository;

import com.example.Lesson4.domain.SinhVien;
import com.example.Lesson4.projection.SVDiemInfo;
import com.example.Lesson4.projection.SinhVienInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SVDiemRepository extends JpaRepository<SinhVien, String> {

    @Query(value = "select concat_ws(' ',sv.ho_sv,sv.ten_sv) as hoTen, " +
            "       kq.diem as diem " +
            "from sinh_vien sv " +
            "         inner join ket_qua kq on sv.ma_sv = kq. ma_sv " +
            "         inner join mon_hoc mh on kq.ma_mh = mh.ma_mh " +
            "where kq.ma_mh=:id", nativeQuery = true )
    List<SVDiemInfo> findDiemByMonhoc(@Param("id") Long id);
}
