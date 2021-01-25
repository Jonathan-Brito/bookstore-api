package com.jonathan.brito.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.brito.bookstore.domain.Categoria;
import com.jonathan.brito.bookstore.domain.Livro;
import com.jonathan.brito.bookstore.repositories.CategoriaRepository;
import com.jonathan.brito.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDados() {

		Categoria cat1 = new Categoria(null, "Informática", "livros de TI");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}

}
