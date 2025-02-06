package com.JpaQueryMethodAndNative.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JpaQueryMethodAndNative.entity.Product;

import jakarta.transaction.Transactional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
	
	
	    
	   
	
	//JpaQueryMethod
	Product findByproductNameEquals(String productName);
	
	//Product ProductfindByproductPriceStartingWith(String productPrice);
	
	//jpql
	@Query("SELECT p FROM Product p WHERE p.productName = ?1")
	List<Product> searchname(String productName);
	
	
	  @Query("SELECT p FROM Product p WHERE p.productPrice <= ?1")
	    List<Product> searchProductPrice(Long productPrice);
	
}
