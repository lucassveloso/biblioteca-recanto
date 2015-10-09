package biblioteca.dao;

public class Consultas {

    public class Obra{
        public static final String FIND_BY_TITULO = "SELECT a FROM obra a WHERE UPPER(UNACCENT(titulo)) LIKE UPPER(UNACCENT(:titulo))";
        public static final String FIND_BY_TITULO_NA_CATEGORIA = "SELECT a FROM obra a WHERE cod_categoria = :categoria AND UPPER(UNACCENT(titulo)) LIKE UPPER(UNACCENT(:titulo))";

    }
    public class Categoria{
        public static final String FIND_BY_NOME = "SELECT a FROM categoria a WHERE UPPER(UNACCENT(nome)) LIKE UPPER(UNACCENT(:nome))";
    }

    public class Autor {
        public static final String FIND_BY_NOME = "SELECT a FROM autor a WHERE UPPER(UNACCENT(nome)) LIKE UPPER(UNACCENT(:nome))";
    }

    public class Editora {
        public static final String FIND_BY_NOME = "SELECT a FROM editora a WHERE UPPER(UNACCENT(nome)) LIKE UPPER(UNACCENT(:nome))";
    }
}
