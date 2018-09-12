package edu.bu.datastructures.list;

import java.util.Arrays;

public class ArrayBasedList<T> implements List<T> {
	private static final int DEFAULT_CAPACITY = 20;
	private T[] elements;
	private int size;

	public ArrayBasedList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayBasedList(int capacity) {
		elements = (T[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO:do bounds check (negative i? empty data? i>size?)->throw exception.
		if (i < 0)
			throw new IllegalArgumentException("Index can't be negative");
		else if (size == 0)
			throw new IllegalArgumentException("List is empty");
		else if (i >= size)
			throw new IllegalArgumentException("Your index " + i + " is bigger than size " + size);
		else
			return elements[i];

	}

	public void set(int i, T x) {
		// TODO: check if i>= size? i<0?-->throw exception. size exceeds the array
		// capacity?-->resize the array. not allowed
		if (i < 0)
			throw new IllegalArgumentException("Index can't be negative");
		else if (size == 0)
			throw new IllegalArgumentException("List is empty");
		else if (i >= size)
			throw new IllegalArgumentException("Your index " + i + " is bigger than size " + size);
		else
			elements[i] = x;
	}

	public void add(int i, T x) {
		// TODO: check if capacity allows addition and resize the array if needed. Check
		// if i>=size-> throw exception
		if (i > size)
			throw new IllegalArgumentException("Your index " + i + " is bigger than size " + size);
		else if (i < 0)
			throw new IllegalArgumentException("Index can't be negative");

		if (size == DEFAULT_CAPACITY) {
			elements = Arrays.copyOf(elements, DEFAULT_CAPACITY * 2);
			shiftForwards(i);
			elements[i] = x;
			size++;

		} else {
			shiftForwards(i);
			elements[i] = x;
			size++;
		}
	}

	public void add(T x) {
		// TODO: check if capacity allows addition and resize the array if needed
		if (size == DEFAULT_CAPACITY) {
			elements = Arrays.copyOf(elements, DEFAULT_CAPACITY * 2);
			elements[size] = x;
			size++;
		} else {
			elements[size] = x;
			size++;
		}
	}

	private void shiftForwards(int startShiftingIndex) {
		for (int i = size; i > startShiftingIndex; i--) {
			elements[i] = elements[i - 1];
		}
	}

	public T remove(int i) {
		// TODO: do bounds check (i>size? data is empty?--? throw exception)
		if (i < 0)
			throw new IllegalArgumentException("Index can't be negative");
		else if (size == 0)
			throw new IllegalArgumentException("List is empty");
		else if (i > size)
			throw new IllegalArgumentException("Your index " + i + " is bigger than size " + size);
		else {
			T x = elements[i];
			shiftBack(i);
			size--;
			return x;
		}
	}

	private void shiftBack(int startShiftingIndex) {
		for (int i = startShiftingIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}

}
