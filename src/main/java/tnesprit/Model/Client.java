package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4874606733340950834L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idClient")
	private long idClient;
	
	@Column(name="nom", nullable=false)
	private int nom;
	
	@Column(name="prenom", nullable=false)
	private int prenom;
	
	@Column(name="dateNaissance", nullable=false)
	private int dateNaissance;

	@Column(name="email", nullable=false)
	private int email;
	

	@Column(name="password", nullable=false)
	private int password;
	

	@Column(name="categorieClient", nullable=false)
	private CategorieClient categorieClient;
	
	@Column(name="profession", nullable=false)
	private Profession profession;


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", email=" + email + ", password=" + password + ", categorieClient=" + categorieClient
				+ ", profession=" + profession + "]";
	}

	public Client(int nom, int prenom, int dateNaissance, int email, int password, CategorieClient categorieClient,
			Profession profession) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.password = password;
		this.categorieClient = categorieClient;
		this.profession = profession;
	}

	public Client(int idClient, int nom, int prenom, int dateNaissance, int email, int password,
			CategorieClient categorieClient, Profession profession) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.password = password;
		this.categorieClient = categorieClient;
		this.profession = profession;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getNom() {
		return nom;
	}

	public void setNom(int nom) {
		this.nom = nom;
	}

	public int getPrenom() {
		return prenom;
	}

	public void setPrenom(int prenom) {
		this.prenom = prenom;
	}

	public int getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public CategorieClient getCategorieClient() {
		return categorieClient;
	}

	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

}
