package models;

public class Clinic {
    private String clinicId;
    private String name;
    private String address;

    public Clinic(String clinicId, String name, String address) {
        this.clinicId = clinicId;
        this.name = name;
        this.address = address;
    }

    public String getClinicId() {
        return clinicId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Clinic{" + "ID='" + clinicId + "', Name='" + name + "', Address='" + address + "'}";
    }
}