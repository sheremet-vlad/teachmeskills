package com.teachmeskills.teachmeskills.lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
   private Comparator<Product> comparator = (o1, o2) -> {
      if (o1.getName().compareTo(o2.getName()) > 0)
      {
         return 1;
      }
      return o1.equals(o2) ? 0 : -1;
   };


   public static void main(String[] args)
   {
      List<Product> products = new ArrayList<>();

      List<String> stringList = products.stream()
               .flatMap(product -> product.getListOfDescriptions().stream())
               .collect(Collectors.toList());

      stringList.forEach(s -> {
         System.out.println(s);
      });

      List<Integer> integerList = new ArrayList<>();
      List<Integer> list = new ArrayList();

      integerList = Stream.iterate(1, n -> n + 1).limit(100).collect(Collectors.toList());

      long startTime = System.currentTimeMillis();

      for (int i = 0; i < integerList.size(); i++)
      {
         if (integerList.get(i) % 2 == 0)
         {
            list.add(integerList.get(i));
         }
      }



      list = integerList.stream()
               .filter(integer -> integer % 2 == 0)
               .collect(Collectors.toList());

      System.out.println(System.currentTimeMillis() - startTime);
      System.out.println(list.size());

      /*list.stream();

      int[] array = {1,3,4};
      "sdv".chars();
*/







     /* Scanner scanner = new Scanner(System.in);

      if (scanner.nextInt() == 1) {
         Executor executor = (value) -> 10;

         executor.execute(scanner.nextInt());
      }*/
      printProductName(Optional.empty());
   }

   public static void printProductName(Optional<Product> optionalProduct)
   {
      optionalProduct.ifPresent(product -> System.out.println(product.getName()));

      if (optionalProduct.isPresent())
      {
         Product product = optionalProduct.get();

         System.out.println(product.getName());
      }
   }
}
