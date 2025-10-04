package prueba;

import dao.SubjectDAO;
import dao.SubjectDaoImpl;

import model.Sujeto;

public class Eliminar {

	public static void main(String[] args) {
		SubjectDAO dao = new SubjectDaoImpl();
		
		dao.delete(1);

	}

}
