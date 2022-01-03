public class NodeLifo {
    private int data;
    private NodeLifo nodeRef = null;

    public NodeLifo() {

    }

    public NodeLifo(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeLifo getNodeRef() {
        return this.nodeRef;
    }

    public void setNodeRef(NodeLifo nodeRef) {
        this.nodeRef = nodeRef;
    }

    @Override
    public String toString() {
        return "NodeLifo{" +
                "data=" + data +
                ", nodeRef=" + nodeRef +
                '}';
    }
}
