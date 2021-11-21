package com.api.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.biblio.model.CadLivro;

public interface LivroRepository extends JpaRepository<CadLivro, Long> {
	
	CadLivro findById(long id);

}
