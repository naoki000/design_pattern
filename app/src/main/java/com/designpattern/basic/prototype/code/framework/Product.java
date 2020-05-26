package com.designpattern.basic.prototype.code.framework;

//ｃｏｐｙ対象となるクラスはClonebleを実装する必要がある
//clonableの実態は何もない、ただ「clone　によってコピーすることを認める印なだけ、こういうのをマーカーインターフェースという
public interface Product extends Cloneable {
    static String TAG = Product.class.getSimpleName();

    void use(String string);

    Product createClone();
}
