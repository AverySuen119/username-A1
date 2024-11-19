public class HealthProfessional {

  private String doctorName;
  private String gender;
  private int age;
  private int id;
  private String professionalAge;

  //构造空参函数
  public HealthProfessional(){}
     /* this.name="unknown";
      this.gender="unknown";
      this.department="unknown";
      this.age=0;
      this.id=0;
      this.professionalAge=0;*/

  //构造带所有参数的函数
    public HealthProfessional(String doctorName,String gender,int age,int id, String professionalAge) {

        this.doctorName = doctorName;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.professionalAge=professionalAge;
    }

    //set name 方法
    public void getDoctorName(String doctorName){
        this.doctorName=doctorName;
    }

    //get name 方法
    public String getDoctorName(){
        return doctorName;
    }

    //set gender 方法
    public void setGender(String gender) {
        this.gender = gender;

    }
   //get gender 方法
    public String getGender(){
        return gender;

    }

    //set age 方法
    public void setAge(int age){
        this.age=age;

    }
    //get age 方法

    public int getAge() {
        return age;
    }

    //set id 方法
    public void setId(int id){
        this.id=id;
    }
    //get id 方法

    public int getId(){
        return id;
    }

    //set professionalAge 方法
    public void setProfessionalAge(String professionalAge){
        this.professionalAge=professionalAge;
    }
    //get professionalAge 方法
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



