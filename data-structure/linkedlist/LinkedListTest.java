public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);

        System.out.println(myLinkedList);

        myLinkedList.remove(3);

        System.out.println(myLinkedList);

    }
}