package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a student identified by a unique matriculation number.
 *
 * <p>
 * Lombok {@code @Data} generates getters, setters, {@code equals}, {@code hashCode}, and
 * {@code toString}. {@code @AllArgsConstructor} generates a constructor for all fields.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class Student {

   /** Unique matriculation number of the student. Immutable after construction. */
   private final String id;

   /** Full name of the student. */
   private String name;

}
