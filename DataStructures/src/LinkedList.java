public class LinkedList {

	public Node head;
	public int size;
	
	public LinkedList(Node n) {
		/* complete this non-default constructor */
	}
	
	//write the default constructor
	public LinkedList() {
		head = null;
		size = 0;		
	}
	
	public void add(Node node) {
		
		//empty list!
		if(head==null) {
			head = node;
			size++;
			return;
		}
		
		Node next; 
		next = head;
		
		while(next.next!=null) {
			next = next.next;
		}
		
		/* 
		 * what happens once it breaks out? 
		 * what does that mean?
		 */
		next.next = node;
		size++;
	}
	
	public void print() {
		Node next = head;
		while(next!=null) {
			System.out.print(next);
			next = next.next;
		}
	}
	
	/* remove and return the last nodes */
	public Node removeLast() {
		return null;
	}
	
	/* remove the Node at the index */
	/* return null if index does not exist */
	public Node remove(int index) {
		return null;
	}
	
	/* reverse the list */
	public void reverse() {
		
	}
	
	
	
}
