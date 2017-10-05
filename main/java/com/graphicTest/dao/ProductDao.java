package com.graphicTest.dao;

import com.graphicTest.model.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProduct();

    void deleteProduct(String id);

    List<Product> getProductBySearchCriteria();
}

