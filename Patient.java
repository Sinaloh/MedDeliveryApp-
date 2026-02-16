package models;

public class Patient {
    private String patientId;
    private String name;
    private String address;

    public Patient(String patientId, String name, String address) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID='" + patientId + "', Name='" + name + "', Address='" + address + "'}";
    }
}