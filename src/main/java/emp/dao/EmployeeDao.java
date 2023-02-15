package emp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;


import emp.dto.Employee;
@Component
public class EmployeeDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void signup(Employee emp)
	{
		et.begin();
		em.persist(emp);
		et.commit();
	}
	public Employee login(String email)
	{
		List<Employee> list=em.createQuery("select x from Employee x where email=?1").setParameter(1,email).getResultList();
		if(list.isEmpty())
		{
		return null;	
		}
		else{
			return  list.get(0);
		}
		}
	public List<Employee> fetchall()
	{
		return em.createQuery("select x from Employee x").getResultList();
		
	}

}
