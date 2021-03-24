/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 循环队列
 * @date 2021/3/23 4:30 下午
 */
public class LoopQueue<E> implements Queue<E>{
    private E[] data;
    private int fount,tail;
    private int size;

    public LoopQueue() {
        this(10);
    }
    public LoopQueue(int capacity){
        this.data =(E[]) new Object[capacity+1];
        this.fount = 0;
        this.tail = 0;
        this.size = 0;

    }
    @Override
    public void enqueue(E e) throws Exception {

    }

    @Override
    public E dequeue() throws Exception {
        return null;
    }

    @Override
    public E getFront() throws IllegalAccessException {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return fount==this.tail;
    }

    @Override
    public int getCapacity() {
        return data.length-1;
    }
}
