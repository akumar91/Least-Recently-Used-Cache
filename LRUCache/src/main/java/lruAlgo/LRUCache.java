package lruAlgo;

import java.util.HashMap;

public class LRUCache {
	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public void remove(Node n) {
		if (n.previous != null) {
			n.previous.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.previous = n.previous;
		} else {
			end = n.previous;
		}
	}

}
