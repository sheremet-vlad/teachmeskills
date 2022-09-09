package com.teachmeskills.teachmeskills.lesson17;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String[] args) throws IOException
   {
      //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      // String text = reader.readLine();
      /*String example = "///API/v1/nika/example";

      String[] strings = example.split("/");

      for (int i = 0; i < strings.length; i++)
      {
         if (strings[i].equals("API") && i < strings.length - 1) {
            strings[i + 1];
         }
      }
*/
      /*Pattern pattern = Pattern.compile("/API/");
      Matcher matcher = pattern.matcher(example);*/
      /*if (matcher.find()) {
         System.out.println(matcher.end());
            *//*String[] lines = example.split("API/");
            String[] newArrayLines = lines[1].split("/");
            String result = newArrayLines[0];
            System.out.println(result);*//*
      } else {
         System.out.println("совпадений не найдено");
      }*/
   }
}

/*public class Main
{
   public static void main(String[] args)
   {
      //test""
      String test = "test1";

      Pattern pattern = Pattern.compile("[a-b]{5}[1-9]$");

      Matcher matcher = pattern.matcher(test);

      System.out.println(matcher.matches());

   }


}*/
