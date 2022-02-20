package com.memories.Repository;

import com.memories.DataModel.Board;
import com.memories.DataModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board,Integer> {


}
