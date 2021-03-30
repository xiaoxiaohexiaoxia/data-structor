package com.xiao.util;

import com.xiao.stage_1.select_sort.SelectSort;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 排序辅助类
 * @date 2021/1/7 12:48 下午
 */
public class SortingHelper {
    public  static <E extends Comparable<E>> boolean isSort(E[] e){
        for (int i = 1; i < e.length; i++) {
            if(e[i-1].compareTo(e[i])>0){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断排序是否正确
     * @param sort 排序算法
     * @param e 排序数据
     * @param <E> 数据类型
     */
    public static <E extends Comparable<E>> void sortTest(Sort sort,E[] e){
        long start = System.nanoTime();
        sort.sort(e);
        long end = System.nanoTime();
        double time = (end - start) / 1000000000.0;
        if(!SortingHelper.isSort(e)){
            throw new RuntimeException(sort.getName() + "排序失败");
        }
        System.out.printf("%S, 规模 = %d : %f s%n",sort.getName(),e.length,time);
    }
}
