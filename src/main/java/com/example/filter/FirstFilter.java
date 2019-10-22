/*
package com.example.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

*/
/*springboot整合filter方式一
<Filter>
   <Filter-name>FirstFilter<Filter-name>
   <filter-class> filter/Firstfilter<filter-class>
<Filter>
<Filter-mapping>
   <Filter-name><Filter-name>
   <Filter-pattern><Filter-pattern>
<Filter-mapping>
* *//*

*/
/*@WebFilter(filterName = "FirstFilter",urlPatterns = {"*.do","*.jsp"})*//*

@WebFilter(filterName = "FirstFilter",urlPatterns = "/First")
public class FirstFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开filter");
    }
}


*/
