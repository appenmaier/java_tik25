package main;

import java.util.Scanner;

/**
 * Java Basics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_JavaBasics {

   /**
    * main method of Java Basics class
    * 
    * @param args input arguments
    */
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Datenobjekte und Datentypen */
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

      System.out.print("Gib bitte Deinen Vornamen ein: ");
      firstName = scanner.next();

      System.out.print("Gib bitte Deinen Nachnamen ein: ");
      lastName = scanner.next();

      System.out.print("Gib bitte Dein Alter ein: ");
      age = scanner.nextInt();

      System.out.print("Gib bitte Deine Größe in Meter ein: ");
      sizeInM = scanner.nextDouble();

      System.out.print("Gib bitte ein, ob Du glücklich bist (true, false): ");
      isHappy = scanner.nextBoolean();

      System.out.print("Gib bitte Dein Geschlecht ein (w, m, d): ");
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

      // Vergleichsoperatoren: <, <=, >, >=, ==, !=
      // Logische Operatoren: UND (&&), ODER (||), VERNEINUNG (!)
      if ((gender == 'm' || gender == 'M') && age >= 18) {
         System.out.println("Hallo Herr " + lastName);
      } else if ((gender == 'w' || gender == 'W') && age >= 18) {
         System.out.println("Hallo Frau " + lastName);
      } else {
         System.out.println("Hallo " + firstName);
      }

      String happyText;
      if (isHappy) {
         happyText = "glücklich";
      } else {
         happyText = "nicht glücklich";
      }
      System.out.println("Du bist " + happyText);

      happyText = (isHappy) ? "glücklich" : "nicht glücklich";
      System.out.println("Du bist " + happyText);

      System.out.println("Du bist " + ((isHappy) ? "glücklich" : "nicht glücklich"));

      /* Fallunterscheidungen */
      System.out.println(switch (gender) {
         case 'm', 'M' -> "männlich";
         case 'w', 'W' -> "weiblich";
         case 'd', 'D' -> "divers";
         default       -> gender;
      });

      /* Schleifen */
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
         System.out.print("Nochmal ne Runde?: ");
         if (scanner.next().equals("nein")) {
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

      String hobbiesText = "Fußball;Zocken;Backen";
      String[] hobbies = hobbiesText.split(";");

      for (String hobby : hobbies) {
         System.out.println(hobby);
      }

      System.out.println(hobbies[0] == "Fußball");
      System.out.println("Fußball" == "Fußball");
      System.out.println(new String("Fußball") == "Fußball");

      System.out.println(hobbies[0].equals("Fußball"));
      System.out.println("Fußball".equals("Fußball"));
      System.out.println(new String("Fußball").equals("Fußball"));
   }

}
