package biblioteca.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "editora")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editora_sequence_generator")
    @SequenceGenerator(name = "editora_sequence_generator", sequenceName = "editora_sequence_cod", allocationSize = 1)
    @Column(name = "codigo", nullable = false)
    private int codigo;
    private String nome;

    @OneToMany(mappedBy = "editora")
    private List<Obra> obras;

    public Editora(){}

    public Editora(int codigo){
        this.codigo = codigo;
    }

    public Editora(int codigo, String nome) {

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
