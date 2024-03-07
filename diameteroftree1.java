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

    public static int height(Node root) {
        if(root==null) {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root) { //O(n)
        if(root==null) {
            return new Info(0,0); 
        }
        Info li=diameter(root.left);
        Info ri=diameter(root.right);
        int diam=Math.max(Math.max(li.diam, ri.diam), li.ht+ri.ht+1);
        int ht=Math.max(li.ht, ri.ht)+1;

        return new Info(diam,ht);
    }   
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}