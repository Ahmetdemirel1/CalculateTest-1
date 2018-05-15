package com.testinium.web;

import org.junit.Assert;
import org.junit.Test;

public class CalculateSubTest extends HookTest {
  Calculate calculate = new Calculate();

  @Test
  public void subTest() {
    int result = calculate.sub(4, 3);
    Assert.assertTrue(result == 1);
  }

  @Test
  public void subTest2() {
    int result = calculate.sub(5, 3);
    Assert.assertEquals(2, result);
  }
}
