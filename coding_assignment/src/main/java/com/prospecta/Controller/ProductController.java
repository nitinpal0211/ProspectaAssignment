package com.prospecta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.Exception.productException;
import com.prospecta.model.Product;
import com.prospecta.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addNewProduct(@RequestBody Product p){
		Product saveP = pService.addProduct(p);
		return new ResponseEntity<Product>(saveP,HttpStatus.CREATED);
	}
	
//	@GetMapping("/product/{category}")
//	public ResponseEntity<List<Product>> seeProductByCategory(@PathVariable("category") String category) throws productException{
//		
//		List<Product> pList = pService.categoryProduct(category);
//		return new ResponseEntity<List<Product>>(pList,HttpStatus.ACCEPTED);
//	}
}
