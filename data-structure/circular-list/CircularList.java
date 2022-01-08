public class CircularList {
    private Node head;
    private Node tail;
    private int listLength;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.listLength = 0;
    }

    public void add(int dataNode) {
        Node newNode = new Node(dataNode);

        if (this.listLength == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setRefNextNode(this.tail);
        } else {
            newNode.setRefNextNode(this.tail);
            this.head.setRefNextNode(newNode);
            this.tail = newNode;
        }
        this.listLength++;
    }

    public void remove(int index) {
        if (index >= this.listLength)
            throw new IndexOutOfBoundsException("The index is bigger than list length");

        Node nodeAux = this.tail;
        if (index == 0) { // I'm on the tail
            this.tail = this.tail.getRefNextNode();
            this.head.setRefNextNode(this.tail);
        } else if (index == 1) {
            this.tail.setRefNextNode(this.tail.getRefNextNode().getRefNextNode());
        } else {
            for (int i = 0; i < index-1; i++) {
                nodeAux = nodeAux.getRefNextNode();
            }
            nodeAux.setRefNextNode((nodeAux.getRefNextNode().getRefNextNode()));
        }
        this.listLength--;
    }

    public int getNodeData(int index) {
        return this.getNode(index).getData();
    }

    public Node getNode(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("The List is empty");

        if (index == 0) return this.tail;

        Node nodeAux = this.tail;
        for (int i = 0; (i < index) && (nodeAux != null); i++) {
            nodeAux = nodeAux.getRefNextNode();
        }
        return nodeAux;

    }

    public boolean isEmpty() {
        return this.listLength == 0 ? true : false;
    }

    public int size() {
        return this.listLength;
    }

    @Override
    public String toString() {
        String strReturn = "";
        Node nodeAux = this.tail;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "[Node{data=" + nodeAux.getData() + "}]--->";
            nodeAux = nodeAux.getRefNextNode();
        }
        strReturn += this.size() != 0 ? "(Retorna ao início)" : "[]";
        return strReturn;
    }
}
