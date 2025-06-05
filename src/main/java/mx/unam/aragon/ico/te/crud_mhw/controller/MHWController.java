package mx.unam.aragon.ico.te.crud_mhw.controller;

import mx.unam.aragon.ico.te.crud_mhw.models.Monstruo;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class MHWController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/mostrarMonstruo   ")
    public String mostrarMonstruo(Model model){
        ArrayList<Object> listaMonstruos = new ArrayList<>();
        listaMonstruos.add(new Monstruo(1,"Anjanath","https://cdn.kiranico.net/file/kiranico/mhworld-web/mhw/icon/em100_ID.png","Wyvern Fauces Feroces","Fuego","Plaga de fuego","Agua","Bosque Primigeneo","Anjanath Fulgúreo","Quinta"));
        listaMonstruos.add(new Monstruo(2,"Anjanathprueba","https://cdn.kiranico.net/file/kiranico/mhworld-web/mhw/icon/em100_ID.png","Wyvern Fauces Feroces","Fuego","Plaga de fuego","Agua","Bosque Primigeneo","Anjanath Fulgúreo","Quinta"));
        model.addAttribute("listaMonstruos",listaMonstruos);
        return "mostrarMonstruo";
    }
    @GetMapping("/nuevoMonstruo")
    public String nuevoMonstruo(Model model){
        model.addAttribute("monstruo", new Monstruo());
        return "nuevoMonstruo";
    }
    @GetMapping("/editarMonstruo")
    public String editarMonstruo(Model model){
        return "editarMonstruo";
    }
    @GetMapping("/borrarMonstruo")
    public String borrarMonstruo(Model model){
        return "borrarMonstruo";
    }
    @PostMapping("/guardarMonstruo")
    public String guardar(@ModelAttribute Monstruo monstruo){
        LoggerFactory.getLogger(getClass()).info("Guardando monstruo: "+ monstruo);
        return "redirect:/nuevoMonstruo?save";
    }
}
