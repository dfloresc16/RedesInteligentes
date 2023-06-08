/**
 * 
 */
package com.redesint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesint.entity.Auc;

/**
 * @author Diego
 *
 */
@Repository
public interface AucRepository extends JpaRepository<Auc, String> {
	
	
}
