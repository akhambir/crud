package com.graphicTest.controller;

import com.graphicTest.model.Product;
import com.graphicTest.model.SearchCriteria;
import com.graphicTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(name = "/product", method = RequestMethod.POST)
    private String getProducts(@ModelAttribute SearchCriteria criteria, Model model) {

        List<Product> productResult = productService.getProducts(criteria);
        model.addAttribute("products", productResult);
        System.out.println();

        return "result";
    }

}
