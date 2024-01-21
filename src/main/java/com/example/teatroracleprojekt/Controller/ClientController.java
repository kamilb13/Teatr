package com.example.teatroracleprojekt.Controller;
import com.example.teatroracleprojekt.Model.Client;
import com.example.teatroracleprojekt.Repository.KlientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class ClientController {

    @Autowired
    KlientRepo klientRepo;

    @GetMapping("/allClients")
    public String allClients(Model model){
        List<Client> klienci = klientRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute( "klienci", klienci);
        return "index";
    }

    @PostMapping("/dodaj-klienta")
    public String addClient(@RequestParam String imieKlienta, @RequestParam String nazwiskoKlienta, @RequestParam String emailKlienta) {
        Client klient = new Client(imieKlienta, nazwiskoKlienta, emailKlienta);
        klientRepo.save(klient);

        return "redirect:/";
    }

}
