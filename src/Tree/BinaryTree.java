package Tree;
/*
class Node{
    Node node,left,right;
    int key;
    public Node(int item) {
        key = item;
        left=right=null;
    }
}*/
public class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }

    void preorder(Node node){
        if(node==null)
            return;
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }
    void preorder(){
        preorder(root);
    }

    void postorder(Node node){
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);
    }
    void postorder(){
        postorder(root);
    }

    void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }
    void inorder(){
        inorder(root);
    }

    static int count(Node root){
        if(root==null) return 0;
        int left =count(root.left);
        int right=count(root.right);
        return left+right+1;
        //return count(root.left)+count(root.right)+1;
    }

    static int sum(Node root){
        if(root==null) return 0;
        /*int left =sum(root.left);
        int right=sum(root.right);
        return left+right+root.key;*/
        return sum(root.left)+sum(root.right)+root.key;
    }
    static int height(Node root){
        if (root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        System.out.println("preorder traversal:");
        tree.preorder();
        System.out.println("postorder traversal:");
        tree.postorder();
        System.out.println("inorder traversal:");
        tree.inorder();


        System.out.println("count of nodes:  "+count(tree.root));
        System.out.println("sum of nodes:  "+sum(tree.root));
        System.out.println("height of tree:  " + height(tree.root));
    }


}
