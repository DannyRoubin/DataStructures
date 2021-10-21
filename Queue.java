public class Queue {
    private Object[] data;
    private Object front = 0;
    private Object back = 0;
    private int size = 0;


     Queue(int size) {
        this.size = size;
        data = new int[size];
    }


    public void enqueue (Object val) {
        data[back++] = val;
    }

    public Object dequeue () {
        return data[front++];
    }

    public boolean isEmpty () {
    for (int i = 0; i < size; i++) {
        if (data[i] == null) {
            return false;
        }
    }
    return true;
    }

    public String toString () {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += (data[i] + " ");
        }        
        return output;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
