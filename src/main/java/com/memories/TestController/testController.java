package com.memories.TestController;


import com.memories.DataModel.User;
import com.memories.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.function.Supplier;

@RestController
public class testController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/dummyTest") // 저장하는 메소드
    public String save(User user){
        System.out.println("사용자이름:" + user.getUsername());
        System.out.println("사용자 비밀번호:" + user.getPassword());
        System.out.println("사용자 이메일:" + user.getEmail());

        userRepository.save(user);
        return "저장되었습니다.";
    }

    @GetMapping("/dummy/{id}")
    public User selectId(@PathVariable int id){

        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {

            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당하는 아이디가 없습니다." + id);
            }
        });

        return user;
    }
}
