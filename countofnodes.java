public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int countOfNodes(Node root) { //O(n)
        if(root==null) {
            return 0;
        }

        int lc=countOfNodes(root.left);
        int rc=countOfNodes(root.right);
        return lc+rc+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(countOfNodes(root));
    }
}
