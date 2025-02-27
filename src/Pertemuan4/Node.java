package Pertemuan4;

public class Node {
	private double data;
	public Node next;
	
	
	//inisialisasi Node
	public Node (double data2) {
		this.data = data2;
	}
	
	public double getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
