package com.testinium.web.process;

import static org.junit.Assert.*;

import com.testinium.web.model.Number;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateProcessImplTest {

  CalculateProcess calculateProcess;

  @Before
  public void setUp() throws Exception {
    System.out.println("Before test method");
    calculateProcess = new CalculateProcessImpl();
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("After test method");
    calculateProcess = null;
  }

  @Test
  public void sum() {
    int result = calculateProcess.sum(new Number(3), new Number(5));
    Assert.assertEquals(8, result);
  }

  @Test
  public void sum2() {
    int result = calculateProcess.sum(new Number(3), new Number(5));
    Assert.assertEquals(8, result);
  }
}