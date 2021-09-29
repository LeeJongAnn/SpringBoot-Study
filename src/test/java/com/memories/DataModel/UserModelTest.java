package com.memories.DataModel;


import com.memories.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserModelTest {

    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void HaveNoFunTest(){
        
        User JongAnn = new User("미래는 두렵고 과거는 그립다","JongAnn123","JongAnn@naver.com");
        User GogoUser = userRepository.save(JongAnn);

        assertThat(GogoUser.getId()).isGreaterThan(0);
    }

}
