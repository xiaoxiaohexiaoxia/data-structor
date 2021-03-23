package com.xiao.stage_1.select_sort;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: TODO
 * @date 2021/1/7 11:31 上午
 */
public class SelectSortT implements Comparable<SelectSortT> {
    private int age;

    public SelectSortT(int age) {
        this.age = age;
    }

    public int compareTo(SelectSortT o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "SelectSortT{" +
                "age=" + age +
                '}';
    }
}
