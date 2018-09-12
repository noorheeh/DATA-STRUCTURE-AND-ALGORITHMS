package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;

public class ArrayBasedListTest {
	@Test
	public void testSizeOfEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testAddingToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);
		int actual = (int) list.get(0);
		
		assertEquals(5, actual);
		assertEquals(2, list.size());
	}

	@Test
	public void testRemovingFromList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(4);
		Integer removed = list.remove(1);
		assertEquals(4, (int) removed);
		assertEquals(1, list.size());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRemovingFromEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.remove(1);
	}
	
	@Test
	public void testAddingToFullList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(2,5);
		assertEquals(5,(int) list.get(2));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetExceptionFromList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
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
	
}
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception

