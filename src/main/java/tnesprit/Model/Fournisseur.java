package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fournisseur")
public class Fournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8700393451049620624L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idFournisseur")
	private long idFournisseur;

	@Column(name="codeFournisseur", nullable=false)
	private String code;
	
	@Column(name="libelleFournisseur", nullable=false)
	private String libelle;
	
	public Fournisseur(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Fournisseur(int idFournisseur, String code, String libelle) {
		super();
		this.idFournisseur = idFournisseur;
		this.code = code;
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", code=" + code + ", libelle=" + libelle + "]";
	}

	public long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
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

	public Fournisseur() {
		// TODO Auto-generated constructor stub
	}

}
