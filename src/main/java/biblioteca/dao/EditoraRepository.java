package biblioteca.dao;

import biblioteca.model.Editora;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EditoraRepository extends CrudRepository<Editora, Integer>{

    @Query(Consultas.Editora.FIND_BY_NOME)
    List<Editora> findByNome(@Param("nome") String nome);

}