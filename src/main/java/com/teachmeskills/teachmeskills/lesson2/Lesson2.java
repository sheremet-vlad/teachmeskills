package com.teachmeskills.teachmeskills.lesson2;

import java.util.ArrayList;

public class Lesson2
{
   public static void main(String[] args)
   {
      cast();
   }

   public void increment()
   {
      Integer number1 = 10;
      int number2 = 10;
      number2 = Integer.parseInt("heiubhei");
      int increment = 0;
      //System.out.println(increment++);
      System.out.println(++increment);
   }

   public static void cast() {
      short initShort = 11_111;
      int initInt = 999_999;

      int shortToInt = initShort;
      short intToShort = (short)initInt;

      System.out.println("short to int: " + shortToInt);
      System.out.println("int to short: " + intToShort);
   }

   public static void boxingAndUnboxing() {
      //example of automatic boxing
      int a = 5;
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(a);
      System.out.println(list);

      //example of unboxing
      Integer integer = new Integer(10);
      int b = integer;
      System.out.println(b);
   }
}
