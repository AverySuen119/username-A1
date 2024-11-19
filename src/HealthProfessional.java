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

    //set name method
    public void getDoctorName(String doctorName){
        this.doctorName=doctorName;
    }

    //get name method
    public String getDoctorName(){
        return doctorName;
    }

    //set gender method
    public void setGender(String gender) {
        this.gender = gender;

    }
   //get gender method
    public String getGender(){
        return gender;

    }

    //set age method
    public void setAge(int age){
        this.age=age;

    }
    //get age method

    public int getAge() {
        return age;
    }

    //set id method
    public void setId(int id){
        this.id=id;
    }
    //get id method

    public int getId(){
        return id;
    }

    //set professionalAge method
    public void setProfessionalAge(String professionalAge){
        this.professionalAge=professionalAge;
    }
    //get professionalAge method
    public  String getProfessionalAge(){
        return professionalAge;
    }

    public void print(){
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
        System.out.println("ProfessionalAge: "+professionalAge);

    }
}



