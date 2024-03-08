import java.util.*;

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
    
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node=node;
            this.hd=hd;
        }
    }
    
    public static void KLevel(Node root, int level, int K) {
        if(root==null) {
            return;
        }
        if(level==K) {
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left,level+1,K);
        KLevel(root.right,level+1,K);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int k=3;
        KLevel(root,1,k);
    }
}
