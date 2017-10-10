package com.graphicTest.dao;

import com.graphicTest.model.Product;
import com.graphicTest.model.SearchCriteria;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProduct();

    void deleteProduct(String id);

    List<Product> getProductBySearchCriteria(SearchCriteria criteria);
}

