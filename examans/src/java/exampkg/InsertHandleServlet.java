/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "InsertHandleServlet", urlPatterns = {"/InsertHandleServlet"})
public class InsertHandleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         String user1 = request.getParameter("username");	// Get the entered user name
	String pass = request.getParameter("userpwd");
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String url = "jdbc:derby://localhost:1527/mylesson";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String user = "sa";
        String password = "sa";
        
         RequestDispatcher rd=null;
        
          String sql1 = "select * from loginuser where user =?";   // SQL statement to query whether the user exists	

       String sql2 = " insert into loginuser values(?,?)";	//Insert the user's SQL statement

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            
            prst = conn.prepareStatement(sql1);
            prst.setString(1, user ) ;
            rs = prst.executeQuery();
            if (rs.next()) {
                out.print("该用户已存在");
               // prst.close();
             //    rd=request.getRequestDispatcher("reg.jsp");
             //    rd.include(request, response);
            } else {
                 // Execute sql2 statement, insert user information
                prst = conn.prepareStatement(sql2);
                prst.setString(1, user );
                prst.setString(2, pass );
                prst.executeUpdate();
		// Redirect the response to 
		response.sendRedirect("ok.jsp");  
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
