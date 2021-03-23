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
public class SelectSort implements Sort {
    public String getName() {
        return "选择排序";
    }
    public static void main(String[] args) {
        SortingHelper.sortTest(new SelectSort(),ArrayGenerator.generateDisorder(1000,1000));
    }

    public  <T extends Comparable<T>> void sort(T[] array) {
        T t;
        // 循环不变量 是 arr[i,n) 是未排序的 arr[0,i) 是已排序的
        for (int i = 0; i < array.length; i++) {
            int min = i;
            // 选择 arr[i,n) 中的最小值
            for (int j = i; j < array.length; j++) {
                // arr[i,n) 中的最小值 放到 arr[i] 中 维持循环不变量
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            t = array[i];
            array[i] = array[min];
            array[min] = t;
        }
    }


}

