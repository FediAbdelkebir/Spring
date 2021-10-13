package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CategorieProduit")
public class CategorieProduit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8892192930628196313L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCategorieProduit")
	private int idCategorieProduit;
	
	public CategorieProduit(int idCategorieProduit) {
		super();
		this.idCategorieProduit = idCategorieProduit;
	}

	@Override
	public String toString() {
		return "CategorieProduit [idCategorieProduit=" + idCategorieProduit + "]";
	}

	public int getIdCategorieProduit() {
		return idCategorieProduit;
	}

	public void setIdCategorieProduit(int idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}

	public CategorieProduit() {
		// TODO Auto-generated constructor stub
	}

}
