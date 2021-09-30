package com.bridgelabz.addressbookapp.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;
public @Data class AddressBookData {
	
	private Integer contactid;
	private String name;
	private String address;
	private long phonenumber;
	
	@ElementCollection
	@CollectionTable(name="addressbook_relation",joinColumns=@JoinColumn(name="id"))
	@Column(name="relations")
	private List<String> relations;

	public AddressBookData(int contactid,AddressBookDTO addressbookdto) {
		super();
		this.contactid = contactid;
		this.name=addressbookdto.name;
		this.phonenumber=addressbookdto.phonenumber;
		this.address=addressbookdto.address;
		this.relations=addressbookdto.relations;
	}
}
