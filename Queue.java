public class Queue {
    private int[] data = new int[100];
    private int front = 0;
    private int back = 0;


    public void enqueue (int val) {
        data[back++] = val;
    }

    public int dequeue () {
        return data[front++];
    }

    public boolean isEmpty () {
        // if (count)
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
