/*
 * Properties of Binary Search Tree (BST):
 * value of left child < value of parent < value of right child
 * left and right subtree are also BST 
 * And Inorder traversal of BST gives increasing order of values
 */

 /*  
  *            example
    *                15
    *               /   \
    *              13     18
    *             / \   / \
    *            11 14 17  1 9
    *           / \
    *          0   2    
  */

//   case-1- Zero child (leaf node)
//   case-2- One child 
//   case-3- Two child
//   for case-3 we find inorder successor (minimum value in right subtree) or inorder predecessor (maximum value in left subtree)   
//   and replace the value of node to be deleted with inorder successor or predecessor and then delete the inorder successor or predecessor 

public class DeletionInBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    // function to find minimum value node in a given tree
    static Node minValueNode(Node node){
        Node current = node;

        // loop down to find the leftmost leaf
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    // function to delete a node in BST
    static Node deleteNode(Node root, int key){
        // base case
        if(root == null){
            return root;
        }

        // recursive calls for ancestors of the node to be deleted
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        } else if(key > root.data){
            root.right = deleteNode(root.right, key);
        } else {
            // node with only one child or no child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            // node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValueNode(root.right).data;

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    // function for inorder traversal of BST
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

}
