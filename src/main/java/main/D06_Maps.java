package main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

import model.Exam;
import model.Student;

/**
 * Demo 6: Maps.
 *
 * <p>
 * Demonstrates {@link java.util.HashMap} usage with custom key and value types:
 * <ul>
 * <li>Inserting, overwriting, and reading entries</li>
 * <li>Checking for key/value presence with {@code containsKey}/{@code containsValue}</li>
 * <li>Iterating over {@code keySet()}, {@code values()}, and {@code entrySet()}</li>
 * </ul>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D06_Maps {

   /**
    * Entry point of the Maps demo.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      HashMap<Student, Exam> studentsWithExam = new HashMap<>();

      /* Set value */
      studentsWithExam.put(new Student("8172545", "Max"), new Exam(LocalDate.now(), 2.6));
      studentsWithExam.put(new Student("1920563", "Lisa"), new Exam(LocalDate.now(), 1.8));
      studentsWithExam.put(new Student("5528354", "Anna"), new Exam(LocalDate.now(), 3.5));

      /* Check key and value */
      System.out.println(studentsWithExam.containsKey(new Student("1920563", "Lisa")));
      System.out.println(studentsWithExam.containsValue(new Exam(LocalDate.now(), 3.5)));

      /* Read value */
      System.out.println(studentsWithExam.get(new Student("1920563", "Lisa")));

      /* Overwrite value */
      Exam oldExam =
            studentsWithExam.put(new Student("5528354", "Anna"), new Exam(LocalDate.now(), 3.0));
      System.out.println(studentsWithExam.get(new Student("5528354", "Anna")));
      System.out.println(oldExam);

      /* Print values */
      System.out.println(studentsWithExam);

      /* Collections: The set of all keys */
      System.out.println();
      System.out.println("Attendance list:");
      for (Student s : studentsWithExam.keySet()) {
         System.out.println(s.getName() + " [ ]");
      }

      /* Collections: All values */
      System.out.println();
      double total = 0;
      int grades = 0;
      for (Exam e : studentsWithExam.values()) {
         total += e.getGrade();
         grades++;
      }
      System.out.println("Average grade: " + (total / grades));

      /* Collections: The set of all key-value pairs / entries */
      System.out.println();
      System.out.println("Grade list: ");
      for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
         Student s = entry.getKey();
         Exam e = entry.getValue();
         System.out.println(s.getId() + ": " + e.getGrade());
      }
   }

}
