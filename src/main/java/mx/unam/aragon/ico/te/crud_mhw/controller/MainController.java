package mx.unam.aragon.ico.te.crud_mhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping()
    public String obtenerInicial(){
        return "index";
    }
}
