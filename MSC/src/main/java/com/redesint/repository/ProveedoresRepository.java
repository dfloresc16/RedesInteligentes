/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.ProveedoresHLR;

/**
 * @author Diego
 *
 */
@Repository
public interface ProveedoresRepository extends JpaRepository<ProveedoresHLR,Integer>{

}
