public class HealthProfessional {

  private String name;
  private String gender;
  private int age;
  private int id;
  private int professionalAge;

  //构造空参函数
  public HealthProfessional(){}
     /* this.name="unknown";
      this.gender="unknown";
      this.department="unknown";
      this.age=0;
      this.id=0;
      this.professionalAge=0;*/

  //构造带所有参数的函数
    public HealthProfessional(String name,String gender,int age,int id, int professionalAge) {

        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.professionalAge=professionalAge;
    }

    //set name 方法
    public void getName(String name){
        this.name=name;
    }

    //get name 方法
    public String getName(){
        return name;
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
    public void setProfessionalAge(int professionalAge){
        this.professionalAge=professionalAge;
    }
    //get professionalAge 方法
    public  int getProfessionalAge(){
        return professionalAge;
    }

    public void print(){
        System.out.println("name"+name);
        System.out.println("gender"+gender);
        System.out.println("age"+age);
        System.out.println("id"+id);
        System.out.println("professionalAge"+professionalAge);

    }
}



