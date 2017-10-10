package com.graphicTest.dao.implement;

import com.graphicTest.dao.ProductDao;
import com.graphicTest.model.Product;
import com.graphicTest.model.SearchCriteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }


    public Product getProductById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();

        return product;
    }


    public List<Product> getAllProduct() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> products = query.list();
        session.flush();

        return products;
    }


    public void deleteProduct(String id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getProductById(id));
        session.flush();
    }

    public List<Product> getProductBySearchCriteria(SearchCriteria criteria) {
        Query query = getQuery(criteria);
        List<Product> products = query.list();
        return products;
    }

    private Query getQuery(SearchCriteria criteria) {
        Query result;
        String sql;
        if (criteria.getLimit() == 0) {
            sql = "from Product " +
                    "where OEExpense =:expence " +
                    "and OEStaticPressure = :pressure";
            result = sessionFactory.getCurrentSession().createQuery(sql);
            result.setInteger("expence", criteria.getOEExpense());
            result.setInteger("pressure", criteria.getOEStaticPressure());
            return result;
        }
        sql = "from Product " +
                "where OEExpense =:expence " +
                "and OEStaticPressure between :lowValue and :highValue";
        result = sessionFactory.getCurrentSession().createQuery(sql);
        result.setInteger("expence", criteria.getOEExpense());
        result.setInteger("lowValue", criteria.getOEStaticPressure());
        result.setInteger("highValue", criteria.getLimit());
        return result;
    }
}
