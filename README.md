# Package Sorting Automation

## Objective
This project implements a function that classifies packages for a robotic automation factory based on their **dimensions and mass**.

The function determines whether a package should be sent to:

- **STANDARD**
- **SPECIAL**
- **REJECTED**

based on predefined rules.

---

## Sorting Rules

A package is **bulky** if:

- Volume (Width × Height × Length) ≥ **1,000,000 cm³**, OR
- Any dimension ≥ **150 cm**

A package is **heavy** if:

- Mass ≥ **20 kg**

---

## Package Classification

| Condition | Stack |
|--------|--------|
| Not bulky and not heavy | **STANDARD** |
| Either bulky or heavy | **SPECIAL** |
| Both bulky and heavy | **REJECTED** |

---

