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
}
