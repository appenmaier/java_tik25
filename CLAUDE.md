# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an educational lecture repository for a Java programming course (TIK25) — "Programmieren mit Java". It contains demo source code for lectures, with course materials written in German.

External documentation: https://jappuccini.github.io/java-docs/production/

## Build & Run Commands

This project uses **Maven** with **Java 21**.

```bash
mvn compile          # Compile sources
mvn test             # Run JUnit 5 tests
mvn package          # Package the application
mvn javafx:run       # Run the JavaFX application (main class: edu.jappuccini.demos.App)
mvn -Dtest=ClassName test   # Run a single test class
```

## Architecture

The `src/main/java/` directory is organized into three packages:

- **`main/`** — Runnable demo classes (`D01_JavaBasics`, `D02_ObjectOrientedProgramming`, …) that are executed directly to illustrate lecture topics. Each demo has a `main()` method.
- **`model/`** — Domain/entity classes used across demos. The same concept is often shown in three variants side by side: a traditional class (manual constructors/getters/setters), a Java Record (`PersonRecord`), and a Lombok-annotated class (`PersonLombok`).
- **`utility/`** — Static helper methods (e.g. `StringArrayHelper`).

Lecture notes live in `skript/` as Markdown files (`lecture01.md` … `lecture07.md`).

Tests go in `src/test/java/` (structure mirrors `src/main/java/`); no tests exist yet.

## Key Dependencies

| Dependency | Version | Purpose |
|---|---|---|
| Lombok | 1.18.38 | Reduces boilerplate (`@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, `@AllArgsConstructor`) |
| JUnit 5 (Jupiter) | 5.11.3 | Unit testing |
| Mockito | 5.14.2 | Mocking in tests |
| JavaFX | 23.0.1 | GUI application support |

## Conventions

- New demo classes belong in `main/` and follow the `D##_TopicName` naming pattern.
- When demonstrating a concept involving data classes, show all three variants: traditional class, Record, and Lombok.
- Source encoding is UTF-8; German characters (ü, ö, ä, ß) are used in comments and output strings.
- All classes, fields, constructors, and methods must have JavaDoc. Use `{@link}` and `{@code}` tags where appropriate, and cross-reference equivalent implementations (e.g. `Person` ↔ `PersonRecord` ↔ `PersonLombok`).
- Utility classes (no-instance static helpers) get a private no-arg constructor documented as `/** Utility class — not instantiable. */`.
