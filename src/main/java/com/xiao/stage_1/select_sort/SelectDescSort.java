package com.xiao.stage_1.select_sort;

import com.xiao.util.ArrayGenerator;
import com.xiao.util.Sort;
import com.xiao.util.SortingHelper;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 选择排序
 * @date 2021/1/7 11:29 上午
 */
public class SelectDescSort implements Sort {
    public String getName() {
        return "倒序选择排序";
    }
    public static void main(String[] args) {
        Integer[] integers = ArrayGenerator.generateDisorder(10, 10);
        SortingHelper.sortTest(new SelectDescSort(),integers);
        System.out.println(integers);

    }

    public  <T extends Comparable<T>> void sort(T[] array) {
        T t;
        // 循环不变量 是  arr[0,i)  是未排序的 arr[i,n) 是已排序的
        for (int i = array.length-1; i >= 0; i--) {
            int max = i;
            // 选择 arr[0,i) 中的最大值
            for (int j = i; j >= 0; j--) {
                // arr[0,i) 中的最大值 放到 arr[i] 中 维持循环不变量
                if (array[j].compareTo(array[max]) > 0) {
                    max = j;
                }
            }
            swap(array,i,max);
        }
    }
    private <E> void swap(E[] e,int i,int j){
        E t = e[j];
        e[j] = e[i];
        e[i] = t;
    }

}

