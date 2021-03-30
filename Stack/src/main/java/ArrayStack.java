
/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 栈
 * @date 2021/1/15 11:42 上午
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> data;

    public ArrayStack() {
        this.data = new Array<E>();
    }

    public ArrayStack(int capacity) {
        this.data = new Array<E>(capacity);
    }

    @Override
    public void push(E e) {
        this.data.addLast(e);
    }

    @Override
    public E pop() {
        return this.data.removeLast();
    }

    @Override
    public E peek() {
        return this.data.getLast();
    }

    @Override
    public int getSize() {
        return this.data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public int getCapacity() {
        return this.data.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Stack: [");
        for (int i = 0; i < data.getSize(); i++) {
            res.append(data.get(i).toString());
            if (i != data.getSize() - 1) {
                res.append(",");
            }
        }
        res.append("] TOP");
        return res.toString();
    }
}
