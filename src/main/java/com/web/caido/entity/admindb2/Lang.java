package com.web.caido.entity.admindb2;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="ad_lang")
public class Lang implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="nume")
	private String nume;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Column(name="import_id")
	private String importId;
	public String getImportId() {
		return importId;
	}
	public void setImportId(String importId) {
		this.importId = importId;
	}
	public Lang() {}

	public Lang(Integer id,String nume,String importId) {
		this.id = id;
		this.nume = nume;
		this.importId = importId;
	}

	@Override
	public String toString() {
		return "Lang[id= "+id+" , nume= "+nume+" , importId= "+importId+" , ";
	}

}
