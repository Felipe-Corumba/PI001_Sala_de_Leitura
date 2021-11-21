package com.api.biblio.resource;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.biblio.model.CadUsuario;
import com.api.biblio.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/apicadusuario")
@Api(value="API REST Cadusuario")
@CrossOrigin(origins="*")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@GetMapping("/cadusuario")
	@ApiOperation(value="Retorna usuario")
	public List<CadUsuario> listaTeste(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/cadusuario/{id}")
	@ApiOperation(value="Retorna usuario")
	public CadUsuario listaCadUsuario(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/cadusuario")
	@ApiOperation(value="Salva usuario")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public CadUsuario salvaCadUsuario(@RequestBody CadUsuario cadusuario) {
	    return usuarioRepository.save(cadusuario);
	}
	
	@DeleteMapping("/cadusuario")
	@ApiOperation(value="Apaga usuario")
	public void deleteCadLivro(@RequestBody CadUsuario cadusuario) {
		usuarioRepository.delete(cadusuario);
	}
	
	@PutMapping("/cadusuario")
	@ApiOperation(value="Atualiza usuario")
	public CadUsuario atualizaCadLivro(@RequestBody CadUsuario cadusuario) {
	    return usuarioRepository.save(cadusuario);
	}
	
}
