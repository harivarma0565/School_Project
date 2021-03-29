package com.example.schools.Mappers;

import org.springframework.stereotype.Component;

import com.example.schools.DTO.BusDetailsDTO;
import com.example.schools.Utils.MasterMapper;
import com.example.schools.VO.BusDetailsVO;

@Component
public class BusDetailsMapper extends MasterMapper<BusDetailsVO, BusDetailsDTO>{

	@Override
	public BusDetailsVO convertEntity(BusDetailsDTO dto) {
		BusDetailsVO vo = new BusDetailsVO();
		
		funPoint(dto.getVehicleNo(), vo::setVehicleNo);
		funPoint(dto.getDriverName(), vo::setDriverName);
		funPoint(dto.getDriverDLNo(), vo::setDriverDLNo);
		funPoint(dto.getDriverContactNo(), vo::setDriverContactNo);
		funPoint(dto.getFromRoute(), vo::setFromRoute);
		funPoint(dto.getToRoute(), vo::setToRoute);
		return null;
	}

	@Override
	public BusDetailsDTO convertVO(BusDetailsVO vo) {
		BusDetailsDTO dto = new BusDetailsDTO();
		
		funPoint(vo.getVehicleNo(), dto::setVehicleNo);
		funPoint(vo.getDriverName(), dto::setDriverName);
		funPoint(vo.getDriverDLNo(), dto::setDriverDLNo);
		funPoint(vo.getDriverContactNo(), dto::setDriverContactNo);
		funPoint(vo.getFromRoute(), dto::setFromRoute);
		funPoint(vo.getToRoute(), dto::setToRoute);
		return dto;
	}

}
