package top.ouzhanbo.webspringboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author zhanxiangOu
 * @date 2022年01月18日13:24
 */
public class HelloWorldListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet容器被初始化了");
    }
}
