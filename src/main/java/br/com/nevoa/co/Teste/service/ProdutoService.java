package br.com.nevoa.co.Teste.service;

import br.com.nevoa.co.Teste.model.Produto;
import br.com.nevoa.co.Teste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public Produto inserir(Produto produtoInserir) {
        // Verifica se o produto já existe (assumindo que o ID é único)
        if (produtoRepository.findById(produtoInserir.getId()).isPresent())
            throw new RuntimeException("Produto já existe!");


        return produtoRepository.save(produtoInserir);
    }
}


