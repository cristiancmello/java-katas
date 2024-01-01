package org.quickstart;

public class RecursiveFactorial implements FactorialInterface {
  @Override
  public int calculate(int n) {
    if (n < 2) return 1;

    return n * calculate(n - 1);
  }
}
