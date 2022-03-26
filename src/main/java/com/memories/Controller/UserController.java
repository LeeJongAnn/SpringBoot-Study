package com.memories.Controller;

import com.memories.DataModel.Board;
import com.memories.Repository.BoardRepository;
import com.memories.Service.BoardService;
import com.memories.auth.PrincipalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class UserController {

    @GetMapping("/auth/login")
    public String login() {
        return "/user/userLogin";
    }
    @GetMapping("/user/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }

    @GetMapping("/auth/join")
    public String join() {
        return "/user/userJoin";
    }



}
