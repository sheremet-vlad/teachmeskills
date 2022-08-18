package com.teachmeskills.teachmeskills.lesson14;

public class CustomArray<T>
{
   private T[] arr = (T[]) new Object[1];

   public T get(int index)
   {
      return arr[index];
   }
}
