package biblioteca.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_sequence_generator")
    @SequenceGenerator(name = "autor_sequence_generator", sequenceName = "autor_sequence_cod", allocationSize = 1)
    @Column(name = "codigo", nullable = false)
    private int codigo;
    private String nome;

    @OneToMany(mappedBy = "autor")
    private List<Obra> obras;

    public Autor(){}

    public Autor(int codigo){
        this.codigo = codigo;
    }

    public Autor(int codigo, String nome) {

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
