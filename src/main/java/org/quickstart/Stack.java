package org.quickstart;

public class Stack {
  private final int initialCapacity;
  private final int[] elements;
  private int size;

  public Stack(int initialCapacity) {
    this.initialCapacity = initialCapacity;
    elements = new int[initialCapacity];
  }

  public Stack() {
    this(2);
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void push(int element) {
    if (size == initialCapacity) throw new Overflow();

    this.elements[size++] = element;
  }

  public int pop() {
    if (isEmpty()) throw new Underflow();

    return elements[--size];
  }

  public int getSize() {
    return size;
  }

  public int getCapacity() {
    return initialCapacity;
  }
}
