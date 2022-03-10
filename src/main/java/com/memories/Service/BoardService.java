package com.memories.Service;


import com.memories.DataModel.Board;
import com.memories.DataModel.Role;
import com.memories.DataModel.User;
import com.memories.Repository.BoardRepository;
import com.memories.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {


    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void 글쓰기(Board board,User user) {
        board.setCount(0);
        board.setUser(user);
        boardRepository.save(board);
    }


    public Page<Board> 글목록(Pageable pageable){
        return boardRepository.findAll(pageable);
    }


    @Transactional
    public void 글삭제하기(int id) {
        System.out.println("글삭제하기 : "+id);
        boardRepository.deleteById(id);
    }
}
