
public class Node {
	
	String value;
	Node next;
	
	public Node(String val) {
		
		value = val;
		next = null;
		
	}
	
	public void setNext(Node n) {
		
		next = n;
		
	}

	public void setNext() {
		
		next = null;
		
	}
	
}
