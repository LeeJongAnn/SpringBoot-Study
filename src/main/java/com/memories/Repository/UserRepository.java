package com.memories.Repository;

import com.memories.DataModelTest.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
