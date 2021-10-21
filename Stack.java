public class Stack {

    private int[] data = new int[100];
    private int count = 0;

    public void push (int val) {
        data[count++] = val;
    }

    public int pop () {
        if (count > 0)  {
        return data[--count];
        }
        else { return Integer.MAX_VALUE;
        }
    }

    public boolean isEmpty () {
        return (count == 0);
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
