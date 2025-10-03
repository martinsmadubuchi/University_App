package university;

public class undergraduateStudent extends student{
    private String subject;
    private int yearOfEntry;

    public undergraduateStudent(String subject, int yearOfEntry, int StudentId, String FirstName, String LastName, double[] Marks, Address Address){
        super(StudentId,FirstName,LastName,Marks,Address);
        this.subject = subject;
        this.yearOfEntry =  yearOfEntry;
    }
      public String getSubject(){
        return subject;
      }
      public int getYearOfEntry(){
        return yearOfEntry;
      }

    @Override
    public boolean graduate() {
        return Average() > 60;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "Subject: " + subject + "\n" +
               "Year of Entry: " + yearOfEntry;
    }
}