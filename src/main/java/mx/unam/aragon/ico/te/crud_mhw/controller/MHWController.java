package mx.unam.aragon.ico.te.crud_mhw.controller;

import mx.unam.aragon.ico.te.crud_mhw.models.Monstruo;
import mx.unam.aragon.ico.te.crud_mhw.service.MonstruoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class MHWController {
    @Autowired
    private MonstruoService monstruoService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/mostrarMonstruo")
    public String mostrarMonstruo(Model model){
        List<Monstruo> listaMonstruos = monstruoService.obtenerMonstruos();
        model.addAttribute("listaMonstruos",listaMonstruos);
        return "mostrarMonstruo";
    }
    @GetMapping("/nuevoMonstruo")
    public String nuevoMonstruo(Model model){
        model.addAttribute("monstruo", new Monstruo());
        return "nuevoMonstruo";
    }
    @GetMapping("/idEditarMonstruo")
    public String idEditarMonstruo(Model model){
        return "idEditarMonstruo";
    }
    @GetMapping("/editarMonstruo")
    public String editarMonstruo(@RequestParam Integer id, Model model) {
        Monstruo monstruo = monstruoService.encontrarPorId(id);
        model.addAttribute("monstruo", monstruo);
        return "editarMonstruo";
    }
    @GetMapping("/idBorrarMonstruo")
    public String idBorrarMonstruo(Model model){
        return "idBorrarMonstruo";
    }
    @GetMapping("/borrarMonstruo")
    public String borrarMonstruo(@RequestParam Integer id, Model model){
        boolean eliminado = monstruoService.eliminarMonstruoPorId(id);
        return "redirect:/mostrarMonstruo?delete";
    }
    @PostMapping("/guardarNuevoMonstruo")
    public String guardarNuevoMonstruo(@ModelAttribute Monstruo monstruo){
        monstruoService.guardarNuevoMonstruo(monstruo);
        return "redirect:/nuevoMonstruo?save";
    }
    @PostMapping("/guardarMonstruoExistente")
    public String guardarMonstruoExistente(@ModelAttribute Monstruo monstruo){
        monstruoService.editarMonstruoExistente(monstruo);
        return "redirect:/mostrarMonstruo?save";
    }
}
