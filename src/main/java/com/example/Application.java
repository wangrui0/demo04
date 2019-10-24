package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
@MapperScan("com.example.mapper")
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

