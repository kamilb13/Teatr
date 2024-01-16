package com.example.teatroracleprojekt.Controller;

import com.example.teatroracleprojekt.Model.User;
import com.example.teatroracleprojekt.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String allActors(Model model){
        List<User> aktorzy = userRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute( "aktorzy", aktorzy);
        return "index";
    }

    @PostMapping("/dodaj-aktora")
    public String addActor(@RequestParam String imie, @RequestParam String nazwisko){
        User user = new User(imie, nazwisko);
        userRepo.save(user);

        return "redirect:/";
    }
}
