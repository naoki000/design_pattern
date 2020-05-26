package com.designpattern.basic.factorymethod.code.idcard;

import com.designpattern.basic.factorymethod.code.framework.Factory;
import com.designpattern.basic.factorymethod.code.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private static String TAG = IDCardFactory.class.getSimpleName();

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
