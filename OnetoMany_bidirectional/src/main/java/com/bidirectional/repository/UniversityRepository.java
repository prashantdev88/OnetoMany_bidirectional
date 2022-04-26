package com.bidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bidirectional.entitiy.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long>{

}
