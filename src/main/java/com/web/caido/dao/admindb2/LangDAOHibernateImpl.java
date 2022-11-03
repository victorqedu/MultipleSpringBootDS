package com.web.caido.dao.admindb2;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.web.caido.entity.admindb2.Lang;
@Repository
public class LangDAOHibernateImpl implements LangDAO {
	private EntityManager entityManager;
	@Autowired
	public LangDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	@Override
	public List<Lang> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Lang> theQuery = currentSession.createQuery("from Lang", Lang.class);
		List<Lang> objects = theQuery.getResultList();
		return objects;
	}

	@Override
	public Lang findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Lang object = currentSession.get(Lang.class, theId);
		return object;
	}

	@Override
	public void save(Lang object) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(object);
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from Lang where id=:Id");
		theQuery.setParameter("Id", theId);
		theQuery.executeUpdate();
	}
}
