package com.bridgelabz.addressbookapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
	@Query(value="select * from contacts,addressbook_relation where contact_id=id and relations= :relation",nativeQuery=true)
	List<AddressBookData> findcontactByRelation(String relation);
}