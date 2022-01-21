package top.ouzhanbo.webspringboot.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;
import top.ouzhanbo.webspringboot.filter.CustomFilter;
import top.ouzhanbo.webspringboot.servlet.CustomServlet;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * @author zhanxiangOu
 * @date 2022年01月20日18:29
 */
@Component
public class CustomServletContextInitializer implements ServletContextInitializer {

    private final static String JAR_HELLO_URL = "/custom";
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("创建 customServlet...");

        ServletRegistration.Dynamic servlet = servletContext.addServlet(
                CustomServlet.class.getSimpleName(),
                CustomServlet.class);
        servlet.addMapping(JAR_HELLO_URL);

        System.out.println("创建 customFilter...");

        FilterRegistration.Dynamic filter = servletContext.addFilter(
                CustomFilter.class.getSimpleName(), CustomFilter.class);

        EnumSet<DispatcherType> dispatcherTypes = EnumSet.allOf(DispatcherType.class);
        dispatcherTypes.add(DispatcherType.REQUEST);
        dispatcherTypes.add(DispatcherType.FORWARD);

        filter.addMappingForUrlPatterns(dispatcherTypes, true, JAR_HELLO_URL);
    }
}
