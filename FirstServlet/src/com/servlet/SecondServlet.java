package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet")
public class SecondServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res){
//        HttpSession ses = req.getSession();
//        int sum = (int)ses.getAttribute("sum");

//        int sum = (int)req.getAttribute("sum");

//        int sum = Integer.parseInt(req.getParameter("sum"));

        int sum = 0;
        Cookie cookies[] = req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("sum")){
                sum = Integer.parseInt(c.getValue());
            }
        }
        int prod = sum*sum;
        try{
            PrintWriter out = res.getWriter();
            out.println("Product is "+prod);
        }
        catch (IOException e){
            System.out.println("The IoException in AddServlet");
        }
    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
