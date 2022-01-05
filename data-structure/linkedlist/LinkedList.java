public class LinkedList {
    private NodeList refLinkList;

    public LinkedList() {
        this.refLinkList = null;
    }

    public void add(int data) {
        NodeList newNode = new NodeList(data);

        if(this.isEmpty()) {
            this.refLinkList = newNode;
            return;
        }

        NodeList auxNode = this.refLinkList;
        for(int i = 0; i < this.getSize() - 1; i++) {
            auxNode = auxNode.getNextNode();
        }
        auxNode.setNextNode(newNode);
    }

    public int get(int index) {
        return this.getNode(index).getData();
    }

    private NodeList getNode(int index) {
        checkIndex(index);
        NodeList auxNode = this.refLinkList;
        NodeList nodeReturn = null;

        for (int i = 0; i <= index; i++) {
            nodeReturn = auxNode;
            auxNode = auxNode.getNextNode();
        }

        return nodeReturn;
    }

    public int remove(int index) {
        checkIndex(index);
        NodeList pivotNode = this.getNode(index);

        if(index == 0) {
            this.refLinkList = pivotNode.getNextNode();
            return pivotNode.getData();
        }

        NodeList previousNode =  this.getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getData();
    }

    public int getSize() {
        int sizeLinkList = 0;

        NodeList auxRefLinkList = this.refLinkList;

        while(true) {
            if (auxRefLinkList != null) {
                sizeLinkList++;
                if (auxRefLinkList.getNextNode() != null) {
                    auxRefLinkList = auxRefLinkList.getNextNode();
                } else {
                    break;
                }
            }
        }
        return sizeLinkList;
    }

    public void checkIndex(int index) {
        if (index >= this.getSize()) {
            int lastIndex = this.getSize() - 1;
            throw new IndexOutOfBoundsException(lastIndex);
        }
    }

    public boolean isEmpty() {
        return this.refLinkList == null ? true : false;
    }

    public NodeList getRefLinkList() {
        return this.refLinkList;
    }

    @Override
    public String toString() {
        String str = "";
        NodeList auxNode = this.refLinkList;

        for (int i = 0; i < this.getSize(); i++) {
            str += "[Node{data=" + auxNode.getData() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        str += "null";

        return str;
    }
}