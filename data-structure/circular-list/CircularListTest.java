public class CircularListTest {
    public static void main(String[] args) {
        CircularList myCircularList = new CircularList();

        myCircularList.add(10);
        System.out.println(myCircularList);

        myCircularList.remove((0));
        System.out.println(myCircularList);

        myCircularList.add(20);
        System.out.println(myCircularList);

        myCircularList.add(30);
        myCircularList.add(40);
        System.out.println(myCircularList);

        System.out.println(myCircularList.getNode(7));
        System.out.println(myCircularList.getNode(323));


    }
}