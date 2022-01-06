public class DoubleNode {
     private int data;
     private DoubleNode refNextNode;
     private DoubleNode refPreviousNode;

     public DoubleNode(int data) {
         this.data = data;
     }

     public int getData() {
         return this.data;
     }

     public void setData(int data) {
         this.data = data;
     }

     public DoubleNode getRefNextNode() {
         return this.refNextNode;
     }

     public void setRefNextNode(DoubleNode nextNode) {
         this.refNextNode = nextNode;
     }

     public DoubleNode getRefPreviousNode() {
         return this.refPreviousNode;
     }

     public void setRefPreviousNode(DoubleNode prevNode) {
         this.refPreviousNode = prevNode;
     }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + data +
                '}';
    }
}