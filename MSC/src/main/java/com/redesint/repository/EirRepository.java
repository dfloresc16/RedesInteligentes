/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.Eir;

/**
 * @author Diego
 *
 */
@Repository
public interface EirRepository extends JpaRepository<Eir, String>{
	
	

}
