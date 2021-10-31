package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private String nom;
	
	@Column(name="prenom", nullable=false)
	private String prenom;
	
	@Column(name="dateNaissance", nullable=false)
	private String dateNaissance;

	@Column(name="email", nullable=false)
	private String email;
	

	@Column(name="password", nullable=false)
	private String password;
	

	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	@Enumerated(EnumType.STRING)
	private Profession profession;
	
	@ManyToOne(targetEntity=Facture.class,cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="idFacture")
	private Facture facture;
	
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", email=" + email + ", password=" + password + ", categorieClient=" + categorieClient
				+ ", profession=" + profession + "]";
	}

	public Client(String nom, String prenom, String dateNaissance, String email, String password, CategorieClient categorieClient,
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

	public Client(int idClient, String nom, String prenom, String dateNaissance, String email, String password,
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
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
