package com.api.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.biblio.model.CadUsuario;

public interface UsuarioRepository extends JpaRepository<CadUsuario, Long>  {
	
	CadUsuario findById(long id);

}
