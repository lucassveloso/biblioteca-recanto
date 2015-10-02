package biblioteca.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_sequence_generator")
    @SequenceGenerator(name = "categoria_sequence_generator", sequenceName = "categoria_sequence_cod", allocationSize = 1)
    @Column(name = "codigo", nullable = false)
    private int codigo;
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Obra> obras;

    public Categoria(){}

    public Categoria(int codigo){
        this.codigo = codigo;
    }

    public Categoria(int codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
}
