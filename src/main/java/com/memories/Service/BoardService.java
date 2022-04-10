package com.memories.Service;


import com.memories.DataModel.Board;
import com.memories.DataModel.Reply;
import com.memories.DataModel.Role;
import com.memories.DataModel.User;
import com.memories.Repository.BoardRepository;
import com.memories.Repository.ReplyRepository;
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

    @Autowired
    private ReplyRepository replyRepository;

    @Transactional
    public void 글쓰기(Board board, User user) {
        board.setCount(0);
        board.setUser(user);
        boardRepository.save(board);
    }

    @Transactional(readOnly = true)
    public Page<Board> 글목록(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Board 글상세보기(int id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> {
                    return new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다.");
                });
    }
    @Transactional
    public void 글수정하기(int id, Board requestBoard) {
        Board board = boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 찾기 실패 : 아이디를 찾을 수 없습니다.");
                });
        board.setTitle(requestBoard.getTitle());
        board.setContent(requestBoard.getContent());
    }
    @Transactional
    public void 글삭제하기(int id) {
        System.out.println("글삭제하기 : " + id);
        boardRepository.deleteById(id);
    }


    @Transactional
    public void 댓글쓰기(User user, int boardId, Reply requestReply) {

        Board board = boardRepository.findById(boardId).orElseThrow(()->{
            return new IllegalArgumentException("댓글 쓰기 실패 : 게시글 id를 찾을 수 없습니다.");
        }); // 영속화 완료;

        requestReply.setUser(user);
        requestReply.setBoard(board);

        replyRepository.save(requestReply);
    }

}
