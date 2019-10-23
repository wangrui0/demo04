package com.example;

import com.example.servlet.SecondServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.Servlet;

@SpringBootApplication
@MapperScan("com.example.mapper.*")
@Component
public class Application {
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);


    }
  /*  @Bean
    public ServletRegistrationBean getServletRegistrationbean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
*/

    }

