package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CategorieClient")
public class CategorieClient implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8146417779552002630L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCategorieClient")
	private int idCategorieClient;
	
	@Column(name="nom", nullable=false)
	private int nom;
	
	public CategorieClient(int nom) {
		super();
		this.nom = nom;
	}

	public CategorieClient(int idCategorieClient, int nom) {
		super();
		this.idCategorieClient = idCategorieClient;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "CategorieClient [idCategorieClient=" + idCategorieClient + ", nom=" + nom + "]";
	}

	public int getIdCategorieClient() {
		return idCategorieClient;
	}

	public void setIdCategorieClient(int idCategorieClient) {
		this.idCategorieClient = idCategorieClient;
	}

	public int getNom() {
		return nom;
	}

	public void setNom(int nom) {
		this.nom = nom;
	}

	public CategorieClient() {
		// TODO Auto-generated constructor stub
	}

}
