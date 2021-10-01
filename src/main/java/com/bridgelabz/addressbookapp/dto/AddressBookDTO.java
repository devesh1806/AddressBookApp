package com.bridgelabz.addressbookapp.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
public @Data class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	private String name;
	@NotNull(message="address cannot be empty")
	private String address;
	@Pattern(regexp="[0-9]{10,}",message="Phone No Invalid")
	private String phonenumber;
	@NotNull(message="relations cannot be empty")
	private List<String> relations;
}
