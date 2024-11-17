package main;

import entities.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Головний клас із простим меню для роботи з пацієнтами.
 */
public class Main {

    /**
     * Метод для створення масиву пацієнтів.
     */
    public static List<Patient> createPatients() {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "Іваненко", "Іван", "Іванович", "Київ, вул. Шевченка, 1", "+80631234567", 10001, "Грип"));
        patients.add(new Patient(2, "Петренко", "Петро", "Петрович", "Львів, вул. Грушевського, 2", "+380501234567", 10002, "Ангiна"));
        patients.add(new Patient(3, "Сидоренко", "Сидір", "Сидорович", "Одеса, вул. Дерибасівська, 3", "+0671234567", 10003, "Грип"));
        patients.add(new Patient(4, "Мельник", "Марія", "Іванівна", "Харків, вул. Сумська, 4", "+0991234567", 10004, "Пневмонія"));
        patients.add(new Patient(5, "Коваленко", "Олексій", "Сергійович", "Дніпро, вул. Поля, 5", "+80631111111", 10005, "Алергія"));
        return patients;
    }

    /**
     * Метод для виведення всіх пацієнтів.
     */
    public static void printAllPatients(List<Patient> patients) {
        System.out.println("\nУсі пацієнти:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    /**
     * Метод для виведення пацієнтів за діагнозом.
     */
    public static void printPatientsWithDiagnosis(List<Patient> patients, String diagnosis) {
        System.out.println("\nПацієнти з діагнозом: " + diagnosis);
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                System.out.println(patient);
            }
        }
    }

    /**
     * Метод для виведення пацієнтів за діапазоном номерів медичних карт.
     */
    public static void printPatientsInMedicalCardRange(List<Patient> patients, int min, int max) {
        System.out.println("\nПацієнти з номерами медичних карт у діапазоні: " + min + " - " + max);
        for (Patient patient : patients) {
            if (patient.getMedicalCardNumber() >= min && patient.getMedicalCardNumber() <= max) {
                System.out.println(patient);
            }
        }
    }

    /**
     * Метод для виведення пацієнтів, у яких телефон починається з певної цифри.
     */
    public static void printPatientsWithPhoneStarting(List<Patient> patients, char startingDigit) {
        System.out.println("\nПацієнти, телефон яких починається з цифри: " + startingDigit);
        for (Patient patient : patients) {
            if (patient.getPhone().charAt(1) == startingDigit) {
                System.out.println(patient);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Patient> patients = createPatients();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Вивести всіх пацієнтів");
            System.out.println("2. Вивести пацієнтів з діагнозом");
            System.out.println("3. Вивести пацієнтів за діапазоном номерів медичних карт");
            System.out.println("4. Вивести пацієнтів за номером телефону");
            System.out.println("0. Вийти");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера

            switch (choice) {
                case 1:
                    printAllPatients(patients);
                    break;
                case 2:
                    System.out.print("Введіть діагноз для пошуку: ");
                    String diagnosis = scanner.nextLine();
                    printPatientsWithDiagnosis(patients, diagnosis);
                    break;
                case 3:
                    System.out.print("Введіть мінімальний номер медичної карти: ");
                    int min = scanner.nextInt();
                    System.out.print("Введіть максимальний номер медичної карти: ");
                    int max = scanner.nextInt();
                    printPatientsInMedicalCardRange(patients, min, max);
                    break;
                case 4:
                    System.out.print("Введіть першу цифру номера телефону (після '+'): ");
                    char startingDigit = scanner.next().charAt(0);
                    printPatientsWithPhoneStarting(patients, startingDigit);
                    break;
                case 0:
                    System.out.println("Вихід із програми.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
