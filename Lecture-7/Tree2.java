
// Tree Traversal:-
/*  
 * Types of Tree Traversal:
 * 1. Depth-First Traversal (DFS):  
 *   a. Inorder Traversal (Left, Root, Right)
 *   b. Preorder Traversal (Root, Left, Right)
 *   c. Postorder Traversal (Left, Right, Root)
 * 2. Breadth-First Traversal (BFS) or
 *  Level Order Traversal: Visit nodes level by level from top to bottom and left to right.
 *   a. Uses Queue data structure.
 *   b. Example: For the previous(Tree1 File) tree, the level order traversal is 1, 2, 3, 4, 5, 6, 7. 
 * 
 */ 

//  Preorder Traversal
import java.util.LinkedList;
import java.util.Queue;
    void preorder(Node root){
        if(root != null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
// Inorder Traversal
   void Inorder(Node root){
      if(root != null){
          Inorder(root.left);
          System.out.println(root.data);
           Inorder(root.right);
      }
   }

// Postorder Traversal
   void postorder(Node root){
    if(root != null){
        [postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);]
    }
   }

//    BSF Or Level order Traversal
    void Levelorder(Node root){
        if(root == null);
        return;
        Queue<Node> q = new LinkedList<Node>(); // it is an interface that is why we cannot create its object directly.here we are using Queue data structure to store the nodes
        q.add(root);
        //  while queue is not empty
        while(!q.isEmpty()){
            Node temp = q.poll(); // it removes the head of the queue and returns it 
            System.out.println(temp.data);
            if(temp.left != null){ // if left child is not null then add it to the queue
                q.add(temp.left);  
            }
            if(temp.right != null){ // if right child is not null then add it to the queue
                q.add(temp.right);
            }
        }

    }

