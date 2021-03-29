package com.example.schools.Mappers;

import org.springframework.stereotype.Component;

import com.example.schools.DTO.ContactDetailsDTO;
import com.example.schools.Utils.MasterMapper;
import com.example.schools.VO.ContactDetailsVO;

@Component
public class ContactDetailsMapper extends MasterMapper<ContactDetailsVO, ContactDetailsDTO> {

	@Override
	public ContactDetailsVO convertEntity(ContactDetailsDTO dto) {
		ContactDetailsVO vo = new ContactDetailsVO();

		funPoint(dto.getMobileNo(), vo::setMobileNo);
		funPoint(dto.getAlternateMobileNo(), vo::setAlternateMobileNo);
		funPoint(dto.getEmailId(), vo::setEmailId);
		funPoint(dto.getFacebookId(), vo::setFacebookId);
		funPoint(dto.getWebsiteName(), vo::setWebsiteName);
		return vo;
	}

	@Override
	public ContactDetailsDTO convertVO(ContactDetailsVO vo) {
		ContactDetailsDTO dto = new ContactDetailsDTO();

		funPoint(vo.getMobileNo(), dto::setMobileNo);
		funPoint(vo.getAlternateMobileNo(), dto::setAlternateMobileNo);
		funPoint(vo.getEmailId(), dto::setEmailId);
		funPoint(vo.getFacebookId(), dto::setFacebookId);
		funPoint(vo.getWebsiteName(), dto::setWebsiteName);
		return dto;
	}

}
