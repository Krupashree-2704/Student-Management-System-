package com.jsp.sms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.jsp.sms.controller.Controller;
import com.jsp.sms.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/readadmin")
public class ReadStudent extends HttpServlet{
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int student_id = Integer.parseInt(req.getParameter("stuid"));
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		List<Student> serachStudent = controller.serachStudent();
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1>"+username+"</h1>");
		writer.print("<h1>"+password+"</h1>");
		writer.print("</body></html>");
		for (Student student : serachStudent) {
			if ((student.getStudent_username().equals(username))&&(student.getStudent_password().equals(password))) {
				writer.print("<html><body>");
				writer.print("<p>Student ID:"+student.getId()+"</p>");
				writer.print("<p>Student Name:"+student.getStudent_name()+"</p>");
				writer.print("<p>Student Email:"+student.getStudent_email()+"</p>");
				boolean student_gender = student.isStudent_gender();
				if (student_gender==true) {
					writer.print("<p>Student Gender:Female</p>");
				} else {
					writer.print("<p>Student Gender:Male</p>");
				}
				int student_id = student.getId();
				writer.print("<p>Student Address:"+student.getStudent_address()+"</p>");
				writer.print("<p>Student Branch:"+student.getStudent_branch()+"</p>");
				writer.print("<p>Student Username:"+student.getStudent_username()+"</p>");
				writer.print("<form action=\"updatestudent\" id=\"login_Form\" method=\"post\">");
				writer.print("<select name=\"updateStudent\">");
				writer.print("<option selected disabled hidden>Default</option>");
				writer.print(" <option>Update</option> ");
				writer.print(" <input type=\"hidden\" id=\"studtId\" name=\"studtId\" value="+student_id+">");
				writer.print("<input type=\"submit\" value=\"Update\">");
				writer.print("</form>");
				writer.print("</body></html>");
//				req.setAttribute("studentid", student_id);
//				RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateStudent.html");
//				requestDispatcher.forward(req, resp);
				
			}
		}
		
	}
}
