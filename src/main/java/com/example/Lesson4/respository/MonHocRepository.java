package com.example.Lesson4.respository;

import com.example.Lesson4.domain.Khoa;
import com.example.Lesson4.domain.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, String> {

    @Query(value = "select m from MonHoc m where m.tenMh like concat('%',:name,'%') ")
    MonHoc findByName(@Param("name") String name);

//    @Query(value = "select mh from MonHoc mh where mh.soTiet >=:soTiet")
//    List<MonHoc> findBySoTiet(@Param("soTiet") Integer soTiet);
}
