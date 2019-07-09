package com.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/add")
public class NumberFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        int num1 = Integer.parseInt(request.getParameter("num1"));
        if(num1>0) {
            chain.doFilter(req, resp);
        }
        else {
            resp.getWriter().println("The num1 is less than 0");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
