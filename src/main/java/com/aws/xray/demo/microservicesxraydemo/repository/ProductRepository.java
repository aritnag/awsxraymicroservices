package com.aws.xray.demo.microservicesxraydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.xray.demo.microservicesxraydemo.entity.Product;

@Repository
public interface ProductRepository
		extends JpaRepository<com.aws.xray.demo.microservicesxraydemo.entity.Product,Long> {
	
//	Product findByNameAndType(String productName,String productType);

}
