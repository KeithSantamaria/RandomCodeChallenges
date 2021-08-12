public class App {


    public static void main(String[] args) throws Exception {
        BinaryNode root = new BinaryNode( 30);
        root.setLeft( new BinaryNode(15));
        root.setRight( new BinaryNode(60));
        root.getLeft().setLeft( new BinaryNode(7));
        root.getLeft().setRight( new BinaryNode(22));
        root.getLeft().getRight().setLeft( new BinaryNode (17) );
        root.getLeft().getRight().setRight(new BinaryNode( 27 ));
        root.getRight().setLeft(new BinaryNode(45));
        root.getRight().setRight(new BinaryNode(75));

        int exampleHeight = BinaryNode.getHeightOfTree(root);

        System.out.println("Should be 4 : " + exampleHeight);
        System.out.println(root.getValue());
        BinaryNode.levelOrderTraversal(root);
    }
}
