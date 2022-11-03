package com.web.caido.dao.hospital4;
import java.util.List;
import com.web.caido.entity.hospital4.AntibiogramaAntibiotice;
public interface AntibiogramaAntibioticeDAO {
	public List<AntibiogramaAntibiotice> findAll();
	public AntibiogramaAntibiotice findById(int theId);
	public void save(AntibiogramaAntibiotice object);
	public void deleteById(int theId);
}
