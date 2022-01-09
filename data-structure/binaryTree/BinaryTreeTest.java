public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Obj> myTree = new BinaryTree<Obj>();

        myTree.insert(new Obj(13));
        myTree.insert(new Obj(10));
        myTree.insert(new Obj(25));
        myTree.insert(new Obj(02));
        myTree.insert(new Obj(12));
        myTree.insert(new Obj(20));
        myTree.insert(new Obj(29));
        myTree.insert(new Obj(32));
        myTree.insert(new Obj(17));

        myTree.remove(new Obj(29));

        myTree.displayInOrder();
        myTree.displayPreOrder();
        myTree.displayPostOrder();


    }
}
