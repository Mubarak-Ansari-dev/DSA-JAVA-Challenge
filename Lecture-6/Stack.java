
// DSA with java Live Class- 11
// Topic:- Stack
/*
 * Properties of Stack
 * 1. Stack is a linear data structure that follows the LIFO (Last In First Out) principle.
 * 2. In stack, the element that is added last is the first one to be removed.
 * 3. Stack has two main operations: push (to add an element) and pop (to remove an element).
 * 4. Stack can be implemented using arrays or linked lists.    
 */
// we can not access the array elements directly
// we can only access the top element of the stack
// we can only add or remove elements from the top of the stack

// when constructor is called, top is set to -1
// when we push an element, top is incremented by 1 and the element is added    
 /*
  * 
  */

  class Stack{

    private int a[];
    private int size;
    private int top;

    // make a constructur to pass the size of the stack
    Stack(int s){

        a = new int[s];
        size = s;
        top = -1; // stack is empty
    }
    // creating functions
    // isEmpty function
    boolean isEmpty(){
        if(top == -1){
            return true;    //or return 1
        }
        else{
            return false;   //or return 0
        }
    }

    // isFull function
    boolean isFull(){
        if(top == size-1){
            return true;    //or return 1
        }
        else{
            return false;   //or return 0
        }
    }
    // peek function
    int peek(){
        if(!isEmpty()){
            return a[top];
        }
        else{
            
            return -1;
        }
    }
    // push function
    void push(int x){
       if(isFull()){
        System.out.println("Stack is full");
       }
       else{
        top++;
        a[top] = x;
       }
    }

    // pop function
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else
        top--;
    }

    public static void main(String args[]){
        Stack s= new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();
    }
  }

  /*
   * output;-
   *       30
           20
           10
          -1
           Stack is empty

   */