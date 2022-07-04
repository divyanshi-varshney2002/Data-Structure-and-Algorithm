package Tree;
// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes
required for the program */
import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class Nodeb {
    int data;
    Nodeb left, right;

    public Nodeb(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}

/* Class to print Level Order Traversal */
class LevelwiseTraversing {

    Nodeb root;

    /* Given a binary tree. Print
    its nodes in level order
    using array for implementing queue */
    void printLevelOrder()
    {
        Queue<Nodeb> queue = new LinkedList<Nodeb>();
        queue.add(root);
        while (!queue.isEmpty()) {

			/* poll() removes the present head.
			For more information on poll() visit
			http://www.tutorialspoint.com/java/
			util/linkedlist_poll.htm */
            Nodeb tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[])
    {
		/* creating a binary tree and entering
		the nodes */
        LevelwiseTraversing tree_level = new LevelwiseTraversing();
        tree_level.root = new Nodeb(1);
        tree_level.root.left = new Nodeb(2);
        tree_level.root.right = new Nodeb(3);
        tree_level.root.left.left = new Nodeb(4);
        tree_level.root.left.right = new Nodeb(5);

        System.out.println("Level order traversalof binary tree is - ");
        tree_level.printLevelOrder();
    }
}
