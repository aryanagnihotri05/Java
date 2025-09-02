package StacknQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        DynamicQueue queue = new DynamicQueue();
//        queue.insert(3);
//        queue.insert(15);
//        queue.insert(16);
//        queue.insert(46);
//        queue.insert(78);
//        queue.insert(54);
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(38);
        queue.insert(94);
        queue.insert(23);
        queue.insert(79);
        queue.insert(12);
        queue.insert(12);
//        queue.remove();
//        queue.display();
//        queue.remove();
        queue.display();
    }
}
