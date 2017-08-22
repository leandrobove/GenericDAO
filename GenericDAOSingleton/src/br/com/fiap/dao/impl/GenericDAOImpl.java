package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.entity.Animal;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class GenericDAOImpl<E, T> implements GenericDAO<E, T> {

	private EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

	// .class da entidade (usado na busca)
	private final Class<E> classe;

	// Construtor
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		classe = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(E entity) {
		em.persist(entity);
	}

	@Override
	public void remover(T codigo) throws IdNotFoundException {
		try {
			E pesquisar = pesquisar(codigo);
			em.remove(pesquisar);
		} catch (Exception e) {
			throw new IdNotFoundException("Erro ao remover, código não encontrado!", e);
		}
	}

	@Override
	public E pesquisar(T codigo) {
		return em.find(classe, codigo);
	}

	@Override
	public void alterar(E entity) {
		em.merge(entity);
	}

	@Override
	public void salvar() throws DBException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<Animal> listar() {
		return em.createQuery("from Animal", Animal.class).getResultList();
	}

}
