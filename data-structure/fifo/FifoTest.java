public class FifoTest {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(new NodeFifo(10));
        myQueue.enqueue(new NodeFifo(20));
        myQueue.enqueue(new NodeFifo(30));
        myQueue.enqueue(new NodeFifo(40));

        System.out.println(myQueue);

        var deqNode = myQueue.dequeue();

        System.out.println("DeqNode: " + deqNode);

        System.out.println(myQueue);

    }
}
