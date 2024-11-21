package com.xworkz.jdbc.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.InformationConstant;
import com.xworkz.jdbc.dto.InformationDto;

public class InformationRepoImpl implements InformationRepo{
		
		@Override
		public boolean update(InformationDto dto) {
			boolean saved=false;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}	
			
			
			try (Connection connection = DriverManager.getConnection(InformationConstant.URL.getValue(),
				InformationConstant.USERNAME.getValue(), InformationConstant.PASSWORD.getValue())) {

			PreparedStatement prst = connection.prepareStatement("insert into info_table values(?,?,?,?)");

			prst.setString(1, dto.getName());
			prst.setString(2, dto.getEmail());
			prst.setLong(3, dto.getPhone_number());
			prst.setString(4, dto.getAddress());
			
			int value=prst.executeUpdate();
			if(value>0) {
				System.out.println("saved");
				saved=true;
			}
			else {
				System.out.println("not saved");
				saved=false;
				
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}	
		return saved;

		

	}

	
}
