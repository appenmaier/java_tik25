package model;

/**
 * Represents a light bulb with a specific color.
 *
 * <p>The color is immutable after construction. Two {@code LightBulb} instances are considered
 * equal when they share the same color (see {@link #equals(LightBulb)}).
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class LightBulb {

   /** The color of this light bulb (e.g. {@code "Rot"}, {@code "Blau"}). */
   private final String color;

   /**
    * Creates a new {@code LightBulb} with the given color.
    *
    * @param color the color of the light bulb
    */
   public LightBulb(String color) {
      this.color = color;
   }

   /**
    * Returns the color of this light bulb.
    *
    * @return the color
    */
   public String getColor() {
      return color;
   }

   /**
    * Indicates whether this light bulb has the same color as another light bulb.
    *
    * @param otherLightBulb the other light bulb to compare with
    * @return {@code true} if both light bulbs have the same color
    */
   public boolean equals(LightBulb otherLightBulb) {
      return this.color.equals(otherLightBulb.color);
   }

   /**
    * Returns a string representation of this light bulb.
    *
    * @return a string containing the color
    */
   @Override
   public String toString() {
      return "LightBulb [color=" + color + "]";
   }

}
