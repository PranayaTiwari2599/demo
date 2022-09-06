package com.project.revision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.revision.entity.Product;
import com.project.revision.service.SnapchatInterface;

@RestController
public class Snapchat {
	@Autowired
	private 		SnapchatInterface si;
	@PostMapping("createproduct")
	public String createproduct(@RequestBody Product p1) {
int i=si.createproduct(p1);
		if(i>0) {
			return "product created";
		}
		else {
			return " product not";
		}
	}
	//jfdh
	@DeleteMapping("deleteproduct/{productid}")
	public String deletecpr(@PathVariable("productid")long l){
		int i=si.deleteproduct(l);
		if(i>0) {
			return "product created";
		}
		else {
			return " product not";
		}
		
	}
	@PutMapping("editpro/{productid}")
	public String editpro(@PathVariable("productid") long l,@RequestBody Product p1) {
		p1.setId(l);
		int i=si.editproduct(p1);
		if(i>0) {
			return "product edited";
		}
		else {
			return " product not";
		}
		
	}
	@GetMapping("showall")
		public List<Product> show(){
			return si.display();
			
		}
	@GetMapping("show/{productid}")
	public Product display(@PathVariable("productid") long l){
		return si.displaya(l);
	}
	
}


