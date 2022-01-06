public class DoubleLinkedTest {
    public static void main(String[] args) {
        DoubleLinkedList myDoubleLinkedList = new DoubleLinkedList();

        myDoubleLinkedList.add(10);
        myDoubleLinkedList.add(20);
        myDoubleLinkedList.add(30);
        myDoubleLinkedList.add(40);
        myDoubleLinkedList.add(50);

        System.out.println(myDoubleLinkedList);

        myDoubleLinkedList.remove(3);

        System.out.println(myDoubleLinkedList);

        myDoubleLinkedList.add(3, 99);

        System.out.println(myDoubleLinkedList);
        System.out.println(myDoubleLinkedList.getDataNode(3));



    }
}
