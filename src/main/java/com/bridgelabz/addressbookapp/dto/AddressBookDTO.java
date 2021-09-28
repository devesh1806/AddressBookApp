package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
	
	private String name;
	private String address;
	private long phonenumber; 

	public AddressBookDTO(String name, String address, long phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
