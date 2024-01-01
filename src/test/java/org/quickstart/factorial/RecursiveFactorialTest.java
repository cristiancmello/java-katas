package org.quickstart.factorial;

public class RecursiveFactorialTest extends AbstractFactorialTest {
  @Override
  public int calculate(int n) {
    return new RecursiveFactorial().calculate(n);
  }
}
