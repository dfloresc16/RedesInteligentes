/**
 * 
 */
package com.redesint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author Diego
 *
 */
@Entity
@Table(name = "usuarios")
public class UsuariosHLR {
	
	@Id
	@Column(name = "id_usuario")
	private String idUsuario;
	
	@Column(name = "numero_abonado")
	private String numeroAbonado;
	
	@Column(name = "imei")
	private String imei;
	
	@Column(name = "mnc")
	private Integer mnc;
	
	@Column(name = "tipo_plan")
	private Integer tipoPlan;
	
	@Column(name = "id_equipo")
	private Integer idEquipo;

	@Column(name = "estado_vlr")
	private Integer estadoVlr;

	/**
	 * 
	 */
	public UsuariosHLR() {
	}

	/**
	 * @param idUsuario
	 * @param numeroAbonado
	 * @param imei
	 * @param mnc
	 * @param tipoPlan
	 * @param idEquipo
	 * @param estadoVlr
	 */
	public UsuariosHLR(String idUsuario, String numeroAbonado, String imei, Integer mnc, Integer tipoPlan,
			Integer idEquipo, Integer estadoVlr) {
		this.idUsuario = idUsuario;
		this.numeroAbonado = numeroAbonado;
		this.imei = imei;
		this.mnc = mnc;
		this.tipoPlan = tipoPlan;
		this.idEquipo = idEquipo;
		this.estadoVlr = estadoVlr;
	}

	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the numeroAbonado
	 */
	public String getNumeroAbonado() {
		return numeroAbonado;
	}

	/**
	 * @param numeroAbonado the numeroAbonado to set
	 */
	public void setNumeroAbonado(String numeroAbonado) {
		this.numeroAbonado = numeroAbonado;
	}

	/**
	 * @return the imei
	 */
	public String getImei() {
		return imei;
	}

	/**
	 * @param imei the imei to set
	 */
	public void setImei(String imei) {
		this.imei = imei;
	}

	/**
	 * @return the mnc
	 */
	public Integer getMnc() {
		return mnc;
	}

	/**
	 * @param mnc the mnc to set
	 */
	public void setMnc(Integer mnc) {
		this.mnc = mnc;
	}

	/**
	 * @return the tipoPlan
	 */
	public Integer getTipoPlan() {
		return tipoPlan;
	}

	/**
	 * @param tipoPlan the tipoPlan to set
	 */
	public void setTipoPlan(Integer tipoPlan) {
		this.tipoPlan = tipoPlan;
	}

	/**
	 * @return the idEquipo
	 */
	public Integer getIdEquipo() {
		return idEquipo;
	}

	/**
	 * @param idEquipo the idEquipo to set
	 */
	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	/**
	 * @return the estadoVlr
	 */
	public Integer getEstadoVlr() {
		return estadoVlr;
	}

	/**
	 * @param estadoVlr the estadoVlr to set
	 */
	public void setEstadoVlr(Integer estadoVlr) {
		this.estadoVlr = estadoVlr;
	}

	@Override
	public String toString() {
		return "UsuariosHLR [idUsuario=" + idUsuario + ", numeroAbonado=" + numeroAbonado + ", imei=" + imei + ", mnc="
				+ mnc + ", tipoPlan=" + tipoPlan + ", idEquipo=" + idEquipo + ", estadoVlr=" + estadoVlr + "]";
	}
	
	
	
}
