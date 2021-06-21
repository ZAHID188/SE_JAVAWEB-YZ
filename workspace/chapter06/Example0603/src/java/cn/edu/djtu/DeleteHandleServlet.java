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
@WebServlet(name = "DeleteHandleServlet", urlPatterns = {"/DeleteHandleServlet"})
public class DeleteHandleServlet extends HttpServlet {

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
        String id = request.getParameter("id");
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
            String sql = "select * from person where id=?";
            prst = conn.prepareStatement(sql);
            prst.setInt(1, Integer.parseInt(id));
            rs = prst.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String pwd = rs.getString("pwd");
                String gender = rs.getString("gender");
                out.print("<html>");
                out.print("<head><title>删除用户</title></head>");
                out.print("<body>");
                out.print("确定删除该用户？");
                out.print("ID:" + id + "<br/>");
                out.print("NAME:" + name + "<br/>");
                out.print("PWD:" + pwd + "<br/>");
                out.print("GENDER:" + gender + "<br/>");
                out.print("<form action=\"DeletePersonServlet\" method=\"post\">");
                out.print("<input type=\"hidden\" name=\"id\" value=\"" + id + "\"/><br/>");
                out.print("<input type=\"submit\" value=\"确定\"/>");
                out.print("<a href=\"index.jsp\">返回</a>");
                out.print("</form>");
                out.print("</body>");
                out.print("</html>");
            } else {
                out.print("查无此人！");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
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
