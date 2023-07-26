package FlipkartServlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String P_name = request.getParameter("name");
		String P_desc = request.getParameter("description");
		String P_price = request.getParameter("price");
		String P_quantity = request.getParameter("quantity");		
		InputStream imageInputStream = null;
		Part imagePart = request.getPart("image");
		if(imagePart != null) {
			imageInputStream = imagePart.getInputStream();
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindetails","root","issac");
			PreparedStatement ps = con.prepareStatement("insert into adminaddproducts(P_name,P_description,P_price,P_quantity,P_image)  values(?,?,?,?,?)");
			
			ps.setString(1,P_name);
			ps.setString(2,P_desc);
			ps.setString(3,P_price);
			ps.setString(4,P_quantity);
			ps.setBlob(5, imageInputStream);
			
			ps.executeUpdate();
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");

			pw.println("<script>");
			pw.println("alert('You have successfully inserted products')");
			pw.println("</script>");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("SQl");
			e.printStackTrace();
		}
		
	}

}
