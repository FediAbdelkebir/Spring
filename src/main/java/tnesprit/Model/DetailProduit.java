package tnesprit.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DetailProduit")
public class DetailProduit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1089802036295241896L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idDetailProduit")
	private long idDetailProduit;
	
	@Column(name="dateCreation", nullable=false)
	private Date dateCreation;

	@Column(name="dateDerniereModification", nullable=false)
	private Date dateDerniereModification;

	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
	public DetailProduit(Date dateCreation, Date dateDerniereModification, CategorieProduit categorieProduit) {
		super();
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
	}

	public DetailProduit(int idDetailProduit, Date dateCreation, Date dateDerniereModification,
			CategorieProduit categorieProduit) {
		super();
		this.idDetailProduit = idDetailProduit;
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
	}

	@Override
	public String toString() {
		return "DetailProduit [idDetailProduit=" + idDetailProduit + ", dateCreation=" + dateCreation
				+ ", dateDerniereModification=" + dateDerniereModification + ", categorieProduit=" + categorieProduit
				+ "]";
	}

	public long getIdDetailProduit() {
		return idDetailProduit;
	}

	public void setIdDetailProduit(int idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}

	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	public DetailProduit() {
		// TODO Auto-generated constructor stub
	}

}
