public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private int value;

    public static void levelOrderTraversal (BinaryNode node){
        for (int i = 0; i < getHeightOfTree(node); i++) {
            printCurrentLevel(node, i + 1);
        }
    }

    static void printCurrentLevel(BinaryNode node, int level){
        if(node == null){
            return;
        }
        if(level == 1){
            System.out.print(node.value + " ");
        }
        else{
            printCurrentLevel(node.left, level -1);
            printCurrentLevel(node.right, level -1);
        }
    }
    static int getHeightOfTree( BinaryNode root){
        if (root == null){
            return 0;
        }
        else{
            int leftHeight =  getHeightOfTree ( root.getLeft() );
            int rightHeight = getHeightOfTree( root.getRight() );

            if( leftHeight > rightHeight){
                return leftHeight + 1;
            }
            else{
                return rightHeight + 1;
            }
        }
    }

    public BinaryNode( int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public BinaryNode getLeft() {
        return left;
    }
    public BinaryNode getRight() {
        return right;
    }
    public int getValue() {
        return value;
    }
    
}
