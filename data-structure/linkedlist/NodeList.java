public class NodeList {

    private int data;
    private NodeList refNextNode = null;

    public NodeList(int data) {
        this.data = data;
    }

    public NodeList(int data, NodeList nextNode) {
        this.data = data;
        this.refNextNode = nextNode;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeList getNextNode() {
        return this.refNextNode;
    }

    public void setNextNode(NodeList nextNode) {
        this.refNextNode = nextNode;
    }

    @Override
    public String toString() {
        String str = "Node{" + this.getData() + "}";

        if (this.refNextNode != null) {
            str += "->" + this.refNextNode.toString();
        } else {
            str += "->null";
        }
        return str;
    }
}
