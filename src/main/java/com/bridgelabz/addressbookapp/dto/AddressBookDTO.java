package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

public @Data class AddressBookDTO {
	
	private String name;
	private String address;
	private long phonenumber; 

	public AddressBookDTO(String name, String address, long phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
		
	
}
