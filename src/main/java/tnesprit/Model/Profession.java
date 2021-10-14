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
@Table(name="Profession")
public class Profession implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7618761972738316804L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idProfession")
	private long idProfession;

	@Column(name="DOCTEUR")
	private Boolean DOCTEUR;
	
	@Column(name="INGENIEUR")
	private Boolean INGENIEUR;
	
	@Column(name="ETUDIANT")
	private Boolean ETUDIANT;
	
	@Column(name="COMMERCIAL")
	private Boolean COMMERCIAL;
	
	@Column(name="CADRE")
	private Boolean CADRE;
	
	@Column(name="AUTRE")
	private Boolean AUTRE;

	public Profession(Boolean dOCTEUR, Boolean iNGENIEUR,
			Boolean eTUDIANT, Boolean cOMMERCIAL,
			Boolean cADRE, Boolean aUTRE) {
		super();
		DOCTEUR = dOCTEUR;
		INGENIEUR = iNGENIEUR;
		ETUDIANT = eTUDIANT;
		COMMERCIAL = cOMMERCIAL;
		CADRE = cADRE;
		AUTRE = aUTRE;
	}

	public Profession(int idProfession, Boolean dOCTEUR,
			Boolean iNGENIEUR, Boolean eTUDIANT,
			Boolean cOMMERCIAL, Boolean cADRE,
			Boolean aUTRE) {
		super();
		this.idProfession = idProfession;
		DOCTEUR = dOCTEUR;
		INGENIEUR = iNGENIEUR;
		ETUDIANT = eTUDIANT;
		COMMERCIAL = cOMMERCIAL;
		CADRE = cADRE;
		AUTRE = aUTRE;
	}

	@Override
	public String toString() {
		return "Profession [idProfession=" + idProfession + ", DOCTEUR=" + DOCTEUR + ", INGENIEUR=" + INGENIEUR
				+ ", ETUDIANT=" + ETUDIANT + ", COMMERCIAL=" + COMMERCIAL + ", CADRE=" + CADRE + ", AUTRE=" + AUTRE
				+ "]";
	}

	public Boolean getDOCTEUR() {
		return DOCTEUR;
	}

	public void setDOCTEUR(Boolean dOCTEUR) {
		DOCTEUR = dOCTEUR;
	}

	public Boolean getINGENIEUR() {
		return INGENIEUR;
	}

	public void setINGENIEUR(Boolean iNGENIEUR) {
		INGENIEUR = iNGENIEUR;
	}

	public Boolean getETUDIANT() {
		return ETUDIANT;
	}

	public void setETUDIANT(Boolean eTUDIANT) {
		ETUDIANT = eTUDIANT;
	}

	public Boolean getCOMMERCIAL() {
		return COMMERCIAL;
	}

	public void setCOMMERCIAL(Boolean cOMMERCIAL) {
		COMMERCIAL = cOMMERCIAL;
	}

	public Boolean getCADRE() {
		return CADRE;
	}

	public void setCADRE(Boolean cADRE) {
		CADRE = cADRE;
	}

	public Boolean getAUTRE() {
		return AUTRE;
	}

	public void setAUTRE(Boolean aUTRE) {
		AUTRE = aUTRE;
	}

	public long getIdProfession() {
		return idProfession;
	}

	public void setIdProfession(int idProfession) {
		this.idProfession = idProfession;
	}

	public Profession() {
		// TODO Auto-generated constructor stub
	}

}
