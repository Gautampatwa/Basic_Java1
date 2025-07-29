package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeExamples {

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

    private static int findMax(Node root) {
        if (root == null)
            return 0;
        int a = root.data;
        int b = findMax(root.left);
        int c = findMax(root.right);
        return Math.max(a, Math.max(b, c));
    }

    private static int sumOfTree(Node root) {
        if (root == null) return 0;
        return root.data + sumOfTree(root.left) + sumOfTree(root.right);
    }

    private static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.right) + size(root.left);
    }


    private static int heightofTree(Node root) {
        if (root == null || root.right == null || root.left == null)
            return 0;
        return 1 + Math.max(heightofTree(root.left), heightofTree(root.right));
    }

    private static int minValueTree(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int a = root.data;
        int b = minValueTree(root.left);
        int c = minValueTree(root.right);
        return Math.min(a, Math.min(b, c));
    }

    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void InOrder(Node root) {
        if (root == null) return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) return;
        InOrder(root.left);
        InOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void nthLevel(Node root, int n) {
        if (root == null) return;
        if (n == 1)
            System.out.print(root.data + " ");
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);

    }


    private static void nthLevel2(Node root, int n) {
        if (root == null) return;
        if (n == 1)
            System.out.print(root.data + " ");
        nthLevel2(root.right, n - 1);
        nthLevel2(root.left, n - 1);
    }

    private static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            Node temp = q.peek();
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

    public static int diameterOfBinaryTree(Node root) {
        if (root == null || root.left == null || root.right == null)
            return 0;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int mid = heightofTree(root.right) + heightofTree(root.left);
        if (root.left != null) mid++;
        if (root.right != null) mid++;
        return Math.max(left, Math.max(mid, right));
    }

    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = heightofTree(root.left);
        if (root.left != null)
            lh++;
        int rh = heightofTree(root.right);
        if (root.right != null)
            rh++;
        int d = lh - rh;
        if (d < 0) {
            d = -d;
        }
        if (d > 1) return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }

    public static boolean isSame(Node left, Node right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.data != right.data)
            return false;
        return isSame(left.left, right.left) && isSame(left.right, right.right);
    }

    private static List<String> path(Node root) {
        List<String> arr = new ArrayList<>();
        helper(root, arr, "");
        return arr;
    }

    private static void helper(Node root, List<String> ans, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.data;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s + root.data + "->");
        helper(root.right, ans, s + root.data + "->");
    }

    private static Node lowestCommonAncestors(Node root, Node p, Node q) {
        if (p == root || q == root) return root;
        if (p == q) return p;
        boolean leftp = contains(root.left, p);
        boolean rightq = contains(root.right, q);
        if ((leftp && rightq) || (!leftp && !rightq)) return root;
        if (leftp && !rightq) return lowestCommonAncestors(root.left, p, q);
        if (!leftp && rightq) return lowestCommonAncestors(root.right, p, q);
        return root;
    }

    private static boolean contains(Node root, Node node) {
        if (root == null) return false;
        if (root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    private static Node invertBinaryTree(Node root) {
        if (root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertBinaryTree(r);
        root.right = invertBinaryTree(l);
        return root;

    }

    public static boolean isSymmteric(Node root) {
        if (root == null) {
            return true;
        }
        root.left = invertBinaryTree(root.left);
        return isSame(root.left, root.right);
    }


    private static Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helperforBinaryTree(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    private static Node helperforBinaryTree(int[] preorder, int prelo, int prehi, int[] inorder, int inlo, int inhi) {
        if (prelo > prehi) return null;
        Node root = new Node(preorder[prelo]);
        int i = inlo;
        while (inorder[i] != preorder[prelo]) {
            i++;
        }
        int leftSize = i - inlo;
        root.left = helperforBinaryTree(preorder, prelo + 1, prelo + leftSize, inorder, inlo, i - 1);
        root.right = helperforBinaryTree(preorder, prelo + leftSize + 1, prehi, inorder, i + 1, inhi);
        display(root);
        return root;
    }

    private static boolean pathSum(Node root, int targetSum) {
        if (root == null) return false;
        if (root != null && root.left == null && root.right == null) {
            if (root.data == targetSum) return true;
        }
        return pathSum(root.left, targetSum - root.data) || pathSum(root.right, targetSum - root.data);
    }


    private static List<List<Integer>> pathSum2(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helperPathSum(ans, arr, root, targetSum);
        return ans;
    }

    private static void helperPathSum(List<List<Integer>> ans, List<Integer> arr, Node root, int targetSum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            arr.add(root.data);
            if(root.data==targetSum)
            {
                List<Integer> a=new ArrayList<>();
                for(int i=0;i<arr.size();i++)
                {
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.data);
        helperPathSum(ans, arr, root.left, targetSum-root.data);
        helperPathSum(ans, arr, root.right, targetSum-root.data);
        arr.remove(arr.size()-1);
    }
    private static int noOfPaths(Node root, int targetSum) {
        if(root==null)return 0;
        int count=0;
        if(root.data==targetSum)
        {
            count++;
        }

        return count+noOfPaths(root.left,targetSum-root.data)+
                noOfPaths(root.right,targetSum-root.data);
    }

    public int pathSumForNoOfPaths(Node root,int targetSum)
    {
        if(root==null)return 0;
        int count=noOfPaths(root,targetSum);
        count+=(pathSumForNoOfPaths(root.left,targetSum)+pathSumForNoOfPaths(root.right,targetSum));
        return count;
    }


    private static void flatten(Node root) {

        if(root==null)return;
        Node leftTree=root.left;
        Node rightTree=root.right;
        root.left=null;
        flatten(leftTree);
        flatten(rightTree);
        root.right=leftTree;
        Node temp=leftTree;
        while(temp!=null && temp.right!=null)
        {
            temp=temp.right;
        }
        if(temp!=null)
        {
            temp.right=rightTree;
        }else{
            root.right=rightTree;
        }

    }

    private static void flatten2(Node root) {
        Node curr=root;
        while (curr!=null)
        {
            if(curr.left!=null)
            {
                Node pred=curr.left;
                while (pred.right!=null);
                {
                    pred=pred.right;
                }
                pred.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(12);
        Node b = new Node(2);
        root.left = a;
        root.right = b;
        Node c = new Node(23);
        Node d = new Node(39);
        a.left = c;
        a.right = d;
        Node e = new Node(21);
        b.right = e;
        display(root);
        System.out.println("Max Element of Tree:" + findMax(root));
        //PreOrder Traversal
        int sumofTree = sumOfTree(root);
        System.out.println("SumofTree:" + sumofTree);
        int sizeOfTree = size(root);
        System.out.println("Tree size:" + sizeOfTree);
        int heightofTree = heightofTree(root);
        System.out.println("Height:" + heightofTree);
        int minValueTree = minValueTree(root);
        System.out.println("Minvalue Tree:" + minValueTree);
        preOrder(root);
        System.out.println();
        System.out.println("InOrder");
        InOrder(root);
        System.out.println();
        System.out.println("PostOrder");
        postOrder(root);
        System.out.println();
        System.out.println("Nth Level");
        nthLevel(root, 3);
        System.out.println();
        System.out.println("Queue pdhke start krna BFS");
        System.out.println("Level Order Traversal (BFS:Breadth First Search)");
        int totalLevels = heightofTree(root) + 1;
        for (int i = 1; i <= totalLevels; i++) {
            nthLevel(root, i);
        }
        System.out.println();
        System.out.println("BFS Using Queue");
        bfs(root);
        int diameter = diameterOfBinaryTree(root);
        System.out.println();
        System.out.println("Diameter of Tree:" + diameter);
        boolean balanced = isBalanced(root);
        System.out.println("Is Tree Balanced Tree:" + balanced);
        boolean same = isSame(root.left, root.right);
        System.out.println("Is Tree Same Tree:" + same);
        List<String> path = path(root);
        System.out.println("Path of the tree:" + path);
        Node p = new Node(12);
        Node q = new Node(23);
        Node ancestors = lowestCommonAncestors(root, p, q);
        System.out.println("Lowest Common Ancestors of the Binary tree:" + ancestors.data);
        System.out.println();
        Node inverted = invertBinaryTree(root);
        System.out.println("Inverted Binary Tree:" + inverted.left.data);
        display(root);
        boolean symmetric = isSymmteric(root);
        System.out.println("Is Tree Symmetric Tree:" + symmetric);
        System.out.println();
        System.out.println("Zigzag Conversion of Binary Tree:");
        for (int i = 1; i <= totalLevels; i++) {
            if (i % 2 != 0) {
                nthLevel(root, i);
            } else {
                nthLevel2(root, i);
                System.out.println();
            }
        }
        display(root);
        System.out.println("Traversal to Binary Tree creation:");
        System.out.println();
        int[] preorder = {1, 2, 4, 5, 3, 6};
        int[] inorder = {4, 2, 5, 1, 3, 6};
        buildTree(preorder, inorder);
        System.out.println();
        int targetSum = 33;
        boolean ispath = pathSum(root, targetSum);
        System.out.println("Path sum equals:" + ispath);
        System.out.println();
        List<List<Integer>> lists = pathSum2(root, targetSum);
        System.out.println("Path sum:"+lists);
        System.out.println();
        int noofPathEqualtoTarget = noOfPaths(root, targetSum);
        System.out.println("No of Path Equal to Target Sum:"+noofPathEqualtoTarget);
        System.out.println();
        System.out.println("Flatten Tree:");
        flatten(root);
        display(root);
        System.out.println();
        System.out.println("Approach 2 for flatten");
        flatten2(root);
        display(root);
    }
}
