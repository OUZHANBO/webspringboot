package top.ouzhanbo.webspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhanxiangOu
 * @date 2022年01月12日15:29
 */
@Controller
public class MyController {

    @GetMapping(value = "/myController")
    public void    hello(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("myController:R U OK???".getBytes(StandardCharsets.UTF_8));
    }

}
