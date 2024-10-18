package br.com.nevoa.co.Teste.controller;

import java.util.List;
import java.util.Optional;

import br.com.nevoa.co.Teste.model.MovimentacaoEstoque;
import br.com.nevoa.co.Teste.service.MovimentacaoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoEstoqueController {

    @Autowired
    private MovimentacaoEstoqueService movimentacaoEstoqueService;

    @GetMapping
    public ResponseEntity<List<MovimentacaoEstoque>> findAll() {
        List<MovimentacaoEstoque> movimentacoes = movimentacaoEstoqueService.findAll();
        return new ResponseEntity<>(movimentacoes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MovimentacaoEstoque>> findById(@PathVariable Long id) {
        Optional<MovimentacaoEstoque> movimentacao = movimentacaoEstoqueService.findById(id);
        if (movimentacao.isPresent())
            return new ResponseEntity<>(movimentacao, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    public ResponseEntity<MovimentacaoEstoque> save(@RequestBody MovimentacaoEstoque movimentacaoEstoque) {
        MovimentacaoEstoque savedMovimentacao = movimentacaoEstoqueService.save(movimentacaoEstoque);
        return new ResponseEntity<>(savedMovimentacao, HttpStatus.CREATED);
    }
}
