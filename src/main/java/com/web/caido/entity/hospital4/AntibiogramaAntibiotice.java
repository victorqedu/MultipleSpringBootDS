package com.web.caido.entity.hospital4;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="antibiograma_antibiotice")
public class AntibiogramaAntibiotice implements Serializable  {
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
	@Column(name="code")
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="to_left")
	private Integer toLeft;
	public Integer getToLeft() {
		return toLeft;
	}
	public void setToLeft(Integer toLeft) {
		this.toLeft = toLeft;
	}
	@Column(name="to_right")
	private Integer toRight;
	public Integer getToRight() {
		return toRight;
	}
	public void setToRight(Integer toRight) {
		this.toRight = toRight;
	}
	@Column(name="vizibil")
	private Integer vizibil;
	public Integer getVizibil() {
		return vizibil;
	}
	public void setVizibil(Integer vizibil) {
		this.vizibil = vizibil;
	}
	@Column(name="id_tip_bacterii")
	private Integer idTipBacterii;
	public Integer getIdTipBacterii() {
		return idTipBacterii;
	}
	public void setIdTipBacterii(Integer idTipBacterii) {
		this.idTipBacterii = idTipBacterii;
	}
	@Column(name="uid")
	private String uid;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public AntibiogramaAntibiotice() {}

	public AntibiogramaAntibiotice(Integer id,String code,String name,Integer toLeft,Integer toRight,Integer vizibil,Integer idTipBacterii,String uid) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.toLeft = toLeft;
		this.toRight = toRight;
		this.vizibil = vizibil;
		this.idTipBacterii = idTipBacterii;
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "AntibiogramaAntibiotice[id= "+id+" , code= "+code+" , name= "+name+" , toLeft= "+toLeft+" , toRight= "+toRight+" , vizibil= "+vizibil+" , idTipBacterii= "+idTipBacterii+" , uid= "+uid+" , ";
	}

}
