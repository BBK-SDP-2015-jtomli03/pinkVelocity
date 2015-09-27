package com.sky.bean;

import java.util.List;

/**
 * Created by Jo on 25/09/2015.
 */
public interface Catalogue {

    //must be a singleton

    //contains products

    //?keeps track of product quantities & locations

    List<Product> getProducts();

    void addProduct(Product product);

    void removeProduct(Product product);

}
