package com.testinium.web.process;

import com.testinium.web.model.Number;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateNumberTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void sum() {
    Assert.assertEquals(5, new CalculateNumber().sum(new Number(3), new Number(2)));
  }
}