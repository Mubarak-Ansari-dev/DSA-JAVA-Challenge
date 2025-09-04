
// Topic;- Queue
/*
 * Properties of Queue
 * 1. Queue is a linear data structure that follows the FIFO (First In First Out) principle.
 * 2. In queue, the element that is added first is the first one to be removed.
 * 3. Queue has two main operations: enqueue (to add an element) and dequeue (to remove an element).
 * 4. Queue can be implemented using arrays or linked lists.    
 */ 

 /*
  * Queue is emplty when - front = Rear = -1
   when we insert first element - front = rear = 0
   when we insert next element - rear++
   when we delete an element - front++
   when front > rear - queue is empty
  */

  /*
   * if front == rear and we want to delete an element(dequeue), so we set front = rear = -1
   * if rear == size-1, so we can not insert more elements(enqueue)
   */

//    code

import java.util.*;

class Queue{
    private int a[];
    private int size;
    private int frint, rear;

    // constructure
    Queue(int s){
        a = new int [s];
        size = s;
        frint = rear = -1; // queue is empty
    }
    // isEmpty function
    int isEmpty(){
        if(frint == -1 && rear == -1 || frint > rear){
            return 1;   // or return true
        }
        else{
            return 0;   // or return false
        }

    }
    // isFull function
    int isFull(){
        if(rear == size-1){
            return 1;   // or return true
        }
        else{
            return 0;   // or return false
        } 
    }
    // enqueue function - to add an element
    void enqueue(int x){
        if(isFull() == 1){
            System.out.println("Queue is full");
        }
        else if(isEmpty() == 1){
            frint = rear = 0;
            a[rear] = x;
            System.out.println(x + " is inserted");
        }
        else{
            rear++;
            a[rear] = x;
            System.out.println(x + " is inserted");
        }
    }  
    // dequeue function - to remove an element
    int dequeue(){
        int x;
        if(isEmpty() == 1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if(frint == rear){
            x = a[frint];
            frint = rear = -1; // queue is empty
            return x;
        }
        else{
            x = a[frint];
            frint++;
            return x;
        }
    }  
    
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.dequeue();
        q.enqueue(10);  
        q.enqueue(20);
        q.enqueue(30);  
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);   // 60 is not inserted because queue is full
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());    
         // queue is empty
    }
}

   /*
 * output;-       
Queue is empty
10 is inserted
20 is inserted
30 is inserted
40 is inserted
50 is inserted
Queue is full
10
20
30
40
50
Queue is empty
-1

 */