package university;

public class student {
    private int StudentId;
    private string FirstName;
    private string LastName;
    private double[] Marks;
    private Address Address;

   public student(int StudentId,string FirstName,string LastName,double[] Marks,Address Address){
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

    public string getFirstName() {
        return FirstName;
    }

    public string getLastName() {
        return LastName;
    }


    @Override
    public String Marks() {
        return Marks();
    }

    public string address (){
        return adress ;
}

    public int Average(){
        double ave = 0;
       for(int i = 0; i < Marks.length; i++) {
           ave += Marks[i] / Marks.length;
        }
       return (int) ave;
   }

    public string[] ToString(){
       string Id = StudentId.toString();
       string Name = "First Name:" +FirstName+ ",Last Name:" +LastName;
       string address = Address.toString();
       string ave = Average().toString();

       return new string[]{Id,Name,address,ave};
}

}
