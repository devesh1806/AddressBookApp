package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
	
	@Autowired
	private AddressBookRepository addressbookrepository;
	
	List<AddressBookData> addressBookDataList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAll() {
		return addressbookrepository.findAll();
	}

	@Override
	public AddressBookData getById(int contactid) {
		return addressBookDataList.stream().filter(contactData->contactData.getContactid()== contactid)
				.findFirst()
				.orElseThrow(()->new AddressBookException("contact not found"));
	}

	@Override
	public AddressBookData addData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = new AddressBookData(addressBookDTO);
		addressBookDataList.add(addressBookData);
		log.debug(addressBookData.toString()); 
		return addressbookrepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateData(int contactid, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = addressBookDataList.get(contactid-1);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setPhonenumber(addressBookDTO.phonenumber);
		addressBookDataList.set(contactid-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteData(int contactid) {
		addressBookDataList.remove(contactid-1);
	}
	
}
