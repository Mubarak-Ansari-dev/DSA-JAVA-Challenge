// Live Class-12
// Tree Data Structure

/*
 * Tree:- A tree is a non-linear data structure that consists of nodes connected by edges. It is a hierarchical structure where each node can have zero or more child nodes, and there is one root node at the top. Trees are used to represent relationships between data elements, such as in file systems, organizational structures, and decision-making processes.
 * Common types of trees include binary trees, binary search trees, AVL trees, and B-trees.
 * Trees are widely used in computer science for various applications, including searching, sorting, and hierarchical data representation.
 * 
 */

 /*
  * Basic Terminologies of Tree:
  * 1. Node: A node is a fundamental unit of a tree that contains data and may have child nodes.
  * 2. Root: The root is the topmost node of a tree, which has no parent node.
  * 3. Parent: A parent node is a node that has one or more child nodes.
  * 4. Child: A child node is a node that has a parent node.    
    * 5. Leaf: A leaf node is a node that has no child nodes.   
    * 6. Sibling: Sibling nodes are nodes that share the same parent node.
    * 7. Edge: An edge is a connection between two nodes in a tree.
    * 8. Path: A path is a sequence of nodes and edges that connects an ancestor node to a descendant node.
    * 9. Height: The height of a tree is the length of the longest path from the root to a leaf node.
    * 10. Depth: The depth of a node is the length of the path from the root to that node.
    * 11. Subtree: A subtree is a tree that is a part of a larger tree, consisting of a node and all its descendants.   
  */


  /*
   * Root(Parent)    -> level 0 -> Height 3
   *    /    \
   * Child1  Child2  -> level 1 -> Height 2
   *   /  \      \  
   * C1.1 C1.2   C2.1 -> level 2 -> Height 1
   *   / \
   * C1.1.1 C1.1.2    -> level 3 -> Height 0
   */

  /*
   * Types of Trees:
   * 1. Binary Tree: Maximum 2 children for each node.
   * 2. Strict Binary Tree: Exactly 0 or 2 children for each node.
   * 3. Complete Binary Tree: Exactly 0 or 2 children for each node, and all leaf nodes are at the same level.
   * 4. Perfect Binary Tree: All levels are fully filled.   
   * 5. Skewed Tree: A tree where all nodes are either to the left or right.
   */

   /* 
    * Binary Tree Representation:
    * 1) Array Representation:- 
    * 2) Linked List Representation:-

      # Array Representation of a tree:
    *          1
    *        /   \  
    *       2     3
    *      / \   / \
    *     4   5 6   7   
    * Array: [1, 2, 3, 4, 5, 6, 7]
    * Index:  0  1  2  3  4  5  6
    * For any node at index i:
    *                 Left Child = (Parent*2)+1
    *                 Right Child = (Parent*2)+2
    *                 Parent = (Child-1)/2
    * Drawbacks- Memory Wastage, Dynamic Size not possible.
    * like- if we have a tree like this:
    *          1
    *        /   \  
    *       2     3 
    *      / 
    *     4                     
    * Array: [1, 2, 3, 4, -1, -1, -1]
    * Index:  0  1  2  3   4   5   6
    * Here, -1 indicates that there is no node at that position, leading to memory wastage.
    * Array make  space for all possible nodes, even if they are not present in the tree.😊
    * if(k is parent node index)
       {
    *   leftChildIndex = 2*k + 1;
    *   rightChildIndex = 2*k + 2;
       }
    * CHALO AB LINKED LIST REPRESENTATION DEKHTE HAIN. 😊 
    */

    // Linked List Representation of a tree:
    // Each node contains data and pointers to its left and right children.
    // This representation is more memory efficient and allows for dynamic sizing of the tree.  


    class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            data = x;
            left = right = null;
        }
    }

    // testing module
    public class Tree1{
        static Node root;

        public static void main(String[] args) {
            root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.right = new Node(40);
            root.right.left = new Node(50);
            root.right.right = new Node(60);
            

        }

    }
    
// This code defines a simple binary tree using linked list representation. The Node class represents each node in the tree, containing data and pointers to its left and right children. The Tree1 class contains a static root node and a main method to create a sample binary tree. 
