package com.redesint.service;

import java.io.Serializable;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redesint.DTO.UsuarioVlrDTO;
import com.redesint.entity.UsuariosHLR;
import com.redesint.entity.UsuariosVLR;
import com.redesint.repository.UsuariosHLRRepository;
import com.redesint.repository.UsuariosVLRRepository;

@Service
public class UsuariosVlrService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private UsuariosHLRRepository hlrrepository;
	
	@Autowired
	private UsuariosVLRRepository vlrRepository;
	
	
	private static final Logger log = LoggerFactory.getLogger(UsuariosVlrService.class);

	
	public UsuarioVlrDTO insertUsuarioVLrService(String nombre, String numAbonado) {
		Optional<UsuariosHLR> findByidUsuario = hlrrepository.findById(nombre);
		UsuariosVLR usuariosVLR = new UsuariosVLR();
		UsuarioVlrDTO vlrDTO = new UsuarioVlrDTO();
		log.info(findByidUsuario.toString());
		if(findByidUsuario.isPresent()) {
			usuariosVLR.setIdUsuario(findByidUsuario.get().getIdUsuario());
			usuariosVLR.setEstadoVlr(1);
			usuariosVLR.setIdEquipo(findByidUsuario.get().getIdEquipo());
			usuariosVLR.setImei(findByidUsuario.get().getImei());
			usuariosVLR.setMnc(findByidUsuario.get().getMnc());
			usuariosVLR.setNumeroAbonado(findByidUsuario.get().getNumeroAbonado());
			usuariosVLR.setTipoPlan(findByidUsuario.get().getTipoPlan());
			vlrRepository.save(usuariosVLR);
			vlrDTO.setIdUsuario(findByidUsuario.get().getIdUsuario());
			vlrDTO.setEstadoVlr(1);
			vlrDTO.setIdEquipo(findByidUsuario.get().getIdEquipo());
			vlrDTO.setImei(findByidUsuario.get().getImei());
			vlrDTO.setMnc(findByidUsuario.get().getMnc());
			vlrDTO.setNumAbonado(findByidUsuario.get().getNumeroAbonado());
			vlrDTO.setTipoPlan(findByidUsuario.get().getTipoPlan());
			return vlrDTO;
		}
		return vlrDTO;
	}
	
	
	
}
