package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	
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

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
