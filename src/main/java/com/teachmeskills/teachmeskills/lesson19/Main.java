package com.teachmeskills.teachmeskills.lesson19;

import java.util.ArrayList;
import java.util.List;

public class Main
{
   public static void main(String[] args) throws InterruptedException
   {
      List<Thread> threads = new ArrayList<>();

      for (int i = 0; i < 10; i++)
      {
         threads.add(new CustomThread());
         //threads.add(new Thread(new CustomRunnable(i)));
      }

      for (int i = 0; i < 10; i++)
      {

         threads.get(i).start();
      }

      threads.parallelStream().forEach(thread -> System.out.println(thread.toString()));
   }
}
