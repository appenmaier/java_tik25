package model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a toaster that can be connected to and disconnected from a power source.
 *
 * <p>Implements {@link WiredDevice} and prints a status message on each plug/unplug operation.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@ToString
@EqualsAndHashCode
public class Toaster implements WiredDevice {

   /**
    * Plugs this toaster into a power source and prints a confirmation message.
    */
   @Override
   public void plugIn() {
      System.out.println("Bin jetzt eingesteckt");
   }

   /**
    * Unplugs this toaster from the power source and prints a confirmation message.
    */
   @Override
   public void pullThePlug() {
      System.out.println("Bin jetzt leider wieder ausgesteckt");
   }

}
