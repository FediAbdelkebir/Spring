package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rayon")
public class Rayon implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6563351112036345353L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idRayon")
	private long idRayon;

	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="libelle", nullable=false)
	private String libelle;

	public Rayon(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Rayon(int idRayon, String code, String libelle) {
		super();
		this.idRayon = idRayon;
		this.code = code;
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", code=" + code + ", libelle=" + libelle + "]";
	}

	public long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(int idRayon) {
		this.idRayon = idRayon;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Rayon() {
		// TODO Auto-generated constructor stub
	}

}
