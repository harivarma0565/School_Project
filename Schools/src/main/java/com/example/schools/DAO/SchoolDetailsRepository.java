package com.example.schools.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schools.DTO.SchoolDetailsDTO;

@Repository
public interface SchoolDetailsRepository extends JpaRepository<SchoolDetailsDTO, Long> {

	
}
