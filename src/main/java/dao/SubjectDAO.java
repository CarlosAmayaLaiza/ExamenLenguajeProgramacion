package dao;
import java.util.List;

import model.Sujeto;


public interface SubjectDAO {
	
	public void create(Sujeto subject);
	
	public void update(Sujeto subject);
	
	public void delete(Integer id);
	
	public Sujeto find(Integer id);
	
	public List<Sujeto> findAll();
	 
}