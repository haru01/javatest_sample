package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ResourceBundle;
import java.util.MissingResourceException;


public final class GradleHello extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
      throws IOException, ServletException, MissingResourceException {
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();

       ResourceBundle bundle = ResourceBundle.getBundle("application");

      writer.println("<html>");
      writer.println("<head>");
      writer.println("<title>Hello Servlet Page</title>");

      writer.println("</head>");
      writer.println("<body bgcolor=white>");
      writer.println("<p>db.databasename:");
      writer.println(bundle.getString("db.databasename"));
      writer.println("</p>");
      writer.println("<p>db.username:");
      writer.println(bundle.getString("db.username"));
      writer.println("</p>");

      writer.println("<table border=\"0\">");
      writer.println("<tr>");
      writer.println("<td>");
      writer.println("<img src=\"images/tomcat.gif\">");
      writer.println("</td>");
      writer.println("<td>");
      writer.println("<h1>Hello Gradle</h1>");
      writer.println("This is the output of a servlet that is part of");
      writer.println("the Hello, World application.");
      writer.println("</td>");
      writer.println("</tr>");
      writer.println("</table>");
      writer.println("</body>");
      writer.println("</html>");
    }
}
