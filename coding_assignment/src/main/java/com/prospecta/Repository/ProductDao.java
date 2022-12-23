package com.prospecta.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prospecta.model.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	public List<Product> findAllBycategory(String c);
	
	

}
