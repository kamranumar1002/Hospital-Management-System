import java.util.List;

public class Doctor extends Person {
    private String doctorId;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String firstName, String lastName, String address, String phoneNumber,
                  String doctorId, String specialization) {
        super(firstName, lastName, address, phoneNumber);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    // Getters and setters
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
