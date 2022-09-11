package com.kh.shopping;

import java.util.Comparator;

public class Main {
  public static void main(String[] args) {

    Product p1 = new Product("apple", 3000);
    Product p2 = new Product("banana", 1000);
    Product p3 = new Product("orange", 1500);
    Product p4 = new Product("watermelon", 10000);
    Product p5 = new Product("kiwi", 5000);

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    shoppingBasket.put(p1);
    shoppingBasket.put(p2);
    shoppingBasket.put(p3);
    shoppingBasket.put(p4);
    shoppingBasket.put(p5);
    System.out.println(shoppingBasket);
    System.out.println("==============================");

//    Integer x = 1; //auto boxing
//    int z = x; //auto unboxing
//    Integer y = new Integer(1);
//    int z = y.intValue();

    //가격 내림차순 비교연산자
//    Comparator<Proudct> com3 = new Comparator<Proudct>() {
//      @Override
//      public int compare(Proudct o1, Proudct o2) {
//        return 0;
//      }
//    }

    //상품명 오름차순 비교연산자
    Comparator<Product> com4 = new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };
    ShoppingBasket shoppingBasket4 = new ShoppingBasket(com4){};
    shoppingBasket4.put(p1);
    shoppingBasket4.put(p2);
    shoppingBasket4.put(p3);
    shoppingBasket4.put(p4);
    shoppingBasket4.put(p5);
    System.out.println(shoppingBasket4);
    System.out.println("==============================");

    //상품명 내림차순 비교연산자
    Comparator<Product> com5 = new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName()) * -1;
      }
    };
    ShoppingBasket shoppingBasket5 = new ShoppingBasket(com5){};
    shoppingBasket5.put(p1);
    shoppingBasket5.put(p2);
    shoppingBasket5.put(p3);
    shoppingBasket5.put(p4);
    shoppingBasket5.put(p5);
    System.out.println(shoppingBasket5);












  }
}
