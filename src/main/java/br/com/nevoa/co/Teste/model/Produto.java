package br.com.nevoa.co.Teste.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    @Column (name = "nome", length = 30, nullable = false)
    private String nome;

    @Column (name = "descricao", length = 100, nullable = false)
    private String descricao;

    @Column (name = "preco", length = 100, nullable = false)
    private float preco;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToOne(mappedBy = "produto")
    private MovimentacaoEstoque movimentacaoEstoque;
}
