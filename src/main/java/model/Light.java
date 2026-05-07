package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Abstract base class for all light devices.
 *
 * <p>Provides the common on/off switch state and switch operations shared by all
 * {@link Light} subclasses such as {@link FlashLight} and {@link TableLight}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class Light {

   /** Whether this light's switch is currently in the on position. */
   protected boolean isOn;

   /**
    * Creates a light with the switch in the off position.
    */
   public Light() {}

   /**
    * Turns this light on by setting the switch to the on position.
    */
   public void switchOn() {
      isOn = true;
   }

   /**
    * Turns this light off by setting the switch to the off position.
    */
   public void switchOff() {
      isOn = false;
   }

   /**
    * Returns whether this light is currently emitting light.
    *
    * @return {@code true} if this light is shining, {@code false} otherwise
    */
   public abstract boolean isShining();

}
