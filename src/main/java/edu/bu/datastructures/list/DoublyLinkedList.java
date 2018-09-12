package edu.bu.datastructures.list;

public class DoublyLinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoublyLinkedList() {
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO check if i<0 or i>=size--> throw exception
		T data = getData(i);
		return data;
	}

	public void set(int i, T x) {
		// TODO: impelement the set method and its test cases
	}

	public void add(int index, T x) {
		// TODO implement this method and its tests

	}

	public void add(T x) {
		Node<T> newNode = new Node<T>();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
		if (size == 0) {
			setHead(newNode);
			setTail(newNode);
		} else {
			newNode.setPrev(getTail());
			getTail().setNext(newNode);
			setTail(newNode);
		}
		size++;
	}

	public T remove(int i) {
		// TODO implement the remove method and its test case
		return null;
	}

	public int getSize() {
		return size;
	}

	private T getData(int index) {
		int i = 0;
		Node<T> currData = getHead();
		while (i != index) {
			currData = currData.getNext();
			i++;
		}

		return currData.data;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> prev;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
	}
	// TODO: implement the test cases for each public method in this class
	
}
