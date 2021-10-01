package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressbook")
@Slf4j
public class AddressBookRestController {
	
	@Autowired
	public IAddressBookService addressBookService;
	
	@GetMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBook() {
		List<AddressBookData> addressBookData = addressBookService.getAll();
		ResponseDTO resp = new ResponseDTO("Get call success", addressBookData);
		return new ResponseEntity<ResponseDTO>(resp,HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactid}")
	public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable int contactid){
		AddressBookData addressBookData = addressBookService.getById(contactid);
		ResponseDTO resp = new ResponseDTO("Get call success", addressBookData);
		return new ResponseEntity<ResponseDTO>(resp,HttpStatus.OK);
	}
	@GetMapping("/relation/{realtion}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("relation") String relation)
	{
		List<AddressBookData> contactList=null;
		contactList=addressBookService.getContactByRelation(relation);
		ResponseDTO respDTO=new ResponseDTO("Get call for ID SucessFul",contactList);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBook(@Valid @RequestBody AddressBookDTO addressBookDTO){
		log.debug("AdressBook DTO: "+addressBookDTO.toString());
		AddressBookData addressBookData = addressBookService.addData(addressBookDTO);
		ResponseDTO resp = new ResponseDTO("Add call success", addressBookData);
		return new ResponseEntity<ResponseDTO>(resp,HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactid}")
	public ResponseEntity<ResponseDTO> updateAddressBook(@PathVariable int contactid,@Valid @RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = addressBookService.updateData(contactid,addressBookDTO);
		ResponseDTO resp = new ResponseDTO("Update success", addressBookData);
		return new ResponseEntity<ResponseDTO>(resp,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactid}")
	public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable int contactid){
		addressBookService.deleteData(contactid);
		ResponseDTO resp = new ResponseDTO("Delete success", contactid);
		return new ResponseEntity<ResponseDTO>(resp,HttpStatus.OK);
	}
	
}
