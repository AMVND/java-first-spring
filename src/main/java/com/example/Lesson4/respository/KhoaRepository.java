package com.example.Lesson4.respository;

import com.example.Lesson4.domain.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa, String> {

//    @Query(value = "select k from Khoa k where k.tenKh =:name ")
    @Query(value = "select k from Khoa k where k.tenKh like concat('%',:name,'%') ")
    Khoa findByName(@Param("name") String name);

//    @Query(value = "select k from Khoa k where k.id =:id ")
//    Optional<Khoa> findById(@Param("id") String id);

}