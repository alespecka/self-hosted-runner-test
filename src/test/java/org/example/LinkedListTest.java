package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
	@Test
	void testAddFirst() {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		assertEquals(3, list.getItem(0));
		assertEquals(2, list.getItem(1));
		assertEquals(1, list.getItem(2));
	}

	@Test
	void testAppend() {
		LinkedList<Integer> list = new LinkedList<>();
		list.append(1);
		list.append(2);
		list.append(3);
		assertEquals(1, list.getItem(0));
		assertEquals(2, list.getItem(1));
		assertEquals(3, list.getItem(2));
	}

//	@Test
//	void testAppend2() {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.append2(1);
//		list.append2(2);
//		list.append2(3);
//		assertEquals(1, list.getItem(0));
//		assertEquals(2, list.getItem(1));
//		assertEquals(3, list.getItem(2));
//	}

	@Test
	void testAddLast() {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		assertEquals(1, list.getItem(0));
		assertEquals(2, list.getItem(1));
		assertEquals(3, list.getItem(2));
	}

	@Test
	void testAdd() {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.add(2, 100);
		list.add(4, 101);
		assertEquals(1, list.getItem(0));
		assertEquals(2, list.getItem(1));
		assertEquals(100, list.getItem(2));
		assertEquals(3, list.getItem(3));
		assertEquals(101, list.getItem(4));
	}
}