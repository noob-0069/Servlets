package com.shivam;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
public class showmessage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out= res.getWriter();
		out.println("LOL I know all ur data");
		Cookie cookies[]=req.getCookies();
		String aa;
		int k;
		for(Cookie c: cookies) {
			if(c.getName().equals("res")) {
				aa=c.getValue();
				out.println("The result is--"+aa);
			}
			else {
			k=Integer.parseInt(c.getValue());
			out.println(k);
			}
		}
			
	}

}
