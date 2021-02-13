package com.packt.java.chapter21;

import java.lang.ref.SoftReference;

public class Exercise4 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        SoftReference<ShoppingCart> softReference = new
                SoftReference<>(shoppingCart);
        shoppingCart = null;

        System.gc();
        System.runFinalization();

        ShoppingCart shoppingCart2 = softReference.get();
        System.out.println(String.format("ShoppingCart was %scleared.",
                (shoppingCart2 == null ? "" : "not ")));
    }
}
