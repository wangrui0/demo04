package com.example.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
/*springboot整合listener
<listener>
        <listener-class><listener-class>
<listener>*/
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Listener 正在工作");
        System.out.println("-----&&&&&&&&&----------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
