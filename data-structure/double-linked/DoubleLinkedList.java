public class DoubleLinkedList {

    private DoubleNode firstNode;
    private DoubleNode lastNode;

    private int listLength = 0;

    public void add(int data) {
        DoubleNode newNode = new DoubleNode(data);
        newNode.setRefNextNode(null);
        newNode.setRefPreviousNode(this.lastNode);

        if (this.firstNode == null) {
            this.firstNode = newNode;
        }
        if (this.lastNode != null) {
            lastNode.setRefNextNode(newNode);
        }

        this.lastNode = newNode;
        this.listLength++;

    }

    public void add(int index, int data) {
        DoubleNode nodeAux = this.getNode(index);
        DoubleNode newNode = new DoubleNode(data);
        newNode.setRefNextNode(nodeAux);

        if (newNode.getRefNextNode() != null) {
            newNode.setRefPreviousNode((nodeAux.getRefPreviousNode()));
            newNode.getRefNextNode().setRefPreviousNode(newNode);
        } else {
            newNode.setRefPreviousNode(this.lastNode);
            this.lastNode = newNode;
        }

        if (index == 0) {
            this.firstNode = newNode;
        } else {
            newNode.getRefPreviousNode().setRefNextNode(newNode);
        }

        this.listLength++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.firstNode = this.firstNode.getRefNextNode();

            if (this.firstNode != null) {
                this.firstNode.setRefPreviousNode(null);
            }
        } else {
            DoubleNode nodeAux = this.getNode(index);
            nodeAux.getRefPreviousNode().setRefNextNode(nodeAux.getRefNextNode());
            if (nodeAux != this.lastNode) {
                nodeAux.getRefNextNode().setRefPreviousNode(nodeAux.getRefPreviousNode());
            } else {
                this.lastNode = nodeAux;
            }
        }
        this.listLength--;
    }


    public int getDataNode(int index) {
        return this.getNode(index).getData();
    }

    private DoubleNode getNode(int index) {
        DoubleNode nodeAux = this.firstNode;
        for (int i = 0; (i < index) && (nodeAux != null); i++) {
            nodeAux = nodeAux.getRefNextNode();
        }

        return nodeAux;
    }

    public int size() {
        return this.listLength;
    }

    @Override
    public String toString() {
        String strReturn = "";
        DoubleNode nodeAux = this.firstNode;
        for (int i= 0; i < this.size(); i++) {
            strReturn += "[Node{Data=" + nodeAux.getData() + "}]--->";
            nodeAux = nodeAux.getRefNextNode();
        }

        strReturn += "null";
        return strReturn;
    }
}