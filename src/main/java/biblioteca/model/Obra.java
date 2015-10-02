package biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "obra")
public class Obra implements Comparable<Obra>,Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "obra_sequence_generator")
    @SequenceGenerator(name = "obra_sequence_generator", sequenceName = "obra_sequence_cod", allocationSize = 1)
    @Column(name = "codigo", nullable = false)
    private int codigo;
    private String titulo;
    @JoinColumn(name = "cod_categoria", referencedColumnName = "codigo")
    @ManyToOne
    @JsonIgnore
    private Categoria categoria;
    @JoinColumn(name = "cod_autor", referencedColumnName = "codigo")
    @ManyToOne
    @JsonIgnore
    private Autor autor;
    private int anoPublicacao;
    @JoinColumn(name = "cod_editora", referencedColumnName = "codigo")
    @ManyToOne
    @JsonIgnore
    private Editora editora;
    private String urlImagemPequena;
    private String urlImagemGrande;
    private int exemplar;

    public Obra() {
    }

    public Obra(String titulo, Categoria categoria, Autor autor, int anoPublicacao, Editora editora, String urlImagemPequena, String urlImagemGrande, int exemplar) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.urlImagemPequena = urlImagemPequena;
        this.urlImagemGrande = urlImagemGrande;
        this.exemplar = exemplar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getUrlImagemPequena() {
        return urlImagemPequena;
    }

    public void setUrlImagemPequena(String urlImagemPequena) {
        this.urlImagemPequena = urlImagemPequena;
    }

    public String getUrlImagemGrande() {
        return urlImagemGrande;
    }

    public void setUrlImagemGrande(String urlImagemGrande) {
        this.urlImagemGrande = urlImagemGrande;
    }

    public int getExemplar() {
        return exemplar;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public int compareTo(Obra o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }
}