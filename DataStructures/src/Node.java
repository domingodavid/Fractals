
public class Node<T> {
	private T data;
	public Node next; //singly linked list
	
	public Node(T data) {
		this.data = data;
		next = null; // no next pointer
	}
	
	public T getData() {
		return data;
	}
	
	public String toString() {
		return data + " ";
	}
	
}
