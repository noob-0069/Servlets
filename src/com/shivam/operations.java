package com.shivam;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
public class operations extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		String action= req.getParameter("calci");
		PrintWriter out= res.getWriter();
		Cookie cookie1= new Cookie("num1",i+"");
		res.addCookie(cookie1);
		
		Cookie cookie2= new Cookie("num2",j+"");
		res.addCookie(cookie2);
		
		
		if("ADD".equals(action)) {
			//out.println("The addition is "+(i+j));
			Cookie cookie3=new Cookie("res",(i+j)+"");
			res.addCookie(cookie3);
			res.sendRedirect("boys");
		}
		
		
		else if(action.equals("SUB")) {
			//out.println("The subtraction is "+(i-j));
			Cookie cookie3=new Cookie("res",(i-j)+"");
			res.addCookie(cookie3);
			res.sendRedirect("boys");
		}
		
		
		else if(action.equals("MULTIPLY")) {
			//out.println("The multiplication is "+(i*j));
			Cookie cookie3=new Cookie("res",(i*j)+"");
			res.addCookie(cookie3);
			res.sendRedirect("boys");
		}
		
		
		else if(action.equals("DIVIDE")) {
			float result=(float)i/(float)j;
			//System.out.println(result);
			//out.println("The division is "+result);
			Cookie cookie3=new Cookie("res",result+"");
			res.addCookie(cookie3);
			res.sendRedirect("boys");
		}
		
	}
}
