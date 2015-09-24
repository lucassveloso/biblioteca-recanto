package biblioteca.dao;

import biblioteca.model.Autor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository extends CrudRepository<Autor, Integer>{

    @Query(Consultas.Autor.FIND_BY_NOME)
    List<Autor> findByNome(@Param("nome") String nome);

}