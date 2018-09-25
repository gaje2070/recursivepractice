package com.utils;

public class Utility {
  // Loop method
  public static void display() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  // Recursive method
  public static void displayRecursive(int start, int end) {
    // System.out.println(start);
    if (start <= end) {
      System.out.println(start);
      displayRecursive(++start, end);
    }
  }

  public int calculateSum(int start, int end) {
    int total = 0;
    for (int i = start; i <= 10; i++) {
      total = total + i;
    }
    return total;
  }

  public static int calculateSumRecursive(int start, int end) {

    if (start <= end) {
      int total = start + calculateSumRecursive(++start, end);
      // calculateSumRecursive(++start, end);
      return total;
    }
    return 0;
  }

  public static int multiplication(int start, int end) {
    int total = 1;
    for (int i = start; i <= 10; i++) {
      total = total * i;
    }
    return total;
  }

  public static int multiplicationRecursive(int start, int end) {

    if (start <= end) {
      int total = 1;
      total = start * multiplicationRecursive(++start, end);
      return total;
    }
    return 1;
  }

  public static void differentiateOddEven(int start, int end) {
    for (int i = start; i <= end; i++) {
      if ((i % 2) != 0) {
        System.out.println(i + "odd number");
      } else {
        System.out.println(i + "even number ");
      }
    }
  }

  public static void oddEvenRecursive(int start, int end) {
    if (start <= end) {
      if ((start % 2) == 0) {
        System.out.println(start + " Even number");

      } else {
        System.out.println(start + " Odd number");
      }
      oddEvenRecursive(++start, end);
    }
  }
}