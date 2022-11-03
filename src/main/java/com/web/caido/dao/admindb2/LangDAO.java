package com.web.caido.dao.admindb2;
import java.util.List;
import com.web.caido.entity.admindb2.Lang;
public interface LangDAO {
	public List<Lang> findAll();
	public Lang findById(int theId);
	public void save(Lang object);
	public void deleteById(int theId);
}
