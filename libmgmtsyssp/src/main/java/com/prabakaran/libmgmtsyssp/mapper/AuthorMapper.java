package com.prabakaran.libmgmtsyssp.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.prabakaran.libmgmtsyssp.dto.AuthorDTO;
import com.prabakaran.libmgmtsyssp.entities.Author;

@Component
public class AuthorMapper implements Converter<AuthorDTO,Author> {

	@Override
	public Author convert(AuthorDTO source) {
		Author dest = new Author();
		dest.setContact(source.getContact());
		dest.setName(source.getName());
		return dest;
		
		
	}
	
	

}
