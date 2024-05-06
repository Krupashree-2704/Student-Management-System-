package com.jsp.sms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.sms.controller.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/updatestudent")
public class UpdateStudent extends HttpServlet{

	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
		int studentID = Integer.parseInt(req.getParameter("studtId"));
		System.out.println(studentID);
		req.setAttribute("studentID", studentID);
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<form action=\"updatefinalresult\" id=\"login_Form\" method=\"post\">");
		writer.print("<select name=\"updateselector\">");
		writer.print("<option selected disabled hidden>Default</option>");
		writer.print(" <option>Name</option> ");
		writer.print(" <option>Email</option> ");
		writer.print(" <option>Address</option> ");
		writer.print(" <option>Branch</option> ");
		writer.print(" <option>Contact</option> ");
		writer.print(" <option>Username</option> ");
		writer.print(" <option>Password</option> ");
		writer.print("<input type=\"text\" name=\"updatetext\">");
		writer.print("  <input type=\"submit\" value=\"Update\">");
		writer.print("</form>");
		writer.print("</body></html>");
//		String studentid = req.getParameter("updateidtext");
//		int student_id=Integer.parseInt(studentid);
		String updatedValue = req.getParameter("updateselector");
		System.out.println(updatedValue);
		if (updatedValue.equalsIgnoreCase("Name")) {
			String updatedName = req.getParameter("updatetext");
			if (controller.updateStudentName(studentID, updatedName)) {
				System.out.println("Student Name Updated");
			} else {
				System.out.println("Student Name not updated");
			}
//			student.setStudent_name(updatedName);
		}
		else if(updatedValue.equalsIgnoreCase("Email"))
		{
			String updatedEmail = req.getParameter("updateselector");
//			student.setStudent_email(updatedEmail);
		}
		else if(updatedValue.equalsIgnoreCase("Address"))
		{
			String updatedAddress = req.getParameter("updateselector");
//			student.setStudent_address(updatedAddress);
		}
		else if(updatedValue.equalsIgnoreCase("Branch"))
		{
			String updatedBranch = req.getParameter("updateselector");
//			student.setStudent_branch(updatedBranch);
		}
		else if(updatedValue.equalsIgnoreCase("contact"))
		{
			long updatedContact =(long) Long.parseLong(req.getParameter("updatetext"));
//			student.setStudent_contact(updatedContact);
			if (controller.updateStudentContact(studentID, updatedContact)) {
				System.out.println("Student Contact Updated");
			} else {
				System.out.println("Student Contact not updated");
			}
		}
		else if(updatedValue.equalsIgnoreCase("username"))
		{
			String updatedUsername = req.getParameter("updateselector");
//			student.setStudent_username(updatedUsername);
		}
		else if (updatedValue.equalsIgnoreCase("password")) {
			String updatedPassword = req.getParameter("updateselector");
//			student.setStudent_username(updatedPassword);
		} 
////		req.getRequestDispatcher(""
		
	}
}
