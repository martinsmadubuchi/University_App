package university;

public class graduateStudent {

    class GraduateStudent extends Student {
        private String subject;
        private int yearOfEntry;
        private String thesisTopic;

        // Constructor
        public GraduateStudent(String name, int id, double[] marks,
                               String subject, int yearOfEntry, String thesisTopic) {
            super(name, id, marks);
            this.subject = subject;
            this.yearOfEntry = yearOfEntry;
            this.thesisTopic = thesisTopic;
        }

        // Getters and Setters
        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }

        public int getYearOfEntry() { return yearOfEntry; }
        public void setYearOfEntry(int yearOfEntry) { this.yearOfEntry = yearOfEntry; }

        public String getThesisTopic() { return thesisTopic; }
        public void setThesisTopic(String thesisTopic) { this.thesisTopic = thesisTopic; }

        // toString method (overrides base class)
        @Override
        public String toString() {
            return super.toString() +
                    "\nSubject: " + subject +
                    "\nYear Of Entry: " + yearOfEntry +
                    "\nThesis Topic: " + thesisTopic;
        }
    }


}
