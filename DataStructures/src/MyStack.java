import java.util.ArrayList;

public class MyStack<T> {
	//the underlying storage is an ArrayList
		private ArrayList<T> data;
		private int size;
		
		/* constructor */
		public MyStack() {
			/* what's the job of a constructor /*/
			data = new ArrayList<T>();
			size = 0;
		}
		
		/*
		 * Add the two helper methods
		 * push (adds an element to the top of the stack)
		 * pop (removes an element from the top of the stack 
		 */
		
		/**
		 * Adds an element to the stack at the front (top).
		 * @param el
		 */
		public void push(T el) {
			data.add(el);
			size++; //be sure to increment size
		}
		
		public T pop() {
			if(size > 0) {
				size--;
				return data.remove(data.size()-1);
			}else {
				return null;
			}
		}
		
		public int size() {
			return size;
		}
		
		public String toString() {
			return data.toString();
		}
		
}
