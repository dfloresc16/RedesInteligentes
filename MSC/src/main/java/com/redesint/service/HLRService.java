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


	public UsuarioHrlDTO getInformationService(String nombre) {
		Optional<UsuariosHLR> findByidUsuario = repository.findById(nombre);
		UsuarioHrlDTO usuarioHrlDTO = new UsuarioHrlDTO();
		if(findByidUsuario.isPresent()) {
			usuarioHrlDTO.setIdUsuario(findByidUsuario.get().getIdUsuario());
			usuarioHrlDTO.setNumAbonado(findByidUsuario.get().getNumeroAbonado());
			usuarioHrlDTO.setMnc(findByidUsuario.get().getMnc());
			usuarioHrlDTO.setTipoPlan(findByidUsuario.get().getTipoPlan());
			usuarioHrlDTO.setIdEquipo(findByidUsuario.get().getIdEquipo());
			usuarioHrlDTO.setImei(findByidUsuario.get().getImei());
			//Validar el mnc y en caso de que no pertenezca mandar a insertar a VLR
		}
		log.info(usuarioHrlDTO.toString());
		return usuarioHrlDTO;
	}
}
