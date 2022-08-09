package com.teachmeskills.teachmeskills.lesson11;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main
{
   //7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
   public static void main(String[] args) throws CustomException
   {
      /*ConsoleReader consoleReader = new ConsoleReader();
      System.out.println(consoleReader.readNextInt());
      System.out.println(consoleReader.readNextString());*/
      DogService dogService = new DogService();
      System.out.println(dogService.execute());


      /*try
      {

         //byte[] info = Files.readAllBytes(Path.of("test.txt"));

         System.out.println("1");
         System.out.println("2");
      }
      catch (IOException e)
      {
         System.out.println("ошибочка, нет такого файла");
      }
      finally
      {
         System.out.println("3");
         System.out.println("4");
      }

      System.out.println("5");
      System.out.println("6");*/






      /*int number = 10;
      long result = 1;

      for (int i = 1; i <= number; i++)
      {
         result *= i;
      }

      System.out.println(result);
      System.out.println(rec(10));*/
   }

   public static long rec(long number)
   {
      if (number == 1)
      {
         return number;
      }

      return number * rec(number - 1);
   }

}
