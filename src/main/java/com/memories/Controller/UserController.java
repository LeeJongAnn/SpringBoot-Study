package com.memories.Controller;

import com.memories.auth.PrincipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal PrincipalDetail principal ) {

        return "index";
    }

    @GetMapping("/auth/login")
    public String login() {

        return "/user/userLogin";

    }

    @GetMapping("/auth/join")
    public String join() {
        return "/user/userJoin";
    }
}
