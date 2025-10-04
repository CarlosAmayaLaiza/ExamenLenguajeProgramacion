package prueba;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Sujeto;

import java.util.List;

public class BuscarPorNombre {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1_CDAL_Jv");
        EntityManager em = emf.createEntityManager();

        String nombreBuscado = "Matemáticas";  // Cambia este nombre según tus datos

        TypedQuery<Sujeto> query = em.createQuery(
            "SELECT s FROM Sujeto s WHERE s.nombre = :nombre", Sujeto.class);
        query.setParameter("nombre", nombreBuscado);

        List<Sujeto> resultados = query.getResultList();

        if (resultados.isEmpty()) {
            System.out.println("----No se encontró ningún curso con el nombre: " + nombreBuscado+"----");
        } else {
            for (Sujeto s : resultados) {
            	System.out.println("----Usted acaba de Buscar------");
                System.out.println("ID: " + s.getIdSubject());
                System.out.println("Nombre: " + s.getNombre());
                System.out.println("Créditos: " + s.getCreditos());
                System.out.println("-------------------------------");
            }
        }
        em.close();
        emf.close();
    }
}

