package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.CompanyDto;
import com.xworkz.jdbc.repo.CompanyRepoImpl;

public class CompanyServiceimpl implements CompanyService {

	@Override
	public boolean validate(CompanyDto dto) {

		CompanyRepoImpl impl = new CompanyRepoImpl();
		impl.save(dto);
		return true;
	}

	@Override
	public String getListById(int id) {
		CompanyRepoImpl repo = new CompanyRepoImpl();
		return repo.getListById(id);
	}

	@Override
	public String getEMailAndPassword(long phoneNumber) {
		CompanyRepoImpl repo = new CompanyRepoImpl();
		return repo.getEMailAndPassword(phoneNumber);
	}

	@Override
	public String checkEmailPassword(String email, String password) {
		String valid = null;

		CompanyRepoImpl companyRepoImpl = new CompanyRepoImpl();
		String res = companyRepoImpl.checkEmailPassword(email, password);

		return res;

	}

	@Override
	public String deleteByName(String name) {
		CompanyRepoImpl companyRepoImpl = new CompanyRepoImpl();
		String res = companyRepoImpl.deleteByName(name);
		return res;
	}

	@Override
	public String updatedByEmail(String name,String address,String email) {
		String valid=null;
		CompanyRepoImpl companyRepoImpl = new CompanyRepoImpl();
	       String res = companyRepoImpl.updatedByEmail(name,address,email);
		return valid;
	
	
	}
}
