package br.com.nevoa.co.Teste.repository;

import br.com.nevoa.co.Teste.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
    public String findByNome(String nome);
}