package Trees;


public class TreesExample {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        display(root);
        preOrder(root);
//        postOrder(root);
    }

    private static void preOrder(Node root) {
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

//    private static void postOrder(Node root) {
//        postOrder(root.left);
//        postOrder(root.right);
//        if(root==null)return;
//        System.out.print(root.data+" ");
//    }

    public static void display(Node root)
    {
        if(root==null)return;
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+" ");
        if(root.right!=null) System.out.print(root.right.data+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
}
