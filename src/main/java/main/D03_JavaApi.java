package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import model.Person;

/**
 * Demonstrates selected Java API features: math operations, random number generation,
 * date/time API, {@link java.util.LinkedList}, file I/O with {@link Scanner}, and
 * wrapper classes.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_JavaApi {

   /**
    * Entry point — runs all API demos sequentially.
    *
    * @param args command-line arguments (not used)
    * @throws FileNotFoundException if {@code src/main/resources/persons.txt} cannot be found
    */
   @SuppressWarnings("unused")
   public static void main(String[] args) throws FileNotFoundException {
      /* Mathematische Berechnungen */
      int a = 5, b = 3;

      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println((a / b) + " Rest " + (a % b));
      System.out.println((double) a / b);

      double d = 5;
      int i = (int) 5.5;

      System.out.println(Math.sqrt(8));

      /* Pseudozufallszahlen */
      Random random = new Random();

      for (int x = 0; x < 100; x++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }

      /* Datums- und Zeitangaben */
      long nowInMs = System.currentTimeMillis();
      System.out.println(nowInMs);

      LocalDate newYearsEve = LocalDate.of(2026, 12, 31);
      LocalDate now = LocalDate.now();
      System.out.println(now.getDayOfYear());
      System.out.println(now);

      LocalTime time = LocalTime.now();
      System.out.println(time);

      LocalDateTime dateTime = LocalDateTime.now();
      System.out.println(dateTime);

      /* Listen */
      LinkedList<String> names = new LinkedList<>();

      names.add("Hans");
      names.add("Peter");
      names.add(1, "Lisa");
      names.add("Max");

      names.removeFirst();

      System.out.println(names.size());
      System.out.println(names);

      for (int x = 0; x < names.size(); x++) {
         String name = names.get(x);
         System.out.println(name);
      }

      /* Lesen von Dateien und Wrapper-Klassen */
      System.out.println(System.getProperty("user.dir"));
      System.out.println(System.getProperty("file.separator"));

      String absolutePath =
            "C:\\users\\d054906\\git\\java_tik25\\src\\main\\resources\\persons.txt";
      String relativePath = "src/main/resources/persons.txt";

      File file = new File(relativePath);
      if (file.exists()) {
         System.out.println("OK");
      }

      ArrayList<Person> persons = new ArrayList<>();

      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         String name = tokens[0];
         int age = Integer.parseInt(tokens[2]);
         char gender = tokens[1].charAt(0);
         boolean isHappy = Boolean.parseBoolean(tokens[3]);
         Person person = new Person(name, age, gender);
         person.setHappy(isHappy);
         persons.add(person);
      }
      System.out.println(persons);

      scanner.close();
      int z = Integer.valueOf("8");
      Integer k = 5;
   }

}
