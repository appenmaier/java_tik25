package model;

/**
 * Light Bulb
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LightBulb {

   /* Attribute */
   private final String color;

   /* Methoden */
   public LightBulb(String color) {
      this.color = color;
   }

   public String getColor() {
      return color;
   }

   public boolean equals(LightBulb otherLightBulb) {
      return this.color.equals(otherLightBulb.color);
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color + "]";
   }

}
