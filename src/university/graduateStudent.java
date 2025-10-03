package university;

public class graduateStudent extends student {
    private String subject;
    private int yearOfEntry;
    private String thesisTopic;

    public graduateStudent(String subject, int yearOfEntry, String thesisTopic,
                          int StudentId, String FirstName, String LastName,
                          double[] Marks, Address Address) {
        super(StudentId, FirstName, LastName, Marks, Address);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
        this.thesisTopic = thesisTopic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    @Override
    public boolean graduate() {
        return Average() > 70;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSubject: " + subject +
                "\nYear Of Entry: " + yearOfEntry +
                "\nThesis Topic: " + thesisTopic;
    }
}
