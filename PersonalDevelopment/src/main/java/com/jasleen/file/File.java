package com.jasleen.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/

public class File {

	public static void main(String[] args) {
		String file = "C://JasleenDdrive//Xebia//xebia//exportFile.txt";
		  try (Stream<String> stream = Files.lines(Paths.get(file))) {
			  Stream.of("update [tmd].[dbo].[EMPLOYMENT_NUMBER_INFO] set EXPORT_TO_CSV = 5 where PERSONNEL_NUMBER = '").forEach(System.out::println);
			  //stream.forEach(System.out::println);	  
		   
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
	
/*	public static void main(StringMethods[] args) {
        StringMethods file = "C://JasleenDdrive//Xebia//xebia//exportFile.txt";
        List<StringMethods> listOfElements = new ArrayList<>();
        try (Stream<StringMethods> stream = Files.lines(Paths.get(file))) {
            stream.forEach(listOfElements::add);
            for (StringMethods element : listOfElements) {
                System.out.println("update [pbg].[dbo].[EMPLOYMENT_NUMBER_INFO] set EXPORT_TO_CSV = 5 where PERSONNEL_NUMBER = '" + element + "'");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
	
/*	public static void main(StringMethods[] args) {
        StringMethods file = "C://Users//jasleen//Desktop//exportPersonalNumber.txt";
        List<StringMethods> listOfElements = new ArrayList<>();
        try (Stream<StringMethods> stream = Files.lines(Paths.get(file))) {
            stream.forEach(listOfElements::add);
            for (StringMethods element : listOfElements) {
                System.out.println("update [tmd].[dbo].[EMPLOYMENT_NUMBER_INFO] set EXPORT_TO_CSV = 5 where PERSONNEL_NUMBER = '" + element + "'");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
