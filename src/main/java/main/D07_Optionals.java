package main;

import java.util.Optional;
import java.util.Random;

/**
 * Demo 7: Optionals.
 *
 * <p>
 * Contrasts the traditional {@code null}-check pattern with {@link java.util.Optional} to handle
 * absent values safely.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D07_Optionals {

   /**
    * Entry point of the Optionals demo.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      /* Ansatz ohne Optionals */
      String text = getText();
      if (text != null) {
         System.out.println(text.toUpperCase());
      } else {
         System.out.println("Ups, something went wrong");
      }

      /* Ansatz mit Optionals */
      Optional<String> optionalText = getOptionalText();

      if (optionalText.isPresent()) {
         System.out.println(optionalText.get().toUpperCase());
      } else {
         System.out.println("Ups, something went wrong");
      }
   }

   /**
    * Returns a text string, or {@code null} with 50 % probability.
    *
    * @return {@code "Hello World"} or {@code null}
    */
   private static String getText() {
      String text = null;

      if ((new Random()).nextBoolean()) {
         text = "Hello World";
      }

      return text;
   }

   /**
    * Returns an {@link Optional} wrapping {@code "Hello World"}, or an empty Optional with 50 %
    * probability.
    *
    * @return an {@link Optional} containing {@code "Hello World"}, or {@link Optional#empty()}
    */
   private static Optional<String> getOptionalText() {
      Optional<String> text = Optional.empty();

      if ((new Random()).nextBoolean()) {
         text = Optional.of("Hello World");
      }

      return text;
   }

}
