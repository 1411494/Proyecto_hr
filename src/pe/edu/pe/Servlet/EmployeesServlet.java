package pe.edu.pe.Servlet;


import java.io.PrintWriter;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
/**
 * Created by Marco on 27/05/2016.
 */
@WebServlet(name = "EmployeesServlet"   , urlPatterns = "/Employees")
public class EmployeesServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        try {
            pw.println( "hhhh" );
            int employee_id = Integer.parseInt(request.getParameter("employee_id"));
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String email = request.getParameter("email");
            pw.println( "1111" );

            String phone_number = request.getParameter("phone_number");
            String hire_date = request.getParameter("hire_date");
            String job_id = request.getParameter("job_id");
            double salary = Double.parseDouble(request.getParameter("salary"));
            double commission_pct = Double.parseDouble(request.getParameter("commission_pct"));
            int manager_id = Integer.parseInt(request.getParameter("manager_id"));
            int department_id = Integer.parseInt(request.getParameter("department_id"));

            pw.println( "xxxx" );
            Connection con = ConnectionPool();

            PreparedStatement pst = (PreparedStatement)
                    con.prepareStatement("insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(?,?,?,?,?,?,?,?,?,?,?)");

            pst.setInt(1, employee_id);
            pst.setString(2, first_name);
            pst.setString(3, last_name);
            pst.setString(4, email);
            pst.setString(5, phone_number);
            pst.setString(6, hire_date);
            pst.setString(7, job_id);
            pst.setDouble(8, salary);
            pst.setDouble(9, commission_pct);
            pst.setInt(10, manager_id);
            pst.setInt(11, department_id);

            int i = pst.executeUpdate();
            con.commit();
            String msg = " ";
            if (i != 0) {
                msg = "Record has been inserted";
                pw.println("<font size='6' color=blue>" + msg + "</font>");


            } else {
                msg = "failed to insert the data";
                pw.println("<font size='6' color=blue>" + msg + "</font>");
            }
            pst.close();


        } catch (Exception e) {
            pw.println(e);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
        Connection con = ConnectionPool();
        Statement stmt = con.createStatement();
            pw.println( "<p>Before Query</p>" );
        ResultSet rs = stmt.executeQuery( "SELECT * FROM employees " );
        if ( rs != null  ){
            pw.println( "<p>Right</p>" );
            while( rs.next() ){
                pw.println("<p>" + rs.getString("last_name") + "</p>" );
            }
        }
        } catch (Exception e) {
            pw.println(e);
        }
    }

    private Connection ConnectionPool() {
        Connection con = null;
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/MySQLConnPool");
            con = ds.getConnection();


        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;

    }


}
