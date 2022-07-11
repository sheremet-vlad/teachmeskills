package com.teachmeskills.teachmeskills.lesson3;

public class MathUtils
{
   public void printEvenNumbersViaFor(int value)
   {
      for (int i = 0; i <= value; i++)
      {
         if (i == 0)
         {
            break;
         }

         if (i % 2 == 0)
         {
            System.out.println(i);
         }
      }
      System.out.println("Вывели");
   }

   public void printEvenNumbersViaWhile(int value)
   {
      int i = 1;
      while (i <= value)
      {
         if (i % 2 == 0)
         {
            System.out.println(i);
         }
         i++;
      }
   }

   public void printEvenNumbersViaDoWhile(int value)
   {
      int i = 1;

      do {
         if (i % 2 == 0)
         {
            System.out.println(i);
         }
         i++;
      } while (i <= value);
   }
}
