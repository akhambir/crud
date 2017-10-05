package com.graphicTest.service;

import com.graphicTest.dao.ProductDao;
import com.graphicTest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getProducts(Product product) {
        product = countLimits(product);
        return productDao.getProductBySearchCriteria();
    }

    private Product countLimits(Product product) {
        if (product.getLimit() == 0) {
            return product;
        }

    }
}
