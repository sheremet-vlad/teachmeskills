package com.teachmeskills.teachmeskills.lesson3;

public class Homework
{
   private String deadline;

   private String homeworkSize;

   private String subject;

   public Homework(String deadline, String homeworkSize, String subject)
   {
      this.deadline = deadline;
      this.homeworkSize = homeworkSize;
      this.subject = subject;
   }

   public String getSubject()
   {
      return subject;
   }

   public void setSubject(String subject)
   {
      this.subject = subject;
   }

   public String getDeadline()
   {
      return deadline;
   }

   public void setDeadline(String deadline)
   {
      this.deadline = deadline;
   }

   public String getHomeworkSize()
   {
      return homeworkSize;
   }

   public void setHomeworkSize(String homeworkSize)
   {
      this.homeworkSize = homeworkSize;
   }
}
