package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents a battery-powered flash light.
 *
 * <p>Extends {@link Light} with an energy level that decreases each time the light is switched on.
 * The light can be recharged to restore full energy via {@link #recharge()}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class FlashLight extends Light {

   // private boolean isOn;
   /** The current energy level of the battery, between {@code 0.0} (empty) and {@code 1.0} (full). */
   private double energyLevel;

   /**
    * Creates a flash light with a fully charged battery ({@code energyLevel = 1.0}).
    */
   public FlashLight() {
      energyLevel = 1;
   }

   /**
    * Turns this flash light on, consuming {@code 0.1} units of energy if available.
    *
    * <p>Energy is only consumed when the level is at least {@code 0.1}. Delegates
    * to {@link Light#switchOn()} to set the on/off state.
    */
   @Override
   public void switchOn() {
      if (energyLevel >= 0.1) {
         energyLevel -= 0.1;
      }
      super.switchOn();
   }

   // @Override
   // public void switchOff() {
   // isOn = false;
   // }

   /**
    * Recharges the battery to full capacity ({@code energyLevel = 1.0}).
    */
   public void recharge() {
      energyLevel = 1;
   }

   /**
    * Returns whether this flash light is currently shining.
    *
    * <p>The flash light shines only if its switch is on and the energy level is above {@code 0.0}.
    *
    * @return {@code true} if shining, {@code false} otherwise
    */
   @Override
   public boolean isShining() {
      return isOn && energyLevel > 0;
   }

}
