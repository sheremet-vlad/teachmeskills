package com.teachmeskills.teachmeskills.lesson10.enumexample;

public class Main
{
   public static void main(String[] args)
   {
      String value = "july";

      Month month = Month.getEnum("10");

      switch (month)
      {
         case JULY:
            System.out.println(7);
            break;

         case JUNE:
            System.out.println(6);
            break;
         case MAY:
            System.out.println(5);
            break;
      }
   }
}
