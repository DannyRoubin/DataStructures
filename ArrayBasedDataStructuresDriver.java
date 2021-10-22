/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Data Structures assignment

Purpose of this file/class is simply to be the driver.
it handles taking in data and using methods from other classes to sort through the data
*/


/**Incomplete Driver for ArrayList(ObjectList),Stack and Queue***/
// Lesley's version - has some extra ArrayList tests

public class ArrayBasedDataStructuresDriver {
	// Uncomment each of the methods whenever you are ready to run each test
	public static void main(String[] args) {
		arrayListTests();
		// queueTests();
		// stackTests();	
		
	}

	private static void arrayListTests() {
		System.out.println("ArrayList Tests");
		System.out.println("-----------------------------------------------");
		ArrayList a = new ArrayList();
		System.out.println("Check empty array isEmpty:" + a.isEmpty());
		a.insert('B', 0);
		a.insert('a', 0);
		a.insert('t', 1);
		System.out.println("Check non-empty array isEmpty:" + a.isEmpty());
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println("here is a being removed: " + a.toString());
			System.out.println(a.remove(0));
		}
			
		// Fill over initial capacity and check that it grows
		for (int i = 0; i < 110; i++)
		{
			a.lengthCheck();
			a.append(new Integer(i));
		}
		System.out.println("Size of array after 110 adds: "+ a.size());
		System.out.println("Value of last element: "+ a.get(a.size()-1));
		System.out.println("Insert past end of list");
		a.insert('z', 200);
		System.out.println("Insert negative index");
		a.insert('z',  -3);
		System.out.println(a.toString());
		System.out.println("Remove past end of list");
		a.remove(200);
		System.out.println(a.toString());

		// -----------------------------------------------------------------
		// ADDITIONAL TESTS
		
		// Check for equality
		System.out.println("equality test");
		System.out.println("-----------------------------------------------");
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.insert("A", 0);
		list1.insert("B", 0);
		list1.insert("C", 0);
		list2.insert("A", 0);
		list2.insert("B", 0);
		list2.insert("C", 0); 

		System.out.println("list 1: " + list1.toString());
		System.out.println("list 2: " + list2.toString());
		System.out.println("equality true check: " + list1.equals(list2));
		list2.remove(1);
		list2.insert("D", 0);
		System.out.println("list 1: " + list1.toString());
		System.out.println("list 2: " + list2.toString());
		System.out.println("equality false check: " + list1.equals(list2));
		
		System.out.println("index of, expecting 1: " + list1.getIndexOf("B"));
		System.out.println("index of, expecting -1: " + list1.getIndexOf("J"));
		System.out.println("get, expecting A: " + list1.get(2));
		System.out.println("get, expecting error: ");
		System.out.println(list1.get(9));
		System.out.println("size, expecting 3: " + list1.size());
		System.out.println("remove return value, expecting A: " + list1.remove(2));
		
		// Contains test
		System.out.println("Contains test");
		System.out.println("-----------------------------------------------");
		boolean b = list1.contains(list1.contains("B"));
		System.out.println("contains, expecting true: " + list1.contains(("B")));
		System.out.println("contains, expecting false: " + list1.contains(("Z")));
		
		System.out.println("Append test");
		System.out.println("-----------------------------------------------");
		// Append test

		System.out.println("list 1 prior to appending: " +list1.toString());
		list1.append("F");
		list1.append("G");
		list1.append("H");
		list1.append("I");
		System.out.println("list 1 post append expecting 'C B F G H I':  " +list1.toString());
		
		
	}

	// queue test section 
	private static void queueTests() {
		System.out.println("\nQueue Tests");

		Queue a = new Queue();
		System.out.println("dequeue empty q");
		a.dequeue();
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.dequeue());
		}
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++)
		{
			a.enqueue(new Integer(i));
		}
		System.out.println("size: "+ a.size());
		System.out.println("Equals test");
		Queue b = new Queue();
		Queue c = new Queue();
		b.enqueue('B');
		b.enqueue('a');
		b.enqueue('t');
		c.enqueue('B');
		System.out.println("Expected result: false; Received result: " +b.equals(c));
		c.enqueue('a');
		c.enqueue('t');
		System.out.println("obj b = " + b.toString());
		System.out.println("obj c = " + c.toString());
		System.out.println("Expected result: true; Received result: " +b.equals(c));
	}

	// stack test section
	private static void stackTests() {
		System.out.println("\nStack Tests");
	
		Stack a = new Stack();
		System.out.println("pop empty stack");
		a.pop();
		a.push('B');
		a.push('a');
		a.push('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.pop());
		}
		
		System.out.println("pop past pushes");
		a.push('A');
		a.pop();
		a.pop();
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++)
		{
			a.push(new Integer(i));
		}
		System.out.println("pop last");
		System.out.println(a.pop());

		System.out.println("Equals test");
		Stack b = new Stack();
		Stack c = new Stack();
		b.push("B");
		b.push("a");
		b.push("t");
		c.push("B");
		System.out.println("Expected result: false; Received result: " +b.equals(c));
		c.push("a");
		c.push("t");
		System.out.println("obj b = " + b.toString());
		System.out.println("obj c = " + c.toString());
		System.out.println("Expected result: true; Received result: " +b.equals(c));
	}
}