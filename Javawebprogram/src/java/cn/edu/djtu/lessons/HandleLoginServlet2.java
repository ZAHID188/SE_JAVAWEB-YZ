/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.lessons;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zahid
 */
@WebServlet(name = "HandleLoginServlet2", urlPatterns = {"/HandleLoginServlet2"})
public class HandleLoginServlet2 extends HttpServlet {

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
        try {
            
            String username = request.getParameter("username");
            String userpass = request.getParameter("userpass");
            if ("admin".equalsIgnoreCase(username) && "1234".equals(userpass)) {
                RequestDispatcher rd = request.getRequestDispatcher("Lesson/index.jsp");
                out.print("Before Forward");
                rd.forward(request, response);// FORWARD ==this one opens a new page Index in lessons
                out.print("After Forward");
                
            } else {
                out.print("the username or password is error，please reenter！");
                RequestDispatcher rd = request.getRequestDispatcher("Lesson/login1.jsp");
                
                 out.print("Before Include");
                rd.include(request, response);//// INCLUDE ==this one opens a new page AFTER THE PRINT Login
                //response.sendRedirect("login.jsp");
                out.print("After Include");
                
            }
       
        } finally {            
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
