package com.jsp.Argo_boot_4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Argo_boot_4.entity.Address;
import com.jsp.Argo_boot_4.entity.Post;
import com.jsp.Argo_boot_4.entity.User;
import com.jsp.Argo_boot_4.repo.AddressRepo;
import com.jsp.Argo_boot_4.repo.PostRepo;
@Repository
public class AddressDao {
	@Autowired
	AddressRepo repo;
	public Address updateAddress(Address address) {
		return repo.save(address);
	}
}
