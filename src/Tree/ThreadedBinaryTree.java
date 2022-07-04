package Tree;

class Node_{
    int data;
    Node_ left, right;
    boolean leftthread , rightthread;
    public Node_(int data){
        this.data=data;
    }
}
public class ThreadedBinaryTree {
    public static Node_ leftMost(Node_ root) {
        if (root == null)
            return root;
        while (root.left != null)
            root = root.left;
        return root;
    }
    public static void inorder(Node_ root){
        Node_ current=leftMost(root);
        while(current != null && current.data != Integer.MIN_VALUE)
        {
            System.out.println(current.data);
            if(current.rightthread)
            {
                current= current.right;
            }
            else
                current = leftMost(current.right);
        }
    }
    public static void main(String[] args) {
        Node_ dummy = new Node_(Integer.MIN_VALUE);
        Node_ n1 = new Node_(90);
        Node_ n2 = new Node_(20);
        Node_ n3 = new Node_(50);
        Node_ n4 = new Node_(60);
        // adding left and right child here
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        // utilization of dummy node
        dummy.left = n1;
        dummy.right = dummy;
        dummy.rightthread= true;
        // now adding thread with each of the node
        n4.right = n2;
        n4.rightthread= true;
        n2.right = n1;
        n2.rightthread = true;
        n3.right= dummy;
        n3.rightthread= true;
        inorder(dummy);
    }
}

