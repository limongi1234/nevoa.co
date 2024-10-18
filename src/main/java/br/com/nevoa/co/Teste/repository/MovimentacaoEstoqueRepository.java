package br.com.nevoa.co.Teste.repository;

import br.com.nevoa.co.Teste.model.MovimentacaoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovimentacaoEstoqueRepository extends JpaRepository <MovimentacaoEstoque, Long> {
     Optional<MovimentacaoEstoque> findById(Long id);
}
