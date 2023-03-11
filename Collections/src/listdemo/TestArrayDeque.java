package listdemo;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<String> queue = new ArrayDeque<>();
		
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element = queue.peek();    // queue.getFirst();   Retrieves, but does not remove, the head of the queue represented bythis deque
		System.out.println(element);
		
		
		queue.poll();                      //Retrieves and removes the head of the queue represented by this deque
		System.out.println(queue);
		
		Iterator<String> iter = queue.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		

	}

}
