package com;

import com.utils.Utility;

public class Programe {

  public static void main(String[] args) {
    Utility.oddEvenRecursive(1, 10);

    Utility u = new Utility();
    int sum = u.calculateSum(1, 10);
    System.out.println(sum);
  }

}