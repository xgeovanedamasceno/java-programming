public class NodeFifo {
    private int data;
    private NodeFifo nodeRef = null;

    public NodeFifo(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeFifo getNodeRef() {
        return this.nodeRef;
    }

    public void setNodeRef(NodeFifo nodeRef) {
        this.nodeRef = nodeRef;
    }

    @Override
    public String toString() {
        return "NodeFifo{" +
                "data=" + data +
                ", nodeRef=" + nodeRef +
                '}';
    }
}