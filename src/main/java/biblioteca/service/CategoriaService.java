package biblioteca.service;

import biblioteca.dao.CategoriaRepository;
import biblioteca.dao.ObraRepository;
import biblioteca.model.Categoria;
import biblioteca.model.Obra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repositorioCategoria;

    public Iterable<Categoria> buscaTodos() {
        return repositorioCategoria.findAll();
    }

}
