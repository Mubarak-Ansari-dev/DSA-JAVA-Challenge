
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