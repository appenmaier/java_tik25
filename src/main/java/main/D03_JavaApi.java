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
import model.PlugType;
import model.TableLight;

/**
 * Demonstrates selected Java API features: math operations, random number generation, date/time
 * API, {@link java.util.LinkedList}, file I/O with {@link Scanner}, wrapper classes, and enum usage
 * with {@link model.PlugType} and {@link model.TableLight}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_JavaApi {

   /**
    * Entry point — runs all API demos sequentially.
    *
    * <p>
    * Covers:
    * <ul>
    * <li>Integer and floating-point arithmetic, casting, and {@link Math#sqrt}</li>
    * <li>Pseudo-random numbers via {@link Random#nextInt(int, int)}</li>
    * <li>Date/time via {@link java.time.LocalDate}, {@link java.time.LocalTime}, and
    * {@link java.time.LocalDateTime}</li>
    * <li>List operations with {@link java.util.LinkedList}</li>
    * <li>File I/O with {@link Scanner} and CSV parsing into {@link model.Person} objects</li>
    * <li>Wrapper classes ({@link Integer#parseInt}, {@link Boolean#parseBoolean}, autoboxing)</li>
    * <li>Enum usage with {@link model.PlugType} and {@link model.TableLight}</li>
    * </ul>
    *
    * @param args command-line arguments (not used)
    * @throws FileNotFoundException if {@code src/main/resources/persons.txt} cannot be found
    */
   @SuppressWarnings("unused")
   public static void main(String[] args) throws FileNotFoundException {
      /* Mathematical calculations */
      int a = 5, b = 3;

      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println((a / b) + " remainder " + (a % b));
      System.out.println((double) a / b);

      double d = 5;
      int i = (int) 5.5;

      System.out.println(Math.sqrt(8));

      /* Pseudo-random numbers */
      Random random = new Random();

      for (int x = 0; x < 100; x++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }

      /* Date and time */
      long nowInMs = System.currentTimeMillis();
      System.out.println(nowInMs);

      LocalDate newYearsEve = LocalDate.of(2026, 12, 31);
      LocalDate now = LocalDate.now();
      System.out.println(now.getDayOfYear());
      System.out.println(now);
      System.out.println(now.getMonth());

      LocalTime time = LocalTime.now();
      System.out.println(time);

      LocalDateTime dateTime = LocalDateTime.now();
      System.out.println(dateTime);

      /* Lists */
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

      /* Performance measurements */
      ArrayList<Integer> numbers = new ArrayList<>();

      long start = System.currentTimeMillis();
      for (int x = 0; x < 250_000; x++) {
         numbers.add(0, random.nextInt(1, 7));
      }
      long end = System.currentTimeMillis();
      System.out.println("Runtime (adding): " + (end - start) + "ms");
      start = System.currentTimeMillis();
      for (int x = 0; x < 250_000; x++) {
         numbers.get(x);
      }
      end = System.currentTimeMillis();
      System.out.println("Runtime (reading): " + (end - start) + "ms");

      /* Reading files and wrapper classes */
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

      /* Enumerations */
      PlugType typeF = PlugType.TYPE_F;
      PlugType typeI = PlugType.TYPE_I;

      TableLight light1 = new TableLight();
      TableLight light2 = new TableLight(typeF);

      ArrayList<TableLight> lights = new ArrayList<>();
      lights.add(light1);
      lights.add(light2);

      for (TableLight l : lights) {
         if (l.getPlugType().equals(PlugType.TYPE_F)) {
            System.out.println("Hooray");
         }
      }
   }

}
