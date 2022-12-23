package com.prospecta.service;

import java.util.List;

import com.prospecta.Exception.productException;
import com.prospecta.model.Product;

public interface ProductService {
	
	public Product addProduct(Product p);
	public List<Product> categoryProduct(String c) throws productException;

}
