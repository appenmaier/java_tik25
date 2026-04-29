package model;

/**
 * Immutable record representation of a person.
 *
 * <p>This is the Java Record equivalent of {@link Person} and {@link PersonLombok}. Records
 * automatically generate a canonical constructor, getters, {@code equals}, {@code hashCode}, and
 * {@code toString} based on the declared components.
 *
 * @param name    the person's full name
 * @param age     the person's age in years
 * @param gender  the person's gender ({@code 'm'}, {@code 'w'}, or {@code 'd'})
 * @param isHappy whether the person is currently happy
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record PersonRecord(String name, int age, char gender, boolean isHappy) {

}
