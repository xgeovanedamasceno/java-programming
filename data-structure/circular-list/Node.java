public class Node {
    private int data;
    private Node refNextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRefNextNode() {
        return this.refNextNode;
    }

    public void setRefNextNode(Node nextNode) {
        this.refNextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}