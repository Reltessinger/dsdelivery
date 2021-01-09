package com.reltessinger.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reltessinger.dsdeliver.dto.ProductDTO;
import com.reltessinger.dsdeliver.entities.Product;
import com.reltessinger.dsdeliver.repositories.ProductRepository;

 @Service
public class ProductService {
	
	 @Autowired
	 private ProductRepository productRepository;
	 
	 @Transactional(readOnly = true)
	 public List<ProductDTO> findAll(){
		 List<Product> allProducts = productRepository.findAllByOrderByNameAsc();
		 return allProducts.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	 }
}
