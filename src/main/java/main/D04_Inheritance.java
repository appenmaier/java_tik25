package main;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Demonstrates inheritance, polymorphism, downcasting, and interface usage in Java.
 *
 * <p>Shows three scenarios:
 * <ol>
 *   <li>Working with concrete lists of {@link TableLight} and {@link FlashLight} without polymorphism.</li>
 *   <li>Using a shared {@link Light} base-type list with upcasting, dynamic dispatch, and pattern-matching downcasts.</li>
 *   <li>Using the {@link WiredDevice} interface to group unrelated pluggable devices ({@link TableLight}, {@link Toaster}).</li>
 * </ol>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_Inheritance {

   /**
    * Entry point demonstrating inheritance and polymorphism scenarios.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      /* Ansatz ohne Vererbung */
      ArrayList<TableLight> tableLights = new ArrayList<>();

      tableLights.add(new TableLight());
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());

      for (TableLight light : tableLights) {
         light.plugIn();
         light.switchOn();
         System.out.println(light.isShining());
         System.out.println(light);
      }

      ArrayList<FlashLight> flashLights = new ArrayList<>();

      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());

      for (FlashLight light : flashLights) {
         light.switchOn();
         System.out.println(light.isShining());
         System.out.println(light);
      }

      System.out.println();

      /* Ansatz mit Vererbung */
      ArrayList<Light> lights = new ArrayList<>();

      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast

      for (Light light : lights) {
         light.switchOn(); // Dynamische Polymorphie

         if (light instanceof TableLight) {
            TableLight tableLight = (TableLight) light;// Downcast
            tableLight.plugIn();
         }

         if (light instanceof FlashLight flashLight) { // Downcast
            flashLight.recharge();
         }

         System.out.println(light.isShining()); // Statische und Dynamische Polymorphie
         System.out.println(light); // Statische und Dynamische Polymorphie
      }

      /* Schnittstellen */
      ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

      wiredDevices.add(new TableLight()); // Upcast
      wiredDevices.add(new Toaster()); // Upcast

      for (WiredDevice d : wiredDevices) {
         d.plugIn(); // Dynamische Polymorphie

         if (d instanceof TableLight tableLight) { // Downcast
            tableLight.switchOn();
         }
         System.out.println(d);
      }
   }

}
