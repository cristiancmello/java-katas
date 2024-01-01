package org.quickstart;

public class IterativeFactorial implements FactorialInterface {
  @Override
  public int calculate(int n) {
    if (n < 2) return 1;

    for (int i = n; i > 1; i--)
      n *= i - 1;

    return n;
  }
}
