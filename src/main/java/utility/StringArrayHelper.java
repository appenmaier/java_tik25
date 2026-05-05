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
    * Prints each element of the given {@code String} array to standard output on its own line.
    *
    * @param array the array whose elements are printed; must not be {@code null}
    */
   public static void print(String[] array) {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
