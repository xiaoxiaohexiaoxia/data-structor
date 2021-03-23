package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 栈接口
 * @date 2021/1/15 11:50 上午
 */
public interface Stack<E> {
    void push(E e) throws IllegalAccessException;
    E pop()throws IllegalAccessException ;
    E peek() throws IllegalAccessException;
    int getSize();
    boolean isEmpty();
}
