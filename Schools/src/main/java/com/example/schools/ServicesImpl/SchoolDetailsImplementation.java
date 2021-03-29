package com.example.schools.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schools.DAO.SchoolDetailsRepository;
import com.example.schools.DTO.SchoolDetailsDTO;
import com.example.schools.Services.SchoolDetailsService;
import com.example.schools.VO.SchoolDetailsVO;

@Service
public class SchoolDetailsImplementation implements SchoolDetailsService{
	
	@Autowired
	SchoolDetailsRepository dao;

	@Override
	public String saveData(SchoolDetailsVO vo) {
		SchoolDetailsDTO dto = new SchoolDetailsDTO();
		
		dao.save(dto);
	return  "Saved Succesful";
	}

}
