/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.FabricantesHLR;

/**
 * @author Diego
 *
 */

@Repository
public interface FabricantesRepository extends JpaRepository<FabricantesHLR, Integer> {

}
