package com.example.servlet;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name="FirsServlet",urlPatterns ="/First")
public class FirsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当你重写父类的doget方法时候不要调用父类中doget方法
        /*super.doGet(req, resp);*/
        System.out.println("----first----");
        String haha="我爱代码";
    }
}
