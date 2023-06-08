/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.ServiciosHLR;

/**
 * @author Diego
 *
 */
@Repository
public interface ServiciosRepository extends JpaRepository<ServiciosHLR, Integer>{

}
