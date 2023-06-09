/**
 * 
 */
package com.redesint.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redesint.DTO.GenericResponseDTO;
import com.redesint.DTO.UsuarioHrlDTO;
import com.redesint.DTO.UsuarioVlrDTO;
import com.redesint.service.HLRService;
import com.redesint.service.UsuariosVlrService;
/**
 * @author Diego
 *
 */
@RestController
@RequestMapping("/MSC")
@CrossOrigin(origins = "*",allowedHeaders = "*")
//@CrossOrigin(origins = "http://localhost:4200")
public class MSCController extends CommonController{
	
	@Autowired
	private HLRService service;
	
	@Autowired 
	private UsuariosVlrService service2;
	
	private static final Logger log = LoggerFactory.getLogger(MSCController.class);

	@RequestMapping(value = "/HLR/{nombre}/{numAbonado}",method = RequestMethod.GET)
	public ResponseEntity<GenericResponseDTO<UsuarioHrlDTO>> getInformationHLR(@PathVariable("nombre") String nombre,@PathVariable("numAbonado") String numAbonado){
		UsuarioHrlDTO usuarioHrlDTO = new UsuarioHrlDTO();
		try {
			log.info(nombre);
			usuarioHrlDTO = service.getInformationService(nombre,numAbonado);
			log.info(usuarioHrlDTO.toString());
			return ResponseEntity.ok(new GenericResponseDTO<>(SUCCESS, HTTP_SUCCESS, null, null, "Servicio ejecutado exitosamente", usuarioHrlDTO));
		} catch (Exception e) {
			log.info(e.getMessage());
			return ResponseEntity.ok(new GenericResponseDTO<>(SUCCESS, HTTP_BAD_REQUEST, null, null, "Servicio ejecutado no exitosamente", usuarioHrlDTO));
		}
	}
	
	@RequestMapping(value = "/VLR/{nombre}/{numAbonado}",method = RequestMethod.GET)
	public ResponseEntity<GenericResponseDTO<UsuarioVlrDTO>> insertInformationVLR(@PathVariable("nombre") String nombre, @PathVariable("numAbonado") String numAbonado){
		UsuarioVlrDTO usuarioVlrDTO = new UsuarioVlrDTO();
		try {
			log.info(nombre);
			usuarioVlrDTO = service2.insertUsuarioVLrService(nombre,numAbonado);
			log.info(usuarioVlrDTO.toString());
			return ResponseEntity.ok(new GenericResponseDTO<>(SUCCESS, HTTP_SUCCESS, null, null, "Servicio ejecutado exitosamente", usuarioVlrDTO));
		} catch (Exception e) {
			log.info(e.getMessage());
			return ResponseEntity.ok(new GenericResponseDTO<>(SUCCESS, HTTP_BAD_REQUEST, null, null, "Servicio ejecutado no exitosamente", usuarioVlrDTO));
		}
	}
	
	

}
