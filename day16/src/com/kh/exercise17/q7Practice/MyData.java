package com.kh.exercise17.q7Practice;

import java.util.Objects;
import java.util.TreeSet;

public class MyData {

  int number;

  public MyData(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "MyData{" +
        "number=" + number +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyData myData = (MyData) o;
    return number == myData.number;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }
}
