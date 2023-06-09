/**
 * 
 */
package com.redesint.DTO;

/**
 * @author Diego
 *
 */
public class UsuarioVlrDTO {
	
	private String idUsuario;
	
	private String numAbonado;
	
	private Integer mnc;
	
	private Integer tipoPlan;
	
	private Integer idEquipo;
	
	private String imei;
	
	private Integer estadoVlr;

	/**
	 * @param idUsuario
	 * @param numAbonado
	 * @param mnc
	 * @param tipoPlan
	 * @param idEquipo
	 * @param imei
	 * @param estadoVlr
	 */
	public UsuarioVlrDTO(String idUsuario, String numAbonado, Integer mnc, Integer tipoPlan, Integer idEquipo,
			String imei, Integer estadoVlr) {
		this.idUsuario = idUsuario;
		this.numAbonado = numAbonado;
		this.mnc = mnc;
		this.tipoPlan = tipoPlan;
		this.idEquipo = idEquipo;
		this.imei = imei;
		this.estadoVlr = estadoVlr;
	}

	/**
	 * 
	 */
	public UsuarioVlrDTO() {
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
	 * @return the numAbonado
	 */
	public String getNumAbonado() {
		return numAbonado;
	}

	/**
	 * @param numAbonado the numAbonado to set
	 */
	public void setNumAbonado(String numAbonado) {
		this.numAbonado = numAbonado;
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
		return "UsuarioHrlDTO [idUsuario=" + idUsuario + ", numAbonado=" + numAbonado + ", mnc=" + mnc + ", tipoPlan="
				+ tipoPlan + ", idEquipo=" + idEquipo + ", imei=" + imei + ", estadoVlr=" + estadoVlr + "]";
	}
	
	
	
}
