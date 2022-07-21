package com.teachmeskills.teachmeskills.lesson6.service;

import com.teachmeskills.teachmeskills.lesson6.entity.School;
import com.teachmeskills.teachmeskills.lesson6.entity.Student;

import java.util.Random;

public class StudentService
{
   public String answerToQuestion(Student student, String question) {
      return "ответ";
   }

   public void answerToAllQuestion(Student student, String... questions) {
      for (int i = 0; i < questions.length; i++)
      {
         System.out.println("ответ на вопрос: " + questions[i]);
      }
   }

   public void doHomework()
   {
      System.out.println("делаю домашку");
   }

   public static void doNothing()
   {

   }
}
