package com.sky.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 25/09/2015.
 */
public class ProductImpl implements Product {
    private int id;
    private String productCode;
    private String name;
    private BigDecimal price;
    private String description;
    private List<ProductSupplier> suppliers;

    public ProductImpl(int id, String productCode, String name, BigDecimal price, String description){
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.description = description;
        suppliers = new ArrayList<ProductSupplier>();
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void addProductSupplier(ProductSupplier supplier) {
        suppliers.add(supplier);
    }

    @Override
    public List<ProductSupplier> getProductSuppliers() {
        return suppliers;
    }

    @Override
    public String getProductCode() {
        return productCode;
    }

    @Override
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

}
