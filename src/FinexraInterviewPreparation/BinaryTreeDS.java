package FinexraInterviewPreparation;

public class BinaryTreeDS {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BinaryTree{
       static int index=-1;
       public static Node buildTree(int nodes[])
       {
           index++;
           if(nodes[index]==-1)
           {
               return null;
           }
           Node newNode=new Node(nodes[index]);
           newNode.left=buildTree(nodes);
           newNode.right=buildTree(nodes);
           return newNode;
       }
    }
    public static int countOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Total no of Nodes:"+countOfNodes(root));
    }
}
