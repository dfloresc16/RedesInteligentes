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
@Table(name = "AUC")
public class Auc {

	@Id
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "imei")
	private Integer imei;
	
	@Column(name = "pswrd")
	private String pswrd;
	
	
}
