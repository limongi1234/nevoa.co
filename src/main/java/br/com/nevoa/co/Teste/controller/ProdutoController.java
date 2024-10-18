package br.com.nevoa.co.Teste.controller;

import br.com.nevoa.co.Teste.model.Produto;
import br.com.nevoa.co.Teste.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    @Transactional
    public
    Produto inserir(@Valid @RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}


