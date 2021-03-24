/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 队列实现
 * @date 2021/1/18 11:48 上午
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity) {
        this.array = new Array<E>(capacity);
    }

    public ArrayQueue() {
        this.array = new Array<E>();
    }

    @Override
    public void enqueue(E e) throws Exception {
        this.array.addLast(e);
    }

    @Override
    public E dequeue() throws Exception {
        E e = this.array.removeFirst();
        return e;
    }

    @Override
    public E getFront() throws IllegalAccessException {
        return this.array.getFirst();
    }

    @Override
    public int getSize() {
        return this.array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.array.isEmpty();
    }

    @Override
    public int getCapacity() {
        return this.array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Queue: front[");
        for (int i = 0; i < array.getSize(); i++) {
            try {
                res.append(array.get(i).toString());
                if (i != array.getSize() - 1) {
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
