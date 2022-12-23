package com.prospecta.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prospecta.Exception.productException;
import com.prospecta.Repository.ProductDao;
import com.prospecta.model.Product;
import com.prospecta.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pDao;
	@Override
	public Product addProduct(Product p) {
		Product pr = pDao.save(p);
		return pr;
	}

	@Override
	public List<Product> categoryProduct(String c) throws productException {
	List<Product> pr = pDao.findAllBycategory(c);
	if(pr.size()==0) {
		throw new productException("No Product found with category "+ c);
	}
	return pr;
	}
	

}
