/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Data Structures assignment

Purpose of this file/class is to be a queue class
based around the first in first out system
*/
public class Queue {
    private Object[] data;
    private int front = 0;
    private int back = 0;
    private int size = 0;

    // no arg constructor which auto sets size to 100 
    Queue() {
        size = 100;
        data = new Object[size];
    }

    // constructor which sets the size to the int which was given
     Queue(int size) {
        this.size = size;
        data = new Object[size];
    }

    // adds an object to the back of the queue
    public void enqueue (Object val) {
        lengthCheck();
        data[back++] = val;
    }

    // takes the object at the front of the queue off and returns it
    public Object dequeue () {
        if(isEmpty()) {
            System.out.println("You can't dequeue an empty queue");
            return null;
        }
        return data[front++];
    }

    // method to determine if the queue is empty, returns boolean
    public boolean isEmpty () {
        int tempFront = front;
        while(tempFront < back) {
            if (data[tempFront] != null) {
                return false;
            }
            tempFront++;
        }
        return true;
    }

    // method to print out the contents of the queue into a easy to read format
    public String toString () {
        String output = "";
        for (int i = 0; i < back; i++) {
            output += (data[i] + " ");
        }        
        return output;
    }

    // method to check if queue is almost out of space and if it is, increase the space
    public void lengthCheck() {
        if (data[data.length -1] != null) {
            Object[] newObj = new Object[(data.length * 2)];
            for (int i = 0; i < back; i++) {
                newObj[i] = data[i];
            }
            this.data = newObj; 
        } else {
        }

    }

    // gets the size of the array
    public int size() {
        return this.back;
    }

    // equals method to determine if two queues hold the same values
    public boolean equals(Queue obj) {
        Queue thisTempQueue = new Queue(this.size);
        Queue thisTempQueue2 = new Queue(this.size);
        Queue objTempQueue = new Queue(obj.size);
        Queue objTempQueue2 = new Queue(obj.size);
        Object thisTempHolder;
        Object objTempHolder;
        if(this.front == obj.front  && this.back == obj.back) {            
            while(!this.isEmpty()) {
                thisTempHolder = this.dequeue();
                thisTempQueue.enqueue(thisTempHolder);
                thisTempQueue2.enqueue(thisTempHolder);
            }
            
            while(!obj.isEmpty()) {
                objTempHolder = obj.dequeue();
                objTempQueue.enqueue(objTempHolder);
                objTempQueue2.enqueue(objTempHolder);
            }
            
            while(!thisTempQueue2.isEmpty()) {
                thisTempHolder = thisTempQueue2.dequeue();
                this.enqueue(thisTempHolder);
            }
            
            while(!objTempQueue2.isEmpty()) {
                objTempHolder = objTempQueue2.dequeue();
                obj.enqueue(objTempHolder);
            }

            while(!thisTempQueue.isEmpty()) {
                thisTempHolder = thisTempQueue.dequeue();
                objTempHolder = objTempQueue.dequeue();

                if(thisTempHolder != objTempHolder) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    
}
