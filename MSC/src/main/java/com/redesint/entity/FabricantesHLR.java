/**
 * 
 */
package com.redesint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Diego
 *
 */
@Entity
@Table(name = "fabricantesHLR")
public class FabricantesHLR {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name = "idFabricante")
	private Integer idFabricante;
	
	@Column(name = "fabricante")
	private String fabricante;

	/**
	 * @return the idFabricante
	 */
	public Integer getIdFabricante() {
		return idFabricante;
	}

	/**
	 * @param idFabricante the idFabricante to set
	 */
	public void setIdFabricante(Integer idFabricante) {
		this.idFabricante = idFabricante;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
