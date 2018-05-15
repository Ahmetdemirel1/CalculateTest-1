package com.testinium.web.process;

import com.testinium.web.model.Number;

public class CalculateProcessImpl implements CalculateProcess {

  @Override
  public int sum(Number numberOne, Number numberTwo) {
    return numberOne.getNumber() + numberTwo.getNumber();
  }
}
