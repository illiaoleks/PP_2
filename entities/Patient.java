package entities;

/**
 * Клас, який представляє пацієнта.
 */
public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private String diagnosis;

    /**
     * Конструктор для створення об'єкта пацієнта.
     */
    public Patient(int id, String lastName, String firstName, String middleName, String address,
                   String phone, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    // Геттери та сеттери для всіх полів
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Представлення об'єкта пацієнта у вигляді рядка.
     */
    @Override
    public String toString() {
        return String.format(
                "ID: %d, Прізвище: %s, Ім'я: %s, По батькові: %s, Адреса: %s, Телефон: %s, Номер мед. карти: %d, Діагноз: %s",
                id, lastName, firstName, middleName, address, phone, medicalCardNumber, diagnosis);
    }
}
