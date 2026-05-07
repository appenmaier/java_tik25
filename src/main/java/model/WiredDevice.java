package model;

/**
 * Interface for devices that connect to a power source via a plug.
 *
 * <p>Implementing classes include {@link TableLight} and {@link Toaster}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface WiredDevice {

   /**
    * Plugs this device into a power source.
    */
   void plugIn();

   /**
    * Unplugs this device from the power source.
    */
   void pullThePlug();

}
