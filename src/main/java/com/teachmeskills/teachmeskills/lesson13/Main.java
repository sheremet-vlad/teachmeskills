package com.teachmeskills.teachmeskills.lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
   public static void main(String[] args)
   {
      TestGeneric<String, Integer, StringBuilder> testGeneric = new TestGeneric<>();

      System.out.println(testGeneric.getFirstParam("FIRST"));
      System.out.println(testGeneric.getSecondParam(2));
      System.out.println(testGeneric.getThirdParam(new StringBuilder("3 - ий")));
      System.out.println(testGeneric.getNewGenericType(10.0));
      System.out.println(testGeneric.getNewGenericType(new Scanner(System.in)));

      List<String> stringList = new ArrayList<>();
      stringList.add("10");

      List<Integer> list = new ArrayList<>();
      list.add(5);

      int result = 10 * list.get(0);


      Set<Integer> set = new HashSet<>();
      set.add(4);
      set.add(6);
      set.add(5);

      for (Integer integer : set)
      {
         System.out.println(integer);
      }

      final Map<Integer, String> map = new HashMap<>();
      map.put(1, "Зима");
      map.put(2, "Зима");
      map.put(3, "Зима");
      map.put(4, "Весна");
      map.put(5, "Весна");
      map.put(6, "Весна");
      //map.put(1, "Весна");

      System.out.println(map.get(4));


      /*Set<Integer> set = new HashSet<>();

      set.add(10);
      set.add(10);*/


      /*List<Integer> list = new LinkedList<>();

      for (int i = 0; i < 1_000_000; i++)
      {
         list.add(i);
      }


      long startTime = System.currentTimeMillis();

      for (int i = 0; i < 100_000; i++)
      {
         list.add(list.size()/2, i);
      }

      System.out.println(System.currentTimeMillis() - startTime);*/
   }
}
