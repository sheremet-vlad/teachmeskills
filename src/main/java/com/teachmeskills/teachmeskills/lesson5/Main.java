package com.teachmeskills.teachmeskills.lesson5;

import java.util.Arrays;

public class Main
{
   public static void main(String[] args)
   {
      //1 sub array - sum 10
      //
      int[][] arr = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};

      int[] array = {10, 4, 6, 6};

      for (int i = 0; i < arr.length; i++)
      {
         arr[i] = new int[i];

         for (int j = 0; j < arr[i].length; j++)
         {
            arr[i][j] = j;
         }
      }

      for (int i = 0; i < arr.length; i++)
      {
         for (int j = 0; j < arr[i].length; j++)
         {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println(Arrays.toString(array));





      /*int value = 3;

      if (value > 5)
      {
         System.out.println("Больше 5");
         System.out.println("Наше число больше 5");
      }*/
   }
}
