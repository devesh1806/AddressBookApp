package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAll();
	AddressBookData getById(int contactid);
	AddressBookData addData(AddressBookDTO addressBookDTO);
	AddressBookData updateData(int contactid, AddressBookDTO addressBookDTO);
	void deleteData(int contactid);

}
