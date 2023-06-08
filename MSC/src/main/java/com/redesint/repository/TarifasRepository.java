/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.TarifasHLR;

/**
 * @author Diego
 *
 */
@Repository
public interface TarifasRepository extends JpaRepository<TarifasHLR, Integer> {

}
