package ru.smartian.testwebproject.web;

import java.io.IOException;

/**
 * Created by sasha on 20.01.17.
 */
public class About extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/about.jsp").forward(request, response);
    }
}
