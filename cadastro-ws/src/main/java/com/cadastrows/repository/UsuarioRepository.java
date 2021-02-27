package com.cadastrows.repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastrows.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}