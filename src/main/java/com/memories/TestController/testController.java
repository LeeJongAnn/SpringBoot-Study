package com.memories.TestController;


import com.memories.DataModel.Role;
import com.memories.DataModel.User;
import com.memories.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class testController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/dummyTest") // 저장하는 메소드
    public String save(User user){
        System.out.println("사용자이름:" + user.getUsername());
        System.out.println("사용자 비밀번호:" + user.getPassword());
        System.out.println("사용자 이메일:" + user.getEmail());
        user.setRole(Role.USER);
        userRepository.save(user);
        return "저장되었습니다.";
    }

    @GetMapping("/dummy/{id}") // ID번호로 조회한다.
    public User selectId(@PathVariable int id){

        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {

            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당하는 아이디가 없습니다." + id);
            }
        });

        return user;
    }

    @GetMapping("/dummy/all")
    public List<User> selectALL(){

        return userRepository.findAll();
    }

    @GetMapping("/dummy/paginUser")
    public Page<User> PaginUser(@PageableDefault(size = 1,sort = "id",direction = Sort.Direction.DESC)Pageable pageable){


        return userRepository.findAll(pageable);

    }
    @PutMapping("/dummy/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User requestUser){

        User user = userRepository.findById(id).orElseThrow(()->{
            return new IllegalArgumentException("업데이트에 실패하였습니다, 다시 시도하세요" + id);
        });
        user.setUsername(requestUser.getUsername());
        user.setPassword(requestUser.getPassword());
        user.setEmail(requestUser.getEmail());

        userRepository.save(user);
        return user;
    }
}
