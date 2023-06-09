/**
 * 
 */
package com.redesint.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.redesint.DTO.GenericResponseDTO;
import com.redesint.DTO.UsuarioHrlDTO;
import com.redesint.entity.UsuariosHLR;
import com.redesint.service.HLRService;

import jakarta.websocket.server.PathParam;

import com.redesint.DTO.CommonController;
/**
 * @author Diego
 *
 */
@RestController
@RequestMapping("/MSC")
//@CrossOrigin(origins = "192.168.3.47:4200")
@CrossOrigin(origins = "http://localhost:4200")
public class MSCController {
	
	@Autowired
	private HLRService service;
	
	private static final Logger log = LoggerFactory.getLogger(MSCController.class);

	@RequestMapping(value = "/HLR/{nombre}",method = RequestMethod.GET)
	public ResponseEntity<UsuarioHrlDTO> getInformationHLR(@PathVariable("nombre") String nombre){
		UsuarioHrlDTO usuarioHrlDTO = new UsuarioHrlDTO();
		try {
			log.info(nombre);
			usuarioHrlDTO = service.getInformationService(nombre);
			log.info(usuarioHrlDTO.toString());
			return new ResponseEntity<>(usuarioHrlDTO,HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ResponseEntity<>(usuarioHrlDTO,HttpStatus.NOT_FOUND);
		}
	}
	
	

}
