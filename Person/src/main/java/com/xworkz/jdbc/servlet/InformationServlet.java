package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.dto.InformationDto;
import com.xworkz.jdbc.service.InformationServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class InformationServlet extends HttpServlet {

	public InformationServlet() {
		System.out.println("no arg const in InformationServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNumber = req.getParameter("contactNumber");
		String address = req.getParameter("address");

		long phone_number = Long.parseLong(phoneNumber);
		System.out.println(name + email + phoneNumber + address);

		InformationDto dto = new InformationDto(name, email, phone_number, address);

		InformationServiceImpl service = new InformationServiceImpl();
		service.save(dto);
		
	}
}
