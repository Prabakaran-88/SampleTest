package com.prabakaran.libmgmtsyssp.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.prabakaran.libmgmtsyssp.dto.AuthorDTO;
import com.prabakaran.libmgmtsyssp.entities.Author;

@Component
public class AuthorDTOMapper implements Converter<Author, AuthorDTO>{

	@Override
	public AuthorDTO convert(Author source) {
		AuthorDTO dest = new AuthorDTO();
		dest.setContact(source.getContact());
		dest.setName(source.getName());
		dest.setId(source.getId());
		return dest;
	}

}
