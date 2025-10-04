package prueba;

import dao.SubjectDAO;
import dao.SubjectDaoImpl;
import model.Sujeto;

public class Editar {

	public static void main(String[] args) {
		SubjectDAO dao = new SubjectDaoImpl();
		
		Sujeto subject = new Sujeto();
		subject.setIdSubject(1);
		subject.setNombre("Matematicas");
		subject.setCreditos("2");
		
		dao.update(subject);

	}

}
