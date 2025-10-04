package prueba;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Sujeto;

public class Listar {

    public static void main(String[] args) {
        EntityManagerFactory fabric = Persistence.createEntityManagerFactory("T1_CDAL_Jv");
        EntityManager em = fabric.createEntityManager();

        Query query = em.createQuery("SELECT s FROM Sujeto s", Sujeto.class);

        @SuppressWarnings("unchecked")
        List<Sujeto> lista = (List<Sujeto>) query.getResultList();

        for (Sujeto s : lista) {
        	System.out.println("----Lista Subject------");
            System.out.println("ID: " + s.getIdSubject());
            System.out.println("Nombre: " + s.getNombre());
            System.out.println("Créditos: " + s.getCreditos());
            System.out.println("-----------------------");
        }

        em.close();
        fabric.close();
    }
}

