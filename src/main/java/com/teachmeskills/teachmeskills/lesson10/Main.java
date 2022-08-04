package com.teachmeskills.teachmeskills.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
   public static String value = "10";

   public static void main(String[] args) throws CloneNotSupportedException
   {
      String str1 = "java the best";

      System.out.println(str1.length());

      System.out.println(str1.charAt(3));

      char[] charString = str1.toCharArray();
      System.out.println(Arrays.toString(charString));

      double pi = 3.14;
      String valueOfExample = String.valueOf(pi);
      System.out.println(valueOfExample);

      String searchString = "HELLO, find me! find me!, !";
      System.out.println(searchString.indexOf("find"));
      System.out.println(searchString.lastIndexOf("!"));
      System.out.println(searchString.replace("find me", "?"));
      System.out.println("     hello world       ".trim());
      System.out.println(searchString.toLowerCase());
      System.out.println(searchString.toUpperCase());

      String[] splitString = searchString.split("find me!");
      for (int i = 0; i < splitString.length; i++)
      {
         System.out.println(splitString[i]);
      }

      System.out.println(" ".isEmpty());
      System.out.println(" ".isBlank());

      System.out.println(searchString.substring(5, 20));

      System.out.println(searchString.contains("find"));
      System.out.println(searchString.startsWith("find"));
      System.out.println(searchString.endsWith("!, !"));

      System.out.println("JAVA".equalsIgnoreCase("java"));

      System.out.println("ab".compareTo("ab"));

      StringBuilder builder = new StringBuilder("hello");
      String stringBuilderString = builder.append((char)10).append(10).append(20).toString();
      System.out.println(stringBuilderString);

      char ch = 100;
      System.out.println("ch=" + ch);


      /*Car car1 = new Car();
      car1.setName("audi");
      car1.setYear(2000);

      Engine engine = new Engine();
      engine.setSize(3000);
      engine.setPower(100);

      Door[] doors = {new Door("red", 10), new Door("blue", 20)};

      car1.setEngine(engine);
      car1.setDoors(doors);

      Car car2 = car1.clone();

      car1.setName("BMB");
      car1.getEngine().setPower(5000);

      System.out.println(car1);

      System.out.println(car2);*/
   }

   public void test()
   {
      value = "test";
   }
}
