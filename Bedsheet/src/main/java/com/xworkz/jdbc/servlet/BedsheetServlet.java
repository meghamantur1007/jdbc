package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.dto.BedsheetDto;
import com.xworkz.jdbc.service.BedsheetServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class BedsheetServlet extends HttpServlet {

	public BedsheetServlet() {
		System.out.println("no arg const in BedsheetServlet");

	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String companyName=req.getParameter("companyName");
		String material=req.getParameter("material");
		String color=req.getParameter("color");
		String size=req.getParameter("size");		
		
		System.out.println(companyName);
		System.out.println(material);
		System.out.println(color);
		System.out.println(size);
		
		BedsheetDto dto=new BedsheetDto(companyName, material, color, size);
		
		BedsheetServiceImpl service=new BedsheetServiceImpl();
		service.save(dto);

		

	}

}
