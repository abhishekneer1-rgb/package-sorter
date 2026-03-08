# Package Sorter

## Objective

This project implements the function `sort(width, height, length, mass)` for a robotic automation factory.

The function classifies a package into one of the following stacks:

- `STANDARD`
- `SPECIAL`
- `REJECTED`

based on its dimensions and mass.

---

## Rules

A package is considered **bulky** if:

- its volume (`width × height × length`) is greater than or equal to `1,000,000 cm³`, or
- any one of its dimensions is greater than or equal to `150 cm`

A package is considered **heavy** if:

- its mass is greater than or equal to `20 kg`

### Dispatch Rules

- `STANDARD`: package is neither bulky nor heavy
- `SPECIAL`: package is either bulky or heavy
- `REJECTED`: package is both bulky and heavy

---

## Implementation

The solution is implemented in Java in:

- `PackageSorter.java`

It uses a simple scoring approach:

- +1 if the package is bulky
- +1 if the package is heavy

Then:

- score = 0 → `STANDARD`
- score = 1 → `SPECIAL`
- score = 2 → `REJECTED`

---

## Files

- `PackageSorter.java` — main implementation
- `PackageSorterTest.java` — unit tests using JUnit 5

---

## Sample Cases

| Width | Height | Length | Mass | Result |
|------:|-------:|-------:|-----:|--------|
| 50 | 40 | 30 | 10 | `STANDARD` |
| 50 | 40 | 30 | 20 | `SPECIAL` |
| 100 | 100 | 100 | 10 | `SPECIAL` |
| 150 | 100 | 100 | 20 | `REJECTED` |

---

## How to Run

### Compile
```bash
javac PackageSorter.java

