/**
 * @author 肖立彤
 * @version 0.1
 * 描述: 主函数
 * @date 2021/3/23 4:27 下午
 */
public class Main {
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
