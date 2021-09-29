package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	private String name;
	private String address;
	private long phonenumber; 

	public AddressBookDTO(String name, String address, long phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
		
	
}
