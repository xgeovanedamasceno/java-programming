public class NodeTree <T extends Comparable<T>> {
    private T data;
    private NodeTree<T> refLeftNode;
    private NodeTree<T> refRightNode;

    public NodeTree(T data) {
        this.data = data;
        this.refLeftNode = this.refRightNode = null;
    }

    public NodeTree() {

    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeTree getRefLeftNode() {
        return this.refLeftNode;
    }

    public void setRefLeftNode(NodeTree<T> leftNode) {
        this.refLeftNode = leftNode;
    }

    public NodeTree getRefRightNode() {
        return this.refRightNode;
    }

    public void setRefRightNode(NodeTree<T> rightNode) {
        this.refRightNode = rightNode;
    }

    @Override
    public String toString() {
        return "NodeTree{" +
                "data=" + data +
                '}';
    }
}