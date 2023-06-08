/**
 * 
 */
package com.redesint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Diego
 *
 */
@Entity
@Table(name = "tarifasHLR")
public class TarifasHLR {
	
	@Id
	@GeneratedValue()
	@Column(name = "idTarifa")
	private Integer idTarifa;
	
	@Column(name = "tarifa")
	private String tarifa;

	/**
	 * @return the idTarifa
	 */
	public Integer getIdTarifa() {
		return idTarifa;
	}

	/**
	 * @param idTarifa the idTarifa to set
	 */
	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	/**
	 * @return the tarifa
	 */
	public String getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	
	

}
