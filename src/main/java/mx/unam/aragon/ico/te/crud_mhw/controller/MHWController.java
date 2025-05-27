package mx.unam.aragon.ico.te.crud_mhw.controller;

import mx.unam.aragon.ico.te.crud_mhw.models.Monstruo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MHWController {
    @GetMapping("/home/")
    public String home(){
        return "home";
    }
    @GetMapping("/monstruo/")
    public String monstruo(Model model){
        Monstruo monstruo = new Monstruo(1,"Anjanath","Wyvern Fauces Feroces","Fuego","Plaga de fuego","Agua","Bosque Primigeneo","Anjanath Fulgúreo","Quinta");
        model.addAttribute("monstruo",monstruo);
        return "monstruo";
    }
}
