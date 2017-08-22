package br.com.fiap.test;

import java.util.Calendar;

import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.entity.Animal;
import br.com.fiap.entity.Porte;
import br.com.fiap.exception.DBException;

public class Test01 {

	public static void main(String[] args) {

		Animal animal = new Animal(0, "Tigre", Porte.GRANDE, null, Calendar.getInstance());
		AnimalDAOImpl dao = new AnimalDAOImpl();

		try {
			dao.cadastrar(animal);
			dao.salvar();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
