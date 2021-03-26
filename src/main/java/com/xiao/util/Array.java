package com.xiao.util;

/**
 * @author xiaolitong
 */
public class Array<T> {
    private int size;
    private T[] data;

    private int resizeNumber;

    public Array() {
        this(10);
    }

    public Array(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * 获取当前数组成员数量
     *
     * @return 数组成员数量
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取当前数组容量
     *
     * @return 数组容量
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 获取是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // 增

    /**
     * @param index 要添加的位置
     * @param t     要添加的内容
     * @throws IllegalAccessException 索引异常信息
     */
    public void add(int index, T t) throws IllegalAccessException {

        // 判断索引是否合法
        if (index < 0 || index > this.size) {
            throw new IllegalAccessException("索引需大于0 小于当前数组长度");
        }
        // 判断当前容量
        if (this.size == this.data.length) {
            resize(2 * this.data.length);
        }
        if (size - index >= 0) {
            /*
              src – the source array. 源数组
              srcPos – starting position in the source array. 源数组起始位置
              dest – the destination array. 目标数组
              destPos – starting position in the destination data. 目标数组的起始位置
              length – the number of array elements to be copied. 要复制的数量
             */
            System.arraycopy(data, index, data, index + 1, size - index);
        }
        data[index] = t;
        size++;
    }

    /**
     * 向末尾添加元素
     *
     * @param t 元素
     * @throws IllegalAccessException 索引异常信息
     */
    public void addLast(T t) throws IllegalAccessException {
        add(size, t);
    }

    /**
     * 向开头添加元素
     *
     * @param t 元素
     * @throws IllegalAccessException 索引异常信息
     */
    public void addFirst(T t) throws IllegalAccessException {
        add(0, t);
    }

    // 删
    // 查
    // 私有方法
    // 扩容/缩容
    void resize(int capacity) {
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(data, 0, newArray, 0, size);
        data = newArray;
        resizeNumber++;
    }

    /**
     * 获取index索引位置的元素
     *
     * @param index 索引
     * @return 对应索引位置的元素
     * @throws IllegalAccessException 输出参数异常
     */
    public T get(int index) throws IllegalAccessException {
        extracted(index);
        return data[index];
    }
    public T getFirst() throws IllegalAccessException {
        return get(0);
    }
    public T getLast() throws IllegalAccessException {
        return this.get(this.size - 1);
    }
    /**
     * 更新某一索引的值
     *
     * @param index 索引
     * @param t     值
     * @throws IllegalAccessException 传入参数异常
     */
    void set(int index, T t) throws IllegalAccessException {
        extracted(index);
        data[index] = t;
    }

    /**
     * 查找数组中是否存在某一元素
     *
     * @param t 元素
     * @return 是否存在
     */
    public boolean contains(T t) {
        for (T datum : data) {
            if (datum.equals(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找某一元素 所在位置
     *
     * @param t 某一元素
     * @return 元素所在位置 如果不存在 返回-1
     */
    public int find(T t) {
        for (int j = 0; j < size; j++) {
            if (data[j].equals(t)) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 删除指定索引的元素
     *
     * @param index 指定的索引
     * @return 已删除的元素
     * @throws IllegalAccessException 传入参数异常
     */
    public T remove(int index) throws IllegalAccessException {
        extracted(index);
        T t = data[index];
        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null; // 用于垃圾回收
        if (size == (data.length / 4) && data.length / 2 != 0) {
            resize(data.length / 2); // 考虑1/2 = 0
        }
        return t;
    }

    /**
     * 删除指定元素
     *
     * @param t 指定元素
     * @return 是否已删除
     * @throws IllegalAccessException 索引异常
     */
    public boolean removeElement(T t) throws IllegalAccessException {
        int i = find(t);
        if (i != -1) {
            remove(i);
            return true;
        }
        return false;
    }


    /**
     * 删除所有指定元素
     *
     * @param t 指定元素
     * @return 删除元素个数
     * @throws IllegalAccessException 索引异常
     */
    public int removeAllElement(T t) throws IllegalAccessException {
        int i = 0;
        boolean isHave = true;
        while (isHave) {
            isHave = removeElement(t);
            i++;
        }
        return i;
    }

    /**
     * 移除第一个元素
     *
     * @return 移除的元素
     * @throws IllegalAccessException 移除越界
     */
    public T removeFirst() throws IllegalAccessException {
        return remove(0);
    }

    /**
     * 移除最后一个元素
     *
     * @return 异常的元素
     * @throws IllegalAccessException 异常越界
     */
    public T removeLast() throws IllegalAccessException {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(String.format("[数组长度=%d,数组容量=%d,扩容次数=%d]:", size, data.length, resizeNumber));
        for (int i = 0; i < size; i++) {
            stringBuilder.append(",").append(data[i].toString());
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    /**
     * 判断索引是否合法
     *
     * @param index 索引
     * @throws IllegalAccessException 传入参数异常
     */
    private void extracted(int index) throws IllegalAccessException {
        if (index < 0) {
            throw new IllegalAccessException("请传入 大于0的索引");
        }
        if (index >= size) {
            throw new IllegalAccessException("该位置不存在数据");
        }
    }
}

