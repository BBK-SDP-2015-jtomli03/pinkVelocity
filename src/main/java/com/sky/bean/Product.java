package com.sky.bean;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Jo on 25/09/2015.
 */
public interface Product {

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    void addProductSupplier(ProductSupplier supplier);

    List<ProductSupplier> getProductSuppliers();

    String getProductCode();

    void setProductCode(String productCode);
}
