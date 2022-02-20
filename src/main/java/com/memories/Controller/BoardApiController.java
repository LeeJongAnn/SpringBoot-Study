package com.memories.Controller;


import com.memories.DataModel.Board;
import com.memories.DataModel.Role;
import com.memories.DataModel.User;
import com.memories.Dto.ResponseDto;
import com.memories.Service.BoardService;
import com.memories.Service.UserService;
import com.memories.auth.PrincipalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal) {
        boardService.글쓰기(board,principal.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

}
