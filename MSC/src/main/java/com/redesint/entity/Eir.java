/**
 * 
 */
package com.redesint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Diego
 *
 */

@Entity
@Table(name = "EIR")
public class Eir {
	
	@Id
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "imei")
	private Integer imei;
	
	@Column(name = "equipo")
	private String equipo;
	
	@Column(name = "lista")
	private Integer lista;
	
	@Column(name = "tarifa")
	private String tarifa;

}
