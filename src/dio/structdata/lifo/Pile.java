package dio.structdata.lifo;

public class Pile {
    NodeLifo pileRef = null;

    public void push(NodeLifo newNode) {
        NodeLifo auxRef = this.pileRef;
        this.pileRef = newNode;
    }

    public NodeLifo pop() {
        if(!isEmpty()) {
            NodeLifo nodePoped = this.pileRef;
            this.pileRef = this.pileRef.getNodeRef();
            return nodePoped;
        }
        return null;
    }

    public NodeLifo top() {
        return this.pileRef;
    }

    public boolean isEmpty() {
        return this.pileRef == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "------------\n";
        stringReturn += "   Pile\n";
        stringReturn += "------------\n";
        NodeLifo nodeLifoAux = this.pileRef;

        while(true) {
            if(nodeLifoAux != null ) {
                stringReturn += "Node{data=" + nodeLifoAux.getData() + "}]\n";
                nodeLifoAux = nodeLifoAux.getNodeRef();
            } else {
                break;
            }
        }

        stringReturn += "============";
        return stringReturn;
    }
}
