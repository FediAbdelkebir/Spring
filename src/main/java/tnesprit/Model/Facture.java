package tnesprit.Model;

import java.io.Serializable;
import java.sql.Date;

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
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Facture")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1429645713063605826L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idFacture")
	private long idFacture;
	
	@Column(name="montantRemise")
	private float montantRemise;
	
	@Column(name="montantFacture")
	private float montantFacture;
	
	@Column(name="dateFacture")
	private Date dateFacture;
	
	@Column(name="Active")
	private Boolean Active;
	
	@ManyToOne
	private Client client;
	@ManyToOne
	private detailFacture detailfacture;
	

}
