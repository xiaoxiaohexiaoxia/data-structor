package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 队列接口
 * @date 2021/1/18 11:47 上午
 */
public interface Queue<E> {
    void enqueue(E e) throws Exception;
    E dequeue() throws Exception;
    E getFront() throws IllegalAccessException;
    int getSize();
    boolean isEmpty();
    int getCapacity();
}
