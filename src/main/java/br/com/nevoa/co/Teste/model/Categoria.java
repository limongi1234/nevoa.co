package br.com.nevoa.co.Teste.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 150, nullable = false)
    private String descricao;

    // Optional: Additional fields or relationships

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;
}