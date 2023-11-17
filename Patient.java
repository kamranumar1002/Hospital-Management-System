public class Patient extends Person {
    private String patientId;
    private String medicalRecord;
    private Doctor primaryDoctor;

    public Patient(String firstName, String lastName, String address, String phoneNumber,
                    String patientId, String medicalRecord) {
        super(firstName, lastName, address, phoneNumber);
        this.patientId = patientId;
        this.medicalRecord = medicalRecord;
    }

    // Getters and setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Doctor getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(Doctor primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }
}
