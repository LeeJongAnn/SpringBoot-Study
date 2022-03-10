package com.memories.Controller;

import com.memories.DataModel.Board;
import com.memories.Service.BoardService;
import com.memories.auth.PrincipalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    public BoardService boardService;

    @GetMapping("/")
    public String index(@AuthenticationPrincipal PrincipalDetail principal, Model model, @PageableDefault(size=3,sort="id",direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Board> boardslist = boardService.글목록(pageable);
        System.out.println(boardslist);
        model.addAttribute("boards",boardslist);
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

    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "/board/saveForm";
    }

}
