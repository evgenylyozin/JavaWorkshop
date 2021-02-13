package com.packt.java.chapter21;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Exercise2 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        ReferenceQueue<ShoppingCart> referenceQueue = new
                ReferenceQueue<>();
        WeakReference<ShoppingCart> weakReference = new
                WeakReference<>(shoppingCart, referenceQueue);

        System.out.println(String.format("ShoppingCart has %sbeen cleared.", (referenceQueue.poll() == null ? "not " : "")));

        shoppingCart = null;
        System.gc();

        System.runFinalization();
        System.out.println(String.format("ShoppingCart has %sbeen cleared.", (referenceQueue.poll() == null ? "not " : "")));

        System.out.println(String.format("ShoppingCart reference %sexist",(weakReference.get() == null ? "does not " : "")));
    }
}

class ShoppingCart {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalized");
    }
}