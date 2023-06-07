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
	

}
