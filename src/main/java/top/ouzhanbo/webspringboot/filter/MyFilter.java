package top.ouzhanbo.webspringboot.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhanxiangOu
 * @date 2022年01月12日15:55
 */
@WebFilter(value = "/myServlet",initParams = {@WebInitParam(name = "filterName",value = "myFilter"),@WebInitParam(name = "msg",value = "被我过滤了")})
public class MyFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        String msg = getInitParameter("filterName") +
                ":" +
                getInitParameter("msg");
        response.getOutputStream().write(msg.getBytes(StandardCharsets.UTF_8));
        response.getOutputStream().write("<br>".getBytes(StandardCharsets.UTF_8));
        chain.doFilter(request,response);
    }
}
