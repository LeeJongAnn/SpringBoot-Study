package com.memories.Controller;

import com.memories.DataModel.Board;
import com.memories.Repository.BoardRepository;
import com.memories.Repository.ReplyRepository;
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
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BoardController {

    @Autowired
    public BoardService boardService;

    @Autowired
    public BoardRepository boardRepository;

    @Autowired
    public ReplyRepository replyRepository;


    @GetMapping("/")
    public String index(@AuthenticationPrincipal PrincipalDetail principal, Model model, @PageableDefault(size=3,sort="id",direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Board> boardslist = boardService.글목록(pageable);
        System.out.println(boardslist);
        model.addAttribute("boards",boardslist);
        return "index";
    }

    @GetMapping("/board/{id}/updateForm")
    public String updateForm(@PathVariable int id, Model model) {
        model.addAttribute("board", boardService.글상세보기(id));
        return "board/updateForm";
    }

    @GetMapping("/board/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("board", boardService.글상세보기(id));
        return "board/detail";
    }

    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "/board/saveForm";
    }
}
