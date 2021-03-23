package com.xiao.stage_1;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 线性查找算法
 * @date 2020/12/4 12:53 下午
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Integer search = LinearSearch.search(4, a);
        System.out.println(search);
    }
    private static Integer search(int a, int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==a){
                return i;
            }
        }
        // 没有返回-1  也就是无效的索引
        return -1;
    }
}
