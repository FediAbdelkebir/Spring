package tnesprit.Model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.xml.bind.v2.model.core.EnumConstant;

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
	private long idCategorieClient;
	
	@Column(name="FIDELE")
	private Boolean FIDELE;
	
	@Column(name="ORDINAIRE")
	private Boolean ORDINAIRE;

	@Column(name="PREMIUM")
	private Boolean PREMIUM;
	
	@Override
	public String toString() {
		return "CategorieClient [idCategorieClient=" + idCategorieClient + ", FIDELE=" + FIDELE + ", ORDINAIRE="
				+ ORDINAIRE + ", PREMIUM=" + PREMIUM + "]";
	}

	public CategorieClient(Boolean fIDELE,
			Boolean oRDINAIRE, Boolean pREMIUM) {
		super();
		FIDELE = fIDELE;
		ORDINAIRE = oRDINAIRE;
		PREMIUM = pREMIUM;
	}

	public CategorieClient(int idCategorieClient, Boolean fIDELE,
			Boolean oRDINAIRE, Boolean pREMIUM) {
		super();
		this.idCategorieClient = idCategorieClient;
		FIDELE = fIDELE;
		ORDINAIRE = oRDINAIRE;
		PREMIUM = pREMIUM;
	}

	public Boolean getFIDELE() {
		return FIDELE;
	}

	public void setFIDELE(Boolean fIDELE) {
		FIDELE = fIDELE;
	}

	public Boolean getORDINAIRE() {
		return ORDINAIRE;
	}

	public void setORDINAIRE(Boolean oRDINAIRE) {
		ORDINAIRE = oRDINAIRE;
	}

	public Boolean getPREMIUM() {
		return PREMIUM;
	}

	public void setPREMIUM(Boolean pREMIUM) {
		PREMIUM = pREMIUM;
	}

	public long getIdCategorieClient() {
		return idCategorieClient;
	}

	public void setIdCategorieClient(int idCategorieClient) {
		this.idCategorieClient = idCategorieClient;
	}

	public CategorieClient() {
		// TODO Auto-generated constructor stub
	}

}
