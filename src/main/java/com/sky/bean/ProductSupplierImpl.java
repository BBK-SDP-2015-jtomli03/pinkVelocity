package com.sky.bean;

/**
 * Created by Jo on 26/09/2015.
 */
public class ProductSupplierImpl implements ProductSupplier{
    private int id;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private int cityId;
    private String postCode;
    private String landLinePhoneNumber;

    @Override
    public String getAddress() {
        return null;
    }
}
