package org.quickstart.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractFactorialTest implements FactorialInterfaceTest {
  @Override
  public void assertFactorialOf(int expected, int n) {
    assertEquals(expected, calculate(n));
  }

  @Test
  public void doGeneralAssertions() {
    assertFactorialOf(1, 0);
    assertFactorialOf(1, 1);
    assertFactorialOf(2, 2);
    assertFactorialOf(3 * 2, 3);
    assertFactorialOf(4 * 3 * 2, 4);
    assertFactorialOf(5 * 4 * 3 * 2, 5);
    assertFactorialOf(6 * 5 * 4 * 3 * 2, 6);
  }
}
