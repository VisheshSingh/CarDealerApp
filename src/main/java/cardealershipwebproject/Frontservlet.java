package cardealershipwebproject;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Frontservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Car> carlist = new ArrayList<Car>();
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println(uname);
		System.out.println(pwd);
		if (new LoginDAO().checkCredentials(uname, pwd)) {
			HttpSession session = request.getSession();

			ResultSet rs = new LoginDAO().getCars();
			try {
				while (rs.next()) {
					Car c = new Car();
					c.setModelNumber(rs.getString(1));
					c.setYearofProduction(rs.getString(2));
					c.setDownPayment(rs.getString(3));
					c.setMonthlyPayment(rs.getString(4));
					c.setDuration_in_months(rs.getString(5));
					carlist.add(c);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// AFTER VALIDATING SEND THE DATA TO NEXT RESOURSE
			request.setAttribute("carlist", carlist);
			session.setAttribute("carlist", carlist);
			// FORWARD REQUEST TO NEXT RESOURSE
			RequestDispatcher RD = request.getRequestDispatcher("cars.jsp");
			RD.forward(request, response);
		}
	}

}
