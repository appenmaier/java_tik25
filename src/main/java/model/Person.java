package model;

import java.util.Objects;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Person {

   private String name;
   private int age;
   private boolean isHappy;
   private final char gender;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public boolean isHappy() {
      return isHappy;
   }

   public void setHappy(boolean isHappy) {
      this.isHappy = isHappy;
   }

   public char gender() {
      return gender;
   }

   public Person(String name, int age, char gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Person [name=" + name + ", age=" + age + ", isHappy=" + isHappy + ", gender=" + gender
            + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, gender, isHappy, name);
   }

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
