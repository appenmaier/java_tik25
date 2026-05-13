package main;

import java.util.ArrayList;
import java.util.Collections;

import model.AlreadyPluggedInException;
import model.LightBulb;
import model.PlugType;
import model.TableLight;
import model.TableLightByPlugTypeDescComparator;

/**
 * Demo 5: Sorting.
 *
 * <p>
 * Demonstrates sorting of collections in Java:
 * <ul>
 * <li>Sorting primitive-wrapper lists ({@link Integer}, {@link String}) via
 * {@link Collections#sort}</li>
 * <li>Sorting {@link model.TableLight} objects using the natural order defined by
 * {@link model.TableLight#compareTo} ({@link Comparable})</li>
 * <li>Sorting with a custom {@link model.TableLightByPlugTypeDescComparator}
 * ({@link java.util.Comparator})</li>
 * <li>Using {@link java.util.List#forEach} with a method reference</li>
 * </ul>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D05_Sorting {

   /**
    * Entry point of the Sorting demo.
    *
    * @param args command-line arguments (not used)
    * @throws AlreadyPluggedInException if a {@link model.TableLight} is plugged in twice
    */
   public static void main(String[] args) throws AlreadyPluggedInException {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(4);
      numbers.add(7);
      numbers.add(8);
      numbers.add(3);
      numbers.add(4);
      numbers.add(-6);

      Collections.sort(numbers);
      System.out.println(numbers);

      ArrayList<String> names = new ArrayList<>();
      names.add("Hans");
      names.add("Fritz");
      names.add("Anna");
      names.add("anna");
      names.add("Xaver");

      Collections.sort(names);
      System.out.println(names);

      ArrayList<TableLight> lights = new ArrayList<>();
      lights.add(new TableLight(PlugType.TYPE_F));
      lights.add(new TableLight());
      lights.add(new TableLight(PlugType.TYPE_I));
      lights.add(new TableLight());
      lights.get(1).changeLightBulb(new LightBulb("red"));
      lights.get(2).switchOn();
      lights.get(0).plugIn();
      lights.get(3).changeLightBulb(new LightBulb("blue"));
      lights.get(3).switchOn();
      lights.get(3).plugIn();

      Collections.sort(lights);
      System.out.println(lights);

      Collections.sort(lights, new TableLightByPlugTypeDescComparator());
      System.out.println(lights);

      lights.sort(null);
      System.out.println(lights);

      lights.forEach(System.out::println);
   }

}
