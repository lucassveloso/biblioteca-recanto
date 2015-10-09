package biblioteca.service;

import biblioteca.dao.ObraRepository;
import biblioteca.model.Categoria;
import biblioteca.model.Obra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class ObraService {

    private static final int ITENS_POR_PAGINA = 12;

    @Autowired
    private ObraRepository repositorioObra;

    public Iterable<Obra> buscaTodos(int pagina) {
        return repositorioObra.findAll(paginacao(pagina));
    }

    public Iterable<Obra> buscaPorTitulo(String titulo, int pagina) {
        titulo = ("%").concat(titulo.concat("%"));
        return repositorioObra.findByNome(titulo, paginacao(pagina));
    }

    public Iterable<Obra> buscaPorCategoria(int codigoCategoria, int pagina) {
        return repositorioObra.findByCategoria(new Categoria(codigoCategoria), paginacao(pagina));
    }

    private PageRequest paginacao(int paginaAtual) {
        return new PageRequest(paginaAtual - 1, ITENS_POR_PAGINA, Sort.Direction.fromString("ASC"), "titulo");
    }
}
