package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class FirstServlet extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1+num2;
        System.out.println(sum);

//        req.setAttribute("sum",sum);
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req,res);


//        HttpSession ses = req.getSession();
//        ses.setAttribute("sum",sum);
//        res.sendRedirect("sq");

//        Cookie cookie = new Cookie("sum",sum+"");
//        res.addCookie(cookie);
//        res.sendRedirect("sq");

        try{
            PrintWriter out = res.getWriter();
            out.println("result is "+sum);
        }
        catch (IOException e){
            System.out.println("The IoException in AddServlet");
        }

//        PrintWriter out =res.getWriter();
//        ServletContext ctx = getServletContext();
//        out.println("hi "+ctx.getInitParameter("name"));
//        ServletConfig cfg = getServletConfig();
//        out.println("hi "+cfg.getInitParameter("name"));

    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
