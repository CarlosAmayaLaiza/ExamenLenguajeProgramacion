package prueba;

import dao.SubjectDAO;
import dao.SubjectDaoImpl;
import model.Sujeto;

public class Registrar {

	public static void main(String[] args) {
		SubjectDAO dao = new SubjectDaoImpl();
		
		Sujeto subject = new Sujeto();
		subject.setNombre("Gerente de Sede");
		subject.setCreditos("1");
		
		dao.create(subject);

	}

}
