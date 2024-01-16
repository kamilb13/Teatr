package com.example.teatroracleprojekt.Repository;

import com.example.teatroracleprojekt.Model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
   // List<User> findAll(Sort sort);

}