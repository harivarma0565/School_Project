package com.example.schools.Mappers;

import org.springframework.stereotype.Component;

import com.example.schools.DTO.AddressDetailsDTO;
import com.example.schools.Utils.MasterMapper;
import com.example.schools.VO.AddressDetailsVO;

@Component
public class AddressDetailsMapper extends MasterMapper<AddressDetailsVO, AddressDetailsDTO> {

	@Override
	public AddressDetailsVO convertEntity(AddressDetailsDTO dto) {
		AddressDetailsVO vo = new AddressDetailsVO();

		funPoint(dto.getStreetName(), vo::setStreetName);
		funPoint(dto.getArea(), vo::setArea);
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getMandalName(), vo::setMandalName);
		funPoint(dto.getDistrictName(), vo::setDistrictName);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getPinCode(), vo::setPinCode);
		return vo;
	}

	@Override
	public AddressDetailsDTO convertVO(AddressDetailsVO vo) {
		AddressDetailsDTO dto = new AddressDetailsDTO();
		
		funPoint(vo.getStreetName(), dto::setStreetName);
		funPoint(vo.getArea(), dto::setArea);
		funPoint(vo.getCity(), dto::setCity);
		funPoint(vo.getMandalName(), dto::setMandalName);
		funPoint(vo.getDistrictName(), dto::setDistrictName);
		funPoint(vo.getState(), dto::setState);
		funPoint(vo.getPinCode(), dto::setPinCode);
		return dto;
	}

}
