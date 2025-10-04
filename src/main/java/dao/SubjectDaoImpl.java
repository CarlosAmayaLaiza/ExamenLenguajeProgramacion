package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Sujeto;

public class SubjectDaoImpl implements SubjectDAO {
	
	EntityManagerFactory fabric;
	EntityManager em;
	
	public SubjectDaoImpl() {
		super();
		fabric = Persistence.createEntityManagerFactory("T1_CDAL_Jv");
		em = fabric.createEntityManager();
	}
	
	@Override
	public void create(Sujeto subject) {
		try {
			em.getTransaction().begin(); //Iniciamos Trasaccion
			em.persist(subject);// Trasaccion
			em.getTransaction().commit();//Confirmamos la Trasaccion
			
		} catch (Exception e) {
			em.getTransaction().rollback(); //Vuelva a un estado anterior Trasaccion
		}
		
	}

		

	@Override
	public void update(Sujeto subject) {
		try {
			em.getTransaction().begin(); //Iniciamos Trasaccion
			em.merge(subject);// Trasaccion; merge une 2 objetos 
			em.getTransaction().commit();//Confirmamos la Trasaccion
			
		} catch (Exception e) {
			em.getTransaction().rollback(); //Vuelva a un estado anterior Trasaccion
		}
	}
	


	@Override
	public void delete(Integer id) {
	    try {
	        em.getTransaction().begin();
	        Sujeto sujeto = em.find(Sujeto.class, id); // Debes buscar la entidad primero
	        if (sujeto != null) {
	            em.remove(sujeto); // Ahora sí puedes eliminar
	        }
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        em.getTransaction().rollback();
	        System.out.println("Error al eliminar: " + e.getMessage());
	    }
	}


	@Override
	public Sujeto find(Integer id) {
		try {
			return em.find(Sujeto.class, id);
			
		} catch (Exception e) {
			return null;
		}
	
	}

	@Override
	public List<Sujeto> findAll() {
	    List<Sujeto> lista;
	    try {
	        Query query = em.createQuery("SELECT s FROM Sujeto s", Sujeto.class); // JPQL
	        lista = query.getResultList();
	    } catch (Exception e) {
	        lista = null;
	        System.out.println("Error en findAll: " + e.getMessage());
	    }
	    return lista;
	}

}
