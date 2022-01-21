package top.ouzhanbo.webspringboot.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhanxiangOu
 * @date 2022年01月17日14:28
 */
public class HelloWorldFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("helloWorldFilter:被我拦截了");
        chain.doFilter(request,response);
    }
}
