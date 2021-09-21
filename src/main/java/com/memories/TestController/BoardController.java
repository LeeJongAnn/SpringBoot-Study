package com.memories.TestController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/index")
    public String index(){

        return "index";
    }

    @GetMapping("/user/login")
    public String login(){

        return "userLogin";

    }

    @GetMapping("/user/Join")
    public String join(){
        return "userJoin";
    }
}
