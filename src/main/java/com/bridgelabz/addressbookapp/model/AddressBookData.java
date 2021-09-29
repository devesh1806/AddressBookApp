package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;
public @Data class AddressBookData {
	
	private Integer contactid;
	private String name;
	private String address;
	private long phonenumber;
	
	public AddressBookData(Integer contactid,AddressBookDTO addressBookDTO) {
		this.contactid = contactid;
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
		this.phonenumber = addressBookDTO.getPhonenumber();
	}
		
	
}
