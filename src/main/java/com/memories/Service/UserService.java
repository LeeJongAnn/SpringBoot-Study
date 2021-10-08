package com.memories.Service;


import com.memories.DataModel.User;
import com.memories.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository; // DI 주입 받아서 쓸 수 있게 한다.

    @Transactional
    public int JoinUser(User user) { // User 객체를 받는 join메소드를 만든다. 리턴값이 숫자기 때문에 int로 줬다.
        try {
            userRepository.save(user); // userRepository의 save를 이용해서 객체를 저장해준다.
            return 1; // 성공적으로 저장되면 리턴값으로 1을 준다.
        } catch (Exception e) { // 오류가 났을 시에 오류를 가장 부모인 Exception에서 받아준다.
            e.printStackTrace(); // 오류 내용을 출력을 해준다.
            System.out.println("UserService:회원가입 실패 " + e.getMessage());
        }
        return -1;
    }


    @Transactional(readOnly = true)
    public User LoginUser(User user){
       return userRepository.FindByUserNameAndPassword(user.getUsername(),user.getPassword());

    }
}