package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Produit")
public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6546100055361088412L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idProduit")
	private long idProduit;

	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="libelle", nullable=false)
	private String libelle;
	
	@Column(name="prixUnitaire", nullable=false)
	private String prixUnitaire;
	
	public Produit(String code, String libelle, String prixUnitaire) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}

	public Produit(int idProduit, String code, String libelle, String prixUnitaire) {
		super();
		this.idProduit = idProduit;
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", libelle=" + libelle + ", prixUnitaire="
				+ prixUnitaire + "]";
	}

	public long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
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

	public String getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(String prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Produit() {
		// TODO Auto-generated constructor stub
	}

}
