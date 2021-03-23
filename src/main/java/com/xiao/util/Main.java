package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: main 函数
 * @date 2021/1/14 11:38 上午
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack.toString());
        }
        arrayStack.pop();
        System.out.println(arrayStack.toString());
    }
}
