package com.soson.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost ------");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + "_" + password);

        if ("123".equals(username) && "456".equals(password)) {
            resp.getWriter().write("login success");
        } else {
            resp.getWriter().write("login fail");
        }
    }
}
