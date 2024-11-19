# Health Service Appointment System

This project is a **Java-based application** that manages a simple appointment system for a health service. It allows patients to book appointments with different types of health professionals. This system demonstrates the principles of **object-oriented programming (OOP)**, including **inheritance**, and uses **collections** to handle bookings.

## Features

1. **Health Professional Management**:
   - Represents different types of health professionals (e.g., General Practitioners and Specialists).
   - Inherits common properties (e.g., ID, Name, Specialty) from a base class.

2. **Appointment System**:
   - Manages patient details, preferred time slots, and selected health professionals.
   - Supports creating, viewing, and canceling appointments.

3. **Collections**:
   - Uses `ArrayList` to store and manage appointments dynamically.

4. **Modular Code Structure**:
   - Demonstrates good coding practices with encapsulation, constructors, and method overrides.

---

## Directory Structure

```
username-A1/
├── src/
│   ├── AssignmentOne.java            # Main class for running the program
│   ├── HealthProfessional.java       # Base class for health professionals
│   ├── GeneralPractitioner.java      # Subclass for general practitioners
│   ├── Specialist.java               # Subclass for another type of health professional
│   ├── Appointment.java              # Class representing patient appointments
│   └── README.md                     # Project documentation
```

---

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/username-A1.git
   cd username-A1
   ```

2. **Open in IntelliJ IDEA**:
   - Import the project as a Java project.
   - Ensure the JDK is set up correctly.

3. **Run the Main Program**:
   - Navigate to `AssignmentOne.java`.
   - Run the `main()` method.

---

## Example Output

**Sample Execution:**

```text
// Part 3 – Using classes and objects
Health Professional Details:
ID: 101, Name: Dr. Smith, Specialty: General Practice
Health Professional Details:
ID: 102, Name: Dr. Jones, Specialty: Cardiology

------------------------------
// Part 5 – Collection of appointments
Appointments:
1. Patient: John Doe, Phone: 1234567890, Time Slot: 10:00, Doctor: Dr. Smith
2. Patient: Jane Doe, Phone: 0987654321, Time Slot: 14:30, Doctor: Dr. Jones

Canceling an appointment with Phone: 1234567890
Remaining Appointments:
1. Patient: Jane Doe, Phone: 0987654321, Time Slot: 14:30, Doctor: Dr. Jones
------------------------------
```

---

## Classes Overview

1. **`HealthProfessional` (Base Class)**:
   - Fields: `id`, `name`, `specialty`.
   - Methods: Default and parameterized constructors, `printDetails`.

2. **`GeneralPractitioner` and `Specialist` (Subclasses)**:
   - Add fields and methods specific to their types.
   - Override the `printDetails` method.

3. **`Appointment`**:
   - Fields: `patientName`, `phoneNumber`, `timeSlot`, and a `HealthProfessional`.
   - Manages appointment creation, printing, and cancellation.

---

## Key Concepts Demonstrated

- **Inheritance**: Subclasses (`GeneralPractitioner`, `Specialist`) inherit from `HealthProfessional`.
- **Polymorphism**: Overriding methods in subclasses to provide specific implementations.
- **Encapsulation**: Use of private fields with public getters and setters.
- **Collections**: Management of appointments using `ArrayList`.

---

## Requirements

- **Java Development Kit (JDK)**: Version 8 or higher.
- **IDE**: IntelliJ IDEA (recommended) or any Java-compatible IDE.

---

## Future Improvements

- Extend functionality to support more types of health professionals.
- Add a user-friendly graphical interface.
- Implement persistent storage (e.g., using a database) for appointments.
- Add input validation and error handling for robustness.

---

## Author

- **Your Name**
- [Your GitHub Profile](https://github.com/your-username)

---

## License

This project is licensed under the MIT License. Feel free to use and modify as needed.

--- 

> Replace placeholders like `your-username` and `your-name` with actual details.

This README provides clear instructions for understanding, running, and extending the project. Let me know if you'd like to include anything else!
