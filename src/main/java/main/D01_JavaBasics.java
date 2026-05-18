package main;

import java.util.Scanner;

/**
 * Demo 1: Java Basics.
 *
 * <p>Demonstrates fundamental imperative Java concepts:
 * <ul>
 *   <li>Primitive and reference data types</li>
 *   <li>Reading user input via {@link java.util.Scanner}</li>
 *   <li>Comparison and logical operators</li>
 *   <li>Conditional statements ({@code if}/{@code else}, ternary, {@code switch})</li>
 *   <li>Loops ({@code while}, {@code do-while}, {@code for}, enhanced {@code for})</li>
 *   <li>Arrays and {@link String} operations</li>
 * </ul>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D01_JavaBasics {

   /**
    * Entry point of the Java Basics demo.
    *
    * <p>Reads several user inputs from {@code stdin}, performs string and numeric operations,
    * evaluates conditional expressions, iterates with various loop constructs, and demonstrates
    * array usage including reference vs. value equality of strings.
    *
    * @param args command-line arguments (not used)
    */
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Data objects and data types */
      String firstName;
      String lastName;
      String firstNameAndLastName;

      int length = "Hello World".length();
      System.out.println(length);
      char charAt7 = "Hello World".charAt(7);
      System.out.println(charAt7);

      int age;
      double sizeInM;
      boolean isHappy;
      char gender;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter your first name: ");
      firstName = scanner.next();

      System.out.print("Please enter your last name: ");
      lastName = scanner.next();

      System.out.print("Please enter your age: ");
      age = scanner.nextInt();

      System.out.print("Please enter your height in metres: ");
      sizeInM = scanner.nextDouble();

      System.out.print("Please enter whether you are happy (true, false): ");
      isHappy = scanner.nextBoolean();

      System.out.print("Please enter your gender (f, m, d): ");
      gender = scanner.next().charAt(0);

      firstNameAndLastName = firstName + " " + lastName;

      System.out.println(firstName);
      System.out.println(lastName);
      System.out.println(age);
      System.out.println(sizeInM);
      System.out.println(isHappy);
      System.out.println(gender);
      System.out.println(firstNameAndLastName);
      System.out.printf("%S %S%n", firstName, lastName);

      // Comparison operators: <, <=, >, >=, ==, !=
      // Logical operators: AND (&&), OR (||), NOT (!)
      if ((gender == 'm' || gender == 'M') && age >= 18) {
         System.out.println("Hello Mr. " + lastName);
      } else if ((gender == 'w' || gender == 'W') && age >= 18) {
         System.out.println("Hello Ms. " + lastName);
      } else {
         System.out.println("Hello " + firstName);
      }

      String happyText;
      if (isHappy) {
         happyText = "happy";
      } else {
         happyText = "not happy";
      }
      System.out.println("You are " + happyText);

      happyText = (isHappy) ? "happy" : "not happy";
      System.out.println("You are " + happyText);

      System.out.println("You are " + ((isHappy) ? "happy" : "not happy"));

      /* Conditional statements */
      System.out.println(switch (gender) {
         case 'm', 'M' -> "male";
         case 'w', 'W' -> "female";
         case 'd', 'D' -> "diverse";
         default       -> gender;
      });

      /* Loops */
      int x = 0;
      while (x < 10) {
         System.out.println(x + 1);
         x++;
      }

      int z = 0;
      do {
         System.out.println(z + 1);
         z++;
      } while (z < 10);

      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }

      while (true) {
         System.out.print("Another round?: ");
         if (scanner.next().equals("no")) {
            break;
         }
      }

      /* Arrays */
      String[] names = new String[3];

      names[0] = "Max";
      names[1] = "Lisa";
      names[2] = "Hans";

      int[] numbers = {4, 7, 1, 1, 8, 0, -4, 2};

      numbers[1] = -7;

      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         System.out.println(name);
      }

      String hobbiesText = "Soccer;Gaming;Baking";
      String[] hobbies = hobbiesText.split(";");

      for (String hobby : hobbies) {
         System.out.println(hobby);
      }

      System.out.println(hobbies[0] == "Soccer");
      System.out.println("Soccer" == "Soccer");
      System.out.println(new String("Soccer") == "Soccer");

      System.out.println(hobbies[0].equals("Soccer"));
      System.out.println("Soccer".equals("Soccer"));
      System.out.println(new String("Soccer").equals("Soccer"));
   }

}
