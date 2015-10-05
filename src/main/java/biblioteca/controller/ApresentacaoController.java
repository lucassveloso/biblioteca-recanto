package biblioteca.controller;

import biblioteca.model.Categoria;
import biblioteca.model.Obra;
import biblioteca.service.CategoriaService;
import biblioteca.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ApresentacaoController {

    @Autowired
    private ObraService servicoObra;

    @Autowired
    private CategoriaService servicoCategoria;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("obras", (List) servicoObra.buscaTodos());
        model.addAttribute("categorias",(List) servicoCategoria.buscaTodos());
        return "home";
    }

}
