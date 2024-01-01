package org.quickstart.factorial;

public class IterativeFactorialTest extends AbstractFactorialTest {
  @Override
  public int calculate(int n) {
    return new IterativeFactorial().calculate(n);
  }
}
