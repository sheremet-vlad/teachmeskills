package com.teachmeskills.teachmeskills.lesson7;

public class Main
{
   public static void main(String[] args)
   {
      Computer computer = new Computer();
      computer.setHdd(new HDD(10));

      Computer secondComputer = new Computer();
      secondComputer.setHdd(new HDD(100));

      ComputerService computerService = new ComputerService();

      //computerService.addSizeToHdd(computer);

      computerService.addSizeToHdd(secondComputer);

      System.out.println(computer);
      System.out.println(secondComputer);
   }
}
