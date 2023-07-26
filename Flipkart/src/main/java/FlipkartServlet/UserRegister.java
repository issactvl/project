package FlipkartServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/issaclogin","root","issac");
			PreparedStatement pr = con.prepareStatement("insert into logindetails values(?,?)");
			pr.setString(1, name);
			pr.setString(2, pass);
			int rs= pr.executeUpdate();
			
			if(rs>0)
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
