package br.com.nevoa.co.Teste.model;

import br.com.nevoa.co.Teste.Tipo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name  = "movimentacaoEstoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    @Column (name = "data_cmovimentacao")
    private LocalDate data;

    @Column (name = "observacao", length = 100, nullable = false)
    private String observacao;

    @Column
    private int quantidade_estoque;

    @Column
    private Tipo tipos;

    @OneToOne
    @JoinColumn(name = "id_cproduto")
    private Produto id_produto;

    @ManyToOne
    private Produto produto;
}
