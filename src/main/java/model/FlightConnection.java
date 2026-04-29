package model;

/**
 * Represents a flight connection between two airports operated by an airline.
 *
 * <p>A flight connection is the static route definition (airline, connection ID, departure and
 * arrival airports) shared by potentially many individual {@link Flight} instances.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class FlightConnection {

   /** The name of the airline operating this connection (e.g. {@code "Lufthansa"}). */
   public String airline;

   /** The unique identifier for this connection (e.g. {@code "0400"}). */
   public String connectionId;

   /** The name of the departure airport (e.g. {@code "Frankfurt Airport"}). */
   public String departureAirport;

   /** The name of the arrival airport (e.g. {@code "JFK International Airport"}). */
   public String arrivalAirport;

}
