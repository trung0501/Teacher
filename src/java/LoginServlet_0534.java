/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/LoginServlet_0534"})
public class LoginServlet_0534 extends HttpServlet {
ketnoi k = new ketnoi();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet_0534</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet_0534 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
    }
    
    public void getAll(HttpServletResponse response) throws SQLException, IOException{
        try {
        k.getConnection();
        String sql = "select * from product";
        PreparedStatement stm = k.con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<table border = '1'>");
        out.println("<tr><th>Magv</th><th>Ten</th><th>Gioitinh</th><th>Diem</th><th>Hocvi</th><th>Chuyennghanh</th></tr>");
        while(rs.next()) {
            int magv = rs.getInt(1);
            String ten = rs.getString(2);
            String gioitinh = rs.getString(3);
            float diem = rs.getFloat(4);
            String hocvi = rs.getString(5);
            String chuyennganh = rs.getString(6);
            
            out.println("<tr>");
            out.println("<td>" + magv +"</td>");
            out.println("<td>" + ten +"</td>");
            out.println("<td>" + gioitinh +"</td>");
            out.println("<td>" + diem +"</td>");
            out.println("<td>" + hocvi +"</td>");
            out.println("<td>" + chuyennganh +"</td>");
            out.println("</tr>");
            out.println("<br>");
        }   
    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet_0534.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SXtangdantheoTen(HttpServletResponse response) throws SQLException, IOException {
        try {
        k.getConnection();

        String sql = "SELECT * FROM product ORDER BY ten ASC"; 
        PreparedStatement stm = k.con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<table border='1'>");
        out.println("<tr><th>magv</th><th>Ten</th><th>Gioitinh</th><th>Diem</th><th>Hocvi</th><th>chuyennganh</th></tr>");
        while (rs.next()) {
            int magv = rs.getInt(1);
            String ten = rs.getString(2);
            String gioitinh = rs.getString(3);
            float diem = rs.getFloat(4);
            String hocvi = rs.getString(5);
            String chuyennganh = rs.getString(6);
            
            out.println("<tr>");
            out.println("<td>" + magv + "</td>");
            out.println("<td>" + ten + "</td>");
            out.println("<td>" + gioitinh + "</td>");
            out.println("<td>" + diem + "</td>");
            out.println("<td>" + hocvi + "</td>");
            out.println("<td>" + chuyennganh +"</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginServlet_0534.class.getName()).log(Level.SEVERE, null, ex);
    }
}   
    
    public void SXtangdantheoGT(HttpServletResponse response) throws SQLException, IOException {
    try {
        k.getConnection();
        String sql = "SELECT * FROM product ORDER BY gioitinh ASC"; 
        PreparedStatement stm = k.con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<table border='1'>");
        out.println("<tr><th>magv</th><th>Ten</th><th>Gioitinh</th><th>Diem</th><th>Quequan</th><th>Chuyennganh</th></tr>");
        
        while (rs.next()) {
            int magv = rs.getInt(1);
            String ten = rs.getString(2);
            String gioitinh = rs.getString(3);
            float diem = rs.getFloat(4);
            String hocvi = rs.getString(5);
            String chuyennganh = rs.getString(6);
            
            out.println("<tr>");
            out.println("<td>" + magv + "</td>");
            out.println("<td>" + ten + "</td>");
            out.println("<td>" + gioitinh + "</td>");
            out.println("<td>" + diem + "</td>");
            out.println("<td>" + hocvi + "</td>");
            out.println("<td>" + chuyennganh +"</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginServlet_0534.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public void AddGV(String ten, String gioitinh,String diem, String hocvi, String chuyennganh) throws SQLException{
        String sql = "insert into product (ten,gioitinh,diem,hocvi,chuyennganh)";
        try(PreparedStatement stm = k.con.prepareStatement(sql)){
            stm.setString(1,ten);
            stm.setString(2,gioitinh);
            stm.setString(3,diem);
            stm.setString(4,hocvi);
            stm.setString(4,chuyennganh);
                
            stm.executeUpdate();
        }
    }
    private void DeleteGV(String magv) throws SQLException {
        String sql = "DELETE FROM product where magv = ?";
        try(PreparedStatement stm = k.con.prepareStatement(sql)){   
            stm.setString(1, magv);
            stm.executeUpdate();
        }
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String ten = request.getParameter("ten");
        String gioitinh = request.getParameter("gioitinh");
        String diem = request.getParameter("diem");
        String hocvi = request.getParameter("hocvi");
        String chuyennganh = request.getParameter("chuyennganh");
        String chucnang = request.getParameter("chucnang");
        String sort_attribute = request.getParameter("sort_attribute");
   
            try {
                k.getConnection();
            
           
            switch(chucnang){
                    case "Add":
                        AddGV(ten,gioitinh,diem,hocvi,chuyennganh);
                        break;
                    case "Delete":
                        DeleteGV(ten);
                        break;
                    case "Sắp xếp":
                        switch(sort_attribute){
                            case "ten":
                                SXtangdantheoTen(response);
                            break;
                            case "gioitinh":
                                SXtangdantheoGT(response);
                            break;
                        }
                    break;
            }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet_0534.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet_0534.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    