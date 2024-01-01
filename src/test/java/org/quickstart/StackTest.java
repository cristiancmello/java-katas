package org.quickstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  private Stack stack = new Stack();

  private void pushingInfinityElementsThrowsOverflow() {
    assertThrows(Overflow.class, () -> {
      for (; ; ) stack.push(0);
    });
  }

  private void createStackWithNthElementsAndVerifyCapacity(int initialCapacity) {
    stack = new Stack(initialCapacity);

    pushingInfinityElementsThrowsOverflow();

    assertEquals(initialCapacity, stack.getSize());
    assertEquals(initialCapacity, stack.getCapacity());
  }

  @Test
  public void canCreateStack() {
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }

  @Test
  public void afterOnePush_isNotEmpty() {
    stack.push(0);
    assertFalse(stack.isEmpty());
    assertEquals(1, stack.getSize());
  }

  @Test
  public void afterOnePushAndOnePop_isEmpty() {
    stack.push(0);
    stack.pop();
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }

  @Test
  public void afterTwoPushes_sizeIsTwo() {
    stack.push(0);
    stack.push(0);
    assertEquals(2, stack.getSize());
  }

  @Test
  public void poppingEmptyStack_throwsUnderflow() {
    assertThrows(Underflow.class, stack::pop);
  }

  @Test
  public void afterPushingX_willPopX() {
    stack.push(99);
    assertEquals(99, stack.pop());
    stack.push(88);
    assertEquals(88, stack.pop());
  }

  @Test
  public void afterPushingXAndY_willPopYThenX() {
    stack.push(99);
    stack.push(88);
    assertEquals(88, stack.pop());
    assertEquals(99, stack.pop());
  }

  @Test
  public void afterPushingElements_throwsOverflowAndCapacityIsTwo() {
    pushingInfinityElementsThrowsOverflow();

    assertEquals(2, stack.getSize());
    assertEquals(2, stack.getCapacity());
  }

  @Test
  public void afterPushingElements_throwsOverflowWhenCapacityMoreThanTwo() {
    createStackWithNthElementsAndVerifyCapacity(3);
    createStackWithNthElementsAndVerifyCapacity(4);
  }
}
