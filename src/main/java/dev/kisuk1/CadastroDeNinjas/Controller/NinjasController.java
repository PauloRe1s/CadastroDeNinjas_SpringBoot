package dev.kisuk1.CadastroDeNinjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjasController {

    @GetMapping("/konoha")
    public String AllNinjas() {
        return "Bem Vindo a Aldeia da Folha!";
    }

}
