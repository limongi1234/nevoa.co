package br.com.nevoa.co.Teste.service;

import br.com.nevoa.co.Teste.model.MovimentacaoEstoque;
import br.com.nevoa.co.Teste.repository.MovimentacaoEstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoEstoqueService {

    private final MovimentacaoEstoqueRepository movimentacaoEstoqueRepository;

    @Autowired
    public MovimentacaoEstoqueService(MovimentacaoEstoqueRepository movimentacaoEstoqueRepository) {
        this.movimentacaoEstoqueRepository = movimentacaoEstoqueRepository;
    }

    public List<MovimentacaoEstoque> findAll() {
        return movimentacaoEstoqueRepository.findAll();
    }

    public Optional<MovimentacaoEstoque> findById(Long id) {
        return movimentacaoEstoqueRepository.findById(id);
    }

    public MovimentacaoEstoque save(MovimentacaoEstoque movimentacaoEstoque) {
        return movimentacaoEstoqueRepository.save(movimentacaoEstoque);
    }

    public void delete(Long id) {
        movimentacaoEstoqueRepository.deleteById(id);
    }

}

