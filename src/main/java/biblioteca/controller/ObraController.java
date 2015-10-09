package biblioteca.controller;

import biblioteca.model.Categoria;
import biblioteca.model.Obra;
import biblioteca.service.CategoriaService;
import biblioteca.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ObraController {

    @Autowired
    private ObraService servicoObra;

    @Autowired
    private CategoriaService servicoCategoria;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listar(
            @RequestParam(value = "busca", required = false) String busca,
            @RequestParam(value = "categoria", required = false, defaultValue = "0") int categoria,
            @RequestParam(value = "pagina", required = false, defaultValue = "1") int pagina,
            Model model) {

        pagina = pagina <= 0 ? 1 : pagina;

        model.addAttribute("categorias", servicoCategoria.buscaTodos());

        Iterable<Obra> obras;
        if (busca != null) {
            obras = servicoObra.buscaPorTitulo(busca, pagina);
        } else if (categoria != 0) {
        obras = servicoObra.buscaPorCategoria(categoria, pagina);
        } else {
            obras = servicoObra.buscaTodos(pagina);
        }

        if (obras.iterator().hasNext()) {
            model.addAttribute("paginas", ((Page) obras));
            model.addAttribute("obras", obras);
        } else {
            model.addAttribute("erro", busca + " não foi encontrado :(");
        }

        return "home";
    }
}
