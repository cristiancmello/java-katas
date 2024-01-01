package org.quickstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
  @Test
  public void fib() {
    assertEquals(1, fibOf(0));
    assertEquals(1, fibOf(1));
    assertEquals(1, fibOf(2));
    assertEquals(2, fibOf(3));
    assertEquals(3, fibOf(4));
    assertEquals(5, fibOf(5));
    assertEquals(8, fibOf(6));
    assertEquals(13, fibOf(7));
    assertEquals(21, fibOf(8));
    assertEquals(34, fibOf(9));
    assertEquals(4181, fibOf(19));
  }

  private int fibOf(final int n) {
    int r = 0;

    for (int i = 0, f1 = 1, f2 = 1; i <= n; i++) {
      if (i <= 2) r = f1;
      else {
        r = f1 + f2;
        f1 = f2;
        f2 = r;
      }
    }

    return r;
  }
}
