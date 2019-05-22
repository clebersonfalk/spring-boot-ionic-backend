package com.clebersonfalk.springbootmodeloconceitual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clebersonfalk.springbootmodeloconceitual.domain.Categoria;
import com.clebersonfalk.springbootmodeloconceitual.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
}
