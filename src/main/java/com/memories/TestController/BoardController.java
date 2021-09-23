package com.memories.TestController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/index")
    public String index() {

        return "index";
    }

    @GetMapping("/user/login")
    public String login() {

        return "/user/userLogin";

    }

    @GetMapping("/user/join")
    public String join() {
        return "/user/userJoin";
    }
}
