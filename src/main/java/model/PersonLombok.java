package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {

   private String name;
   private int age;
   private boolean isHappy;
   private final char gender;

}
