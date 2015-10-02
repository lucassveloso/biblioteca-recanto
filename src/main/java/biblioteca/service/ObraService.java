package biblioteca.service;

import biblioteca.dao.ObraRepository;
import biblioteca.model.Obra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ObraService {

    @Autowired
    private ObraRepository repositorioObra;

    public Iterable<Obra> buscaTodos() {
        return repositorioObra.findAll();
    }

}
