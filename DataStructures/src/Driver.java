
public class Driver {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		Node first = new Node(7);
		list.add(first);
		list.add(new Node(8));
		list.add(new Node(10));
		Node last = new Node(34873);
		list.add(last);
		last.next = first;
		list.print();
		
	}
	
	

}
