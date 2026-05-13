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

      /* Wert setzen */
      studentsWithExam.put(new Student("8172545", "Max"), new Exam(LocalDate.now(), 2.6));
      studentsWithExam.put(new Student("1920563", "Lisa"), new Exam(LocalDate.now(), 1.8));
      studentsWithExam.put(new Student("5528354", "Anna"), new Exam(LocalDate.now(), 3.5));

      /* Schlüssel und Wert prüfen */
      System.out.println(studentsWithExam.containsKey(new Student("1920563", "Lisa")));
      System.out.println(studentsWithExam.containsValue(new Exam(LocalDate.now(), 3.5)));

      /* Wert auslesen */
      System.out.println(studentsWithExam.get(new Student("1920563", "Lisa")));

      /* Wert überschreiben */
      Exam oldExam =
            studentsWithExam.put(new Student("5528354", "Anna"), new Exam(LocalDate.now(), 3.0));
      System.out.println(studentsWithExam.get(new Student("5528354", "Anna")));
      System.out.println(oldExam);

      /* Werte ausgeben */
      System.out.println(studentsWithExam);

      /* Datensammlungen: Die Menge aller Schlüssel */
      System.out.println();
      System.out.println("Anwesenheitsliste:");
      for (Student s : studentsWithExam.keySet()) {
         System.out.println(s.getName() + " [ ]");
      }

      /* Datensammlungen: Alle Werte */
      System.out.println();
      double total = 0;
      int grades = 0;
      for (Exam e : studentsWithExam.values()) {
         total += e.getGrade();
         grades++;
      }
      System.out.println("Durchschnittsnote: " + (total / grades));

      /* Datensammlungen: Die Menge aller Schlüsse-Wert-Paare / Einträge */
      System.out.println();
      System.out.println("Notenliste: ");
      for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
         Student s = entry.getKey();
         Exam e = entry.getValue();
         System.out.println(s.getId() + ": " + e.getGrade());
      }
   }

}
