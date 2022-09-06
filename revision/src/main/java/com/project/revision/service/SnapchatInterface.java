package com.project.revision.service;

import java.util.List;

import com.project.revision.entity.Product;
  

public interface SnapchatInterface {

	int createproduct(Product p1);

	int deleteproduct(long l);

	int editproduct(Product p1);

	List<Product> display();

	Product displaya(long l);

}
