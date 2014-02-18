package com.bodejidi;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
public class weixin extends HttpServlet
{
		static final String loginHtml=  "<html>\n"
						+ "<body>\n"
						+ "   <h1> login</h1>\n"
						+ "     <form action=\"\" method=\"POST\">\n"											   +"   content: <input type = \"text\" name = \"content\"/>\n"
						+"   realname: <input type = \"text\" name = \"realname\"/>\n"
		  				+"	<input type = \"submit\" value = \"login\"/>\n"
				 		+"  </form>\n"
						+"</body>\n"
						+"</html>\n";
		static final String loginHtml2=	 "<xml>\n"
                				 +"    <Content><![CDATA[\n"
             					 +" 彭哲:\n\t来自山西大学，性别算是女吧.\n"    
              					 +"    ]]></Content>\n" 
           					 +"</xml>";
		static final String loginHtml3=	"<xml>\n"
                				+ "    <Content><![CDATA[\n"            				
					        +"	白雪:\n\t来自山西大学，性别确实是女.\n"   
              					+"    ]]></Content>\n" 
           					+"</xml>\n";
		static final String loginHtml4=	"<xml>\n"
                				+ "    <Content><![CDATA[\n"
             					+" 许双双:\n\t来自太原理工大学，性别你猜.\n"   
              					+"    ]]></Content>\n" 
           					+"</xml>\n";
		static final String loginHtml5=	"<xml>\n"
                				+ "    <Content><![CDATA[\n"
             					+" 郑鑫:\n\t来自太原理工大学，经验证，性别非女.\n"   
              					+"    ]]></Content>\n" 
           					+"</xml>\n";
		static final String loginHtml6=	"<xml>\n"
                				+ "    <Content><![CDATA[\n"
             					+"哈哈哈，你错了。"
              					+"    ]]></Content>\n" 
           					+"</xml>\n";
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
                     throws ServletException, IOException
		 {
		  resp.setCharacterEncoding("UTF-8");
                  resp.setContentType("text/html;charset=UTF-8");
		  req.getParameter("content");
		  req.getParameter("realname");
	 	  resp.getWriter().println(loginHtml);
	   	 }
	public void doPost(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, java.io.IOException
		{	
			 resp.setCharacterEncoding("UTF-8");
			 req.setCharacterEncoding("UTF-8");
                 	 resp.setContentType("text/xml;charset=UTF-8");
			 String content1 = req.getParameter("content");
		      	 String content2 = content1.replaceAll("\\s+","");		
				switch(req.getParameter("content2"))
				{
           	 		 case "第二小组彭哲":
               			resp.getWriter().println(loginHtml2);
               			 break;
           			 case "第二小组白雪":
               			resp.getWriter().println(loginHtml3);
               			 break;
           		 	 case "第二小组许双双":
               		 	 resp.getWriter().println(loginHtml4);
               			 break;
           			 case "第二小组郑鑫":
                 		 resp.getWriter().println(loginHtml5);
				 break;
				 case "二组彭哲":
               			resp.getWriter().println(loginHtml2);
               			 break;
           			 case "二组白雪":
               			resp.getWriter().println(loginHtml3);
               			 break;
           		 	 case "二组许双双":
               		 	 resp.getWriter().println(loginHtml4);
               			 break;
           			 case "二组郑鑫":
                 		 resp.getWriter().println(loginHtml5);
				 break;
				default:
				resp.getWriter().println(loginHtml6);
      				}
		}
}
