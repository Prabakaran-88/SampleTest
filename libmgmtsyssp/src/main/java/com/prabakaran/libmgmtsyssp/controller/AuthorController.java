package com.prabakaran.libmgmtsyssp.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prabakaran.libmgmtsyssp.entities.Author;
import com.prabakaran.libmgmtsyssp.mapper.AuthorDTOMapper;
import com.prabakaran.libmgmtsyssp.mapper.AuthorMapper;
import com.prabakaran.libmgmtsyssp.util.HibernateUtil;
import com.prabakaran.libmgmtsyssp.dto.AuthorDTO;

@RestController
@RequestMapping(path = "/v1")
public class AuthorController {
	
	@Autowired
	private AuthorMapper authMapper;
	
	@Autowired
	private AuthorDTOMapper authDTOMapper;
	
	
	@PostMapping("/authors")
	public ResponseEntity<String> addAuthor(@RequestBody AuthorDTO authDTO)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	  Author au =  authMapper.convert(authDTO);
	    System.out.println(au);
	    //Save the employee in database
	    session.save(au);

	    //Commit the transaction
	    session.getTransaction().commit();
	    session.close();
	    return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/authors")
	public ResponseEntity<List<AuthorDTO>> getGreetings(@RequestParam String name)
	{
		
		
		
	    Session session = HibernateUtil.getSessionFactory().openSession();

	   
		
		 Query query = session.createQuery("from Author");
	      
		 List<AuthorDTO> listAuthors = (List<AuthorDTO>) query.list().stream().
				 map(auth -> authDTOMapper.convert((Author) auth)).collect(Collectors.toList());
		 session.close();
		
		return new ResponseEntity<>(listAuthors,HttpStatus.OK);
	}
}
