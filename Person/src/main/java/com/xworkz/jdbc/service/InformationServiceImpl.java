package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.InformationDto;
import com.xworkz.jdbc.repo.InformationRepoImpl;


public class InformationServiceImpl implements InformationService {

	@Override
	public boolean save(InformationDto dto) {
		boolean isValid=true;
		System.out.println("name==="+dto.getName());
		System.out.println("email=="+dto.getEmail());
		System.out.println("phone_number=="+dto.getPhone_number());
		System.out.println("address=="+dto.getAddress());
		
		if(isValid) {
			InformationRepoImpl impl=new InformationRepoImpl();
			impl.update(dto);
			
		}
		return false;
	}
}