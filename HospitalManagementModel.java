import java.util.ArrayList;
import java.util.List;

public class HospitalManagementModel {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HospitalManagementModel() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    // Methods to manage patients
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }

    // Methods to manage doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctors);
    }

    // Methods to manage appointments
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return new ArrayList<>(appointments);
    }

    // Other methods as needed for your specific requirements
}
