package com.example.teatroracleprojekt;

import com.example.teatroracleprojekt.Model.User;
import com.example.teatroracleprojekt.Repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class TeatrOracleProjektApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(TeatrOracleProjektApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.save(new User(1, "Kamcio", "Brzozix"));
        userRepo.save(new User(2, "Maciej","Zapix"));
    }
}
