package tn.esprit.spring.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="Produit")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6546100055361088412L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idProduit")
	private long idProduit;

	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="libelle", nullable=false)
	private String libelle;
	
	@Column(name="prixUnitaire", nullable=false)
	private String prixUnitaire;
	
	@ManyToOne
	private Rayon rayon;
	@ManyToOne
	private Stock stock;
	@OneToMany
	private Set<detailFacture> detailfacture;
	@OneToOne
	private DetailProduit detailproduit;
	
}
