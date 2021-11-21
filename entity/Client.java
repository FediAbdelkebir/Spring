package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HP
 *
 */

@Entity
@Table(name="Client")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Client implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idClient")
	private Long idClient;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom; 
	
	@Column(name="dateNaissance")
	private Date dateNaissance;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="categorieClient")
	private CategorieClient categorieClient;
	
	@Enumerated(EnumType.STRING)
	@Column(name="profession")
	private Profession profession;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Facture> Facture;

		
	
}
