package com.lojaweb.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lojaweb.backend.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
    
}
