package utility;

/**
 * Utility class providing static helper methods for {@code String} arrays.
 *
 * <p>Compare with the equivalent instance-based approach in {@link model.StringArray}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class StringArrayHelper {

   /** Utility class — not instantiable. */
   private StringArrayHelper() {}

   /**
    * Prints the given String array.
    * 
    * @param array given String array
    */
   public static void print(String[] array) {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
