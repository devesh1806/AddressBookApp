package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{
	
	List<AddressBookData> addressBookDataList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAll() {
		return addressBookDataList;
	}

	@Override
	public AddressBookData getById(int contactid) {
		return addressBookDataList.get(contactid-1);
	}

	@Override
	public AddressBookData addData(AddressBookDTO addressBookDTO) {
		int id = addressBookDataList.size()+1;
		AddressBookData addressBookData = new AddressBookData(id, addressBookDTO);
		
		return addressBookData;
	}

	@Override
	public AddressBookData updateData(int contactid, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = addressBookDataList.get(contactid-1);
		addressBookData.setAddress(addressBookDTO.getAddress());
		addressBookData.setName(addressBookDTO.getName());
		addressBookData.setPhonenumber(addressBookDTO.getPhonenumber());
		addressBookDataList.set(contactid-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteData(int contactid) {
		addressBookDataList.remove(contactid-1);
	}
	
}
