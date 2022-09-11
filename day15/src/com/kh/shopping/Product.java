package com.kh.shopping;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable{
  private String Name; //상품명
  private int Price; //가격

  public Product(String name, int price) {
    Name = name;
    Price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "Name='" + Name + '\'' +
        ", Price=" + Price +
        '}';
  }

  public String getName() {
    return Name;
  }

  public int getPrice() {
    return Price;
  }

  @Override
  public int compareTo(@NotNull Object o) {
    int result = 0;
    Product p = (Product)o;
    return Integer.valueOf(this.getPrice()).compareTo(Integer.valueOf(p.getPrice()));

//    if (this.getPrice() > (p.getPrice()) {
//      result = 1;
//    } else if (this.getPrice() < (p.getPrice()) {
//      result = -1;
//    }
//    return result;
  }
}
