package com.example.teatroracleprojekt.Repository;

import com.example.teatroracleprojekt.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlientRepo extends JpaRepository<Client, Integer> {
    // List<User> findAll(Sort sort);

}