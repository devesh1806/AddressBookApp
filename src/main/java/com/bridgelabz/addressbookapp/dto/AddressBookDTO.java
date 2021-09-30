package com.bridgelabz.addressbookapp.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
public @ToString class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;
	@NotNull(message="address cannot be empty")
	public String address;
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Phone No Invalid")
	public long phonenumber;
	@NotNull(message="relations cannot be empty")
	public List<String> relations;
}
