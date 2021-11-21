package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DetailProduit")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DetailProduit implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private Long idDetailProduit;
	
	@Column(name="dateDetailProduit")
	private Date dateDetailProduit;
	
	@Column(name="dateDerniereModification")
	private Date dateDerniereModification;
	
	@Enumerated(EnumType.STRING)
	@Column(name="categorieProduit")
	private CategorieProduit categorieProduit;
	
	@OneToOne(mappedBy="detailProduit")
	private Produit produit;/**/
	
	
}
