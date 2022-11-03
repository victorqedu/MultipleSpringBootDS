package com.web.caido.service.admindb2;
import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.web.caido.entity.admindb2.Lang;import com.web.caido.dao.admindb2.LangDAO;
@Service
public class LangServiceImpl implements LangService {

	private final LangDAO objectDAO;
	
	@Autowired
	public LangServiceImpl(LangDAO theObjectDAO) {
		objectDAO = theObjectDAO;
	}
	
	@Override
	@Transactional
	public List<Lang> findAll() {
		return objectDAO.findAll();
	}

	@Override
	@Transactional
	public Lang findById(int theId) {
		return objectDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Lang object) {
		objectDAO.save(object);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		objectDAO.deleteById(theId);
	}
}
