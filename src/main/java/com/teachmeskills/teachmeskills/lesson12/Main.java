package com.teachmeskills.teachmeskills.lesson12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main implements Serializable
{
   private final static Logger logger = LoggerFactory.getLogger(Main.class);

   public static void main(String[] args)
   {
      try
      {
         FileInputStream inputStreamReader = new FileInputStream("file.txt");

         System.out.println(inputStreamReader.readAllBytes());
         inputStreamReader.close();

         File file = new File("file.txt");

         BufferedReader reader = new BufferedReader(
                  new InputStreamReader(new FileInputStream("file.txt")));

         String line;
         while ((line = reader.readLine()) != null)
         {
            System.out.println(line);
         }

         reader.close();

         System.out.println(Files.readAllLines(Path.of("file.txt")));



         file.createNewFile();

         System.out.println(file.getAbsolutePath());
         // ../../../../../file.txt
         // /opt/teachmeskills/file.txt
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}


/*
* Магазин
* 1) Сотрудники - нанять, уволить, выдать зарплату, премировать, выдать штраф))
* 2) Товары - купить, добавить в корзину, вернуть, добавить в магизин, сравнить
* 3) Клиенты - прийти, уйти, положить товар в корзину, ругаться, платить за товар, оставить отзыв
* 4) магазины - открыть, закрыть, ремонт, переучет, уборка, прочитать книгу пожеланий
* 5) поставщики - заключить / расторгнуть договор, привезти товар, расчитать стоимость поставки,
* оформить брак
*
* */
