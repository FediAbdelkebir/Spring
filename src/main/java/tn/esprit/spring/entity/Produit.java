package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Produit")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Produit implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduit")
	private Long idProduit;
	
	@Column(name="codeProduit")
	private String codeProduit;
	
	@Column(name="libelleProduit")
	private String libelleProduit;
	
	@Column(name="prixUnitaire")
	private float prixUnitaire;
	
	@OneToOne
	private DetailProduit detailProduit;
	
	@ManyToOne
	@JsonIgnore
	private Rayon rayon;
	
	@ManyToOne
	@JsonIgnore
	private Stock stock;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
	private Set<DetailFacture> detailFacture;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseur;

	public void enrollFournisseur(Fournisseur f) {
		fournisseur.add(f);
		
	}
	
}
