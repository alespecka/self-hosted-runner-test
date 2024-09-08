package org.example;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
	}

	public void addFirst(T data) {
		Node<T> tmp = head;
		head = new Node<>(data);
		head.next = tmp;

		if (tmp == null) {
			tail = head;
		}
	}

	public void addLast(T data) {
		Node<T> tmp = tail;
		tail = new Node<>(data);

		if (tmp == null) {
			head = tail;
			return;
		}

		tmp.next = tail;
	}

	public void add(int index, T data) {
		if (head == null) {
			if (index > 0) {
				throw new IndexOutOfBoundsException("index " + index + " is out of bounds");
			}

			head = new Node<>(data);
			tail = head;
		}

		Node<T> node = head;
		for (int i = 0; i < index - 1; i++) {
			if (node.next == null) {
				throw new IndexOutOfBoundsException("index " + index + " is out of bounds");
			}
			node = node.next;
		}

		Node<T> next = node.next;
		node.next = new Node<>(data);
		node.next.next = next;

		if (node == tail) {
			tail = node.next;
		}
	}

	public void append(T data) {
		if (head == null) {
			head = new Node<>(data);
			return;
		}

		Node<T> node;
		for (node = head; node.next != null; node = node.next) {
			;
		}

		node.next = new Node<>(data);
	}

	public void print() {
		Node<T> node;
		for (node = head; node.next != null; node = node.next) {
			System.out.print(node.data + " ");
		}
		System.out.println(node.data);
	}

	public T getItem(int position) {
		if (head == null) {
			throw new IndexOutOfBoundsException("index is out of bounds");
		}

		Node<T> node = head;
		for (int i = 0; i < position; i++) {
			if (node.next == null) {
				throw new IndexOutOfBoundsException("index is out of bounds");
			}
			node = node.next;
		}

		return node.data;
	}

//	public T[] toArray() {
//
//	}
}
