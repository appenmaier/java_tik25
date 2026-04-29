package model;

/**
 * Wrapper around a {@code String} array that provides a convenient print method.
 *
 * <p>Compare with the equivalent static helper {@link utility.StringArrayHelper#print(String[])},
 * which achieves the same result without wrapping the array in an object.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class StringArray {

   /** The underlying string array. */
   public String[] array;

   /**
    * Prints each element of {@link #array} to standard output on its own line.
    */
   public void print() {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
