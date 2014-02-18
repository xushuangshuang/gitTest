package com.bodejidi;
import javax.servlet.*;
import javax.servlet.http.*;

public class Connect extends HttpServlet{
     public void doGet(HttpServletRequest req,
                        HttpServletResponse resp)
          throws ServletException, java.io.IOException {
             
               resp.setCharacterEncoding("UTF-8");
             
               resp.setContentType("textml;charset=UTF-8");

              resp.getWriter().println("<xml>");
              resp.getWriter().println("    <Content><![CDATA[");
              resp.getWriter().println(   req.getParameter("yourname"));    
              resp.getWriter().println("    ]]></Content>"); 
            resp.getWriter().println("</xml>");
          }
        public void doPost(HttpServletRequest req,
                         HttpServletResponse resp)
          throws ServletException, java.io.IOException {
             
               resp.setCharacterEncoding("UTF-8");
             
               resp.setContentType("text/xml;charset=UTF-8");

              resp.getWriter().println("<xml>");
              resp.getWriter().println("    <Content><![CDATA[");
              resp.getWriter().println("    白");    
              resp.getWriter().println("    ]]></Content>"); 
            resp.getWriter().println("</xml>");
        }     
}



