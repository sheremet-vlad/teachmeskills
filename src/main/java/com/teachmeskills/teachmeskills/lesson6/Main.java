package com.teachmeskills.teachmeskills.lesson6;

import com.teachmeskills.teachmeskills.lesson6.entity.School;
import com.teachmeskills.teachmeskills.lesson6.entity.Student;
import com.teachmeskills.teachmeskills.lesson6.service.StudentService;

public class Main
{
   public static void main(String[] args)
   {
      School school33 = new School("", "");
      school33.setNumber("33");
      school33.setAddress("Minsk");

      Student vlad = new Student();

      System.out.println(school33);

      StudentService studentService = new StudentService();

      String answer = studentService.answerToQuestion(vlad, "столица РБ");
      System.out.println(answer);

      //studentService.answerToAllQuestion(vlad, "вопрос 1", "вопрос 2", "вопрос 3");
      Main main = new Main();
      System.out.println(main.getRandomValue(0, 0));
   }

   public int getRandomValue()
   {
      return 0;
   }

   public int getRandomValue(byte minValue, byte maxValue)
   {
      return 2;
   }

   public int getRandomValue(double minValue, double maxValue)
   {
      return 3;
   }


   public int getRandomValue(Integer... values)
   {
      return 4;
   }

}
