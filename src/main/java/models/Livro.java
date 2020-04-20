package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import models.Categoria;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

@Entity
@Table(name="TB_LIVRO")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private double preco;
    private int paginas;
    private int codigo;
    private Categoria idCategoria;




}
