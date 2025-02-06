package com.JpaQueryMethodAndNative.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JpaQueryMethodAndNative.entity.Product;
import com.JpaQueryMethodAndNative.repo.ProductRepo;


@RestController
public class ProductController {
  
	
	@Autowired
	private ProductRepo productRepo;
	
	
	@PostMapping("/insertProduct")
	public Product createProduct(@RequestBody Product product) {
	return productRepo.save(product);
	}
	
	@GetMapping("/getProductEquals")
	public Product getNameEqualsTo() {
		return productRepo.findByproductNameEquals("Freeze");
		
	}
	
	
	@GetMapping("/getProduct")
	public List<Product> getName() {
	    return productRepo.searchname("mobile");
	}
	
	//@GetMapping("/getProductsByPrice/{productPrice}")
	//public List<Product> getProductsByPrice(@PathVariable("productPrice") Long productPrice) {
	    //return productRepo.searchProductPrice(productPrice);
	//}
	
	
	 @GetMapping("/getProductsByPrice/{productPrice}")
	    public List<Product> getProductsByPrice(@PathVariable("productPrice") Long productPrice) {
	        return productRepo.searchProductPrice(productPrice);
	    }

}
