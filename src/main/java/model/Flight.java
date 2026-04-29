package model;

import java.time.LocalDate;

/**
 * Represents a single flight on a specific date at a given price.
 *
 * <p>A flight is defined by its {@link FlightConnection} (airline, route), the date it departs,
 * and the ticket price in Euro.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Flight {

   /** The flight connection describing the airline and route. */
   public FlightConnection flightConnection;

   /** The date on which this flight departs. */
   public LocalDate flightDate;

   /** The ticket price for this flight in Euro. */
   public double flightPriceInEuro;

}
