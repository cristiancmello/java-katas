package org.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
  @Test
  public void nothing() {
    Main.main(new String[]{});
    Assertions.assertEquals(new Main().getClass().getSimpleName(), "Main");
  }
}
