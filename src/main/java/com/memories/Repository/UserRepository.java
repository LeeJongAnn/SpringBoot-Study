package com.memories.Repository;

import com.memories.DataModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User FindByUserNameAndPassword(String username, String password);
}
