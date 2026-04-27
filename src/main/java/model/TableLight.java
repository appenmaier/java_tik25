package model;

/**
 * Represents a table light that can be connected, switched on or off, and equipped with a light
 * bulb.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;

   /**
    * Connects the Table Light to the power source.
    */
   public void plugIn() {
      isConnected = true;
   }

   /**
    * Disconnects the Table Light from the power source.
    */
   public void pullThePlug() {
      isConnected = false;
   }

   /**
    * Turns the Table Light on.
    */
   public void switchOn() {
      isOn = true;
   }

   /**
    * Turns the Table Light off.
    */
   public void switchOff() {
      isOn = false;
   }

   /**
    * Replaces the current light bulb with a new one and returns the old one.
    *
    * @param newLightBulb the new light bulb
    * @return the old light bulb
    */
   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = null;
      oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   /**
    * Returns whether the Table Light is currently shining. The Table Light is shining if it is
    * connected and on and has a light bulb.
    *
    * @return true if the Table Light is shining, false otherwise
    */
   public boolean isShining() {
      return isConnected && isOn && lightBulb != null;
   }

   /**
    * Returns whether the Table Light is connected to a power source.
    *
    * @return true if connected, false otherwise
    */
   public boolean isConnected() {
      return isConnected;
   }

   /**
    * Returns whether the Table Light is turned on.
    *
    * @return true if on, false otherwise
    */
   public boolean isOn() {
      return isOn;
   }

   /**
    * Returns the current light bulb of the Table Light.
    *
    * @return the current light bulb, or null if none is installed
    */
   public LightBulb getLightBulb() {
      return lightBulb;
   }

}
