package com.xiao.util;

import java.util.Random;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述:
 * @date 2021/1/7 12:35 下午
 */
public class ArrayGenerator {
    public ArrayGenerator() {
    }
    public static Integer[] generateOrderArray(int n){
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static Integer[] generateDisorder(int n,int bound){
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
