package tn.esprit.spring.Model;

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
@Table(name="detailFacture")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class detailFacture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2555167158806433476L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddetailFacture")
	private long iddetailFacture;

	@Column(name="qte")
	private int qte;
	
	@Column(name="prixTotal")
	private float prixTotal;
	
	@Column(name="pourcentageRemise")
	private int pourcentageRemise;

	@Column(name="montantRemise")
	private float montantRemise;
	
}
