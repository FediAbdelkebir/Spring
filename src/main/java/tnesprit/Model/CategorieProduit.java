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
@Table(name="CategorieProduit")
public class CategorieProduit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8892192930628196313L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCategorieProduit")
	private long idCategorieProduit;
	
	@Column(name="ELECTROMENAGER")
	private Boolean ELECTROMENAGER;

	@Column(name="ALIMENTAIRE")
	private Boolean ALIMENTAIRE;
	
	@Column(name="QUINCAILLERIE")
	private Boolean QUINCAILLERIE;
	

	public CategorieProduit(Boolean eLECTROMENAGER,
			Boolean aLIMENTAIRE, Boolean qUINCAILLERIE) {
		super();
		ELECTROMENAGER = eLECTROMENAGER;
		ALIMENTAIRE = aLIMENTAIRE;
		QUINCAILLERIE = qUINCAILLERIE;
	}

	public CategorieProduit(int idCategorieProduit, Boolean eLECTROMENAGER,
			Boolean aLIMENTAIRE, Boolean qUINCAILLERIE) {
		super();
		this.idCategorieProduit = idCategorieProduit;
		ELECTROMENAGER = eLECTROMENAGER;
		ALIMENTAIRE = aLIMENTAIRE;
		QUINCAILLERIE = qUINCAILLERIE;
	}

	@Override
	public String toString() {
		return "CategorieProduit [idCategorieProduit=" + idCategorieProduit + ", ELECTROMENAGER=" + ELECTROMENAGER
				+ ", ALIMENTAIRE=" + ALIMENTAIRE + ", QUINCAILLERIE=" + QUINCAILLERIE + "]";
	}

	public Boolean getELECTROMENAGER() {
		return ELECTROMENAGER;
	}

	public void setELECTROMENAGER(Boolean eLECTROMENAGER) {
		ELECTROMENAGER = eLECTROMENAGER;
	}

	public Boolean getALIMENTAIRE() {
		return ALIMENTAIRE;
	}

	public void setALIMENTAIRE(Boolean aLIMENTAIRE) {
		ALIMENTAIRE = aLIMENTAIRE;
	}

	public Boolean getQUINCAILLERIE() {
		return QUINCAILLERIE;
	}

	public void setQUINCAILLERIE(Boolean qUINCAILLERIE) {
		QUINCAILLERIE = qUINCAILLERIE;
	}

	public long getIdCategorieProduit() {
		return idCategorieProduit;
	}

	public void setIdCategorieProduit(int idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}

	public CategorieProduit() {
		// TODO Auto-generated constructor stub
	}

}
