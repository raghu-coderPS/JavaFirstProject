package com.sapient.week1;

public class CheckEven {
   public static boolean Check(int n) {
      // if number is divisible by
      // 2 then number is even
      if(n % 2 == 0)
          return true;

      // else the number is odd
      return false;
   }
