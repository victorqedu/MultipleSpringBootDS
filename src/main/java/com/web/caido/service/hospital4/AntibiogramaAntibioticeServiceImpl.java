package com.web.caido.service.hospital4;
import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.web.caido.entity.hospital4.AntibiogramaAntibiotice;import com.web.caido.dao.hospital4.AntibiogramaAntibioticeDAO;
@Service
public class AntibiogramaAntibioticeServiceImpl implements AntibiogramaAntibioticeService {

	private final AntibiogramaAntibioticeDAO objectDAO;
	
	@Autowired
	public AntibiogramaAntibioticeServiceImpl(AntibiogramaAntibioticeDAO theObjectDAO) {
		objectDAO = theObjectDAO;
	}
	
	@Override
	@Transactional
	public List<AntibiogramaAntibiotice> findAll() {
		return objectDAO.findAll();
	}

	@Override
	@Transactional
	public AntibiogramaAntibiotice findById(int theId) {
		return objectDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(AntibiogramaAntibiotice object) {
		objectDAO.save(object);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		objectDAO.deleteById(theId);
	}
}
