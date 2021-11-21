package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DetailFacture")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DetailFacture implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailFacture")
	private Long idDetailFacture;
	
	@Column(name="qte")
	private Integer qte;
	
	@Column(name="prixTotal")
	private float prixTotal;
	
	@Column(name="pourcentageRemise")
	private Integer pourcentageRemise;
	
	@Column(name="montantRemise")
	private Integer montantRemise;
	
	@ManyToOne
	private Produit produit;
	
	@ManyToOne
	private Facture facture;
	
}
