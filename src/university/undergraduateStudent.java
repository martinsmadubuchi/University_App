package university;

public class undergraduateStudent extends student{
    private string subject;
    private int yearOfEntry ;

    public undergraduateStudent(string subject, int yearOfEntry, int StudentId,string FirstName,string LastName,double[] Marks,Address Address){
        super(StudentId,FirstName,LastName,Marks,Address);
        this.subject = subject;
        this.yearOfEntry =  yearOfEntry;
    }
      public string getSubject(){
        return subject;
      }
      public int year0fEntry(){
        return yearOfEntry;
      }

    public boolean graduate() {
        if(Average() > 50) {
          return true;
        }
        return false;
    }
public string[] ToString(){
        string subject = subject.toString();
        string yearEntry = year0fEntry().toString();

        return new string[]{subject, yearEntry};
    }
}