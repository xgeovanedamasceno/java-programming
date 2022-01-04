public class Queue {
    NodeFifo queueRef = null;

    public void enqueue(NodeFifo newNode) {
        newNode.setNodeRef(this.queueRef);
        this.queueRef = newNode;
    }

    public NodeFifo dequeue() {
        if(!this.isEmpty()) {
            NodeFifo firstNode = this.queueRef;
            NodeFifo auxNode = this.queueRef;

            while (true) {
                if (firstNode.getNodeRef() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getNodeRef();
                } else {
                    auxNode.setNodeRef(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty() {
        return queueRef == null ? true : false;
    }

    public NodeFifo firstNode() {
        if (!this.isEmpty()) {
            NodeFifo firstNode = this.queueRef;
            while (true) {
                if (firstNode.getNodeRef() != null) {
                    firstNode = firstNode.getNodeRef();
                } else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        NodeFifo auxNode = this.queueRef;

        if (this.queueRef != null) {
            while (true) {
                stringReturn += "[Node{data= " + auxNode.getData() + "}]--->";
                if (auxNode.getNodeRef() != null) {
                    auxNode = auxNode.getNodeRef();
                } else {
                    stringReturn += "null";
                    break;
                }
            }
        } else {
            stringReturn = "null";
        }

        return stringReturn;
    }
}
