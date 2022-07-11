package com.teachmeskills.teachmeskills.lesson3;

public class HomeworkExecutor
{
   private static final int MIN_STUDENT_MOOD_TO_DO_HOMEWORK = 10;

   public void doHomework(Student student, Homework homework)
   {
      if (student.getMood() > MIN_STUDENT_MOOD_TO_DO_HOMEWORK
               || homework.getDeadline().equals(""))
      {
         executeHomework(homework.getSubject());
         String homeworkStatus = homework.getHomeworkSize().equals("большая") ?
                  "Начал делать, закончу потом" : "Домашка готова";

         System.out.println(homeworkStatus);
      }
      else
      {
         System.out.println("Ай, сделаю потом");
      }
   }

   private void executeHomework(String subject)
   {
      switch (subject)
      {
         case "математика" : break;
         case "русский язык" :
         {
            System.out.println("пишу");
         } break;
         case "биология" :
         {
            System.out.println("изучаю");
         } break;
         default :
         {
            System.out.println("ничего не делаю");
         } break;
      }
   }
}
