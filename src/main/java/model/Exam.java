package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a written exam with a fixed date and a numeric grade.
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
public class Exam {

   /** The date on which this exam took place. Immutable after construction. */
   private final LocalDate examDate;

   /** The numeric grade achieved in this exam (e.g. {@code 1.0}–{@code 5.0}). */
   private double grade;

}
