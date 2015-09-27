package com.sky.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 26/09/2015.
 */
public class ProductCatalogue {

    private static ProductCatalogue catalogue = new ProductCatalogue();
    private List<Product> products;

    private ProductCatalogue(){
        products = new ArrayList<Product>();
        products.add(new ProductImpl("Gnome", 2.00));
        products.add(new ProductImpl("SpecialGnome", 100.00));
    }

    public static ProductCatalogue getCatalogue(){
        return catalogue;
    }

    public List<Product> getProducts(){
        return products;
    }

}
