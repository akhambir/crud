package com.graphicTest.service;


import com.graphicTest.model.Product;
import com.graphicTest.model.SearchCriteria;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(SearchCriteria criteria);

}
