package com.testinium.web.process;

import com.testinium.web.model.Number;

public class CalculateProcessImpl implements CalculateProcess {

  public CalculateProcessImpl() {
    System.out.println("Calculate process created");
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Calculate process remove");
    super.finalize();
  }

  @Override
  public int sum(Number numberOne, Number numberTwo) {
    return numberOne.getNumber() + numberTwo.getNumber();
  }
}
