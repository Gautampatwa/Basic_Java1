package Trees;

import java.util.LinkedList;
import java.util.Queue;

// BT with a property:1: Every node to the left of given node is smaller than the node
//                    2: Every node to the right of given node is greater than the node
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "->");
        if (root.left != null) {
            System.out.print(root.left.data + "->");
        }
        if (root.right != null) {
            System.out.print(root.right.data);
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    private static boolean searchInBST(Node root,int target) {
        if(root==null)return false;
        if(root.data==target)
        {
            return true;
        }
        if(root.data>target)
        {
            return searchInBST(root.left,target);
        }
        return searchInBST(root.right, target);
    }

    private static Node insertintoBST(Node root, int val) {
        if(root==null)
            return new Node(val);
        if(root.data>val)
        {
            if(root.left==null) {
                root.left = new Node(val);
            }
                else{
                return insertintoBST(root.left, val);
                }
            }
        else{
            if(root.right==null) {
                root.right = new Node(val);
            }
            else{
                return insertintoBST(root.right, val);
            }
        }
        return root;
    }

    private static int heightofTree(TreeExamples.Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(heightofTree(root.left), heightofTree(root.right));
    }

    private static void bfs(TreeExamples.Node root) {
        Queue<TreeExamples.Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            TreeExamples.Node temp = q.peek();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.print(temp.data + " ");
            q.remove();
        }
    }

    private static void preOrder(Node root) {
    if(root==null)
    {
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
    }

    public static void main(String[] args) {
     Node root=new Node(50);
     Node b=new Node(20);
     Node c=new Node(17);
     Node d=new Node(34);
        Node e=new Node(28);
        Node f=new Node(10);
        Node g=new Node(14);
        Node h=new Node(60);
        Node i=new Node(55);
        Node j=new Node(89);
        Node k=new Node(70);
        root.left=b;
        b.left=c;
        b.right=d;
        c.left=f;
        d.left=e;
        f.right=g;
        root.right=h;
        h.left=i;
        h.right=j;
        j.left=k;
        display(root);
        int target=60;
        boolean isElementsInBST = searchInBST(root, target);
        System.out.println("Element is present in BST:"+isElementsInBST);
        int val=40;
        Node insertintoedBST = insertintoBST(root, val);
        System.out.println("Inserted elements:"+insertintoedBST.data);
        System.out.println();
        System.out.println("Preorder Of Binary Search Tree:");
        preOrder(root);
    }
}
