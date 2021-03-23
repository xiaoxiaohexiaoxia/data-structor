package com.xiao.stage_1.insert_sort;

import com.xiao.stage_1.select_sort.SelectDescSort;
import com.xiao.stage_1.select_sort.SelectSort;
import com.xiao.util.ArrayGenerator;
import com.xiao.util.Sort;
import com.xiao.util.SortingHelper;

import java.util.Arrays;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 插入排序法
 * @date 2021/1/8 12:41 下午
 */
public class InsertSort implements Sort {
    public static void main(String[] args) {

        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] integers = ArrayGenerator.generateDisorder(n, n);
            Integer[] array2 = Arrays.copyOf(integers, integers.length);
            SortingHelper.sortTest(new InsertSort(), integers);
            SortingHelper.sortTest(new SelectSort(), array2);
            Integer[] order = ArrayGenerator.generateOrderArray(n);
            Integer[] order2 = Arrays.copyOf(order, order.length);
            SortingHelper.sortTest(new InsertSort(), order);
            SortingHelper.sortTest(new SelectSort(), order2);


        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] e) {
        // 循环不变量 arr[0,i) 是有序的 arr[i,n) 是无序的
        for (int i = 0; i < e.length; i++) {
            E t = e[i];
            // 维持循环不变量 把arr[i] 插入到合适的位置
            for (int j = i; j - 1 >= 0; j--) {
                if (t.compareTo(e[j - 1]) < 0) {
                    e[j] = e[j - 1];
                } else {
                    e[j] = t;
                    break;
                }
            }
        }
    }

    @Override
    public String getName() {
        return "插入排序法";
    }
}
