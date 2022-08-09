package com.teachmeskills.teachmeskills.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader
{
   public int readNextInt()
   {
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
      {
         int result = Integer.parseInt(reader.readLine());

         //reader.close();

         return result;
      }
      catch (NumberFormatException | IOException e)
      {
         System.out.println("вы ввели не то значение");
      }
      /*finally
      {
         try
         {
            if (reader != null)
            {
               reader.close();
            }
         } catch (IOException e)
         {
            System.out.println("ошибка в ошибке, не знаю что делать");
         }
      }*/

      return -1;
   }

   public String readNextString()
   {
      try
      {
         BufferedReader reader = new BufferedReader(
                  new InputStreamReader(System.in));

         String result = reader.readLine();

         reader.close();

         return result;
      }
      catch (NumberFormatException | IOException e)
      {
         System.out.println("вы ввели не то значение");
      }

      return "";
   }

}
