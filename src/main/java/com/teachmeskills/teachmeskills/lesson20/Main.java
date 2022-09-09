package com.teachmeskills.teachmeskills.lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main
{
   private static final String SELECT_FROM_SCHOOL_QUERY = "select * from school";

   private static SchoolResultSetConverter converter = new SchoolResultSetConverter();

   public static void main(String[] args)
   {
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
               "root", "1234");
           Statement stmt = conn.createStatement();
           ResultSet resultSet = stmt.executeQuery(SELECT_FROM_SCHOOL_QUERY))
      {
         List<School> schoolList = new ArrayList<>();

         while (resultSet.next())
         {
            schoolList.add(converter.convert(resultSet));
         }

         System.out.println(schoolList);
      }
      catch (SQLException e)
      {
         e.printStackTrace();
      }
   }
}
