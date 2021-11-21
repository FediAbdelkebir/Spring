package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Facture")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
/* Data : remplace getter, setter, constructeurs, toString, equals */
public class Facture implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFacture")
	private Long idFacture;
	
	@Column(name="montantRemise")
	private float montantRemise;
	
	@Column(name="montantFacture")
	private float montantFacture;
	
	@Column(name="dateFacture")
	private Date dateFacture;
	
	@Column(name="active")
	private float active;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
	private Set<DetailFacture> detailFacture;
	
	@ManyToOne
	private Client client;
	
	// fatal : résultat inattendu 
	// error : méthode ne s'exécute pas 
	
	
}
