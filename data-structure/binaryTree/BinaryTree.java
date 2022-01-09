public class BinaryTree<T extends Comparable<T>> {

    private NodeTree<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        NodeTree<T> newNode = new NodeTree(data);
        this.root = this.insert(this.root, newNode);
    }

    private NodeTree<T> insert(NodeTree<T> current, NodeTree<T> newNode) {
        if (current == null) {
            return newNode;
        } else if (newNode.getData().compareTo(current.getData()) < 0) {
            current.setRefLeftNode(this.insert(current.getRefLeftNode(), newNode));
        } else {
            current.setRefRightNode(this.insert(current.getRefRightNode(), newNode));
        }
        return current;
    }

    public void displayInOrder() {
        System.out.println("\n displaying in order");
        this.displayInOrder(this.root);
    }

    private void displayInOrder(NodeTree<T> current) {
        if (current != null) {
            displayInOrder(current.getRefLeftNode());
            System.out.println(current.getData() + ", ");
            displayInOrder(current.getRefRightNode());
        }
    }

    public void displayPostOrder() {
        System.out.println("\n Displaying Post Order");
        this.displayPostOrder(this.root);
    }

    private void displayPostOrder(NodeTree<T> current) {
        if (current != null) {
            this.displayPostOrder(current.getRefLeftNode());
            this.displayPostOrder(current.getRefRightNode());
            System.out.println(current.getData() + ", ");
        }
    }

    public void displayPreOrder() {
        System.out.println("\n Displaying Pre order");
        this.displayPreOrder(this.root);
    }

    private void displayPreOrder(NodeTree<T> current) {
        if (current != null) {
            System.out.println(current.getData() + ", ");
            this.displayPreOrder(current.getRefLeftNode());
            this.displayPreOrder(current.getRefRightNode());
        }
    }

    public void remove(T data) {
        try {
            NodeTree<T> current = this.root;
            NodeTree<T> father = null;
            NodeTree<T> child = null;
            NodeTree<T> temp = null;

            while(current != null && !current.getData().equals(data)) {
                father = current;

                if (data.compareTo(current.getData()) < 0) {
                    current = current.getRefLeftNode();
                } else {
                    current = current.getRefLeftNode();
                }
            }

            if (current == null) {
                System.out.println("Data not found.");
            }

            if (father == null) {
                if (current.getRefRightNode() == null) {
                    this.root = current.getRefLeftNode();
                } else if (current.getRefLeftNode() == null) {
                    this.root = current.getRefRightNode();
                } else {
                    for (temp = current, child = current.getRefLeftNode();
                         child.getRefRightNode() != null;
                         temp = child, child = child.getRefLeftNode()
                    ) {
                        if (child != current.getRefLeftNode()) {
                            temp.setRefLeftNode(child.getRefLeftNode());
                            temp.setRefRightNode(this.root.getRefLeftNode());
                        }
                    }
                    child.setRefRightNode(this.root.getRefRightNode());
                    this.root = child;
                }
            } else if (current.getRefRightNode() == null) {
                if (father.getRefLeftNode() == current) {
                    father.setRefLeftNode(current.getRefLeftNode());
                } else {
                    father.setRefRightNode(current.getRefLeftNode());
                }
            } else if (current.getRefLeftNode() == null) {
                if (father.getRefLeftNode() == null) {
                    father.setRefLeftNode(current.getRefRightNode());
                } else {
                    father.setRefRightNode(current.getRefRightNode());
                }
            } else {
                for (
                        temp = current, child = current.getRefLeftNode();
                        child.getRefRightNode() != null;
                        temp = child, child = child.getRefRightNode()
                ) {
                    if (child != current.getRefLeftNode()) {
                        temp.setRefRightNode((child.getRefLeftNode()));
                        child.setRefLeftNode(current.getRefLeftNode());
                    }
                    child.setRefRightNode(current.getRefRightNode());
                    if (father.getRefLeftNode() == current) {
                        father.setRefLeftNode(child);
                    } else {
                        father.setRefRightNode(child);
                    }
                }
            }
        } catch (NullPointerException error) {
            System.out.println("Data not found, " + error);
        }


    }



}