package com.testinium.web;

import com.testinium.web.process.Calculate;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest extends HookTest {


  @BeforeClass
  public static void beforeClass(){
    System.out.println("Tests start");
  }


  @AfterClass
  public static void afterClass(){
    System.out.println("Tests end");
  }

  @Test
  public void sum() {
    System.out.println("Test sum start");
    int result=new Calculate().sum(4,5);
    Assert.assertEquals("Calculate result not true",9,result);
  }

  @Test
  public void failSum() {
    System.out.println("Test fail sum start");
    int result=new Calculate().sum(4,5);
    Assert.assertEquals("Calculate result not true",9,result);
  }
}