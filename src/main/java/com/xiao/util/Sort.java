package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: TODO
 * @date 2021/1/7 12:57 下午
 */
public interface Sort {
    String name = "排序";
    <E extends Comparable<E>> void sort(E[] e);
    String getName();

}
