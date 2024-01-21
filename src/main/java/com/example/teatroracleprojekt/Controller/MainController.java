package com.example.teatroracleprojekt.Controller;

import com.example.teatroracleprojekt.Model.Client;
import com.example.teatroracleprojekt.Model.User;
import com.example.teatroracleprojekt.Repository.KlientRepo;
import com.example.teatroracleprojekt.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    KlientRepo klientRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String mainController(Model model) {
        List<Client> klienci = klientRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute("klienci", klienci);
        List<User> aktorzy = userRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute("aktorzy", aktorzy);

        logger.info("Zawartość obiektu Model: {}", model);

        return "index";
    }
}

