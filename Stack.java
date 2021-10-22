/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Data Structures assignment

Purpose of this file/class is to be a stack class
based around the last in first out system
*/
public class Stack {

    private Object[] data;
    private int count = 0;
    private int size = 0;

    // no arg constructor which auto sets size to 100
    Stack() {
        size = 100;
        data = new Object[size];
    }

    // constructor which sets the size of the stack to the provided size 
    Stack(int size) {
        this.size = size;
        data = new Object[size];
    }

    // pushes an object to the top of the stack
    public void push (Object val) {
        lengthCheck();
        data[count++] = val;
    }

    // pops the object at the top of the stack off and returns the value
    public Object pop () {
        if (count > 0)  {
            return data[--count];
        }
        else {
            System.out.println("You cannot pop off an empty stack");
            return Integer.MAX_VALUE;
        }
    }

    // checks if the stack is empty or not, returns boolean value 
    public boolean isEmpty () {
        if (count == 0) {
            return true;
        } else{
            return false;
        }
        
    }

    // returns the contents of the stack in string form
    public String toString () {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += (data[i] + " ");
        }        
        return output;
    }

       // method to check if Stack is almost out of space and if it is, increase the space
       public void lengthCheck() {
        if (data[data.length -1] != null) {
            Object[] newObj = new Object[(data.length * 2)];
            for (int i = 0; i < size; i++) {
                newObj[i] = data[i];
            }
            this.data = newObj; 
        } else {
        }

    }

    // method to determine if two stacks are equal to each other
    public boolean equals(Stack obj) {
        Stack thisTempStack = new Stack(this.size);
        Stack thisTempStack2 = new Stack(this.size);
        Stack objTempStack = new Stack(obj.size);
        Stack objTempStack2 = new Stack(obj.size);
        Object thisTempHolder;
        Object objTempHolder;
        if(this.count == obj.count) {    
            while(!this.isEmpty()) {
                thisTempHolder = this.pop();
                thisTempStack2.push(thisTempHolder);
            }

            while(!obj.isEmpty()) {
                objTempHolder = obj.pop();
                objTempStack2.push(objTempHolder);
            }

            while(!thisTempStack2.isEmpty()) {
                thisTempHolder = thisTempStack2.pop();
                this.push(thisTempHolder);
                thisTempStack.push(thisTempHolder);
            }

            while(!objTempStack2.isEmpty()) {
                objTempHolder = objTempStack2.pop();
                obj.push(objTempHolder);
                objTempStack.push(objTempHolder);
            }

            while(!thisTempStack.isEmpty()) {
                thisTempHolder = thisTempStack.pop();
                objTempHolder = objTempStack.pop();
                
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
