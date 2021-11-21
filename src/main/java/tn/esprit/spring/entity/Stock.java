package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Stock")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Stock implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private Long idStock; 
	
	@Column(name="qteStock")
	private Integer qteStock;
	
	@Column(name="qteMin")
	private Integer qteMin;
	
	@Column(name="libelleStock")
	private String libelleStock;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
	private Set<Produit> produit;

}
