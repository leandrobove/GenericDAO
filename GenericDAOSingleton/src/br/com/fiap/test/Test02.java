package br.com.fiap.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.entity.Animal;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Test02 {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		AnimalDAO dao = new AnimalDAOImpl();
		
		List<Animal> listar = dao.listar();
		
		for (Animal a : listar) {
			System.out.println(a.getNome());
		}

	}

}
