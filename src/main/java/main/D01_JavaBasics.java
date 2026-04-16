package main;

import java.util.Scanner;

public class D01_JavaBasics {

   public static void main(String[] args) {
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
   }

}
