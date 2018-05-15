package com.testinium.web;

import org.junit.After;
import org.junit.Before;

public class HookTest {

  @Before
  public void beforeTest(){
    System.out.println("Before test method");
  }


  @After
  public void afterTest(){
    System.out.println("After test method");
  }
}
