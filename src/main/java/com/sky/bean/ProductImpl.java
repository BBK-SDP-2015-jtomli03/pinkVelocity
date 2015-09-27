package com.sky.bean;

import java.util.List;

/**
 * Created by Jo on 25/09/2015.
 */
public class ProductImpl implements Product {

    String name;
    Double price;

    public ProductImpl(String name, Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void addProductSupplier(ProductSupplier supplier) {

    }

    @Override
    public List<ProductSupplier> getProductSuppliers() {
        return null;
    }
}
