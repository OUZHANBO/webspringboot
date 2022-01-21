package top.ouzhanbo.webspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhanxiangOu
 * @date 2022/1/12 15:30
 */
@SpringBootApplication
@ServletComponentScan
public class WebspringbootApplication {

    private  static  int x = 100;

    public static void main(String[] args) {

        SpringApplication.run(WebspringbootApplication.class, args);

    }

}
