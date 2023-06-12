package com.redesint.service;

import java.io.Serializable;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redesint.DTO.UsuarioHrlDTO;
import com.redesint.entity.UsuariosHLR;
import com.redesint.repository.UsuariosHLRRepository;

@Service
public class HLRService implements Serializable{
	
	@Autowired
	private UsuariosHLRRepository repository;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8942027573248076030L;
	
	
	private static final Logger log = LoggerFactory.getLogger(HLRService.class);


	public UsuarioHrlDTO getInformationService(String nombre, String numAbonado) {
		Optional<UsuariosHLR> findByidUsuario = repository.findById(nombre);
		log.info(findByidUsuario.toString());
		UsuarioHrlDTO usuarioHrlDTO = new UsuarioHrlDTO();
		UsuariosHLR hlr = new UsuariosHLR();
		if(findByidUsuario.isPresent()) {
			if(!findByidUsuario.get().getNumeroAbonado().equals(numAbonado)) {
				if(findByidUsuario.get().getEstadoVlr() > 3) {
					hlr.setIdUsuario(findByidUsuario.get().getIdUsuario());
					hlr.setNumeroAbonado(findByidUsuario.get().getNumeroAbonado());
					hlr.setMnc(findByidUsuario.get().getMnc());
					hlr.setTipoPlan(findByidUsuario.get().getTipoPlan());
					hlr.setIdEquipo(findByidUsuario.get().getIdEquipo());
					hlr.setImei(findByidUsuario.get().getImei());
					hlr.setEstadoVlr(0);
					repository.save(hlr);
					usuarioHrlDTO.setIdUsuario(hlr.getIdUsuario());
					usuarioHrlDTO.setNumAbonado(hlr.getNumeroAbonado());
					usuarioHrlDTO.setMnc(hlr.getMnc());
					usuarioHrlDTO.setTipoPlan(hlr.getTipoPlan());
					usuarioHrlDTO.setIdEquipo(hlr.getIdEquipo());
					usuarioHrlDTO.setImei(hlr.getImei());
					usuarioHrlDTO.setEstadoVlr(hlr.getEstadoVlr());
				}else {
					hlr.setIdUsuario(findByidUsuario.get().getIdUsuario());
					hlr.setNumeroAbonado(findByidUsuario.get().getNumeroAbonado());
					hlr.setMnc(findByidUsuario.get().getMnc());
					hlr.setTipoPlan(findByidUsuario.get().getTipoPlan());
					hlr.setIdEquipo(findByidUsuario.get().getIdEquipo());
					hlr.setImei(findByidUsuario.get().getImei());
					hlr.setEstadoVlr(findByidUsuario.get().getEstadoVlr()+1);
					repository.save(hlr);
					usuarioHrlDTO.setIdUsuario(hlr.getIdUsuario());
					usuarioHrlDTO.setNumAbonado(hlr.getNumeroAbonado());
					usuarioHrlDTO.setMnc(hlr.getMnc());
					usuarioHrlDTO.setTipoPlan(hlr.getTipoPlan());
					usuarioHrlDTO.setIdEquipo(hlr.getIdEquipo());
					usuarioHrlDTO.setImei(hlr.getImei());
					usuarioHrlDTO.setEstadoVlr(hlr.getEstadoVlr());
				}
			}
			usuarioHrlDTO.setIdUsuario(findByidUsuario.get().getIdUsuario());
			usuarioHrlDTO.setNumAbonado(findByidUsuario.get().getNumeroAbonado());
			usuarioHrlDTO.setMnc(findByidUsuario.get().getMnc());
			usuarioHrlDTO.setTipoPlan(findByidUsuario.get().getTipoPlan());
			usuarioHrlDTO.setIdEquipo(findByidUsuario.get().getIdEquipo());
			usuarioHrlDTO.setImei(findByidUsuario.get().getImei());
			usuarioHrlDTO.setEstadoVlr(findByidUsuario.get().getEstadoVlr());
			//Validar el mnc y en caso de que no pertenezca mandar a insertar a VLR
		}
		
		log.info(usuarioHrlDTO.toString());
		return usuarioHrlDTO;
	}
}
