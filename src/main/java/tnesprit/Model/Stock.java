package tnesprit.Model;

import java.io.Serializable;

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
@Table(name="Stock")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4573265303498445526L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idStock")
	private long idStock;

	@Column(name="qte", nullable=false)
	private int qte;


	@Column(name="qteMin", nullable=false)
	private int qteMin;


	@Column(name="libelleStock", nullable=false)
	private String libelleStock;

}
