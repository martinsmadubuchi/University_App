package university;

public class student {
    private int StudentId;
    private String FirstName;
    private String LastName;
    private double[] Marks;
    private Address Address;

   public student(int StudentId, String FirstName, String LastName, double[] Marks, Address Address){
       this.StudentId = StudentId;
       this.FirstName = FirstName;
       this.LastName = LastName;
       this.Marks = Marks;
       this.Address = Address;
   }


//put getters


    public int getStudentId() {
        return StudentId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }


    public double[] getMarks() {
        return Marks;
    }

    public Address getAddress() {
        return Address;
    }

    public double Average(){
        double ave = 0;
       for(int i = 0; i < Marks.length; i++) {
           ave += Marks[i];
        }
       return ave / Marks.length;
   }

    @Override
    public String toString(){
       return "Student ID: " + StudentId + "\n" +
              "Name: " + FirstName + " " + LastName + "\n" +
              "Average: " + Average() + "\n" +
              "Address: " + Address.toString();
    }

    public boolean graduate() {
        return Average() > 50;
    }

}
