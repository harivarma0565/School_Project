package com.example.schools.Mappers;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.example.schools.DTO.FacultyDetailsDTO;
import com.example.schools.Utils.MasterMapper;
import com.example.schools.VO.FacultyDetailsVO;

@Component
public class FacultyDetailsMapper extends MasterMapper<FacultyDetailsVO, FacultyDetailsDTO> {

	@Override
	public FacultyDetailsVO convertEntity(FacultyDetailsDTO dto) {
		FacultyDetailsVO vo = new FacultyDetailsVO();

		funPoint(dto.getFacultyId(), vo::setFacultyId);
		funPoint(dto.getFacultyName(), vo::setFacultyName);
		funPoint(dto.getContactNo(), vo::setContactNo);
		funPoint(dto.getQualification(), vo::setQualification);
		funPoint(dto.getDesignation(), vo::setDesignation);
		funPoint(dto.getDealingSubjects(), vo::setDealingSubjects);
		return vo;
	}

	@Override
	public FacultyDetailsDTO convertVO(FacultyDetailsVO vo) {
		FacultyDetailsDTO dto = new FacultyDetailsDTO();
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(this.facultyNumberGeneration(vo.getUserId()), dto::setFacultyId);	
		funPoint(vo.getFacultyName(), dto::setFacultyName);
		funPoint(vo.getContactNo(), dto::setContactNo);
		funPoint(vo.getQualification(), dto::setQualification);
		funPoint(vo.getDesignation(), dto::setDesignation);
		funPoint(vo.getDealingSubjects(), dto::setDealingSubjects);
		return dto;
	}

	//Faculty No Generation
	public String facultyNumberGeneration(String userId) {
		Integer year = LocalDate.now().getYear();
		String facultyId = userId.substring(0, 3) + year.toString();
		return facultyId;
	}

}
