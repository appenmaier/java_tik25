package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;
import model.LightBulb;
import model.Person;
import model.PersonLombok;
import model.PersonRecord;
import model.StringArray;
import model.TableLight;
import utility.StringArrayHelper;

/**
 * Demo 2: Object-Oriented Programming.
 *
 * <p>
 * Demonstrates core OOP concepts in Java:
 * <ul>
 * <li>Creating and working with objects and their attributes</li>
 * <li>Calling static and instance methods</li>
 * <li>Object identity vs. structural equality ({@code equals})</li>
 * <li>Three equivalent representations of a data class: traditional ({@link model.Person}), Java
 * Record ({@link model.PersonRecord}), and Lombok-generated ({@link model.PersonLombok})</li>
 * </ul>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D02_ObjectOrientedProgramming {

   /**
    * Mathematical constant Pi used for geometric calculations.
    */
   public final static double PI = 3.14;

   /**
    * Entry point of the Object-Oriented Programming demo.
    *
    * <p>
    * Instantiates various model objects ({@link model.Flight}, {@link model.FlightConnection},
    * {@link model.LightBulb}, {@link model.TableLight}, {@link model.Person},
    * {@link model.PersonRecord}, {@link model.PersonLombok}), manipulates their state, and prints
    * results to demonstrate equality, {@code toString}, and getter/setter patterns.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      /* Attribute */
      FlightConnection connection1 = new FlightConnection();
      connection1.airline = "Lufthansa";
      connection1.connectionId = "0400";
      connection1.departureAirport = "Frankfurt Airport";
      connection1.arrivalAirport = "JFK International Airport";

      Flight flight1 = new Flight();
      flight1.flightConnection = connection1;
      flight1.flightDate = LocalDate.of(2026, 4, 22);
      flight1.flightPriceInEuro = 700;

      Flight flight2 = new Flight();
      flight2.flightConnection = connection1;
      flight2.flightDate = LocalDate.of(2026, 5, 19);
      flight2.flightPriceInEuro = 900;

      /* Methoden */
      String[] names = {"Hans", "Peter", "Lisa"};
      StringArrayHelper.print(names);

      StringArray names2 = new StringArray();
      names2.array = names;
      names2.print();

      /* Objekte */
      LightBulb redLightBulb = new LightBulb("Rot");
      LightBulb redLightBulb2 = new LightBulb("Rot");
      LightBulb blueLightBulb = new LightBulb("Blau");

      TableLight light1 = new TableLight();
      System.out.println(light1.isShining() ? light1.getLightBulb().getColor() : "dunkel");
      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(blueLightBulb);
      System.out.println(light1.isShining() ? light1.getLightBulb().getColor() : "dunkel");

      System.out.println(redLightBulb.equals(redLightBulb2));
      System.out.println(redLightBulb);
      System.out.println(light1);

      /* Datenklassen */
      Person person1 = new Person("Hans", 16, 'm');
      Person person2 = new Person("Hans", 16, 'm');
      Person person3 = new Person("Lisa", 29, 'w');
      System.out.println(person1);
      System.out.println(person2);
      person3.setHappy(true);
      System.out.println(person3);
      System.out.println(person1.equals(person2));

      PersonRecord person4 = new PersonRecord("Hans", 16, 'm', true);
      PersonRecord person5 = new PersonRecord("Hans", 16, 'm', true);
      PersonRecord person6 = new PersonRecord("Lisa", 29, 'w', true);
      System.out.println(person4);
      System.out.println(person5);
      System.out.println(person6);
      System.out.println(person4.equals(person5));

      PersonLombok person7 = new PersonLombok("Hans", 16, false, 'm');
      PersonLombok person8 = new PersonLombok("Hans", 16, false, 'm');
      PersonLombok person9 = new PersonLombok('w');
      System.out.println(person7);
      System.out.println(person8);
      person9.setName("Lisa");
      person9.setHappy(true);
      person9.setAge(29);
      System.out.println(person9);
      System.out.println(person7.equals(person8));
   }

}
