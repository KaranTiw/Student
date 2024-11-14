package com.in.repository;

import com.in.entity.StudentInf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfRepository extends JpaRepository<StudentInf, Long> {
}