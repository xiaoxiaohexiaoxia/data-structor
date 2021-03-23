package com.xiao.stage_1.insert_sort;

import com.xiao.util.ArrayGenerator;
import com.xiao.util.Sort;
import com.xiao.util.SortingHelper;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 倒序版插入排序
 * @date 2021/1/12 12:46 下午
 */
public class InsertDescSort implements Sort {
    public static void main(String[] args) {
        int n = 10000;
        Integer[] integers = ArrayGenerator.generateDisorder(n, n);
        SortingHelper.sortTest(new InsertDescSort(),integers);
    }
    @Override
    public <E extends Comparable<E>> void sort(E[] e) {
        // 循环不变量 arr[0,i) 为排好序的 arr[i,n) 是排好序的
        for(int i=e.length-1;i>=0;i--){
            E t = e[i];
            int j;
            for(j=i;j+1<e.length && t.compareTo(e[j+1])>0;j++){
              e[j] = e[j+1];
            }
            e[j] = t;
        }
    }

    @Override
    public String getName() {
        return "倒序版插入排序";
    }
}
