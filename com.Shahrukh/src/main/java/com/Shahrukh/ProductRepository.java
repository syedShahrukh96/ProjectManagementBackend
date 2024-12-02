package com.Shahrukh;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Shahrukh.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

