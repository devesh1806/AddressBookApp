package com.bridgelabz.addressbookapp.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="contacts")
public @Data class AddressBookData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private Integer contactid;
	private String name;
	private String address;
	private String phonenumber;
	
	@ElementCollection
	@CollectionTable(name="addressbook_relation",joinColumns=@JoinColumn(name="id"))
	@Column(name="relations")
	private List<String> relations;

	public AddressBookData(AddressBookDTO addressbookdto) {
		this.updateAddressBookData(addressbookdto);
	}

	public  void updateAddressBookData(AddressBookDTO addressbookdto) {		
		this.name=addressbookdto.getName();
		this.phonenumber=addressbookdto.getPhonenumber();
		this.address=addressbookdto.getAddress();
		this.relations=addressbookdto.getRelations();
	}
}
