package model;

/**
 * Thrown when a {@link WiredDevice} is plugged in while it is already connected to a power source.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class AlreadyPluggedInException extends Exception {

   /** Serial version UID for serialization compatibility. */
   private static final long serialVersionUID = 1L;

   /**
    * Creates an {@code AlreadyPluggedInException} with the given detail message.
    *
    * @param message the detail message
    */
   public AlreadyPluggedInException(String message) {
      super(message);
   }

}
