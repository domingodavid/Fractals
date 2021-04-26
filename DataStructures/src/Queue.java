
public class Queue<T> {
	private Stack<T> s1, s2;
	private int size;
	public Queue() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(T el) {
		s1.push(el);
		size++;
	}
	
	public T dequeue() {
		if(size==0)
			return null;
	
		while(s1.size()!=0) {
			s2.push(s1.pop());
		}
		
		T el =  s2.pop();
		
		while(s2.size()!=0) {
			s1.push(s2.pop());
		}
		size--;
		return el;
		
	}
	
	public String toString() {
		return s1.toString();
	}
}
