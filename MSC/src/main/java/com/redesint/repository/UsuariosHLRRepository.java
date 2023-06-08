/**
 * 
 */
package com.redesint.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.redesint.entity.UsuariosHLR;

/**
 * @author Diego
 *
 */
public interface UsuariosHLRRepository extends JpaRepository<UsuariosHLR, String> {
	
}
