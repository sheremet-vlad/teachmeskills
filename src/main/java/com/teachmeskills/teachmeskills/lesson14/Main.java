package com.teachmeskills.teachmeskills.lesson14;

import java.text.ParseException;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      MailService mailService = new MailService();

      //google service
      mailService.createAndSendMessage(
               String::trim,
               (value) -> {
                  String encrypted = value.toLowerCase();
                  return encrypted.trim();
               },
               "message 1",
               "Vlad"
      );

      //mail service
      mailService.createAndSendMessage(
               (value) -> {
                  return value;
               },
               (value) -> {
                  return value;
               },
               "message 1",
               "Vlad"
      );

      //"hi"
      System.out.println("\"hi\"");
      /*Date date = new Date();

      System.out.println(date);


      System.out.println(new Date(111231244));

      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd-MMMM-yyyy",
               new Locale("de"));

      System.out.println(simpleDateFormat.format(date));

      LocalDate localDate = LocalDate.now().plusDays(10)
               .plus(10, ChronoUnit.YEARS);

      System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy")));
      System.out.println(localDate);
      LocalDateTime localDateTime = LocalDateTime.now();
      LocalTime localTime = LocalTime.now();
*/

      printDocument((value) -> {
      }, "body");

      Animal animal = new Animal()
      {
         @Override
         void say()
         {
            System.out.println("гав");
         }
      };

      animal.say();
   }

   public static void printDocument(Test<String> printBody, String body)
   {
      System.out.println("Шапка");
      System.out.println("Тут будет шапка");

      printBody.test1(body);

      System.out.println("Футер");
      System.out.println("Тут будет футер");
   }
}
