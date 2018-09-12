package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;

public class LinkedListTest {
	@Test
	public void testSizeOfEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test
	public void testAddingToList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(3, (int) list.get(1));
		assertEquals(2, list.size());
	}
	@Test
	public void testSetToList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(9);
		list.add(3);
		list.add(3);
		list.set(0, 5);
		list.set(1, 5);
		assertEquals(5, (int) list.get(1));
		assertEquals(3, (int) list.size());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRemovingFromEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.remove(0);
	}
	
	@Test
	public void testRemovingFromList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(9);
		list.add(5);
		list.add(3);
		list.add(-7);
		list.remove(0);
		list.remove(2);
		assertEquals(3, (int) list.get(1));
		assertEquals(2, (int) list.size());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGetExceptionFromList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.get(0);	//Empty Data
		list.get(-5);	//Negative index
		//list.add(8);
		list.get(50);   // i>size
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetExceptionToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.set(0,1);	//Empty Data
		list.set(-5,5);	//Negative index
		//list.add(8);
		list.set(50,5);   // i>size
	}

	// TODO add remove test
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
