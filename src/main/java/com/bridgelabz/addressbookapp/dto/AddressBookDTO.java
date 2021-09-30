package com.bridgelabz.addressbookapp.dto;

import java.util.List;

import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;
public @ToString class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;
	public String address;
	public long phonenumber; 	
	public List<String> relations;
}
