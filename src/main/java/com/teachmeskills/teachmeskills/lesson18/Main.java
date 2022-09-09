package com.teachmeskills.teachmeskills.lesson18;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main
{
   public static void main(String[] args) throws IOException
   {
      Person person = new Person();
      person.setName("Vlad");
      person.setAge(10);

      Car car = new Car();
      car.setNew(true);
      car.setBrand("audi");

      person.setCar(car);

      ObjectMapper objectMapper = new ObjectMapper();

      System.out.println(objectMapper.writeValueAsString(person));

      Person personFromJson = objectMapper.readValue(new File("person.json"), Person.class);

      System.out.println(personFromJson);

   }
}
