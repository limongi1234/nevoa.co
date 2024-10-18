package br.com.nevoa.co.Teste.repository;

import br.com.nevoa.co.Teste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>
{
    Optional<Produto> findById(Long id);
}