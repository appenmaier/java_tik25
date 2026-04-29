package model;

import java.util.Objects;

/**
 * Represents a person with a name, age, gender, and happiness state.
 *
 * <p>This class demonstrates a traditional Java data class with manually implemented constructors,
 * getters, setters, {@link #equals(Object)}, {@link #hashCode()}, and {@link #toString()}.
 * Compare with the equivalent {@link PersonRecord} and {@link PersonLombok} implementations.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Person {

   /** The person's full name. */
   private String name;

   /** The person's age in years. */
   private int age;

   /** Whether the person is currently happy. */
   private boolean isHappy;

   /**
    * The person's gender ({@code 'm'}, {@code 'w'}, or {@code 'd'}).
    * Immutable after construction.
    */
   private final char gender;

   /**
    * Creates a new {@code Person} with the given name, age, and gender.
    * The happiness state defaults to {@code false}.
    *
    * @param name   the person's full name
    * @param age    the person's age in years
    * @param gender the person's gender ({@code 'm'}, {@code 'w'}, or {@code 'd'})
    */
   public Person(String name, int age, char gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

   /**
    * Returns the person's full name.
    *
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * Sets the person's full name.
    *
    * @param name the new name
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * Returns the person's age in years.
    *
    * @return the age
    */
   public int getAge() {
      return age;
   }

   /**
    * Sets the person's age in years.
    *
    * @param age the new age
    */
   public void setAge(int age) {
      this.age = age;
   }

   /**
    * Returns whether the person is currently happy.
    *
    * @return {@code true} if the person is happy, {@code false} otherwise
    */
   public boolean isHappy() {
      return isHappy;
   }

   /**
    * Sets the person's happiness state.
    *
    * @param isHappy {@code true} if the person is happy, {@code false} otherwise
    */
   public void setHappy(boolean isHappy) {
      this.isHappy = isHappy;
   }

   /**
    * Returns the person's gender.
    *
    * @return {@code 'm'}, {@code 'w'}, or {@code 'd'}
    */
   public char gender() {
      return gender;
   }

   /**
    * Returns a string representation of this person.
    *
    * @return a string containing name, age, happiness state, and gender
    */
   @Override
   public String toString() {
      return "Person [name=" + name + ", age=" + age + ", isHappy=" + isHappy + ", gender=" + gender
            + "]";
   }

   /**
    * Returns a hash code based on all fields.
    *
    * @return the hash code
    */
   @Override
   public int hashCode() {
      return Objects.hash(age, gender, isHappy, name);
   }

   /**
    * Indicates whether some other object is equal to this person.
    * Two {@code Person} instances are equal if all four fields (name, age, gender, isHappy) match.
    *
    * @param obj the object to compare with
    * @return {@code true} if {@code obj} is a {@code Person} with identical field values
    */
   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Person other = (Person) obj;
      return age == other.age && gender == other.gender && isHappy == other.isHappy
            && Objects.equals(name, other.name);
   }

}
