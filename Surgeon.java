public class Surgeon {
    public class Surgeon {
        private String name;
        private String specialty;

        public Surgeon(String name, String specialty) {
            this.name = name;
            this.specialty = specialty;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public String getSpecialty() {
            return specialty;
        }

        // Method for performing surgery
        public void performSurgery(String patientName, String surgeryType) {
            System.out.println("Surgeon " + name + " is performing " + surgeryType + " on patient " + patientName);
            // Additional logic for the surgery
            System.out.println("Surgery completed successfully.");
        }


    }

}
