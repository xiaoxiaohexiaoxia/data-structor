/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 栈接口
 * @date 2021/1/15 11:50 上午
 */
public interface Stack<E> {
    /**
     * 入栈
     * @param e 入栈数据
     */
    void push(E e);

    /**
     * 出栈
     * @return 出栈数据
     */
    E pop();

    E peek();

    /**
     * 获取当前个数
     * @return
     */
    int getSize();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();
}
