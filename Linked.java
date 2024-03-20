import java.util.ArrayList;

public class Linked {
	
	Node[] items;
	int currentSize;
	
	public Linked(String[] strs) {
		
		currentSize = 0;
		items = new Node[10];
		for (String s : strs) {
			this.addLast(s);
			currentSize++;
		}
		
	}
	
	public void addLast(String s) {
		
		Node n = new Node(s);
		items[currentSize] = n;
		if (currentSize > 1) {
			items[currentSize - 1].setNext(n);
		}
		currentSize++;
		
	}
	
	public void removeLast() {
		
		items[currentSize--] = null;
		items[currentSize].setNext();
		
	}
	
	public void removeItem(String s) {
		
		for (int i = 0; i < currentSize; i++) {
			if (items[i].value.equals(s)) {
				if (i == currentSize) {
					items[i].setNext();
				} else {
					items[i - 1].setNext(items[i + 1]);
				}
				currentSize--;
				return;
			}
		}
		
	}
	
	public void reverse() {
		
		Node[] replace = new Node[currentSize];
		for (int i = 0; i < currentSize; i++) {
			replace[i] = items[currentSize - 1 - i];
		}
		for (int i = 0; i < currentSize - 1; i++) {
			replace[i].setNext(replace[i + 1]);
		}
		replace[currentSize - 1].setNext();
		items = replace;
		
	}
	
	public int size() {
		
		return currentSize;
		
	}
	
}
