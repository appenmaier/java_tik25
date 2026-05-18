package model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a table light that can be connected, switched on or off, and equipped with a light
 * bulb.
 *
 * <p>
 * A {@code TableLight} has an immutable {@link PlugType} that is set at construction time. The
 * no-arg constructor defaults to {@link PlugType#TYPE_F} (European Schuko).
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TableLight extends Light implements WiredDevice, Comparable<TableLight> {

   /** Whether this table light is plugged into a power source. */
   private boolean isConnected;

   // /** Whether this table light's switch is in the on position. */
   // private boolean isOn;

   /** The light bulb currently installed in this table light, or {@code null} if none. */
   private LightBulb lightBulb;

   /**
    * The plug type of this table light. Immutable after construction.
    *
    * @see PlugType
    */
   private final PlugType plugType;

   /**
    * Creates a table light with the default plug type {@link PlugType#TYPE_F}.
    */
   public TableLight() {
      plugType = PlugType.TYPE_F;
      lightBulb = new LightBulb("white");
   }

   /**
    * Creates a table light with the given plug type.
    *
    * @param plugType the plug type of this table light
    */
   public TableLight(PlugType plugType) {
      this.plugType = plugType;
   }

   /**
    * Connects the Table Light to the power source.
    */
   @Override
   public void plugIn() throws AlreadyPluggedInException {
      if (isConnected) {
         throw new AlreadyPluggedInException("Already Plugged In");
      }

      isConnected = true;
   }

   /**
    * Disconnects the Table Light from the power source.
    */
   @Override
   public void pullThePlug() {
      isConnected = false;
   }

   // /**
   // * Turns the Table Light on.
   // */
   // @Override
   // public void switchOn() {
   // isOn = true;
   // }

   // /**
   // * Turns the Table Light off.
   // */
   // @Override
   // public void switchOff() {
   // isOn = false;
   // }

   /**
    * Replaces the current light bulb with a new one and returns the old one.
    *
    * @param newLightBulb the new light bulb to install
    * @return the previously installed {@link LightBulb}, or {@code null} if none was installed
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
    * @return {@code true} if the Table Light is shining, {@code false} otherwise
    */
   @Override
   public boolean isShining() {
      return isConnected && isOn && lightBulb != null;
   }

   /**
    * Returns whether the Table Light is connected to a power source.
    *
    * @return {@code true} if connected, {@code false} otherwise
    */
   public boolean isConnected() {
      return isConnected;
   }

   // /**
   // * Returns whether the Table Light is turned on.
   // *
   // * @return {@code true} if on, {@code false} otherwise
   // */
   // @Override
   // public boolean isOn() {
   // return isOn;
   // }

   /**
    * Returns the current light bulb of the Table Light.
    *
    * @return the currently installed {@link LightBulb}, or {@code null} if none is installed
    */
   public LightBulb getLightBulb() {
      return lightBulb;
   }

   /**
    * Returns the plug type of this table light.
    *
    * @return the {@link PlugType} of this table light
    */
   public PlugType getPlugType() {
      return plugType;
   }

   /**
    * Compares this table light to another by operational state in ascending order:
    * unconnected &lt; connected &lt; switched on &lt; shining.
    *
    * @param o the other {@link TableLight} to compare to
    * @return a positive integer if this light is in a more active state, negative if less active,
    *         zero if both are in the same state
    */
   @Override
   public int compareTo(TableLight o) {
      if (isShining() && !o.isShining()) {
         return 1;
      } else if (!isShining() && o.isShining()) {
         return -1;
      }

      if (isOn && !o.isOn) {
         return 1;
      } else if (!isOn && o.isOn) {
         return -1;
      }

      if (isConnected && !o.isConnected) {
         return 1;
      } else if (!isConnected && o.isConnected) {
         return -1;
      }

      return 0;
   }

}
