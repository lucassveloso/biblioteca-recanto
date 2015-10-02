package biblioteca.dao;

        import biblioteca.model.Categoria;
        import biblioteca.model.Obra;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.data.repository.query.Param;

public interface ObraRepository extends CrudRepository<Obra, Integer> {

    @Query(Consultas.Obra.FIND_BY_NOME)
    Page<Obra> findByNome(@Param("titulo") String titulo, Pageable paginacao);

    @Query(Consultas.Obra.FIND_BY_NOME_NA_CATEGORIA)
    Page<Obra> findByNomeNaCategoria(@Param("titulo") String titulo, @Param("categoria") int categoria, Pageable paginacao);

    @Query(Consultas.Obra.FIND_BY_NOME)
    Iterable<Obra> findByNome(@Param("titulo") String titulo);

    Page<Obra> findByCategoria(Categoria categoria, Pageable paginacao);
}