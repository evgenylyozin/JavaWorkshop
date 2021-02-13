package com.packt.java.chapter23;

import java.util.Arrays;

public class BubbleSort implements Runnable {
    private int[] data;

    public BubbleSort(int... values) {
        this.data = values;
    }

    @Override
    public void run() {
        System.out.println(Arrays.toString(data));
        int n = data.length;
        boolean moved = true;
        while (moved) {
            moved = false;
            for (int i = 0; i < n - 1; i++) {
                int currentItem = data[i];
                int nextItem = data[i + 1];
                if (currentItem > nextItem) {
                    data[i] = nextItem;
                    data[i + 1] = currentItem;
                    moved = true;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}