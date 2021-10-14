package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock")

public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4573265303498445526L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idStock")
	private long idStock;

	@Column(name="qte", nullable=false)
	private int qte;


	@Column(name="qteMin", nullable=false)
	private int qteMin;


	@Column(name="libelleStock", nullable=false)
	private String libelleStock;

	public Stock(int qte, int qteMin, String libelleStock) {
		super();
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}

	public Stock(int idStock, int qte, int qteMin, String libelleStock) {
		super();
		this.idStock = idStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", qte=" + qte + ", qteMin=" + qteMin + ", libelleStock=" + libelleStock
				+ "]";
	}

	public long getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}

	public Stock() {
		// TODO Auto-generated constructor stub
	}

}
