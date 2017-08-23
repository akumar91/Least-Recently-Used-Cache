package lruAlgo;

public class Run {

	public static void main(String[] args) {
		LRUCache lr=new LRUCache(5);

		lr.set(1, 1);

		lr.set(2,2);

		lr.set(3, 3);

		lr.set(4, 4);

		lr.set(5, 5);

		int val=lr.get(1);

		System.out.println("value of 1 is "+val);

		lr.set(6, 6);

		int val2=lr.get(2);

		System.out.println("After cache has reached the capacity, key 2 is the least recently used");
		System.out.println("value of 2 is "+val2);

	}

}
