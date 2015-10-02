package biblioteca.controller;

import biblioteca.model.Obra;
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

    @RequestMapping("/")
    public String home(Model model){
        List<Obra> obras = (List) servicoObra.buscaTodos();
        model.addAttribute("obras", obras.size());
        return "home";
    }

}
