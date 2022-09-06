package com.project.revision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.revision.entity.Product;

@Repository
public interface Snaochatdao extends JpaRepository<Product, Long> {
	

}
