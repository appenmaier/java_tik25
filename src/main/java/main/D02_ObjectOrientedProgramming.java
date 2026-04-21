package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;
import model.StringArray;
import utility.StringArrayHelper;

/**
 * Object Oriented Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ObjectOrientedProgramming {

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
   }

}
