package top.ouzhanbo.webspringboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.ouzhanbo.webspringboot.filter.HelloWorldFilter;
import top.ouzhanbo.webspringboot.listener.HelloWorldListener;
import top.ouzhanbo.webspringboot.servlet.HelloWorldServlet;

/**
 * @author zhanxiangOu
 * @date 2022年01月17日14:25
 */
@Configuration
public class MyConfig {

    @Bean
    public ServletRegistrationBean<HelloWorldServlet> helloWorldServlet() {
        ServletRegistrationBean<HelloWorldServlet> helloWorldServlet = new ServletRegistrationBean<>();
        helloWorldServlet.addUrlMappings("/hello");
        helloWorldServlet.setServlet(new HelloWorldServlet());
        return helloWorldServlet;
    }

    @Bean
    public FilterRegistrationBean<HelloWorldFilter> helloWorldFilter() {
        FilterRegistrationBean<HelloWorldFilter> helloWorldFilter = new FilterRegistrationBean<>();
        helloWorldFilter.addUrlPatterns("/hello/*");
        helloWorldFilter.setFilter(new HelloWorldFilter());
        return helloWorldFilter;
    }

    @Bean
    public ServletListenerRegistrationBean<HelloWorldListener> helloWorldListener() {
        ServletListenerRegistrationBean<HelloWorldListener> helloWorldListener = new ServletListenerRegistrationBean<>();
        helloWorldListener.setListener(new HelloWorldListener());
        return helloWorldListener;
    }

}