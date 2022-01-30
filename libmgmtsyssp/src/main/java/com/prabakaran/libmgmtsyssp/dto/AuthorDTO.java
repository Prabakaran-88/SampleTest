package com.prabakaran.libmgmtsyssp.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private Integer contact;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	
	
	
	
	

}
