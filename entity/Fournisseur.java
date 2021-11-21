package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Fournisseur")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Fournisseur implements Serializable{
	
	@Id
	@Column(name="idFournisseur")
	private Long idFournisseur;
	
	@Column(name="codeFournisseur")
	private String codeFournisseur;
	
	@Column(name="libelleFournisseur")
	private String libelleFournisseur;
	
}
