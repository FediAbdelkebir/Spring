package tn.esprit.spring.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Rayon")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Rayon implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6563351112036345353L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idRayon")
	private long idRayon;

	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="libelle", nullable=false)
	private String libelle;

	@OneToMany
	private Set<Produit> produit;
	

}
