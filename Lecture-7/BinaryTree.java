
import java.io.*;
import java.util.*;

class Node{  // Node class to create nodes of the binary tree like data,left child,right child
  int data;
  Node left;
  Node right;

//   Constructor- we take data and left and right child as null
  Node(int value){
    data = value;
    left = null;
    right = null;
  }
}

class BinaryTree{
    void preorder(Node root){
        if(root != null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    void Inorder(Node root){
        if(root != null){
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }
    }
    // postorder
    void postorder(Node root){
        if(root != null){
            postorder(root.left);  // traverse all left data
            postorder(root.right);  // traverse all right data
            System.out.println(root.data); // then print root data
        }
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(); // creating object of BinaryTree class but its not necessary

        Node root = new Node(10); // creating root node
        root.left = new Node(20); // creating left child of root node
        root.right = new Node(30); // creating right child of root node
        root.left.left = new Node(40); // creating left child of left child of root node
        root.left.right = new Node(50); // creating right child of left child of root node
        root.right.left = new Node(60); // creating left child of right child of root node
        root.right.right = new Node(70); // creating right child of right child of root node

        System.out.println("Preorder Traversal:");
        tree.preorder(root); // Preorder Traversal: 10, 20, 40, 50, 30, 60, 70

        System.out.println("\nInorder Traversal:");
        tree.Inorder(root); // Inorder Traversal: 40, 20, 50, 10, 60, 30, 70

        System.out.println("\nPostorder Traversal:");
        tree.postorder(root); // Postorder Traversal: 40, 50, 20, 60, 70, 30, 10
    }
}


/*Preorder Traversal:
10
20
40
50
30
60
70

Inorder Traversal:
40
20
50
10
60
30
70

Postorder Traversal:
40
50
20
60
70
30
10

*/