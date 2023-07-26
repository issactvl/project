package FlipkartServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindetails","root","issac");
			PreparedStatement pr = con.prepareStatement("select * from adminlogin where AdminName='"+name+"' and AdminPassword='"+pass+"'");
			ResultSet rs = pr.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("AdminHomePage.jsp");
			}
			else
			{
				response.sendRedirect("AdminLogin.jsp");
			}
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} 
		catch (SQLException e) {			
			e.printStackTrace();
		}
	}


	
	}


