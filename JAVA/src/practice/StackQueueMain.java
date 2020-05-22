package practice;

public class StackQueueMain {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		Queue q = new Queue();
		
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println("After Push Before POP");
		s.print();
		
		String str = s.pop();
		System.out.println("After POP");
		System.out.println("Popped Data : " + str);
		System.out.println();
		s.print();
		
		System.out.println();
		
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		System.out.println("After Enqueue Before Dequeue");
		q.print();
		
		String str2 = q.dequeue();
		System.out.println("After Dequeue");
		System.out.println("Dequeued Data : " + str2);
		System.out.println();
		q.print();
		System.out.println();
		
		
	}
}
