package com.web.caido.dao.hospital4;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.web.caido.entity.hospital4.AntibiogramaAntibiotice;
@Repository
public class AntibiogramaAntibioticeDAOHibernateImpl implements AntibiogramaAntibioticeDAO {
	private EntityManager entityManager;
	@Autowired
	public AntibiogramaAntibioticeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	@Override
	public List<AntibiogramaAntibiotice> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<AntibiogramaAntibiotice> theQuery = currentSession.createQuery("from AntibiogramaAntibiotice", AntibiogramaAntibiotice.class);
		List<AntibiogramaAntibiotice> objects = theQuery.getResultList();
		return objects;
	}

	@Override
	public AntibiogramaAntibiotice findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		AntibiogramaAntibiotice object = currentSession.get(AntibiogramaAntibiotice.class, theId);
		return object;
	}

	@Override
	public void save(AntibiogramaAntibiotice object) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(object);
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from AntibiogramaAntibiotice where id=:Id");
		theQuery.setParameter("Id", theId);
		theQuery.executeUpdate();
	}
}
