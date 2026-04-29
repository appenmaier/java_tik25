package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Lombok-generated representation of a person.
 *
 * <p>This is the Lombok equivalent of {@link Person} and {@link PersonRecord}. Lombok annotations
 * generate getters, setters, {@code equals}, {@code hashCode}, and {@code toString} at compile
 * time, eliminating manual boilerplate.
 *
 * <ul>
 *   <li>{@link AllArgsConstructor} generates a constructor for all four fields.</li>
 *   <li>{@link RequiredArgsConstructor} generates a constructor for {@code final} fields only
 *       (i.e. {@code gender}).</li>
 *   <li>{@link Getter} / {@link Setter} generate accessors for all non-{@code final} fields;
 *       {@code gender} receives only a getter.</li>
 *   <li>{@link ToString} generates {@link Object#toString()}.</li>
 *   <li>{@link EqualsAndHashCode} generates {@link Object#equals(Object)} and
 *       {@link Object#hashCode()}.</li>
 * </ul>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {

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

}
