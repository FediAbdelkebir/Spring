package tnesprit.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="Fournisseur")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8700393451049620624L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idFournisseur")
	private long idFournisseur;

	@Column(name="codeFournisseur", nullable=false)
	private String code;
	
	@Column(name="libelleFournisseur", nullable=false)
	private String libelle;
	
}
