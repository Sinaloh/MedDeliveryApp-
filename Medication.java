package models;

public class Medication {
    private String medId;
    private String name;
    private String dosage;

    public Medication(String medId, String name, String dosage) {
        this.medId = medId;
        this.name = name;
        this.dosage = dosage;
    }

    public String getMedId() {
        return medId;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    @Override
    public String toString() {
        return "Medication{" + "ID='" + medId + "', Name='" + name + "', Dosage='" + dosage + "'}";
    }
}