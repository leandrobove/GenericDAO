package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Animal;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<E, T> {
	
	void cadastrar(E entity);
	void remover(T codigo) throws IdNotFoundException;
	E pesquisar(T codigo);
	void alterar(E entity);
	void salvar() throws DBException;
	List<Animal> listar();

}
