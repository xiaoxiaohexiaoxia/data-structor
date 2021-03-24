package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 队列实现
 * @date 2021/1/18 11:48 上午
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> data;
    private int tailIndex = 0;

    public ArrayQueue(int capacity) {
        this.data = new Array<E>(capacity);
    }

    public ArrayQueue() {
        this.data = new Array<E>();
    }

    @Override
    public void enqueue(E e) throws Exception {
        this.data.add(tailIndex++, e);
    }

    @Override
    public E dequeue() throws Exception {


    }

    @Override
    public E getFront() throws IllegalAccessException {
        return this.data.getFirst();
    }

    @Override
    public int getSize() {
        return this.data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override
    public int getCapacity() {
        return this.data.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Queue: front[");
        for (int i = 0; i < data.getSize(); i++) {
            try {
                res.append(data.get(i).toString());
                if (i != data.getSize() - 1) {
                    res.append(",");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        res.append("] tail");
        return res.toString();
    }


}
