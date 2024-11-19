public class HealthProfessional {

  private String doctorName;
  private String gender;
  private int age;
  private int id;
  private String professionalAge;

  //Construct default function (empty parameter)
  public HealthProfessional(){

  }


  //Construct a function with all parameters
    public HealthProfessional(String doctorName,String gender,int age,int id, String professionalAge) {

        this.doctorName = doctorName;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.professionalAge=professionalAge;
    }


    public void print(){
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
        System.out.println("ProfessionalAge: "+professionalAge);

    }
}



