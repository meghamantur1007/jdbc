package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.dto.CompanyDto;
import com.xworkz.jdbc.service.CompanyServiceimpl;

@WebServlet(loadOnStartup = 1, urlPatterns = {"/send"})
public class CompanyServlet extends HttpServlet {

	public CompanyServlet() {
		System.out.println("no arg const in CompanyServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String phoneNumber = req.getParameter("phone_number");
		String industryType = req.getParameter("industry_type");
		
		System.out.println("id=="+id);
		System.out.println("name=="+name);
		System.out.println("email=="+email);
		System.out.println("password=="+password);
		System.out.println("address=="+address);
		System.out.println("phoneNumber=="+phoneNumber);
		System.out.println("industryType=="+industryType);
		
		int companyId=Integer.valueOf(id);
		long phone_number=Long.parseLong(phoneNumber);
		
		CompanyDto dto=new CompanyDto(companyId, name, email, password, address, phone_number, industryType);
		
		CompanyServiceimpl service=new CompanyServiceimpl();
		boolean valid=service.validate(dto);
		if (valid) {
		    req.setAttribute("success", "Data storing is successful!");
		} else {
		    req.setAttribute("failure", "Data storing was not successful.");
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(req, resp);	
		
		
		

	}
}
