package com.fhws.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

@WebServlet("second")
public class SecondServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        response.setContentType("text/html;charset=UTF-8");

        try( PrintWriter out = response.getWriter()){
           out.println("<html>");
           out.println("<body>");
           out.println("<h1>First Servlet</h1>");
           out.println("Server time: " + new Date());

           Calendar now = Calendar.getInstance();
           if(now.get(Calendar.HOUR_OF_DAY) < 12 )
               out.println("Good Morning");
           else
               out.println("Good Evening");

           out.println("</body>");
           out.println("</html>");
       }
    }
}
