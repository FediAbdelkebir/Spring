package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private int idProfession;

	@Override
	public String toString() {
		return "Profession [idProfession=" + idProfession + "]";
	}

	public Profession(int idProfession) {
		super();
		this.idProfession = idProfession;
	}

	public int getIdProfession() {
		return idProfession;
	}

	public void setIdProfession(int idProfession) {
		this.idProfession = idProfession;
	}

	public Profession() {
		// TODO Auto-generated constructor stub
	}

}
