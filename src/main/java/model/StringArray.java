package model;

/**
 * String Array
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArray {

   public String[] array;

   /**
    * Prints the given String array.
    * 
    */
   public void print() {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
