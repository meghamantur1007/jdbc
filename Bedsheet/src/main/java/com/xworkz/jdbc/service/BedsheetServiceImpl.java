package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.BedsheetDto;
import com.xworkz.jdbc.repo.BedsheetRepoImpl;

public class BedsheetServiceImpl implements BedsheetService{

	@Override
	public boolean save(BedsheetDto dto) {
		
		boolean isValid=true;
		System.out.println("company name==="+dto.getCompanyName());
		System.out.println("material=="+dto.getMaterial());
		System.out.println("color=="+dto.getColor());
		System.out.println("size=="+dto.getSize());
		
		if(isValid) {
		BedsheetRepoImpl impl=new BedsheetRepoImpl();
		impl.update(dto);
			
		}
		
		return false;
	}

}
