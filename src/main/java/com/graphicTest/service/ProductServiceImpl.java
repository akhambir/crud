package com.graphicTest.service;

import com.graphicTest.dao.ProductDao;
import com.graphicTest.model.Product;
import com.graphicTest.model.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getProducts(SearchCriteria criteria) {
        criteria = countLimits(criteria);
        return productDao.getProductBySearchCriteria(criteria);
    }

    private SearchCriteria countLimits(SearchCriteria criteria) {
        if (criteria.getLimit() == 0) {
            return criteria;
        }
        int limit = criteria.getLimit();
        criteria.setLimit(criteria.getOEStaticPressure() + limit);
        criteria.setOEStaticPressure(criteria.getOEStaticPressure() - limit);
        return criteria;
    }
}
