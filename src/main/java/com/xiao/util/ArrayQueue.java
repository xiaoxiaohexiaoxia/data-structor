package com.xiao.util;

/**
 * @author 肖立彤
 * @version 0.1
 * 描述: TODO
 * @date 2021/1/18 11:48 上午
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> data;
    private int frontIndex = 0;
    private int tailIndex = 0;

    public ArrayQueue(int capacity) {
        this.data = new Array<E>(capacity);
    }

    public ArrayQueue() {
        this.data = new Array<E>();
    }

    @Override
    public void enqueue(E e) throws Exception {
        this.data.add(this.frontIndex, e);
        if (frontIndex == this.data.getCapacity() - 1) {
            this.frontIndex = 0;
        }else{
            this.frontIndex++;
        }
    }

    @Override
    public E dequeue() throws Exception {
        if(this.tailIndex==this.frontIndex){
           return null;
        }
        E e = this.data.get(this.tailIndex);
        this.data.set(this.tailIndex,null);
        if (tailIndex == this.data.getCapacity() - 1) {
            this.tailIndex = 0;
        }else{
            this.tailIndex++;
        }
        return e;
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

    public static void main(String[] args) throws Exception {
        ArrayQueue<Integer> integerArrayQueue = new ArrayQueue<Integer>();
        for (int i = 0; i < 20; i++) {
            integerArrayQueue.enqueue(i);
            System.out.println(integerArrayQueue);
            if (i % 3 == 2) {
                integerArrayQueue.dequeue();
                System.out.println(integerArrayQueue);
            }
        }

    }
}
