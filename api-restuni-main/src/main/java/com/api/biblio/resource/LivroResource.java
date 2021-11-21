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

import com.api.biblio.model.CadLivro;
import com.api.biblio.repository.LivroRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/apicadlivro")
@Api(value="API REST Cadlivro")
@CrossOrigin(origins="*")
public class LivroResource {
	
	@Autowired
	LivroRepository livroRepository;
	
	
	@GetMapping("/cadlivro")
	@ApiOperation(value="Retorna livros")
	public List<CadLivro> listaTeste(){
		return livroRepository.findAll();
	}
	
	@GetMapping("/cadlivro/{id}")
	@ApiOperation(value="Retorna livros")
	public CadLivro listaCadLivro(@PathVariable(value="id") long id){
		return livroRepository.findById(id);
	}
	
	@PostMapping("/cadlivro")
	@ApiOperation(value="Salva um livros")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public CadLivro salvateste(@RequestBody CadLivro cadlivro) {
	    return livroRepository.save(cadlivro);
	}
	
	@DeleteMapping("/cadlivro")
	@ApiOperation(value="Apaga um livro")
	public void deleteCadLivro(@RequestBody CadLivro cadlivro) {
		livroRepository.delete(cadlivro);
	}
	
	@PutMapping("/cadlivro")
	@ApiOperation(value="Atualiza dados livro")
	public CadLivro atualizaCadLivro(@RequestBody CadLivro cadlivro) {
	    return livroRepository.save(cadlivro);
	}

}
