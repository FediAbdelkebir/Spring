package tn.esprit.spring.Model;

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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Client")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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

}
