/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ShowAllPersonServlet", urlPatterns = {"/ShowAllPersonServlet"})
public class ShowAllPersonServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String url = "jdbc:derby://localhost:1527/sample";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String user = "app";
        String password = "app";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from person";
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            out.print("<a href=\"index.jsp\">返回首页</a>");
            out.print("<table border=1>");
            while (rs.next()) {
                out.print("<tr>");
                out.print("<td>" + rs.getInt("id") + "</td>");
                out.print("<td>" + rs.getString("name") + "</td>");
                out.print("<td>" + rs.getString("pwd") + "</td>");
                out.print("<td>" + rs.getString("gender") + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");

        } catch (SQLException ex) {
            Logger.getLogger(ShowAllPersonServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowAllPersonServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShowAllPersonServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShowAllPersonServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShowAllPersonServlet.class.getName()).log(Level.SEVERE, null, ex);
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
