package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detailFacture")
public class detailFacture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2555167158806433476L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddetailFacture")
	private int iddetailFacture;

	@Column(name="qte")
	private int qte;
	
	@Column(name="prixTotal")
	private float prixTotal;
	
	@Column(name="pourcentageRemise")
	private int pourcentageRemise;

	@Column(name="montantRemise")
	private float montantRemise;
	
	public detailFacture(int iddetailFacture, int qte, float prixTotal, int pourcentageRemise, float montantRemise) {
		super();
		this.iddetailFacture = iddetailFacture;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}

	public detailFacture(int qte, float prixTotal, int pourcentageRemise, float montantRemise) {
		super();
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}

	@Override
	public String toString() {
		return "detailFacture [iddetailFacture=" + iddetailFacture + ", qte=" + qte + ", prixTotal=" + prixTotal
				+ ", pourcentageRemise=" + pourcentageRemise + ", montantRemise=" + montantRemise + "]";
	}

	public int getIddetailFacture() {
		return iddetailFacture;
	}

	public void setIddetailFacture(int iddetailFacture) {
		this.iddetailFacture = iddetailFacture;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public detailFacture() {
		// TODO Auto-generated constructor stub
	}

}
