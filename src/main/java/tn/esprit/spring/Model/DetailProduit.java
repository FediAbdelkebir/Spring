package tn.esprit.spring.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DetailProduit")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1089802036295241896L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idDetailProduit")
	private long idDetailProduit;
	
	@Column(name="dateCreation", nullable=false)
	private Date dateCreation;

	@Column(name="dateDerniereModification", nullable=false)
	private Date dateDerniereModification;

	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
}
