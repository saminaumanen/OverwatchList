package fi.haagahelia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // Login
    @RequestMapping(value="/login")
    public String login() {
        return "/loginpage.html";
    }

    @RequestMapping(value="/")
    public String index() {
        return "/characterlist.html";
    }


}