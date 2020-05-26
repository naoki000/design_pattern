package com.designpattern.basic.factorymethod.code.framework;

public abstract class Factory {
    private static String TAG = Factory.class.getSimpleName();

    //作るためにcreateProductとregisterProductをもちいる
    //実装はサブクラスに任せる
    //多くの場合これはシングルトンで作成される
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
