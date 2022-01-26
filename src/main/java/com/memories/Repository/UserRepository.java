package com.memories.Repository;

import com.memories.DataModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsernameAndPassword(String username, String password);
}
