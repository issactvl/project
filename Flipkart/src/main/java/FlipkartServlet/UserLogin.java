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

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/issaclogin","root","issac");
			PreparedStatement pr = con.prepareStatement("select * from logindetails where name='"+name+"' and password='"+pass+"'");
			ResultSet rs = pr.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("https://www.flipkart.com/");
			}
			else
			{
				response.sendRedirect("UserLogin.jsp");
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
