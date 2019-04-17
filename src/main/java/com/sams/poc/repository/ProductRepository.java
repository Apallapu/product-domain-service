/**
 * 
 */
package com.sams.poc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sams.poc.domain.Product;

/**
 * @author ankamma pallapu
 *
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Optional<Product> findProductByProductId(Integer productId);
}
