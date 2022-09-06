package com.project.revision.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.revision.dao.Snaochatdao;
import com.project.revision.entity.Product;
@Service
@Transactional
public class SnapchatUser implements  SnapchatInterface {
	@Autowired
	   private Snaochatdao sd ;
	@Override
	public int createproduct(Product p1) {
		
	  int i=0;
	  sd.save(p1);
		
	i=1;
		return i;
	}
	@Override
	public int deleteproduct(long l) {
		int i=0;
		sd.deleteById(l);
		i=1;
		return i;
	}
	@Override
	public int editproduct(Product p1) {
		int i=0;
		sd.saveAndFlush(p1);
		i=1;
		return i;
	}
	@Override
	public List<Product> display() {
    
		return sd.findAll();
	}
	@Override
	public Product displaya(long l) {
		Optional<Product>ll= sd.findById(l);
		Product p=ll.get();
		return p;
	}

}
