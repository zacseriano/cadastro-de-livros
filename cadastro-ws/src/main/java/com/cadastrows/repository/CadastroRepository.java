package com.cadastrows.repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastrows.models.Livro;

public interface CadastroRepository extends CrudRepository<Livro, String> {

}
